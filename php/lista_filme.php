<?php

  $client = new SoapClient('http://localhost:8080/filmes?wsdl');
  $result = $client->__soapCall("listarFilmes", array($a, $b, $c), NULL);
  $array = (array)$result;

  print_r($array);
?>