<?php
require APPPATH . '/libraries/REST_Controller.php';
class Rest extends REST_Controller {
 
    function __construct($config = 'rest') {
        parent::__construct($config);
    }
    
    function index_get() {
        $request = $this->db->get('request')->result();
       // $this->response($request, 200);
	    $xml = new DOMDocument();
        $xml_root = $xml->createElement("root");
        $xml_result = $xml->createElement("result");
        $xml_result->nodeValue = "OK";
        $xml_root->appendChild( $xml_result );
        $xml->appendChild( $xml_root );
        echo $xml->saveXML();
         
    }
 
    
    function index_post() {
        
        $xml = new DOMDocument();
        $xml_root = $xml->createElement("root");
        $xml_result = $xml->createElement("result");
        $xml_result->nodeValue = "OK";
        $xml_root->appendChild( $xml_result );
        $xml->appendChild( $xml_root );      
        $xml_data = simplexml_load_file('php://input');
        $string =  $xml_data->string[0];	
        $data = array(
                    'string' => $string
					);
        $insert = $this->db->insert('request', $data);
        if ($insert) {
           echo $xml->saveXML();
            
        } else {
            $this->response(array('status' => 'fail', 502));
        }
    }
 
    
    function index_put() {
      
    }
 
    // delete
         function index_delete() {
              
    }
 
}