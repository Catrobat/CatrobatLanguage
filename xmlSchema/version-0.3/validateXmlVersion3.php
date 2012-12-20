<?php
function libxml_return_error($error)
{
    $return = "";
    switch ($error->level) {
        case LIBXML_ERR_WARNING:
            $return .= "Warning $error->code: ";
            break;
        case LIBXML_ERR_ERROR:
            $return .= "Error $error->code: ";
            break;
        case LIBXML_ERR_FATAL:
            $return .= "Fatal Error $error->code: ";
            break;
    }
    $return .= trim($error->message);
    $return .= " on line $error->line\n";

    return $return;
}

function libxml_return_errors() {
    $errors = libxml_get_errors();
    $errorMessage = "";
    foreach ($errors as $error) {
        $errorMessage .= libxml_return_error($error);
    }
    libxml_clear_errors();
    return $errorMessage;
}

if(isset($_POST['xmlToValidate'])) {

  // Enable user error handling
  libxml_use_internal_errors(true);
  
  $xml = new DOMDocument(); 
  $xml->loadXML($_POST['xmlToValidate']);
  
  if (!$xml->schemaValidate('catrobatXmlSchema.xsd')) {
       $arr = array ('valid'=>false, 'message'=>libxml_return_errors());
    echo json_encode($arr);
  } else {
    $arr = array ('valid'=>true);
    echo json_encode($arr);
  }
} else {
  print '{"valid":false,"message":"Error: No Document received via POST on xmlToValidate\n"}';
}
?>
