import java.util.*;
/*
Afghanistan, $14.27 billion, Albania, $18.88 billion, Algeria, $191.913 billion, Andorra, $3.35 billion, Angola, $107.71 billion, Antigua and Barbuda, $1.76 billion, Argentina, $632.77 billion, Armenia, $19.50 billion, Australia, $1,675.42 billion, Austria, $471.4 billion, Azerbaijan, $78.72 billion, Bahamas, $12.90 billion, Bahrain, $44.39 billion, Bangladesh, $460.201 billion, Barbados, $5.64 billion, Belarus, $72.79 billion, Belgium, $578.604 billion, Belize, $2.82 billion, Benin, $17.40 billion, Bhutan, $2.77 billion, Bolivia, $43.07 billion, Bosnia and Herzegovina, $24.53 billion, Botswana, $20.35 billion, Brazil, $1,920.1 billion, Brunei, $16.68 billion, Bulgaria, $89.04 billion, Burkina Faso, $18.88 billion, Burundi, $3.07 billion, Cabo Verde, $2.31 billion, Cambodia, $29.96 billion, Cameroon, $44.34 billion, Canada, $2,139.84 billion, Central African Republic, $2.38 billion, Chad, $12.70 billion, Chile, $301.025 billion, China, $17,963.2 billion, Colombia, $343.939 billion, Comoros, $1.24 billion, Congo, Democratic Republic of the, $64.72 billion, Congo, $14.62 billion, Costa Rica, $68.38 billion, Côte d'Ivoire, $70.02 billion, Croatia, $70.96 billion, Cuba, $0.02 billion, Cyprus, $28.44 billion, Czech Republic (Czechia), $290.924 billion, Denmark, $395.404 billion, Djibouti, $2.10 billion, Dominica, $0.61 billion, Dominican Republic, $113.64 billion, Ecuador, $115.05 billion, Egypt, $476.748 billion, El Salvador, $32.49 billion, Equatorial Guinea, $11.81 billion, Eritrea, $2.58 billion, Estonia, $38.10 billion, Eswatini, $4.85 billion, Ethiopia, $126.783 billion, Fiji, $4.94 billion, Finland, $280.826 billion, France, $2,782.91 billion, Gabon, $21.07 billion, Gambia, $2.27 billion, Georgia, $24.61 billion, Germany, $4,072.19 billion, Ghana, $72.84 billion, Greece, $219.066 billion, Grenada, $1.26 billion, Guatemala, $95.00 billion, Guinea, $21.23 billion, Guinea-Bissau, $1.63 billion, Guyana, $15.36 billion, Haiti, $20.25 billion, Honduras, $31.72 billion, Hungary, $178.789 billion, Iceland, $27.84 billion, India, $3,385.09 billion, Indonesia, $1,319.1 billion, Iran, $388.544 billion, Iraq, $264.182 billion, Ireland, $529.245 billion, Israel, $522.033 billion, Italy, $2,010.43 billion, Jamaica, $17.10 billion, Japan, $4,231.14 billion, Jordan, $47.45 billion, Kazakhstan, $220.623 billion, Kenya, $113.42 billion, Kiribati, $0.22 billion, Korea, Democratic Republic of, $28.5 billion, Korea, Republic of, $1,723 billion, Kosovo, $9.43 billion, Kuwait, $184.558 billion, Kyrgyzstan, $10.93 billion, Laos, $15.72 billion, Latvia, $41.15 billion, Lebanon, $53.00 billion, Lesotho, $2.55 billion, Liberia, $4.00 billion, Libya, $45.75 billion, Liechtenstein, $6.25 billion, Lithuania, $70.33 billion, Luxembourg, $82.27 billion, Madagascar, $14.95 billion, Malawi, $13.16 billion, Malaysia, $406.306 billion, Maldives, $6.19 billion, Mali, $17.00 billion, Malta, $20.54 billion, Marshall Islands, $0.21 billion, Mauritania, $8.84 billion, Mauritius, $27.02 billion, Mexico, $1,271.74 billion,
Micronesia, $0.34 billion, Moldova, $11.29 billion, Monaco, $7.06 billion, Mongolia, $16.20 billion, Montenegro, $5.29 billion, Morocco, $124.94 billion, Mozambique, $15.74 billion, Myanmar (Burma), $84.63 billion, Namibia, $11.53 billion, Nauru, $0.11 billion, Nepal, $34.04 billion, Netherlands, $1,108.92 billion, New Zealand, $228.96 billion, Nicaragua, $14.97 billion, Niger, $12.82 billion, Nigeria, $448.12 billion, North Macedonia (formerly Macedonia), $12.59 billion, Norway, $434.75 billion, Oman, $78.52 billion, Pakistan, $315.13 billion, Palau, $0.31 billion, Panama, $73.97 billion, Papua New Guinea, $30.92 billion, Paraguay, $39.25 billion, Peru, $226.54 billion, Philippines, $430.40 billion, Poland, $637.48 billion, Portugal, $282.22 billion, Qatar, $207.61 billion, Romania, $251.99 billion, Russia, $1,464.07 billion, Rwanda, $12.63 billion, Saint Kitts and Nevis, $0.88 billion, Saint Lucia, $2.30 billion, Saint Vincent and the Grenadines, $1.10 billion, Samoa, $0.86 billion, San Marino, $2.06 billion, Sao Tome and Principe, $0.46 billion, Saudi Arabia, $2,617.41 billion, Senegal, $24.64 billion, Serbia, $52.58 billion, Seychelles, $1.50 billion, Sierra Leone, $3.97 billion, Singapore, $586.07 billion, Slovakia, $114.30 billion, Slovenia, $53.53 billion, Solomon Islands, $1.68 billion, Somalia, $4.10 billion, South Africa, $761.87 billion, South Sudan, $3.50 billion, Spain, $1,618.14 billion, Sri Lanka, $88.90 billion, Sudan, $63.49 billion, Suriname, $6.81 billion, Sweden, $617.41 billion, Switzerland, $844.94 billion, Syria, $22.24 billion, Taiwan, $1,362.04 billion, Tajikistan, $11.31 billion, Tanzania, $95.50 billion, Thailand, $1,236.34 billion, Togo, $6.62 billion, Tonga, $0.53 billion, Trinidad and Tobago, $25.81 billion, Tunisia, $49.82 billion, Turkey, $1,190.70 billion, Turkmenistan, $44.74 billion, Tuvalu, $0.04 billion, Uganda, $48.27 billion, Ukraine, $534.04 billion, United Arab Emirates, $421.14 billion, United Kingdom, $2,744.17 billion, United States, $23,193.43 billion, Uruguay, $64.51 billion, Uzbekistan, $71.66 billion, Vanuatu, $1.01 billion, Vatican City, $1.95 billion, Venezuela, $76.62 billion, Vietnam, $372.26 billion, Yemen, $31.53 billion, Zambia, $24.66 billion, Zimbabwe, $41.58 billion.

 */
/*
Afghanistan $356
Albania $6,810
Algeria $4,343
American Samoa $19,673
Andorra $41,993
Angola $3,000
Antigua and Barbuda $19,920
Argentina $13,651
Armenia $7,018
Aruba $33,301
Australia $65,100
Austria $52,085
Azerbaijan $7,762
Bahamas, The $31,458
Bahrain $30,147
Bangladesh $2,688
Barbados $20,239
Belarus $7,888
Belgium $49,927
Belize $6,984
Benin $1,303
Bermuda $118,775
Bhutan $3,560
Bolivia $3,600
Bosnia and Herzegovina $7,569
Botswana $7,739
Brazil $8,918
British Virgin Islands N/A
Brunei Darussalam $37,152
Bulgaria $13,974
Burkina Faso $830
Burundi $259
Cabo Verde $3,754
Cambodia $1,760
Cameroon $1,563
Canada $55,522
Cayman Islands $99,625
Central African Republic $427
Chad $717
Channel Islands $67,961
Chile $15,355
China $12,720
Colombia $6,624
Comoros $1,485
Congo, Dem. Rep. $654
Congo, Rep. $2,649
Costa Rica $13,365
Cote d'Ivoire $2,486
Croatia $18,570
Cuba $9,500
Curacao $20,502
Cyprus $32,048
Czechia $27,227
Denmark $67,790
Djibouti $3,136
Dominica $8,351
Dominican Republic $10,111
Ecuador $6,391
Egypt, Arab Rep. $4,295
El Salvador $5,127
Equatorial Guinea $7,182
Eritrea $644
Estonia $28,247
Eswatini $3,987
Ethiopia $1,028
Faroe Islands $66,979
Fiji $5,356
Finland $50,872
France $40,886
French Polynesia $18,985
Gabon $8,820
Gambia, The $808
Georgia $6,675
Germany $48,718
Ghana $2,204
Gibraltar N/A
Greece $20,867
Greenland $57,116
Grenada $9,689
Guam $35,905
Guatemala $5,473
Guinea $1,515
Guinea-Bissau $776
Guyana $18,199
Haiti $1,748
Honduras $3,040
Hong Kong SAR, China $48,984
Hungary $18,390
Iceland $73,467
India $2,411
Indonesia $4,788
Iran, Islamic Rep. $4,670
Iraq $5,937
Ireland $103,983
Isle of Man $79,531
Israel $54,931
Italy $34,776
Jamaica $6,047
Japan $34,017
Jordan $4,311
Kazakhstan $11,492
Kenya $2,099
Kiribati $1,702
Korea, Dem. People's Rep. N/A
Korea, Rep. $32,423
Kosovo $5,340
Kuwait $41,080
Kyrgyz Republic $1,655
Lao PDR $2,054
Latvia $21,780
Lebanon $4,136
Lesotho $970
Liberia $755
Libya $6,716
Liechtenstein $197,505
Lithuania $25,065*/
/*

 */
public class GeneralAssembly {
    public ArrayList<Nation>nations=new ArrayList<>();
    ArrayList<Integer>totalVotes=new ArrayList<>();

    public void addNation(String Country, double GDP,double GDPperCapita, double CINC){
        Nation nation=new Nation(Country,GDP,GDPperCapita,CINC);
        this.nations.add(nation);
    }
    public void printNations(){
        for (Nation nation: nations){
            System.out.println(nation.getName());
    }

    }

    public void createNationList(){
        /*
        Afghanistan .001420, Albania .000276, Algeria .005290, Andorra .000003, Angola .002483, Antigua and Barbuda .000003, Argentina .004721, Armenia .000614, Australia .007113, Austria .002572, Azerbaijan .001279, Bahamas .000044, Bahrain .000390, Bangladesh .008060, Barbados .000020, Belarus .002557, Belgium .003895, Belize .000021, Benin .000370, Bhutan .000046, Bolivia .001050, Bosnia and Herzegovina .000400, Botswana .000187, Brazil .024597, Brunei .000145, Bulgaria .001422, Burkina Faso .000645, Burundi .000562, Cambodia .001556, Cameroon .000951, Canada .010683, Central African Republic .000206, Chad .000568, Chile .003107, China .198578, Colombia .006174, Comoros .000024, Congo, Democratic Republic of the .004175, Congo .000361, Costa Rica .000240, COTE D'IVOIRE 0.000000, Croatia .000580, Cuba .001352, Cyprus .000202, Czech Republic .002353, Denmark .001493, Djibouti .000150, Dominica .000002, Dominican Republic .000969, Ecuador .001518, Egypt .009713, El Salvador .000575, Equatorial Guinea .000109, Eritrea .002256, Estonia .000253, Eswatini .000057, Ethiopia .003858, Fiji .000081, Finland .002144, France .018924, Gabon .000153, Gambia .000051, Georgia .000504, Germany .024082, Ghana .001109, Greece .003813, Grenada .000003, Guatemala .000789, Guinea .000458
         */
        addNation("AFGHANISTAN", 14.27E9, 356, 0.001420);
        addNation("ALBANIA", 18.88E9, 6810, 0.000276);
        addNation("ALGERIA", 191.913E9, 4343, 0.005290);
        addNation("ANDORRA", 3.35E9, 41993, 0.000003);
        addNation("ANGOLA", 107.71E9, 3000, 0.002483);
        addNation("ANTIGUA AND BARBUDA", 1.76E9, 19920, 0.000003);
        addNation("ARGENTINA", 632.77E9, 13651, 0.004721);
        addNation("ARMENIA", 19.50E9, 7018, 0.000614);
        addNation("AUSTRALIA", 1675.42E9, 65100, 0.007113);
        addNation("AUSTRIA", 471.4E9, 52085, 0.002572);
        addNation("AZERBAIJAN", 78.72E9, 7762, 0.001279);
        addNation("BAHAMAS", 12.90E9, 31458, 0.000044);
        addNation("BAHRAIN", 44.39E9, 30147, 0.000390);
        addNation("BANGLADESH", 460.201E9, 2688, 0.008060);
        addNation("BARBADOS", 5.64E9, 20239, 0.000020);
        addNation("BELARUS", 72.79E9, 7888, 0.002557);
        addNation("BELGIUM", 578.604E9, 49927, 0.003895);
        addNation("BELIZE", 2.82E9, 6984, 0.000021);
        addNation("BENIN", 17.40E9, 1303, 0.000370);
        addNation("BHUTAN", 2.77E9, 3560, 0.000046);
        addNation("BOLIVIA", 43.07E9, 3600, 0.001050);
        addNation("BOSNIA AND HERZEGOVINA", 24.53E9, 7569, 0.000400);
        addNation("BOTSWANA", 20.35E9, 7739, 0.000187);
        addNation("BRAZIL", 1920.1E9, 8918, 0.024597);
        addNation("BRUNEI DARUSSALAM", 16.68E9, 37152, 0.000145);
        addNation("BULGARIA", 89.04E9, 13974, 0.001422);
        addNation("BURKINA FASO", 18.88E9, 830, 0.000645);
        addNation("BURUNDI", 3.07E9, 259, 0.000562);
        addNation("CAMBODIA", 29.96E9, 1760, 0.001556);
        addNation("CAMEROON", 44.34E9, 1563, 0.000951);
        addNation("CANADA", 2139.84E9, 55522, 0.010683);
        addNation("CENTRAL AFRICAN REPUBLIC", 2.38E9, 427, 0.000206);
        addNation("CHAD", 12.70E9, 717, 0.000568);
        addNation("CHILE", 301.025E9, 15355, 0.003107);
        addNation("CHINA", 17963.2E9, 12720, 0.198578);
        addNation("COLOMBIA", 343.939E9, 6624, 0.006174);
        addNation("COMOROS", 1.24E9, 1485, 0.000024);
        addNation("CONGO, DEMOCRATIC REPUBLIC OF THE", 64.72E9, 654, 0.004175);
        addNation("CONGO", 14.62E9, 2649, 0.000361);
        addNation("COSTA RICA", 68.38E9, 13365, 0.000240);
        addNation("COTE D'IVOIRE", 70.02E9, 2486, 0.0);
        addNation("CROATIA", 70.96E9, 18570, 0.000580);
        addNation("CUBA", 0.02E9, 9500, 0.001352);
        addNation("CYPRUS", 28.44E9, 32048, 0.000202);
        addNation("CZECH REPUBLIC", 290.924E9, 27227, 0.002353);
        addNation("DENMARK", 395.404E9, 67790, 0.001493);
        addNation("DJIBOUTI", 2.10E9, 3136, 0.000150);
        addNation("DOMINICA", 0.61E9, 8351, 0.000002);
        addNation("DOMINICAN REPUBLIC", 113.64E9, 10111, 0.000969);
        addNation("ECUADOR", 115.05E9, 6720, 0.001518);
        addNation("EGYPT", 476.748E9, 3542, 0.009713);
        addNation("EL SALVADOR", 32.49E9, 8517, 0.000575);
        addNation("EQUATORIAL GUINEA", 11.81E9, 21695, 0.000109);
        addNation("ERITREA", 2.58E9, 714, 0.002256);
        addNation("ESTONIA", 38.10E9, 25385, 0.000253);
        addNation("ETHIOPIA", 126.783E9, 1039, 0.003858);
        addNation("FIJI", 4.94E9, 5832, 0.000081);
        addNation("FINLAND", 280.826E9, 49887, 0.002144);
        addNation("FRANCE", 2782.91E9, 42955, 0.018924);
        addNation("GABON", 21.07E9, 8512, 0.000153);
        addNation("GAMBIA, THE", 2.27E9, 766, 0.000051);
        addNation("GEORGIA", 24.61E9, 4476, 0.000504);
        addNation("GERMANY", 4072.19E9, 53730, 0.024082);
        addNation("GHANA", 72.84E9, 2224, 0.001109);
        addNation("GREECE", 219.066E9, 19660, 0.003813);
        addNation("GRENADA", 1.26E9, 9217, 0.000003);
        addNation("GUATEMALA", 95.00E9, 5075, 0.000789);
        addNation("GUINEA", 21.23E9, 961, 0.000458);
        addNation("GUINEA-BISSAU", 1.63E9, 739, 0.000132);
        addNation("GUYANA", 15.36E9, 4696, 0.000049);
        addNation("HAITI", 20.25E9, 801, 0.000542);
        addNation("HONDURAS", 31.72E9, 3660, 0.000454);
        addNation("HUNGARY", 178.789E9, 17673, 0.001608);
        addNation("ICELAND", 27.84E9, 72503, 0.000043);
        addNation("INDIA", 3385.09E9, 2459, 0.073444);
        addNation("INDONESIA", 1319.1E9, 4196, 0.013708);
        addNation("IRAN", 388.544E9, 14050, 0.013450);
        addNation("IRAQ", 264.182E9, 5559, 0.005222);
        addNation("IRELAND", 529.245E9, 82322, 0.000635);
        addNation("ISRAEL", 522.033E9, 44177, 0.003638);
        addNation("ITALY", 2010.43E9, 35785, 0.017420);
        addNation("IVORY COAST", 70.02E9, 0, 0.001173);
        addNation("JAMAICA", 17.10E9, 5079, 0.000192);
        addNation("JAPAN", 4231.14E9, 48791, 0.042675);
        addNation("JORDAN", 47.45E9, 4397, 0.001448);
        addNation("KAZAKHSTAN", 220.623E9, 9828, 0.003233);
        addNation("KENYA", 113.42E9, 2015, 0.001777);
        addNation("KIRIBATI", 0.22E9, 3176, 0.000002);
        addNation("KOREA, DEMOCRATIC REPUBLIC OF", 28.5E9, 1579, 0.003745);
        addNation("KOREA, REPUBLIC OF", 1723.0E9, 38166, 0.020732);
        addNation("KOSOVO", 9.43E9, 4394, 0.0);
        addNation("KUWAIT", 184.558E9, 71211, 0.001334);
        addNation("KYRGYZSTAN", 10.93E9, 1394, 0.000357);
        addNation("LAOS", 15.72E9, 2474, 0.000471);
        addNation("LATVIA", 41.15E9, 18167, 0.000345);
        addNation("LEBANON", 53.00E9, 11619, 0.000844);
        addNation("LESOTHO", 2.55E9, 1238, 0.000098);
        addNation("LIBERIA", 4.00E9, 741, 0.000223);
        addNation("LIBYA", 45.75E9, 7918, 0.001763);
        addNation("LIECHTENSTEIN", 6.25E9, 155162, 0.000002);
        addNation("LITHUANIA", 70.33E9, 19146, 0.000442);
        addNation("LUXEMBOURG", 82.27E9, 125006, 0.000428);
        addNation("MADAGASCAR", 14.95E9, 517, 0.000711);
        addNation("MALAWI", 13.16E9, 645, 0.000527);
        addNation("MALAYSIA", 406.306E9, 11993, 0.004403);
        addNation("MALDIVES", 6.19E9, 11781, 0.000029);
        addNation("MALI", 17.00E9, 833, 0.000516);
        addNation("MALTA", 20.54E9, 34128, 0.000035);
        addNation("Marshall Islands", 0.21E9, 6225, 0.000001);
        addNation("Mauritania", 8.84E9, 2065, 0.000270);
        addNation("Mauritius", 27.02E9, 10256, 0.000062);
        addNation("Mexico", 1271.74E9, 11497, 0.012269);
        addNation("Micronesia", 0.34E9, 3714, 0.000003);
        addNation("Moldova", 11.29E9, 5714, 0.000346);
        addNation("Monaco", 7.06E9, 240862, 0.000003);
        addNation("Mongolia", 16.20E9, 5046, 0.000249);
        addNation("Montenegro", 5.29E9, 10093, 0.000133);
        addNation("Morocco", 124.94E9, 3442, 0.004471);
        addNation("Mozambique", 15.74E9, 558, 0.001032);
        addNation("Myanmar (Burma)", 84.63E9, 1149, 0.004771);
        addNation("Namibia", 11.53E9, 5031, 0.000277);
        addNation("Nauru", 0.11E9, 11971, 0.000001);
        addNation("Nepal", 40.83E9, 1337, 0.001842);
        addNation("Netherlands", 1108.92E9, 57025, 0.004666);
        addNation("New Zealand", 228.96E9, 48419, 0.001911);
        addNation("Nicaragua", 14.97E9, 2255, 0.000515);
        addNation("Niger", 12.82E9, 585, 0.000461);
        addNation("Nigeria", 448.12E9, 2163, 0.023842);
        addNation("North Macedonia (formerly Macedonia)", 12.59E9, 6591, 0.000220);
        addNation("Norway", 434.75E9, 108729, 0.002049);
        addNation("Oman", 78.52E9, 25057, 0.000584);
        addNation("Pakistan", 315.13E9, 1589, 0.012568);
        addNation("Palau", 0.31E9, 12922, 0.000001);
        addNation("Panama", 73.97E9, 17358, 0.000393);
        addNation("Papua New Guinea", 30.92E9, 3116, 0.000396);
        addNation("Paraguay", 39.25E9, 6153, 0.000899);
        addNation("Peru", 226.54E9, 7126, 0.006529);
        addNation("Philippines", 430.40E9, 3499, 0.010618);
        addNation("Poland", 637.48E9, 18688, 0.008152);
        addNation("Portugal", 282.22E9, 24515, 0.003119);
        addNation("Qatar", 207.61E9, 87661, 0.000542);
        addNation("Romania", 251.99E9, 15787, 0.004783);
        addNation("Russia", 1464.07E9, 15271, 0.065244);
        addNation("Rwanda", 12.63E9, 966, 0.000854);
        addNation("Saint Kitts and Nevis", 0.88E9, 20262, 0.000002);
        addNation("Saint Lucia", 2.30E9, 23000, 0.000002);
        addNation("Saint Vincent and the Grenadines", 1.10E9, 13031, 0.000002);
        addNation("Samoa", 0.86E9, 3746, 0.000004);
        addNation("San Marino", 2.06E9, 54982, 0.000002);
        addNation("Sao Tome and Principe", 0.46E9, 2387, 0.000043);
        addNation("Saudi Arabia", 2617.41E9, 30448, 0.022348);
        addNation("Senegal", 24.64E9, 1599, 0.001152);
        addNation("Serbia", 52.58E9, 9538, 0.001650);
        addNation("Seychelles", 1.50E9, 13250, 0.000009);
        addNation("Sierra Leone", 3.97E9, 476, 0.000398);
        addNation("Singapore", 586.07E9, 82808, 0.003628);
        addNation("Slovakia", 114.30E9, 21257, 0.001107);
        addNation("Slovenia", 53.53E9, 28439, 0.000715);
        addNation("Solomon Islands", 1.68E9, 2205, 0.000022);
        addNation("Somalia", 4.10E9, 589, 0.001555);
        addNation("South Africa", 761.87E9, 3202, 0.009285);
        addNation("South Sudan", 3.50E9, 303, 0.000332);
        addNation("Spain", 1618.14E9, 14105, 0.014938);
        addNation("Sri Lanka", 88.90E9, 8580, 0.003324);
        addNation("Sudan", 63.49E9, 1431, 0.002819);
        addNation("Suriname", 6.81E9, 4303, 0.000047);
        addNation("Sweden", 617.41E9, 51615, 0.003837);
        addNation("Switzerland", 844.94E9, 73366, 0.004447);
        addNation("Syria", 22.24E9, 2583, 0.002019);
        addNation("Taiwan", 1362.04E9, 61700, 0.010299);
        addNation("Tajikistan", 11.31E9, 4709, 0.000365);
        addNation("Tanzania", 95.50E9, 1492, 0.002337);
        addNation("Thailand", 1236.34E9, 5506, 0.008526);
        addNation("Togo", 6.62E9, 5282, 0.000403);
        addNation("Tonga", 0.53E9, 4089, 0.000004);
        addNation("Trinidad and Tobago", 25.81E9, 21380, 0.000267);
        addNation("Tunisia", 49.82E9, 3766, 0.002122);
        addNation("Turkey", 1190.70E9, 2514, 0.017698);
        addNation("Turkmenistan", 44.74E9, 3957, 0.000512);
        addNation("Tuvalu", 0.04E9, 39184, 0.000001);
        addNation("Uganda", 48.27E9, 6778, 0.002003);
        addNation("Ukraine", 534.04E9, 1757, 0.007708);
        addNation("United Arab Emirates", 421.14E9, 42707, 0.013751);
        addNation("United Kingdom", 2744.17E9, 31772, 0.029589);
        addNation("United States", 23193.43E9, 24360, 0.154972);
        addNation("Uruguay", 64.51E9, 6638, 0.000944);
        addNation("Uzbekistan", 71.66E9, 6629, 0.002285);
        addNation("Vanuatu", 1.01E9, 3111, 0.000022);
        addNation("Vatican City", 1.95E9, 0, 0.000002);
        addNation("Venezuela", 76.62E9, 4868, 0.003608);
        addNation("Vietnam", 372.26E9, 3186, 0.009073);
        addNation("Yemen", 31.53E9, 6963, 0.004757);
        addNation("Zambia", 24.66E9, 2701, 0.001173);
        addNation("Zimbabwe", 41.58E9, 4282, 0.001145);
    }
    public void printPowers(){
        int n=0;
        double z=0;
        for (Nation nation:nations){
            System.out.printf("%s has a power of %.6f\n",nation.getName(),nation.getPower());
            n+=1;
            z+=nation.getPower();
        }
        System.out.println("Total Countries: "+n);
        System.out.println("power t"+ z);
    }


}
