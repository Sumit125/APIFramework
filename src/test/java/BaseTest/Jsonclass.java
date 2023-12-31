package BaseTest;

public class Jsonclass {

    public static String databody()
    {
         String data="{\n" +
                 "    \"medications\":[{\n" +
                 "            \"aceInhibitors\":[{\n" +
                 "                \"name\":\"lisinopril\",\n" +
                 "                \"strength\":\"10 mg Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"PO\",\n" +
                 "                \"sig\":\"daily\",\n" +
                 "                \"pillCount\":\"#90\",\n" +
                 "                \"refills\":\"Refill 3\"\n" +
                 "            }],\n" +
                 "            \"antianginal\":[{\n" +
                 "                \"name\":\"nitroglycerin\",\n" +
                 "                \"strength\":\"0.4 mg Sublingual Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"SL\",\n" +
                 "                \"sig\":\"q15min PRN\",\n" +
                 "                \"pillCount\":\"#30\",\n" +
                 "                \"refills\":\"Refill 1\"\n" +
                 "            }],\n" +
                 "            \"anticoagulants\":[{\n" +
                 "                \"name\":\"warfarin sodium\",\n" +
                 "                \"strength\":\"3 mg Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"PO\",\n" +
                 "                \"sig\":\"daily\",\n" +
                 "                \"pillCount\":\"#90\",\n" +
                 "                \"refills\":\"Refill 3\"\n" +
                 "            }],\n" +
                 "            \"betaBlocker\":[{\n" +
                 "                \"name\":\"metoprolol tartrate\",\n" +
                 "                \"strength\":\"25 mg Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"PO\",\n" +
                 "                \"sig\":\"daily\",\n" +
                 "                \"pillCount\":\"#90\",\n" +
                 "                \"refills\":\"Refill 3\"\n" +
                 "            }],\n" +
                 "            \"diuretic\":[{\n" +
                 "                \"name\":\"furosemide\",\n" +
                 "                \"strength\":\"40 mg Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"PO\",\n" +
                 "                \"sig\":\"daily\",\n" +
                 "                \"pillCount\":\"#90\",\n" +
                 "                \"refills\":\"Refill 3\"\n" +
                 "            }],\n" +
                 "            \"mineral\":[{\n" +
                 "                \"name\":\"potassium chloride ER\",\n" +
                 "                \"strength\":\"10 mEq Tab\",\n" +
                 "                \"dose\":\"1 tab\",\n" +
                 "                \"route\":\"PO\",\n" +
                 "                \"sig\":\"daily\",\n" +
                 "                \"pillCount\":\"#90\",\n" +
                 "                \"refills\":\"Refill 3\"\n" +
                 "            }]\n" +
                 "        }\n" +
                 "    ],\n" +
                 "    \"labs\":[{\n" +
                 "        \"name\":\"Arterial Blood Gas\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Main Hospital Lab\"      \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"BMP\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"BNP\",\n" +
                 "        \"time\":\"3 Weeks\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"BUN\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Cardiac Enzymes\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"CBC\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Creatinine\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Main Hospital Lab\"  \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Electrolyte Panel\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Glucose\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Main Hospital Lab\"  \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"PT/INR\",\n" +
                 "        \"time\":\"3 Weeks\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"PTT\",\n" +
                 "        \"time\":\"3 Weeks\",\n" +
                 "        \"location\":\"Coumadin Clinic\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"TSH\",\n" +
                 "        \"time\":\"1 Year\",\n" +
                 "        \"location\":\"Primary Care Clinic\"    \n" +
                 "        }\n" +
                 "    ],\n" +
                 "    \"imaging\":[{\n" +
                 "        \"name\":\"Chest X-Ray\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Main Hospital Radiology\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Chest X-Ray\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Main Hospital Radiology\"    \n" +
                 "        },\n" +
                 "        {\n" +
                 "        \"name\":\"Chest X-Ray\",\n" +
                 "        \"time\":\"Today\",\n" +
                 "        \"location\":\"Main Hospital Radiology\"    \n" +
                 "        }\n" +
                 "    ]\n" +
                 "}";
        return data;
    }
}
