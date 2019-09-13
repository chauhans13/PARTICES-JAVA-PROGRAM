package com.cdr;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.util.encoders.Hex;



public class Decoder {

	/*Sequence Tags */
	static final int MSCRecordType = 0;
	static final int RecordNumber = 1;
	static final int RecordStatus = 3;
	static final int CallingImsi = 8;
	static final int CallingImei = 9;


	void process() throws IOException, ClassNotFoundException {
	    String path = System.getProperty("user.dir") + "/telconetqual_sampledata/CDR_RGN0_20121120081859.asn";

	    File file = new File(path);
	    byte[] bFile = new byte[(int) file.length()];
	    FileInputStream fis = new FileInputStream(file);
	    fis.read(bFile);

	    ASN1InputStream in = new ASN1InputStream(bFile);

	    while (in.available() > 0) {
	        ASN1Primitive primitive = in.readObject();
	        DERTaggedObject derTaggedObject = (DERTaggedObject) primitive;
	        DLSequence sequence = (DLSequence)derTaggedObject.getObject();
	        for(int i =0; i < sequence.size(); i++){
	            DERTaggedObject seqElement = (DERTaggedObject)sequence.getObjectAt(i);
	            switch (seqElement.getTagNo()) {
	                case MSCRecordType:
	                    DEROctetString recordTypeOctet =(DEROctetString)seqElement.getObject();
	                    //int recordType = Integer.valueOf(Hex.toHexString(recordTypeOctet.getOctets()));
	                    break;
	                case CallingImsi:
	                    DEROctetString  CallingImsiOctet =(DEROctetString)seqElement.getObject();
	                  //  String CallingImsi = Hex.toHexString(CallingImsiOctet.getOctets());
	                    break;

	            }

	        }
	    }

	}
}
