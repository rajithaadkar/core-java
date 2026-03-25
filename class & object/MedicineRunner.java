class MedicineRunner {
    public static void main(String[] args) {

        Medicine m1 = new Medicine();
        m1.medicineId = 1;
        m1.name = "Paracetamol";
        m1.brandName = "Dolo";
        m1.price = 50;
        m1.quantity = 10;
        m1.expiryDate = "12-2026";
        m1.dosage = "500mg";
        m1.isPrescriptionRequired = false;

        System.out.println("Medicine Id: " + m1.medicineId);
        System.out.println("Name: " + m1.name);
        System.out.println("Brand: " + m1.brandName);
        System.out.println("Price: " + m1.price);
        System.out.println("Quantity: " + m1.quantity);
        System.out.println("Expiry Date: " + m1.expiryDate);
        System.out.println("Dosage: " + m1.dosage);
        System.out.println("Prescription Required: " + m1.isPrescriptionRequired);
		
		Medicine m2 = new Medicine();
		m2.medicineId = 2;
		m2.name = "Ibuprofen";
		m2.brandName = "Brufen";
		m2.price = 80;
		m2.quantity = 15;
		m2.expiryDate = "10-2026";
		m2.dosage = "400mg";
		m2.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m2.medicineId);
		System.out.println("Name: " + m2.name);
		System.out.println("Brand: " + m2.brandName);
		System.out.println("Price: " + m2.price);
		System.out.println("Quantity: " + m2.quantity);
		System.out.println("Expiry Date: " + m2.expiryDate);
		System.out.println("Dosage: " + m2.dosage);
		System.out.println("Prescription Required: " + m2.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m3 = new Medicine();
		m3.medicineId = 3;
		m3.name = "Amoxicillin";
		m3.brandName = "Mox";
		m3.price = 120;
		m3.quantity = 10;
		m3.expiryDate = "08-2025";
		m3.dosage = "500mg";
		m3.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m3.medicineId);
		System.out.println("Name: " + m3.name);
		System.out.println("Brand: " + m3.brandName);
		System.out.println("Price: " + m3.price);
		System.out.println("Quantity: " + m3.quantity);
		System.out.println("Expiry Date: " + m3.expiryDate);
		System.out.println("Dosage: " + m3.dosage);
		System.out.println("Prescription Required: " + m3.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m4 = new Medicine();
		m4.medicineId = 4;
		m4.name = "Cetirizine";
		m4.brandName = "Cetzine";
		m4.price = 40;
		m4.quantity = 10;
		m4.expiryDate = "01-2027";
		m4.dosage = "10mg";
		m4.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m4.medicineId);
		System.out.println("Name: " + m4.name);
		System.out.println("Brand: " + m4.brandName);
		System.out.println("Price: " + m4.price);
		System.out.println("Quantity: " + m4.quantity);
		System.out.println("Expiry Date: " + m4.expiryDate);
		System.out.println("Dosage: " + m4.dosage);
		System.out.println("Prescription Required: " + m4.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m5 = new Medicine();
		m5.medicineId = 5;
		m5.name = "Azithromycin";
		m5.brandName = "Azee";
		m5.price = 150;
		m5.quantity = 6;
		m5.expiryDate = "05-2026";
		m5.dosage = "500mg";
		m5.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m5.medicineId);
		System.out.println("Name: " + m5.name);
		System.out.println("Brand: " + m5.brandName);
		System.out.println("Price: " + m5.price);
		System.out.println("Quantity: " + m5.quantity);
		System.out.println("Expiry Date: " + m5.expiryDate);
		System.out.println("Dosage: " + m5.dosage);
		System.out.println("Prescription Required: " + m5.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m6 = new Medicine();
		m6.medicineId = 6;
		m6.name = "Metformin";
		m6.brandName = "Glycomet";
		m6.price = 90;
		m6.quantity = 10;
		m6.expiryDate = "09-2026";
		m6.dosage = "500mg";
		m6.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m6.medicineId);
		System.out.println("Name: " + m6.name);
		System.out.println("Brand: " + m6.brandName);
		System.out.println("Price: " + m6.price);
		System.out.println("Quantity: " + m6.quantity);
		System.out.println("Expiry Date: " + m6.expiryDate);
		System.out.println("Dosage: " + m6.dosage);
		System.out.println("Prescription Required: " + m6.isPrescriptionRequired);
		System.out.println("------------------------");

		// continuing same pattern...

		Medicine m7 = new Medicine();
		m7.medicineId = 7;
		m7.name = "Pantoprazole";
		m7.brandName = "Pantocid";
		m7.price = 110;
		m7.quantity = 10;
		m7.expiryDate = "11-2026";
		m7.dosage = "40mg";
		m7.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m7.medicineId);
		System.out.println("Name: " + m7.name);
		System.out.println("Brand: " + m7.brandName);
		System.out.println("Price: " + m7.price);
		System.out.println("Quantity: " + m7.quantity);
		System.out.println("Expiry Date: " + m7.expiryDate);
		System.out.println("Dosage: " + m7.dosage);
		System.out.println("Prescription Required: " + m7.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m8 = new Medicine();
		m8.medicineId = 8;
		m8.name = "Domperidone";
		m8.brandName = "Domstal";
		m8.price = 60;
		m8.quantity = 10;
		m8.expiryDate = "02-2027";
		m8.dosage = "10mg";
		m8.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m8.medicineId);
		System.out.println("Name: " + m8.name);
		System.out.println("Brand: " + m8.brandName);
		System.out.println("Price: " + m8.price);
		System.out.println("Quantity: " + m8.quantity);
		System.out.println("Expiry Date: " + m8.expiryDate);
		System.out.println("Dosage: " + m8.dosage);
		System.out.println("Prescription Required: " + m8.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m9 = new Medicine();
		m9.medicineId = 9;
		m9.name = "Diclofenac";
		m9.brandName = "Voveran";
		m9.price = 70;
		m9.quantity = 10;
		m9.expiryDate = "06-2026";
		m9.dosage = "50mg";
		m9.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m9.medicineId);
		System.out.println("Name: " + m9.name);
		System.out.println("Brand: " + m9.brandName);
		System.out.println("Price: " + m9.price);
		System.out.println("Quantity: " + m9.quantity);
		System.out.println("Expiry Date: " + m9.expiryDate);
		System.out.println("Dosage: " + m9.dosage);
		System.out.println("Prescription Required: " + m9.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m10 = new Medicine();
		m10.medicineId = 10;
		m10.name = "Ranitidine";
		m10.brandName = "Rantac";
		m10.price = 55;
		m10.quantity = 10;
		m10.expiryDate = "07-2026";
		m10.dosage = "150mg";
		m10.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m10.medicineId);
		System.out.println("Name: " + m10.name);
		System.out.println("Brand: " + m10.brandName);
		System.out.println("Price: " + m10.price);
		System.out.println("Quantity: " + m10.quantity);
		System.out.println("Expiry Date: " + m10.expiryDate);
		System.out.println("Dosage: " + m10.dosage);
		System.out.println("Prescription Required: " + m10.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m11 = new Medicine();
		m11.medicineId = 11;
		m11.name = "Levocetirizine";
		m11.brandName = "LevoCet";
		m11.price = 65;
		m11.quantity = 10;
		m11.expiryDate = "03-2027";
		m11.dosage = "5mg";
		m11.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m11.medicineId);
		System.out.println("Name: " + m11.name);
		System.out.println("Brand: " + m11.brandName);
		System.out.println("Price: " + m11.price);
		System.out.println("Quantity: " + m11.quantity);
		System.out.println("Expiry Date: " + m11.expiryDate);
		System.out.println("Dosage: " + m11.dosage);
		System.out.println("Prescription Required: " + m11.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m12 = new Medicine();
		m12.medicineId = 12;
		m12.name = "Omeprazole";
		m12.brandName = "Omez";
		m12.price = 95;
		m12.quantity = 10;
		m12.expiryDate = "12-2026";
		m12.dosage = "20mg";
		m12.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m12.medicineId);
		System.out.println("Name: " + m12.name);
		System.out.println("Brand: " + m12.brandName);
		System.out.println("Price: " + m12.price);
		System.out.println("Quantity: " + m12.quantity);
		System.out.println("Expiry Date: " + m12.expiryDate);
		System.out.println("Dosage: " + m12.dosage);
		System.out.println("Prescription Required: " + m12.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m13 = new Medicine();
		m13.medicineId = 13;
		m13.name = "Ciprofloxacin";
		m13.brandName = "Ciplox";
		m13.price = 140;
		m13.quantity = 10;
		m13.expiryDate = "09-2025";
		m13.dosage = "500mg";
		m13.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m13.medicineId);
		System.out.println("Name: " + m13.name);
		System.out.println("Brand: " + m13.brandName);
		System.out.println("Price: " + m13.price);
		System.out.println("Quantity: " + m13.quantity);
		System.out.println("Expiry Date: " + m13.expiryDate);
		System.out.println("Dosage: " + m13.dosage);
		System.out.println("Prescription Required: " + m13.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m14 = new Medicine();
		m14.medicineId = 14;
		m14.name = "Loperamide";
		m14.brandName = "Imodium";
		m14.price = 75;
		m14.quantity = 10;
		m14.expiryDate = "04-2027";
		m14.dosage = "2mg";
		m14.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m14.medicineId);
		System.out.println("Name: " + m14.name);
		System.out.println("Brand: " + m14.brandName);
		System.out.println("Price: " + m14.price);
		System.out.println("Quantity: " + m14.quantity);
		System.out.println("Expiry Date: " + m14.expiryDate);
		System.out.println("Dosage: " + m14.dosage);
		System.out.println("Prescription Required: " + m14.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m15 = new Medicine();
		m15.medicineId = 15;
		m15.name = "Doxycycline";
		m15.brandName = "Doxy";
		m15.price = 130;
		m15.quantity = 10;
		m15.expiryDate = "08-2026";
		m15.dosage = "100mg";
		m15.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m15.medicineId);
		System.out.println("Name: " + m15.name);
		System.out.println("Brand: " + m15.brandName);
		System.out.println("Price: " + m15.price);
		System.out.println("Quantity: " + m15.quantity);
		System.out.println("Expiry Date: " + m15.expiryDate);
		System.out.println("Dosage: " + m15.dosage);
		System.out.println("Prescription Required: " + m15.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m16 = new Medicine();
		m16.medicineId = 16;
		m16.name = "Montelukast";
		m16.brandName = "Montair";
		m16.price = 110;
		m16.quantity = 10;
		m16.expiryDate = "06-2027";
		m16.dosage = "10mg";
		m16.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m16.medicineId);
		System.out.println("Name: " + m16.name);
		System.out.println("Brand: " + m16.brandName);
		System.out.println("Price: " + m16.price);
		System.out.println("Quantity: " + m16.quantity);
		System.out.println("Expiry Date: " + m16.expiryDate);
		System.out.println("Dosage: " + m16.dosage);
		System.out.println("Prescription Required: " + m16.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m17 = new Medicine();
		m17.medicineId = 17;
		m17.name = "Aspirin";
		m17.brandName = "Ecosprin";
		m17.price = 45;
		m17.quantity = 14;
		m17.expiryDate = "02-2026";
		m17.dosage = "75mg";
		m17.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m17.medicineId);
		System.out.println("Name: " + m17.name);
		System.out.println("Brand: " + m17.brandName);
		System.out.println("Price: " + m17.price);
		System.out.println("Quantity: " + m17.quantity);
		System.out.println("Expiry Date: " + m17.expiryDate);
		System.out.println("Dosage: " + m17.dosage);
		System.out.println("Prescription Required: " + m17.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m18 = new Medicine();
		m18.medicineId = 18;
		m18.name = "Clindamycin";
		m18.brandName = "Clindac";
		m18.price = 160;
		m18.quantity = 10;
		m18.expiryDate = "10-2025";
		m18.dosage = "300mg";
		m18.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m18.medicineId);
		System.out.println("Name: " + m18.name);
		System.out.println("Brand: " + m18.brandName);
		System.out.println("Price: " + m18.price);
		System.out.println("Quantity: " + m18.quantity);
		System.out.println("Expiry Date: " + m18.expiryDate);
		System.out.println("Dosage: " + m18.dosage);
		System.out.println("Prescription Required: " + m18.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m19 = new Medicine();
		m19.medicineId = 19;
		m19.name = "Fexofenadine";
		m19.brandName = "Allegra";
		m19.price = 120;
		m19.quantity = 10;
		m19.expiryDate = "01-2027";
		m19.dosage = "120mg";
		m19.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m19.medicineId);
		System.out.println("Name: " + m19.name);
		System.out.println("Brand: " + m19.brandName);
		System.out.println("Price: " + m19.price);
		System.out.println("Quantity: " + m19.quantity);
		System.out.println("Expiry Date: " + m19.expiryDate);
		System.out.println("Dosage: " + m19.dosage);
		System.out.println("Prescription Required: " + m19.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m20 = new Medicine();
		m20.medicineId = 20;
		m20.name = "Metronidazole";
		m20.brandName = "Flagyl";
		m20.price = 85;
		m20.quantity = 10;
		m20.expiryDate = "11-2026";
		m20.dosage = "400mg";
		m20.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m20.medicineId);
		System.out.println("Name: " + m20.name);
		System.out.println("Brand: " + m20.brandName);
		System.out.println("Price: " + m20.price);
		System.out.println("Quantity: " + m20.quantity);
		System.out.println("Expiry Date: " + m20.expiryDate);
		System.out.println("Dosage: " + m20.dosage);
		System.out.println("Prescription Required: " + m20.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m21 = new Medicine();
		m21.medicineId = 21;
		m21.name = "Losartan";
		m21.brandName = "Losar";
		m21.price = 140;
		m21.quantity = 10;
		m21.expiryDate = "05-2027";
		m21.dosage = "50mg";
		m21.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m21.medicineId);
		System.out.println("Name: " + m21.name);
		System.out.println("Brand: " + m21.brandName);
		System.out.println("Price: " + m21.price);
		System.out.println("Quantity: " + m21.quantity);
		System.out.println("Expiry Date: " + m21.expiryDate);
		System.out.println("Dosage: " + m21.dosage);
		System.out.println("Prescription Required: " + m21.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m22 = new Medicine();
		m22.medicineId = 22;
		m22.name = "Atorvastatin";
		m22.brandName = "Atorva";
		m22.price = 150;
		m22.quantity = 10;
		m22.expiryDate = "08-2027";
		m22.dosage = "10mg";
		m22.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m22.medicineId);
		System.out.println("Name: " + m22.name);
		System.out.println("Brand: " + m22.brandName);
		System.out.println("Price: " + m22.price);
		System.out.println("Quantity: " + m22.quantity);
		System.out.println("Expiry Date: " + m22.expiryDate);
		System.out.println("Dosage: " + m22.dosage);
		System.out.println("Prescription Required: " + m22.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m23 = new Medicine();
		m23.medicineId = 23;
		m23.name = "Clopidogrel";
		m23.brandName = "Clopilet";
		m23.price = 170;
		m23.quantity = 10;
		m23.expiryDate = "09-2026";
		m23.dosage = "75mg";
		m23.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m23.medicineId);
		System.out.println("Name: " + m23.name);
		System.out.println("Brand: " + m23.brandName);
		System.out.println("Price: " + m23.price);
		System.out.println("Quantity: " + m23.quantity);
		System.out.println("Expiry Date: " + m23.expiryDate);
		System.out.println("Dosage: " + m23.dosage);
		System.out.println("Prescription Required: " + m23.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m24 = new Medicine();
		m24.medicineId = 24;
		m24.name = "Telmisartan";
		m24.brandName = "Telma";
		m24.price = 160;
		m24.quantity = 10;
		m24.expiryDate = "12-2027";
		m24.dosage = "40mg";
		m24.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m24.medicineId);
		System.out.println("Name: " + m24.name);
		System.out.println("Brand: " + m24.brandName);
		System.out.println("Price: " + m24.price);
		System.out.println("Quantity: " + m24.quantity);
		System.out.println("Expiry Date: " + m24.expiryDate);
		System.out.println("Dosage: " + m24.dosage);
		System.out.println("Prescription Required: " + m24.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m25 = new Medicine();
		m25.medicineId = 25;
		m25.name = "Glimepiride";
		m25.brandName = "Amaryl";
		m25.price = 140;
		m25.quantity = 10;
		m25.expiryDate = "11-2026";
		m25.dosage = "2mg";
		m25.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m25.medicineId);
		System.out.println("Name: " + m25.name);
		System.out.println("Brand: " + m25.brandName);
		System.out.println("Price: " + m25.price);
		System.out.println("Quantity: " + m25.quantity);
		System.out.println("Expiry Date: " + m25.expiryDate);
		System.out.println("Dosage: " + m25.dosage);
		System.out.println("Prescription Required: " + m25.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m26 = new Medicine();
		m26.medicineId = 26;
		m26.name = "Amlodipine";
		m26.brandName = "Amlong";
		m26.price = 90;
		m26.quantity = 10;
		m26.expiryDate = "07-2027";
		m26.dosage = "5mg";
		m26.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m26.medicineId);
		System.out.println("Name: " + m26.name);
		System.out.println("Brand: " + m26.brandName);
		System.out.println("Price: " + m26.price);
		System.out.println("Quantity: " + m26.quantity);
		System.out.println("Expiry Date: " + m26.expiryDate);
		System.out.println("Dosage: " + m26.dosage);
		System.out.println("Prescription Required: " + m26.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m27 = new Medicine();
		m27.medicineId = 27;
		m27.name = "Calcium";
		m27.brandName = "Shelcal";
		m27.price = 120;
		m27.quantity = 15;
		m27.expiryDate = "03-2028";
		m27.dosage = "500mg";
		m27.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m27.medicineId);
		System.out.println("Name: " + m27.name);
		System.out.println("Brand: " + m27.brandName);
		System.out.println("Price: " + m27.price);
		System.out.println("Quantity: " + m27.quantity);
		System.out.println("Expiry Date: " + m27.expiryDate);
		System.out.println("Dosage: " + m27.dosage);
		System.out.println("Prescription Required: " + m27.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m28 = new Medicine();
		m28.medicineId = 28;
		m28.name = "VitaminD3";
		m28.brandName = "Uprise";
		m28.price = 110;
		m28.quantity = 4;
		m28.expiryDate = "06-2028";
		m28.dosage = "60000IU";
		m28.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m28.medicineId);
		System.out.println("Name: " + m28.name);
		System.out.println("Brand: " + m28.brandName);
		System.out.println("Price: " + m28.price);
		System.out.println("Quantity: " + m28.quantity);
		System.out.println("Expiry Date: " + m28.expiryDate);
		System.out.println("Dosage: " + m28.dosage);
		System.out.println("Prescription Required: " + m28.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m29 = new Medicine();
		m29.medicineId = 29;
		m29.name = "Multivitamin";
		m29.brandName = "Revital";
		m29.price = 180;
		m29.quantity = 30;
		m29.expiryDate = "09-2027";
		m29.dosage = "OneDaily";
		m29.isPrescriptionRequired = false;

		System.out.println("Medicine Id: " + m29.medicineId);
		System.out.println("Name: " + m29.name);
		System.out.println("Brand: " + m29.brandName);
		System.out.println("Price: " + m29.price);
		System.out.println("Quantity: " + m29.quantity);
		System.out.println("Expiry Date: " + m29.expiryDate);
		System.out.println("Dosage: " + m29.dosage);
		System.out.println("Prescription Required: " + m29.isPrescriptionRequired);
		System.out.println("------------------------");

		Medicine m30 = new Medicine();
		m30.medicineId = 30;
		m30.name = "Insulin";
		m30.brandName = "Huminsulin";
		m30.price = 500;
		m30.quantity = 1;
		m30.expiryDate = "12-2025";
		m30.dosage = "Injection";
		m30.isPrescriptionRequired = true;

		System.out.println("Medicine Id: " + m30.medicineId);
		System.out.println("Name: " + m30.name);
		System.out.println("Brand: " + m30.brandName);
		System.out.println("Price: " + m30.price);
		System.out.println("Quantity: " + m30.quantity);
		System.out.println("Expiry Date: " + m30.expiryDate);
		System.out.println("Dosage: " + m30.dosage);
		System.out.println("Prescription Required: " + m30.isPrescriptionRequired);
		System.out.println("------------------------");


    }
}