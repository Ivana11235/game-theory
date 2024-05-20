import java.util.*;
/**
 * The GeneralAssembly class represents a general assembly of nations. It contains a list of nations and a list of issues
   to be discussed. The assembly can initiate a conference, where an issue of discussion is selected, and each nation in the assembly
   participates by voting and adding a payoff based on their power. After the conference ends, the results are calculated,
   including the voting statistics, total power, and the final result of the resolution. The class also determines the outcome
   for rebellious nations and provides information on the payoff distribution.
 */
public class GeneralAssembly {
    // List of nations in the general assembly
    public ArrayList<Nation> nations = new ArrayList<Nation>() {
        {
            add( new Nation("AFGHANISTAN", 14.27E9, 356, 0.001420, "Asia"));
            add( new Nation("ALBANIA", 18.88E9, 6810, 0.000276, "Europe"));
            add( new Nation("ALGERIA", 191.913E9, 4343, 0.005290, "Africa"));
            add( new Nation("ANDORRA", 3.35E9, 41993, 0.000003, "Europe"));
            add( new Nation("ANGOLA", 107.71E9, 3000, 0.002483, "Africa"));
            add( new Nation("ANTIGUA AND BARBUDA", 1.76E9, 19920, 0.000003, "North America"));
            add( new Nation("ARGENTINA", 632.77E9, 13651, 0.004721, "South America"));
            add( new Nation("ARMENIA", 19.50E9, 7018, 0.000614, "Asia"));
            add( new Nation("AUSTRALIA", 1675.42E9, 65100, 0.007113, "Oceania"));
            add( new Nation("AUSTRIA", 471.4E9, 52085, 0.002572, "Europe"));
            add( new Nation("AZERBAIJAN", 78.72E9, 7762, 0.001279, "Asia"));
            add( new Nation("BAHAMAS", 12.90E9, 31458, 0.000044, "North America"));
            add( new Nation("BAHRAIN", 44.39E9, 30147, 0.000390, "Asia"));
            add( new Nation("BANGLADESH", 460.201E9, 2688, 0.008060, "Asia"));
            add( new Nation("BARBADOS", 5.64E9, 20239, 0.000020, "North America"));
            add( new Nation("BELARUS", 72.79E9, 7888, 0.002557, "Europe"));
            add( new Nation("BELGIUM", 578.604E9, 49927, 0.003895, "Europe"));
            add( new Nation("BELIZE", 2.82E9, 6984, 0.000021, "North America"));
            add( new Nation("BENIN", 17.40E9, 1303, 0.000370, "Africa"));
            add( new Nation("BHUTAN", 2.77E9, 3560, 0.000046, "Asia"));
            add( new Nation("BOLIVIA", 43.07E9, 3600, 0.001050, "South America"));
            add( new Nation("BOSNIA AND HERZEGOVINA", 24.53E9, 7569, 0.000400, "Europe"));
            add( new Nation("BOTSWANA", 20.35E9, 7739, 0.000187, "Africa"));
            add( new Nation("BRAZIL", 1920.1E9, 8918, 0.024597, "South America"));
            add( new Nation("BRUNEI DARUSSALAM", 16.68E9, 37152, 0.000145, "Asia"));
            add( new Nation("BULGARIA", 89.04E9, 13974, 0.001422, "Europe"));
            add( new Nation("BURKINA FASO", 18.88E9, 830, 0.000645, "Africa"));
            add( new Nation("BURUNDI", 3.07E9, 259, 0.000562, "Africa"));
            add( new Nation("Cabo Verde", 2.227E8, 3754.3, 0, "Africa"));
            add( new Nation("CAMBODIA", 29.96E9, 1760, 0.001556, "Asia"));
            add( new Nation("CAMEROON", 44.34E9, 1563, 0.000951, "Africa"));
            add( new Nation("CANADA", 2139.84E9, 55522, 0.010683, "North America"));
            add( new Nation("CENTRAL AFRICAN REPUBLIC", 2.38E9, 427, 0.000206, "Africa"));
            add( new Nation("CHAD", 12.70E9, 717, 0.000568, "Africa"));
            add( new Nation("CHILE", 301.025E9, 15355, 0.003107, "South America"));
            add( new Nation("CHINA", 17963.2E9, 12720, 0.198578, "Asia"));
            add( new Nation("COLOMBIA", 343.939E9, 6624, 0.006174, "South America"));
            add( new Nation("COMOROS", 1.24E9, 1485, 0.000024, "Africa"));
            add( new Nation("CONGO, DEMOCRATIC REPUBLIC OF THE", 64.72E9, 654, 0.004175, "Africa"));
            add( new Nation("CONGO", 14.62E9, 2649, 0.000361, "Africa"));
            add( new Nation("COSTA RICA", 68.38E9, 13365, 0.000240, "North America"));
            add( new Nation("COTE D'IVOIRE", 70.02E9, 2486, 0.0, "Africa"));
            add( new Nation("CROATIA", 70.96E9, 18570, 0.000580, "Europe"));
            add( new Nation("CUBA", 0.02E9, 9500, 0.001352, "North America"));
            add( new Nation("CYPRUS", 28.44E9, 32048, 0.000202, "Asia"));
            add( new Nation("CZECH REPUBLIC", 290.924E9, 27227, 0.002353, "Europe"));
            add( new Nation("DENMARK", 395.404E9, 67790, 0.001493, "Europe"));
            add( new Nation("DJIBOUTI", 2.10E9, 3136, 0.000150, "Africa"));
            add( new Nation("DOMINICA", 0.61E9, 8351, 0.000002, "North America"));
            add( new Nation("DOMINICAN REPUBLIC", 113.64E9, 10111, 0.000969, "North America"));
            add( new Nation("ECUADOR", 115.05E9, 6720, 0.001518, "South America"));
            add( new Nation("EGYPT", 476.748E9, 4295, 0.009713, "Africa"));
            add( new Nation("EL SALVADOR", 32.49E9, 8517, 0.000575, "North America"));
            add( new Nation("EQUATORIAL GUINEA", 11.81E9, 21695, 0.000109, "Africa"));
            add( new Nation("ERITREA", 2.58E9, 714, 0.002256, "Africa"));
            add( new Nation("ESTONIA", 38.10E9, 25385, 0.000253, "Europe"));
            add( new Nation("ESWATINI", 4.791E9, 3987, 0.000057, "Africa"));
            add( new Nation("ETHIOPIA", 126.783E9, 1039, 0.003858, "Africa"));
            add( new Nation("FIJI", 4.94E9, 5832, 0.000081, "Oceania"));
            add( new Nation("FINLAND", 280.826E9, 49887, 0.002144, "Europe"));
            add( new Nation("FRANCE", 2782.91E9, 42955, 0.018924, "Europe"));
            add( new Nation("GABON", 21.07E9, 8512, 0.000153, "Africa"));
            add( new Nation("GAMBIA, THE", 2.27E9, 766, 0.000051, "Africa"));
            add( new Nation("GEORGIA", 24.61E9, 4476, 0.000504, "Asia"));
            add( new Nation("GERMANY", 4072.19E9, 53730, 0.024082, "Europe"));
            add( new Nation("GHANA", 72.84E9, 2224, 0.001109, "Africa"));
            add( new Nation("GREECE", 219.066E9, 19660, 0.003813, "Europe"));
            add( new Nation("GRENADA", 1.26E9, 9217, 0.000003, "North America"));
            add( new Nation("GUATEMALA", 95.00E9, 5075, 0.000789, "North America"));
            add( new Nation("GUINEA", 21.23E9, 961, 0.000458, "Africa"));
            add( new Nation("GUINEA-BISSAU", 1.63E9, 739, 0.000132, "Africa"));
            add( new Nation("GUYANA", 15.36E9, 4696, 0.000049, "South America"));
            add( new Nation("HAITI", 20.25E9, 801, 0.000542, "North America"));
            add( new Nation("HONDURAS", 31.72E9, 3660, 0.000454, "North America"));
            add( new Nation("HUNGARY", 178.789E9, 17673, 0.001608, "Europe"));
            add( new Nation("ICELAND", 27.84E9, 72503, 0.000043, "Europe"));
            add( new Nation("INDIA", 3385.09E9, 2459, 0.073444, "Asia"));
            add( new Nation("INDONESIA", 1319.1E9, 4196, 0.013708, "Asia"));
            add( new Nation("IRAN", 413.5E9, 14050, 0.013450, "Asia"));
            add( new Nation("IRAQ", 264.182E9, 5559, 0.005222, "Asia"));
            add( new Nation("IRELAND", 529.245E9, 82322, 0.000635, "Europe"));
            add( new Nation("ISRAEL", 522.033E9, 44177, 0.003638, "Asia"));
            add( new Nation("ITALY", 2010.43E9, 35785, 0.017420, "Europe"));
            add( new Nation("JAMAICA", 17.10E9, 5079, 0.000192, "North America"));
            add( new Nation("JAPAN", 4231.14E9, 48791, 0.042675, "Asia"));
            add( new Nation("JORDAN", 47.45E9, 4397, 0.001448, "Asia"));
            add( new Nation("KAZAKHSTAN", 220.623E9, 9828, 0.003233, "Asia"));
            add( new Nation("KENYA", 113.42E9, 2015, 0.001777, "Africa"));
            add( new Nation("KIRIBATI", 0.22E9, 3176, 0.000002, "Oceania"));
            add( new Nation("KOREA, DEMOCRATIC REPUBLIC OF", 28.5E9, 1579, 0.003745, "Asia"));
            add( new Nation("KOREA, REPUBLIC OF", 1723.0E9, 38166, 0.020732, "Asia"));
            add( new Nation("KUWAIT", 184.558E9, 71211, 0.001334, "Asia"));
            add( new Nation("KYRGYZSTAN", 10.93E9, 1394, 0.000357, "Asia"));
            add( new Nation("LAOS", 15.72E9, 2474, 0.000471, "Asia"));
            add( new Nation("LATVIA", 41.15E9, 18167, 0.000345, "Europe"));
            add( new Nation("LEBANON", 53.00E9, 11619, 0.000844, "Asia"));
            add( new Nation("LESOTHO", 2.55E9, 1238, 0.000098, "Africa"));
            add( new Nation("LIBERIA", 4.00E9, 741, 0.000223, "Africa"));
            add( new Nation("LIBYA", 45.75E9, 7918, 0.001763, "Africa"));
            add( new Nation("LIECHTENSTEIN", 6.25E9, 155162, 0.000002, "Europe"));
            add( new Nation("LITHUANIA", 70.33E9, 19146, 0.000442, "Europe"));
            add( new Nation("LUXEMBOURG", 82.27E9, 125006, 0.000428, "Europe"));
            add( new Nation("MADAGASCAR", 14.95E9, 517, 0.000711, "Africa"));
            add( new Nation("MALAWI", 13.16E9, 645, 0.000527, "Africa"));
            add( new Nation("MALAYSIA", 406.306E9, 11993, 0.004403, "Asia"));
            add( new Nation("MALDIVES", 6.19E9, 11781, 0.000029, "Asia"));
            add( new Nation("MALI", 17.00E9, 833, 0.000516, "Africa"));
            add( new Nation("MALTA", 20.54E9, 34128, 0.000035, "Europe"));
            add( new Nation("Marshall Islands", 0.21E9, 6225, 0.000001, "Oceania"));
            add( new Nation("Mauritania", 8.84E9, 2065, 0.000270, "Africa"));
            add( new Nation("Mauritius", 27.02E9, 10256, 0.000062, "Africa"));
            add( new Nation("Mexico", 1271.74E9, 11497, 0.012269, "North America"));
            add( new Nation("Micronesia", 0.34E9, 3714, 0.000003, "Oceania"));
            add( new Nation("Monaco", 7.06E9, 240862, 0.000003, "Europe"));
            add( new Nation("Mongolia", 16.20E9, 5046, 0.000249, "Asia"));
            add( new Nation("Montenegro", 5.29E9, 10093, 0.000133, "Europe"));
            add( new Nation("Morocco", 124.94E9, 3442, 0.004471, "Africa"));
            add( new Nation("Mozambique", 15.74E9, 558, 0.001032, "Africa"));
            add( new Nation("Myanmar (Burma)", 84.63E9, 1149, 0.004771, "Asia"));
            add( new Nation("Namibia", 11.53E9, 5031, 0.000277, "Africa"));
            add( new Nation("Nauru", 0.11E9, 11971, 0.000001, "Oceania"));
            add( new Nation("Nepal", 40.83E9, 1337, 0.001842, "Asia"));
            add( new Nation("Netherlands", 1108.92E9, 57025, 0.004666, "Europe"));
            add( new Nation("New Zealand", 228.96E9, 48419, 0.001911, "Oceania"));
            add( new Nation("Nicaragua", 14.97E9, 2255, 0.000515, "North America"));
            add( new Nation("Niger", 12.82E9, 585, 0.000461, "Africa"));
            add( new Nation("Nigeria", 472.6E9, 2163, 0.023842, "Africa"));
            add( new Nation("North Macedonia (formerly Macedonia)", 12.59E9, 6591, 0.000220, "Europe"));
            add( new Nation("Norway", 434.75E9, 108729, 0.002049, "Europe"));
            add( new Nation("Oman", 78.52E9, 25057, 0.000584, "Asia"));
            add( new Nation("Pakistan", 315.13E9, 1589, 0.012568, "Asia"));
            add( new Nation("Palau", 0.31E9, 12922, 0.000001, "Oceania"));
            add( new Nation("Panama", 73.97E9, 17358, 0.000393, "North America"));
            add( new Nation("Papua New Guinea", 30.92E9, 3116, 0.000396, "Oceania"));
            add( new Nation("Paraguay", 39.25E9, 6153, 0.000899, "South America"));
            add( new Nation("Peru", 226.54E9, 7126, 0.006529, "South America"));
            add( new Nation("Philippines", 430.40E9, 3499, 0.010618, "Asia"));
            add( new Nation("Poland", 637.48E9, 18688, 0.008152, "Europe"));
            add( new Nation("Portugal", 282.22E9, 24515, 0.003119, "Europe"));
            add( new Nation("Qatar", 207.61E9, 87661, 0.000542, "Asia"));
            add( new Nation("Romania", 251.99E9, 15787, 0.004783, "Europe"));
            add( new Nation("Russia", 2240E9, 15271, 0.065244, "Europe"));
            add( new Nation("Rwanda", 12.63E9, 966, 0.000854, "Africa"));
            add( new Nation("Saint Kitts and Nevis", 0.88E9, 20262, 0.000002, "North America"));
            add( new Nation("Saint Lucia", 2.30E9, 23000, 0.000002, "North America"));
            add( new Nation("Saint Vincent and the Grenadines", 1.10E9, 13031, 0.000002, "North America"));
            add( new Nation("Samoa", 0.86E9, 3746, 0.000004, "Oceania"));
            add( new Nation("San Marino", 2.06E9, 54982, 0.000002, "Europe"));
            add( new Nation("Sao Tome and Principe", 0.46E9, 2387, 0.000043, "Africa"));
            add( new Nation("Saudi Arabia", 2617.41E9, 30448, 0.022348, "Asia"));
            add( new Nation("Senegal", 24.64E9, 1599, 0.001152, "Africa"));
            add( new Nation("Serbia", 52.58E9, 9538, 0.001650, "Europe"));
            add( new Nation("Seychelles", 1.50E9, 13250, 0.000009, "Africa"));
            add( new Nation("Sierra Leone", 3.97E9, 476, 0.000398, "Africa"));
            add( new Nation("Singapore", 586.07E9, 82808, 0.003628, "Asia"));
            add( new Nation("Slovakia", 114.30E9, 21257, 0.001107, "Europe"));
            add( new Nation("Slovenia", 53.53E9, 28439, 0.000715, "Europe"));
            add( new Nation("Solomon Islands", 1.68E9, 2205, 0.000022, "Oceania"));
            add( new Nation("Somalia", 4.10E9, 589, 0.001555, "Africa"));
            add( new Nation("South Africa", 761.87E9, 3202, 0.009285, "Africa"));
            add( new Nation("South Sudan", 3.50E9, 303, 0.000332, "Africa"));
            add( new Nation("Spain", 1618.14E9, 14105, 0.014938, "Europe"));
            add( new Nation("Sri Lanka", 88.90E9, 8580, 0.003324, "Asia"));
            add( new Nation("Sudan", 63.49E9, 1431, 0.002819, "Africa"));
            add( new Nation("Suriname", 6.81E9, 4303, 0.000047, "South America"));
            add( new Nation("Sweden", 617.41E9, 51615, 0.003837, "Europe"));
            add( new Nation("Switzerland", 844.94E9, 73366, 0.004447, "Europe"));
            add( new Nation("Syria", 22.24E9, 2583, 0.002019, "Asia"));
            add( new Nation("Taiwan", 1362.04E9, 61700, 0.010299, "Asia"));
            add( new Nation("Tajikistan", 11.31E9, 4709, 0.000365, "Asia"));
            add( new Nation("Tanzania", 95.50E9, 1492, 0.002337, "Africa"));
            add( new Nation("Thailand", 1236.34E9, 5506, 0.008526, "Asia"));
            add( new Nation("Timor-Leste", 3.205E9, 2389, 0.00004, "Asia"));
            add( new Nation("Togo", 6.62E9, 5282, 0.000403, "Africa"));
            add( new Nation("Tonga", 0.53E9, 4089, 0.000004, "Oceania"));
            add( new Nation("Trinidad and Tobago", 25.81E9, 21380, 0.000267, "North America"));
            add( new Nation("Tunisia", 49.82E9, 3766, 0.002122, "Africa"));
            add( new Nation("Turkey", 1190.70E9, 2514, 0.017698, "Asia"));
            add( new Nation("Turkmenistan", 44.74E9, 3957, 0.000512, "Asia"));
            add( new Nation("Tuvalu", 0.04E9, 39184, 0.000001, "Oceania"));
            add( new Nation("Uganda", 48.27E9, 6778, 0.002003, "Africa"));
            add( new Nation("Ukraine", 534.04E9, 1757, 0.007708, "Europe"));
            add( new Nation("United Arab Emirates", 421.14E9, 42707, 0.013751, "Asia"));
            add( new Nation("United Kingdom", 2744.17E9, 31772, 0.029589, "Europe"));
            add( new Nation("United States", 23193.43E9, 24360, 0.154972, "North America"));
            add( new Nation("Uruguay", 64.51E9, 6638, 0.000944, "South America"));
            add( new Nation("Uzbekistan", 71.66E9, 6629, 0.002285, "Asia"));
            add( new Nation("Vanuatu", 1.01E9, 3111, 0.000022, "Oceania"));
            add( new Nation("Venezuela", 76.62E9, 4868, 0.003608, "South America"));
            add( new Nation("Vietnam", 372.26E9, 3186, 0.009073, "Asia"));
            add( new Nation("Yemen", 31.53E9, 6963, 0.004757,"Asia"));
            add( new Nation("Zambia", 24.66E9, 2701, 0.001173,"Africa"));
            add( new Nation("Zimbabwe", 41.58E9, 4282, 0.001145,"Africa"));

        }
    };

    // List of issues to be discussed
    public ArrayList<Issue>issues=new ArrayList<Issue>(){
        {
            add(new Issue("Climate change","Environmental"));
            add(new Issue("Global poverty", "Human rights"));
            add(new Issue("Human rights", "Human rights"));
            add(new Issue("Healthcare access", "Human rights"));
            add(new Issue("Education reform", "Human rights"));
            add(new Issue("Gender equality", "Gender"));
            add(new Issue("Environmental conservation", "Environmental"));
            add(new Issue("Income inequality", "Human rights"));
            add(new Issue("Refugee crisis", "Human rights"));
            add(new Issue("Water scarcity", "Environmental"));
            add(new Issue("Drug trafficking", "Security"));
            add(new Issue("Racial discrimination", "Human rights"));
            add(new Issue("Poverty eradication", "Human rights"));
            add(new Issue("Energy sustainability", "Environmental"));
            add(new Issue("Labor rights", "Human rights"));
            add(new Issue("Food security", "Environmental"));
            add(new Issue("Natural disaster response", "Environmental"));
            add(new Issue("Access to clean water", "Environmental"));
            add(new Issue("Cultural preservation", "Human rights"));
            add(new Issue("Child labor", "Human rights"));
            add(new Issue("Economic inequality", "Human rights"));
            add(new Issue("Freedom of speech", "Human rights"));
            add(new Issue("Privacy rights", "Human rights"));
            add(new Issue("Illegal wildlife trade", "Environmental"));
            add(new Issue("Refugee rights", "Human rights"));
            add(new Issue("Ethnic conflicts", "Human rights"));
            add(new Issue("Access to education", "Human rights"));
            add(new Issue("Climate refugee crisis", "Human rights"));
            add(new Issue("Childhood immunization", "Health"));
            add(new Issue("Eating disorders", "Health"));
            add(new Issue("Public health infrastructure", "Health"));
            add(new Issue("Nuclear energy safety", "Environmental"));
            add(new Issue("Tackling extremism", "Security"));
            add(new Issue("Income gap", "Human rights"));
            add(new Issue("Animal rights", "Environmental"));
            add(new Issue("Urbanization challenges", "Environmental"));
            add(new Issue("Human trafficking", "Human rights"));
            add(new Issue("Child marriage", "Human rights"));
            add(new Issue("Water pollution", "Environmental"));
            add(new Issue("Freedom of religion", "Human rights"));
            add(new Issue("Deforestation", "Environmental"));
            add(new Issue("Refugee resettlement", "Human rights"));
            add(new Issue("Hate crimes", "Human rights"));
            add(new Issue("Pollution control", "Environmental"));
            add(new Issue("Poverty cycle", "Human rights"));
            add(new Issue("Mental health awareness", "Health"));
            add(new Issue("Access to clean sanitation", "Health"));
            add(new Issue("Access to reproductive healthcare", "Health"));
            add(new Issue("Disaster preparedness", "Environmental"));
            add(new Issue("Discrimination in the workplace", "Human rights"));
            add(new Issue("Renewable energy", "Environmental"));
            add(new Issue("Biodiversity loss", "Environmental"));
            add(new Issue("Waste management", "Environmental"));
            add(new Issue("Violence against women", "Human rights"));
            add(new Issue("Air pollution", "Environmental"));
            add(new Issue("Sustainable agriculture", "Environmental"));
            add(new Issue("Ocean pollution", "Environmental"));
            add(new Issue("Humanitarian aid", "Human rights"));
            add(new Issue("Access to affordable healthcare technology", "Health"));
            add(new Issue("Healthcare for veterans", "Health"));
            add(new Issue("Health literacy in underserved populations", "Health"));
            add(new Issue("Chronic pain management", "Health"));
            add(new Issue("Telemedicine and remote healthcare", "Health"));
            add(new Issue("Ocean pollution", "Environmental"));
            add(new Issue("Humanitarian aid", "Human rights"));
            add(new Issue("Child protection", "Human rights"));
            add(new Issue("Access to healthcare", "Human rights"));
            add(new Issue("Climate justice", "Environmental"));
            add(new Issue("Worker exploitation", "Human rights"));
            add(new Issue("Urban development", "Environmental"));
            add(new Issue("Freedom of assembly", "Human rights"));
            add(new Issue("Land rights", "Human rights"));
            add(new Issue("Nuclear weapons proliferation", "War"));
            add(new Issue("E-waste management", "Environmental"));
            add(new Issue("Disability rights", "Human rights"));
            add(new Issue("Nutrition education", "Health"));
            add(new Issue("Community health promotion", "Health"));
            add(new Issue("Access to mental health medications", "Health"));
            add(new Issue("Healthcare for people with disabilities", "Health"));
            add(new Issue("Preventive healthcare services", "Health"));
            add(new Issue("Healthcare for homeless populations", "Health"));
            add(new Issue("Youth mental health", "Health"));
            add(new Issue("Access to clean air", "Health"));
            add(new Issue("Healthcare for refugees and asylum seekers", "Health"));
            add(new Issue("Preventable diseases eradication", "Health"));
            add(new Issue("Healthcare for indigenous populations", "Health"));
            add(new Issue("Healthcare for prisoners", "Health"));
            add(new Issue("Accessible healthcare facilities and transportation", "Health"));
            add(new Issue("Access to clean energy", "Environmental"));
            add(new Issue("Substance abuse prevention", "Health"));
            add(new Issue("Healthcare for the elderly", "Health"));
            add(new Issue("Obesity prevention", "Health"));
            add(new Issue("Erosion of privacy rights", "Human rights"));
            add(new Issue("Water conservation", "Environmental"));
            add(new Issue("Child welfare", "Human rights"));
            add(new Issue("Space debris", "Environmental"));
            add(new Issue("Indigenous rights", "Human rights"));
            add(new Issue("Healthcare for marginalized communities", "Health"));
            add(new Issue("Palliative care and end-of-life support", "Health"));
        }
    };

    private int finalResult;// Final result of the resolution
    public Issue issue;// The selected issue for the conference

    /**
     * Selects a random issue from the list of issues and sets it as the current issue for the conference.
     */
    public void selectIssue(){
        Random rand= new Random();
        int n=rand.nextInt(issues.size());
        this.issue = issues.get(n);

    }
    /**
     * Retrieves the currently selected issue for the conference.
     *
     * @return The currently selected issue.
     */
    public Issue getIssue(){
        return this.issue;

    }

    /**
     * Initiates a conference by selecting an issue and printing its name.
     */

    /**
     * Initiates a conference by selecting an issue
     */
    public void initiateConference(){
        selectIssue();
    }

/**
 * Ends the conference by calculating the results, including voting statistics, total power, and the final result
 * of the resolution. It also determines the outcome for rebellious nations and provides information on the payoff distribution.**/
    public void endConference(){
        int rebels=0;
        double totalPower=0;
        double newTotalPower=0;
        int stagYes=0;
        int stagNo=0;
        int stagAbstain=0;
        int rabbitYes=0;
        int rabbitNo=0;
        int rabbitAbstain=0;
        int no=0;
        int abstain=0;
        int yes=0;
        String str="";
        for (Nation nation:nations){
            nation.makeVote();
            nation.addPayoff();
            totalPower+=nation.getPower();
        }
        for (Nation nation: nations){
            switch (nation.getVote()){
                case 0:
                    str="NO";
                    no++;
                    break;
                case 1:
                    str="Abstain";
                    abstain++;
                    break;
                case 2:
                    str="YES";
                    yes++;
                    break;
            }
            nation.setPower(nation.getPower()/totalPower);
            newTotalPower+=nation.getPower();
            System.out.print(nation.getName()+" | "+str+ " | ");
            System.out.printf("Inclination: %.2f | ",nation.getInclination());
            System.out.printf("Power: %.6f\n",nation.getPower());
        }

        for (Nation nation:nations){
            if (nation.isRebel){
                switch (nation.getVote()){
                    case 0:
                        stagNo++;
                        break;
                    case 1:
                        stagAbstain++;
                        break;
                    case 2:
                        stagYes++;
                        break;
                }

            }
            else{
                switch (nation.getVote()){
                    case 0:
                        rabbitNo++;
                        break;
                    case 1:
                        rabbitAbstain++;
                        break;
                    case 2:
                        rabbitYes++;
                        break;
                }

            }

        }

        System.out.print(
                "Total Yes votes: " +yes+
                "\nTotal No Votes: "+ no+
                "\nTotal Abstain Votes: "+abstain+
                "\nNew total power: "+newTotalPower+
                "\nTotal Yes stag votes: " +stagYes+
                "\nTotal No stag Votes: "+ stagNo+
                "\nTotal Abstain stag Votes: "+stagAbstain+
                "\nTotal No rabbit Votes: "+ rabbitNo+
                "\nTotal Abstain rabbit Votes: "+rabbitAbstain
                +"\nTotal Yes rabbit votes: "+rabbitYes
        );
        if (yes>no){
            finalResult=1;
            System.out.println("\nFinal Result: The resolution is passed");
        }

        else{
            finalResult=0;
            System.out.println("\nFinal Result: resolution is not passed");

        }
        if (finalResult==1){
            if (stagYes>rabbitYes){
                System.out.println("\nNations that rebelled against the leader received greater payoff");

            }
            else if (rabbitYes>stagYes){
                System.out.println("\nNations that didn't rebel against the leader received greater payoff");


            }
            else{
                System.out.println("\nNations received similar payoffs regardless of rebellions");
            }

        }
        else{
            if (stagNo>rabbitNo){
                System.out.println("\nNations that rebelled against the leader received greater payoff");

            }
            else if (rabbitNo>stagNo){
                System.out.println("\nNations that didn't rebel against the leader received greater payoff");


            }
            else{
                System.out.println("\nNations received similar payoffs regardless of rebellions");
            }


        }
    }
}
