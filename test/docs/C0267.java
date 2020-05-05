package p001o;

import android.os.Environment;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;
import org.prowl.torque.TorqueSettings;
import org.prowl.torque.landing.FrontPage;

/* renamed from: o.ٳ */
public final class C0267 {

    /* renamed from: ʹ */
    public static final String[] f1501 = { "P1031",
            "HO2S Heater Current Monitor Control Circuit Banks 1 and 2 Sensor 1", "P1032",
            "HO2S Heater Warm Up Control Circuit Banks 1 and 2 Sensor 1", "P1105", "Secondary Vacuum Sensor Circuit",
            "P1106", "Manifold Absolute Pressure (MAP) Sensor Circuit Intermittent High Voltage", "P1107",
            "Manifold Absolute Pressure (MAP) Sensor Circuit Intermitten", "P1108",
            "BARO to MAP Sensor Comparison Too High", "P1109", "Secondary Port Throttle System", "P1111",
            "Intake Air Temperature (IAT) Sensor Circuit Intermittent High Voltage", "P1112",
            "Intake Air Temperature (IAT) Sensor Circuit Intermittent Low Voltage", "P1113",
            "Intake Resonance Switchover Solenoid Control Circuit", "P1114",
            "Engine Coolant Temperature (ECT) Sensor Circuit Intermittent Low Voltage", "P1115",
            "Engine Coolant Temperature (ECT) Sensor Circuit Intermittent High Voltage", "P1116",
            "ECT Signal Unstable or Intermittent", "P1117", "Engine Coolant Temp. Signal Out-Of-Range Low", "P1118",
            "Engine Coolant Temp. Signal Out-Of-Range High", "P1119", "ECT Signal Out-Of-Range With TFT Sensor",
            "P1120", "Throttle Position (TP) Sensor 1 Circuit", "P1121",
            "Throttle Position (TP) Sensor Circuit Intermittent High Voltage", "P1122",
            "Throttle Position (TP) Sensor Circuit Intermittent Low Voltage", "P1125", "APP System", "P1130",
            "HO2S Circuit Low Variance Bank 1 Sensor 1", "P1131", "HO2S Circuit Low Variance Bank 1 Sensor 2", "P1132",
            "HO2S Circuit Low Variance Bank 2 Sensor 1", "P1133", "HO2S Insufficient Switching Bank 1 Sensor 1",
            "P1134", "HO2S Transition Time Ratio Bank 1 Sensor 1", "P1135", "HO2S Lean Mean Bank 1 Sensor 1", "P1136",
            "HO2S Rich Mean Bank 1 Sensor 1", "P1137", "HO2S Bank 1 Sensor 2 Lean System or Low Voltage", "P1138",
            "HO2S Bank 1 Sensor 2 Rich or High Voltage", "P1139", "HO2S Insuff. Switching Bank 1 Sensor 2", "P1140",
            "HO2S Transition Time Ratio Bank 1 Sensor 2", "P1141", "HO2S Heater Control Circuit Bank 1 Sensor 2",
            "P1143", "HO2S Bank 1 Sensor 3 Lean System or Low Voltage", "P1144",
            "HO2S Bank 1 Sensor 3 Rich or High Voltage", "P1145", "HO2S Cross Counts Bank 1 Sensor 3", "P1153",
            "HO2S Insufficient Switching Bank 2 Sensor 1", "P1154", "HO2S Transition Time Ratio Bank 2 Sensor 1",
            "P1155", "HO2S Lean Mean Bank 2 Sensor 1", "P1156", "HO2S Rich Mean Bank 2 Sensor 1", "P1157",
            "HO2S Bank 2 Sensor 2 Lean System or Low Voltage", "P1158", "HO2S Bank 2 Sensor 2 Rich or High Voltage",
            "P1159", "HO2S Cross Counts Bank 2 Sensor 2", "P1161", "HO2S Heater Control Circuit Bank 2 Sensor 2",
            "P1163", "HO2S Bank 2 Sensor 3 Lean System or Low Voltage", "P1164",
            "HO2S Bank 2 Sensor 3 Rich or High Voltage", "P1165", "HO2S Cross Counts Bank 2 Sensor 3", "P1170",
            "Bank to Bank Fuel TrimOffset", "P1171", "Fuel System Lean During Acceleration", "P1172",
            "Fuel Transfer Pump Flow Insufficient", "P1185", "Engine Oil Temperature Circuit", "P1186",
            "EOT Circuit Performance", "P1187", "EOT Sensor Ckt. Low Voltage", "P1188", "EOT Sensor Ckt. High Voltage",
            "P1189", "Engine Oil Pressure (EOP) Switch Circuit", "P1190", "Engine Vacuum Leak", "P1191",
            "Intake Air Duct Air Leak", "P1200", "Injector Control Circuit", "P1201",
            "(Alt. Fuel) Gas Mass Sensor Circuit Range/Performance", "P1202",
            "(Alt. Fuel) Gas Mass Sensor Circuit Low Frequency", "P1203",
            "(Alt. Fuel) Gas Mass Sensor Circuit High Frequency", "P1211", "Mass Air Flow Circuit Intermittent High",
            "P1212", "Mass Air Flow Circuit Intermittent Low", "P1214", "Injection Pump Timing Offset", "P1215",
            "Ground Fault Detection Indicated", "P1216", "Fuel Solenoid Response Time Too Short", "P1217",
            "Fuel Solenoid Response Time Too Long", "P1218", "Injection Pump Calibration Circuit", "P1219",
            "Throttle Position Sensor Reference Voltage", "P1220", "Throttle Position (TP) Sensor 2 Circuit", "P1221",
            "Fuel Pump Secondary Circuit Low", "P1222", "Injector Control Circuit Intermittent", "P1225",
            "Injector Circuit Cylinder 2 Intermittent", "P1228", "Injector Circuit Cylinder 3 Intermittent", "P1231",
            "Injector Circuit Cylinder 4 Intermittent", "P1234", "Injector Circuit Cylinder 5 Intermittent", "P1237",
            "Injector Circuit Cylinder 6 Intermittent", "P1240", "Injector Circuit Cylinder 7 Intermittent", "P1243",
            "Injector Circuit Cylinder 8 Intermittent", "P1245", "Intake Plenum Switchover Valve", "P1250",
            "Early Fuel Evaporation Heater Circuit", "P1257", "Supercharger System Overboost", "P1258",
            "Engine Coolant Overtemperature - Protection Mode Active", "P1260",
            "Last Test Failed Failed SCC ENTER:More Info.", "P1270",
            "Accelerator Pedal Position Sensor A/D Converter Error", "P1271",
            "Accelerator Pedal Position (APP) Sensor 1-2 Correlation", "P1272", "Accelerator Pedal Position Sensor 2",
            "P1273", "Accelerator Pedal Position Sensor 1", "P1274", "Injectors Wired Incorrectly", "P1275",
            "Accelerator Pedal Position (APP) Sensor 1 Circuit", "P1276",
            "Accelerator Pedal Position Sensor 1 Circuit Performance", "P1277",
            "Accelerator Pedal Position Sensor 1 Circuit Low Voltage", "P1278",
            "Accelerator Pedal Position Sensor 1 Circuit High Voltage", "P1280",
            "Accelerator Pedal Position (APP) Sensor 2 Circuit", "P1281",
            "Accelerator Pedal Position Sensor 2 Circuit Performance", "P1282",
            "Accelerator Pedal Position Sensor 2 Circuit Low Voltage", "P1283",
            "Accelerator Pedal Position Sensor 2 Circuit High Voltage", "P1285",
            "Accelerator Pedal Position Sensor 3 Circuit", "P1286",
            "Accelerator Pedal Position Sensor 3 Circuit Performance", "P1287",
            "Accelerator Pedal Position Sensor 3 Circuit Low Voltage", "P1288",
            "Accelerator Pedal Position Sensor 3 Circuit High Voltage", "P1300", "Ignitor Circuit", "P1305",
            "Ignition Coil 2 Primary Feedback Circuit", "P1310", "Ignition Coil 3 Primary Feedback Circuit", "P1315",
            "Ignition Coil 4 Primary Feedback Circuit", "P1320", "IC 4X Reference Circuit Intermittent", "P1321",
            "Electronic Ignition System Fault Line", "P1322", "EI System or Ignition Control Extra or Missing", "P1323",
            "IC 24X Reference Circuit Low Frequency", "P1324", "Crank RPM Too Low", "P1335", "CKP Circuit", "P1336",
            "Crankshaft Position (CKP) System Variation Not Learned", "P1345",
            "Crankshaft Position (CKP)-Camshaft Position (CMP) Correlation", "P1346",
            "Intake Camshaft Position [CMP] Sensor System Performance", "P1350", "Ignition Control System", "P1351",
            "Ignition Coil Control Circuit High Voltage", "P1352", "IC Output High/Pulse Detected when GND_Cyl. 2",
            "P1353", "IC Output High/Pulse Detected when GND_Cyl. 3", "P1354",
            "IC Output High/Pulse Detected when GND_Cyl. 4", "P1355", "IC Output High/Pulse Detected when GND_Cyl. 5",
            "P1356", "IC Output High/Pulse Detected when GND_Cyl. 6", "P1357",
            "IC Output High/Pulse Detected when GND_Cyl. 7", "P1358", "IC Output High/Pulse Detected when GND_Cyl. 8",
            "P1359", "Ignition Coil Group 1 Control Circuit", "P1360", "Ignition Coil Group 2 Control Circuit", "P1361",
            "Ignition Coil Control Circuit Low Voltage", "P1362", "IC Cylinder 2 Not Toggling After Enable", "P1363",
            "IC Cylinder 3 Not Toggling After Enable", "P1364", "IC Cylinder 4 Not Toggling After Enable", "P1365",
            "IC Cylinder 5 Not Toggling After Enable", "P1366", "IC Cylinder 6 Not Toggling After Enable", "P1367",
            "IC Cylinder 7 Not Toggling After Enable", "P1368", "IC Cylinder 8 Not Toggling After Enable", "P1370",
            "IC 4X Reference Circuit Too Many Pulses", "P1371", "IC 4X Reference Circuit Too Few Pulses", "P1372",
            "Crankshaft Position (CKP) Sensor A-B Correlation", "P1374", "3X Reference Circuit", "P1375",
            "IC 24X Reference Circuit High Voltage", "P1376", "Ignition Ground Circuit", "P1377",
            "IC Cam Pulse To 4X Reference Pulse", "P1380", "Misfire Detected - Rough Road Data Not Available", "P1381",
            "Misfire Detected - No Communication with Brake Control Module", "P1390",
            "Wheel Speed Sensor 1 - G - Sensor Circuit", "P1391",
            "Wheel Speed Sensor 1 - G - Sensor Circuit Performance", "P1392",
            "Wheel Speed Sensor 1 - G - Sensor Circuit Low Voltage", "P1393",
            "Wheel Speed Sensor 1 - G - Sensor Circuit High Voltage", "P1394",
            "Wheel Speed Sensor 1 - G - Sensor Circuit Intermittent", "P1395",
            "Wheel Speed Sensor 2 - G - Sensor Circuit", "P1396",
            "Wheel Speed Sensor 2 - G - Sensor Circuit Performance", "P1397",
            "Wheel Speed Sensor 2 - G - Sensor Circuit Low Voltage", "P1398",
            "Wheel Speed Sensor 2 - G - Sensor Circuit High Voltage", "P1399",
            "Wheel Speed Sensor 2 - G - Sensor Circuit Intermittent", "P1403",
            "Exhaust Gas Recirculation System Valve 1", "P1404",
            "Exhaust Gas Recirculation (EGR) Closed Position Performance", "P1405",
            "Exhaust Gas Recirculation System Valve 3", "P1406", "EGR Valve Pintle Position Circuit", "P1407",
            "EGR Air Intrusion in Exhaust Supply to EGR Valve", "P1408", "Intake Manifold Pressure Sensor Circuit",
            "P1409", "EGR Vacuum System Leak", "P1410", "Fuel Tank Pressure System", "P1415",
            "Secondary Air Injection (AIR) System Bank 1", "P1416", "Secondary Air Injection (AIR) System Bank 2",
            "P1418", "Secondary Air Injection System Relay A Control Circuit High", "P1420",
            "Intake Air Low Pressure Switch Circuit Low Voltage", "P1421",
            "Intake Air Low Pressure Switch Circuit High Voltage", "P1423",
            "Intake Air High Pressure Switch Circuit High Voltage", "P1431", "Fuel Level Sensor 2 Circuit Performance",
            "P1432", "Fuel Level Sensor 2 Circuit Low Voltage", "P1433", "Fuel Level Sensor 2 Circuit High Voltage",
            "P1441", "Evaporative Emission (EVAP) System Flow During Non-Purge", "P1442",
            "EVAP Vacuum Sw. High Voltage During Ign. On", "P1450", "Barometric Pressure Sensor Circuit", "P1451",
            "Barometric Press. Sensor Performance", "P1460", "Cooling Fan Control System", "P1460",
            "Misfire Detected With Low Fuel Level", "P1480", "Cooling Fan 1 Control Circuit High", "P1483",
            "Engine Cooling System Performance", "P1500", "Starter Signal Circuit", "P1501", "Theft Deterrent System",
            "P1501", "Vehicle Speed Sensor Circuit Intermittent", "P1502",
            "Theft Deterrent Fuel Enable Signal Not Received", "P1503",
            "Theft Deterrent Fuel Enable Signal Not Correct", "P1504", "Vehicle Speed Output Circuit", "P1508",
            "Idle Speed Low - Idle Air Control (IAC) System Not Responding", "P1509",
            "Idle Speed High - Idle Air Control (IAC) System Not Responding", "P1510",
            "Throttle Control System Performance - Throttle Limitation Active", "P1511",
            "Throttle Control System - Backup System Performance", "P1514", "Airflow to TP Sensor Correlation High",
            "P1515", "Electronic Throttle System Throttle Position", "P1516",
            "Throttle Actuator Control (TAC) Module Throttle Actuator Position Performance", "P1517",
            "Electronic Throttle Module", "P1518", "Electronic Throttle Module to PCM Communication", "P1519",
            "Throttle Actuator Control (TAC) Module Internal Circuit", "P1520", "Transmission Range Switch Circuit",
            "P1521", "Transmission Engaged at High Throttle Angle", "P1522",
            "Park/Neutral to Drive/Reverse at High RPM", "P1523", "Throttle Closed Position Performance", "P1524",
            "Throttle Closed Position Performance", "P1525", "Throttle Body ServiceRequired", "P1526",
            "Minimum Throttle Position Not Learned", "P1527", "Transmission Range to Pressure Switch Correlation",
            "P1528", "Governor", "P1529", "Heated Windshield Request Problem", "P1530",
            "Throttle Actuator Control (TAC) Module Internal Circuit", "P1531", "A/C Low Side Temperature Sensor Fault",
            "P1532", "A/C Evaporator Temp. Sens. Ckt. Low Voltage", "P1533",
            "A/C Evaporator Temp. Sens. Ckt. High Voltage", "P1534", "A/C High Side Temp. Sensor Low Voltage", "P1535",
            "A/C High Side Temperature Sensor Circuit", "P1536",
            "Engine Coolant Overtemperature - Air Conditioning (A/C) Disabled", "P1537",
            "A/C Request Circuit Low Voltage", "P1538", "A/C Request Circuit High Voltage", "P1539",
            "A/C Clutch Status Circuit High Voltage", "P1540",
            "Air Conditioning (A/C) Refrigerant Overpressure - Air Conditioning (A/C) Disabled", "P1541",
            "A/C High Side Over Temperature", "P1542", "A/C System High Pressure High Temperature", "P1543",
            "A/C System Performance", "P1544", "A/C Refrigerant Condition Very Low", "P1545",
            "Air Conditioning (A/C) Clutch Relay Control Circuit", "P1546", "A/C Clutch Status Circuit Low Voltage",
            "P1547", "A/C System Performance Degraded", "P1548", "A/C Recirculation Circuit", "P1551",
            "Throttle Valve Rest Position Not Reached During Learn", "P1554", "Cruise Control Feedback Circuit",
            "P1555", "Electronic Variable Orifice Output", "P1558", "Cruise Control Servo Indicates Low", "P1559",
            "Cruise Control Power Management Mode", "P1560", "Transaxle Not in Drive - Cruise Control Disabled",
            "P1561", "Cruise Vent Solenoid", "P1562", "Cruise Vacuum Solenoid", "P1563",
            "Cruise Vehicle Speed/Set Speed Difference Too High", "P1564",
            "Vehicle Acceleration Too High - Cruise Control Disabled", "P1565", "Cruise Servo Position Sensor", "P1566",
            "Engine RPM Too High - Cruise Control Disabled", "P1567",
            "Active Banking Control Active - Cruise Control Disabled", "P1568",
            "Cruise Servo Stroke Greater than Commanded in Cruise", "P1569",
            "Cruise Servo Stroke High While not in Cruise", "P1570",
            "Traction Control Active - Cruise Control Disabled", "P1571", "Traction Control Torque Request Circuit",
            "P1572", "ASR Active Circuit Low Too Long", "P1573", "PCM/EBTCM Serial Data Circuit", "P1574",
            "Stoplamp Switch Circuit", "P1575", "Extended Travel Brake Switch Circuit", "P1576",
            "BBV Sensor Ckt. High Voltage", "P1577", "BBV Sensor Ckt. Low Voltage", "P1578",
            "BBV Sensor Ckt. Low Vacuum", "P1579", "P/N to D/R at High Throttle Angle - Power Reduction Mode Active",
            "P1580", "Cruise Move Circuit Low Voltage", "P1581", "Cruise Move Circuit High Voltage", "P1582",
            "Cruise Direction Circuit Low Voltage", "P1583", "Cruise Direction CircuitHigh Voltage", "P1584",
            "Cruise Control Disabled", "P1585", "Cruise Control Inhibit Output Circuit", "P1586",
            "Cruise Control Brake Switch 2 Circuit", "P1587", "Cruise Control Clutch Control Circuit Low", "P1588",
            "Cruise Control Clutch Control Circuit High", "P1599", "Engine Stall or Near Stall Detected", "P1600",
            "TCM Internal Watchdog Operation", "P1601", "Serial Comm. Problem With Device 1", "P1602",
            "Knock Sensor (KS) Module Performance", "P1603", "Loss of SDM Serial Data", "P1604",
            "Loss of IPC Serial Data", "P1605", "Loss of HVAC Serial Data", "P1606",
            "Serial Communication Problem With Device 6", "P1607", "Serial Communication Problem With Device 7",
            "P1608", "Serial Communication Problem With Device 8", "P1609", "Loss Of TCS Serial Data", "P1610",
            "Loss of PZM Serial Data", "P1611", "Loss of CVRTD Serial Data", "P1612", "Loss of IPM Serial Data",
            "P1613", "Loss of DIM Serial Data", "P1614", "Loss of RIM Serial Data", "P1615", "Loss of VTD Serial Data",
            "P1617", "Engine Oil Level Switch Circuit", "P1619", "Engine Oil Life Monitor Reset Circuit", "P1620",
            "Low Coolant Circuit", "P1621", "Control Module Long Term Memory Performance", "P1622", "Cylinder Select",
            "P1623", "Transmission Temp Pull-Up Resistor", "P1624", "Customer Snapshot Requested - Data Available",
            "P1625", "TCM System Reset", "P1626", "Theft Deterrent Fuel Enable Signal Not Received", "P1627",
            "A/D Performance", "P1628", "ECT Pull-Up Resistor", "P1629", "Theft Deterrent System - Cranking Signal",
            "P1630", "Theft Deterrent Learn Mode Active", "P1631", "Theft Deterrent Start Enable Signal Not Correct",
            "P1632", "Theft Deterrent Fuel Disable Signal Received", "P1633", "Ignition 0 Switch Circuit", "P1634",
            "Ignition 1 Switch Circuit", "P1635", "5 Volt Reference Circuit", "P1636", "PCM Stack Overrun", "P1637",
            "Generator L-Terminal Circuit", "P1638", "Generator F-Terminal Circuit", "P1639",
            "5 Volt Reference 2 Circuit", "P1640", "Driver-1-Input High Voltage", "P1641",
            "Malfunction Indicator Lamp (MIL) Control Circuit", "P1642", "Vehicle Speed Output Circuit", "P1643",
            "Engine Speed Output Circuit", "P1644", "Traction Control Delivered Torque Output Circuit", "P1645",
            "Evaporative Emission (EVAP) Vent Solenoid Contol Circuit", "P1646",
            "Erative Emission (EVAP) Vent Solenoid Control Circuit", "P1647", "Driver 1 Line 7", "P1650",
            "Control Module Output B Circuit", "P1651", "Fan 1 Relay Control Circuit", "P1652",
            "Powertrain Induced Chassis Pitch Output Circuit", "P1653", "Oil Level Lamp Control Circuit", "P1654",
            "Cruise Control Inhibit Output Circuit", "P1655", "EVAP Purge Solenoid Control Circuit", "P1656",
            "Driver 2 Line 6", "P1657", "1-4 Upshift Solenoid Control Circuit", "P1658",
            "Starter Enable Relay Control Circuit", "P1660", "Cooling Fan Control Circuits", "P1661",
            "MIL Control Circuit", "P1662", "Cruise Lamp Control Circuit", "P1663", "Oil Life Lamp Control Circuit",
            "P1664", "1-4 Upshift Lamp Control Circuit", "P1665", "Driver 3 Line 5", "P1666", "Driver 3 Line 6",
            "P1667", "Reverse Inhibit Solenoid Control Circuit", "P1669", "ABS Unit Expected", "P1670", "Driver 4",
            "P1671", "Driver 4 Line 1", "P1672", "Low Engine Oil Level Lamp Control Circuit", "P1673",
            "Engine Hot Lamp Control Circuit", "P1674", "Tachometer Control Circuit", "P1675",
            "EVAP Vent Solenoid Control Circuit", "P1676", "Driver 4 Line 6", "P1677", "Driver 4 Line 7", "P1680",
            "Driver 5", "P1681", "Driver 5 Line 1", "P1682", "Driver 5 Line 2", "P1683", "Driver 5 Line 3", "P1684",
            "Driver 5 Line 4", "P1685", "Invalid key recieved from immobilizer", "P1686", "Driver 5 Line 6", "P1687",
            "Driver 5 Line 7", "P1689", "Delivered Torque Circuit Fault", "P1690", "ECM Loop Overrun", "P1691",
            "Coolant Gage Circuit Low Voltage", "P1692", "Coolant Gage Circuit High Voltage", "P1693",
            "Tachometer Circuit Low Voltage", "P1694", "Tachometer Circuit High Voltage", "P1695",
            "Remote Keyless Entry Circuit Low", "P1696", "Remote Keyless Entry Voltage High", "P1700",
            "Transmission Control Module (TCM) Requested MIL Illumination", "P1701", "Trans. MIL Request Circuit",
            "P1705", "P/N Signal Output Circuit", "P1740",
            "Torque Reduction Signal Circuit: Overdrive and TCC Solenoid Rationality", "P1743", "TP Signal from ECM",
            "P1760", "TCM Supply Voltage Interrupted", "P1779", "Engine Torque Delivered to TCM Signal", "P1780",
            "Park/Neutral Position [PNP] Switch Circuit", "P1781", "Engine Torque Signal Circuit", "P1790",
            "Transmission Control Module Checksum", "P1791", "Transmission Control Module Loop", "P1791",
            "Throttle/Pedal Position Signal (2000+)", "P1792", "Transmission Control Module Reprogrammable Memory",
            "P1792", "ECM to TCM Engine Coolant Signal", "P1793", "Transmission Control Module Stack Overrun", "P1793",
            "Wheel Speed Signal (2000+)", "P1795", "CAN Bus - Throttle Body Position", "P1800",
            "TCM Power Relay Control Circuit", "P1801", "Performance Selector Switch Failure", "P1804",
            "Ground Control Relay", "P1810", "TFP Valve Position Switch Circuit", "P1811",
            "Maximum Adapt and Long Shift", "P1812", "Transmission Over Temperature Condition", "P1813",
            "Torque Control", "P1814", "Torque Converter Overstressed", "P1815",
            "Transmission Range Switch - Start In Wrong Range", "P1816",
            "TFP Valve Position Sw. - Park/Neu. With Drive Ratio", "P1817",
            "TFP Valve Position Sw. - Reverse With Drive Ratio", "P1818",
            "TFP Valve Position Sw. - Drive Without Drive Ratio", "P1819",
            "Internal Mode Switch - No Start/Wrong Range", "P1820", "Internal Mode Switch Circuit A Low", "P1822",
            "Internal Mode Switch Circuit B High", "P1823", "Internal Mode Switch Circuit P Low", "P1825",
            "Internal Mode Switch - Invalid Range", "P1826", "Internal Mode Switch Circuit C - High", "P1831",
            "Pressure Control (PC) Solenoid Power Circuit - Low Voltage", "P1832",
            "Pressure Control (PC)/Shift Lock Solenoid Control Circuit High Voltage", "P1833",
            "A/T Solenoids Power Circuit - Low Voltage", "P1834",
            "Torque Converter Clutch (TCC)/Shift Solenoid (SS) Control Circuit High Voltage", "P1835",
            "Kick-Down Switch Circuit", "P1836", "Kick-Down Switch Failed Open", "P1837",
            "Kick-Down Switch Failed Short", "P1842", "1-2 Shift Solenoid Circuit Low Voltage", "P1843",
            "1-2 Shift Solenoid Circuit High Voltage", "P1844", "Torque Reduction Signal Circuit Desired By TCM",
            "P1845", "2-3 Shift Solenoid Circuit Low Voltage", "P1847", "2-3 Shift Solenoid Circuit High Voltage",
            "P1850", "Brake Band Apply Solenoid Circuit", "P1851", "Brake Band Apply Solenoid Performance", "P1852",
            "Brake Band Apply SolenoidLow Voltage", "P1853", "Brake Band Apply Solenoid High Voltage", "P1860",
            "TCC PWM Solenoid Circuit Electrical", "P1864", "Torque Converter Clutch Circuit", "P1865",
            "4-5 Shift Solenoid (SS) Valve Control Circuit High Voltage", "P1866",
            "Torque Converter Clutch (TCC) Pulse Width Modulation (PWM) Solenoid Control Circuit Low Voltage", "P1867",
            "Torque Converter Clutch (TCC) Pulse Width Modulation (PWM) Solenoid Control Circuit High Voltage", "P1868",
            "Transmission Fluid Life", "P1870", "Transmission Component Slipping", "P1871", "Undefined Gear Ratio",
            "P1873", "TCC Stator Temp. Switch Circuit Low", "P1874", "TCC Stator Temp. Switch Circuit High", "P1875",
            "4WD Low Switch Circuit Electrical", "P1884", "TCC Enable/Shift Light Circuit", "P1886",
            "Shift Timing Solenoid", "P1887", "TCC Release Switch Circuit", "P1890", "ECM Data Input Circuit", "P1890",
            "Throttle Position Signal Input", "P1891", "Throttle Position Sensor PWM Signal Low", "P1892",
            "Throttle Position Sensor PWM Signal High", "P1893", "Engine Torque Signal Low Voltage", "P1894",
            "Engine Torque Signal High Voltage", "P1895", "TCM to ECM Torque Reduction Circuit", "P2008",
            "Intake Manifold Runner Control (IMRC) Solenoid Control Circuit", "P2009",
            "Intake Manifold Runner Control (IMRC) Solenoid Control Circuit Low Voltage", "P2010",
            "Intake Manifold Runner Control (IMRC) Solenoid Control Circuit High Voltage", "P2066",
            "Fuel Level Sensor 2 Performance", "P2067", "Fuel Level Sensor 2 Circuit Low Voltage", "P2068",
            "Fuel Level Sensor 2 Circuit High Voltage", "P2096", "or P2098 Post Catalyst Fuel Trim System Low Limit",
            "P2097", "or P2099 Post Catalyst Fuel Trim System High Limit", "P2100",
            "Throttle Actuator Control (TAC) Motor Control Circuit", "P2101",
            "Control Module Throttle Actuator Position Performance", "P2105",
            "Throttle Actuator Control (TAC) System - Forced Engine Shutdown", "P2107",
            "Throttle Actuator Control (TAC) Module Internal Circuit", "P2119", "Throttle Closed Position Performance",
            "P2122", "Accelerator Pedal Position (APP) Sensor 1 Circuit Low Voltage", "P2123",
            "Accelerator Pedal Position (APP) Sensor 1 Circuit High Voltage", "P2127",
            "Accelerator Pedal Position (APP) Sensor 2 Circuit Low Voltage", "P2128",
            "Accelerator Pedal Position (APP) Sensor 2 Circuit High Voltage", "P2135",
            "Throttle Position (TP) Sensor 1-2 Correlation", "P2138",
            "Accelerator Pedal Position (APP) Sensor 1-2 Correlation", "P2176", "Minimum Throttle Position Not Learned",
            "P2500", "Generator L-Terminal Circuit Low Voltage", "P2501",
            "Generator L-Terminal Circuit High Voltage " };

    /* renamed from: ʻ */
    public static final int f1502 = 5;

    /* renamed from: ʼ */
    public static final int f1503 = 6;

    /* renamed from: ʽ */
    public static final String[] f1504 = { "P", "C", "B", "U" };

    /* renamed from: ʾ */
    public static final String[] f1505 = { "SAE Reserved", "Fuel and air metering", "Injector circuit",
            "Ignition System or Misfire", "Auxiliary Emission Control System", "Vehicle Speed and Idle Control",
            "ECU Output Circuits", "Transmission", "Transmission", "SAE Reserved" };

    /* renamed from: ʿ */
    public static final String[] f1506 = { "P0010", "\"A\" Camshaft Position Actuator Circuit (Bank 1)", "P0011",
            "\"A\" Camshaft Position - Timing Over-Advanced or System Performance (Bank 1)", "P0012",
            "\"A\" Camshaft Position - Timing Over-Retarded (Bank 1)", "P0013",
            "\"B\" Camshaft Position - Actuator Circuit (Bank 1)", "P0014",
            "\"B\" Camshaft Position - Timing Over-Advanced or System Performance (Bank 1)", "P0015",
            "\"B\" Camshaft Position -Timing Over-Retarded (Bank 1)", "P0016", "Crank-Cam position correlation",
            "P0020", "\"A\" Camshaft Position Actuator Circuit (Bank 2)", "P0021",
            "\"A\" Camshaft Position - Timing Over-Advanced or System Performance (Bank 2)", "P0022",
            "\"A\" Camshaft Position - Timing Over-Retarded (Bank 2)", "P0023",
            "\"B\" Camshaft Position - Actuator Circuit (Bank 2)", "P0024",
            "\"B\" Camshaft Position - Timing Over-Advanced or System Performance (Bank 2)", "P0025",
            "\"B\" Camshaft Position - Timing Over-Retarded (Bank 2)", "P0030",
            "HO2S Heater Control Circuit (Bank 1 Sensor 1)", "P0031",
            "HO2S Heater Control Circuit Low (Bank 1 Sensor 1)", "P0032",
            "HO2S Heater Control Circuit High (Bank 1 Sensor 1)", "P0033", "Turbo Charger Bypass Valve Control Circuit",
            "P0034", "Turbo Charger Bypass Valve Control Circuit Low", "P0035",
            "Turbo Charger Bypass Valve Control Circuit High", "P0036", "HO2S Heater Control Circuit (Bank 1 Sensor 2)",
            "P0037", "HO2S Heater Control Circuit Low (Bank 1 Sensor 2)", "P0038",
            "HO2S Heater Control Circuit High (Bank 1 Sensor 2)", "P0042",
            "HO2S Heater Control Circuit (Bank 1 Sensor 3)", "P0043",
            "HO2S Heater Control Circuit Low (Bank 1 Sensor 3)", "P0044",
            "HO2S Heater Control Circuit High (Bank 1 Sensor 3)", "P0050",
            "HO2S Heater Control Circuit (Bank 2 Sensor 1)", "P0051",
            "HO2S Heater Control Circuit Low (Bank 2 Sensor 1)", "P0052",
            "HO2S Heater Control Circuit High (Bank 2 Sensor 1)", "P0056",
            "HO2S Heater Control Circuit (Bank 2 Sensor 2)", "P0057",
            "HO2S Heater Control Circuit Low (Bank 2 Sensor 2)", "P0058",
            "HO2S Heater Control Circuit High (Bank 2 Sensor 2)", "P0062",
            "HO2S Heater Control Circuit (Bank 2 Sensor 3)", "P0063",
            "HO2S Heater Control Circuit Low (Bank 2 Sensor 3)", "P0064",
            "HO2S Heater Control Circuit High (Bank 2 Sensor 3)", "P0065",
            "Air Assisted Injector Control Range/Performance", "P0066",
            "Air Assisted Injector Control Circuit or Circuit Low", "P0067",
            "Air Assisted Injector Control Circuit High", "P0069", "BARO./MAP sensor", "P0070",
            "Ambient Air Temperature Sensor Circuit", "P0071", "Ambient Air Temperature Sensor Range/Performance",
            "P0072", "Ambient Air Temperature Sensor Circuit Low Input", "P0073",
            "Ambient Air Temperature Sensor Circuit High Input", "P0074",
            "Ambient Air Temperature Sensor Circuit Intermittent", "P0075",
            "Intake Valve Control Solenoid Circuit (Bank 1)", "P0076",
            "Intake Valve Control Solenoid Circuit Low  (Bank 1)", "P0077",
            "Intake Valve Control Solenoid Circuit High (Bank 1)", "P0078",
            "Exhaust Valve Control Solenoid Circuit (Bank 1)", "P0079",
            "Exhaust Valve Control Solenoid Circuit Low (Bank 1)", "P0080",
            "Exhaust Valve Control Solenoid Circuit High (Bank 1)", "P0081",
            "Intake valve Control Solenoid Circuit (Bank 2)", "P0082",
            "Intake Valve Control Solenoid Circuit Low (Bank 2)", "P0083",
            "Intake Valve Control Solenoid Circuit High (Bank 2)", "P0084",
            "Exhaust Valve Control Solenoid Circuit (Bank 2)", "P0085",
            "Exhaust Valve Control Solenoid Circuit Low (Bank 2)", "P0086",
            "Exhaust Valve Control Solenoid Circuit High (Bank 2)", "P0088", "Common rail high pressure", "P0089",
            "Suction control valve stuck", "P0090", "Fuel pressure up solenoid", "P0093", "Fuel leak problem", "P0100",
            "Mass or Volume Air Flow Circuit", "P0101", "Mass or Volume Air Flow Circuit Range/Performance Problem",
            "P0102", "Mass or Volume Air Flow Circuit Low Input", "P0103", "Mass or Volume Air Flow Circuit High Input",
            "P0104", "Mass or Volume Air Flow Circuit Intermittent", "P0105",
            "Manifold Absolute Pressure/Barometric Pressure Circuit", "P0106",
            "Manifold Absolute Pressure/Barometric Pressure Circuit Range/Performance Problem", "P0107",
            "Manifold Absolute Pressure/Barometric Pressure Circuit Low Input", "P0108",
            "Manifold Absolute Pressure/Barometric Pressure Circuit High Input", "P0109",
            "Manifold Absolute Pressure/Barometric Pressure Circuit Intermittent", "P0110",
            "Intake Air Temperature Circuit", "P0111", "Intake Air Temperature Circuit Range/Performance Problem",
            "P0112", "Intake Air Temperature Circuit Low Input", "P0113", "Intake Air Temperature Circuit High Input",
            "P0114", "Intake Air Temperature Circuit Intermittent", "P0115", "Engine Coolant Temperature Circuit",
            "P0116", "Engine Coolant Temperature Circuit Range/Performance Problem", "P0117",
            "Engine Coolant Temperature Circuit Low Input", "P0118", "Engine Coolant Temperature Circuit High Input",
            "P0119", "Engine Coolant Temperature Circuit Intermittent", "P0120",
            "Throttle/Pedal Position Sensor/Switch A Circuit", "P0121",
            "Throttle/Pedal Position Sensor/Switch A Circuit Range/Performance Problem", "P0122",
            "Throttle/Pedal Position Sensor/Switch A Circuit Low Input", "P0123",
            "Throttle/Pedal Position Sensor/Switch A Circuit High Input", "P0124",
            "Throttle/Pedal Position Sensor/Switch A Circuit Intermittent", "P0125",
            "Insufficient Coolant Temperature for Closed Loop Fuel Control", "P0126",
            "Insufficient Coolant Temperature for Stable Operation", "P0127", "Intake Air Temperature Too High",
            "P0128", "Coolant Thermostat (Coolant Temperature Below Thermostat Regulating Temperature)", "P0130",
            "O2 Sensor Circuit (Bank 1 Sensor 1)", "P0131", "O2 Sensor Circuit Low Voltage (Bank 1 Sensor 1)", "P0132",
            "O2 Sensor Circuit High Voltage (Bank 1 Sensor 1)", "P0133",
            "O2 Sensor Circuit Slow Response (Bank 1 Sensor 1)", "P0134",
            "O2 Sensor Circuit No Activity Detected (Bank 1 Sensor 1)", "P0135",
            "O2 Sensor Heater Circuit (Bank 1 Sensor 1)", "P0136", "O2 Sensor Circuit Malfunction (Bank 1 Sensor 2)",
            "P0137", "O2 Sensor Circuit Low Voltage (Bank 1 Sensor 2)", "P0138",
            "O2 Sensor Circuit High Voltage (Bank 1 Sensor 2)", "P0139",
            "O2 Sensor Circuit Slow Response (Bank 1 Sensor 2)", "P0140",
            "O2 Sensor Circuit No Activity Detected (Bank 1 Sensor 2)", "P0141",
            "O2 Sensor Heater Circuit (Bank 1 Sensor 2)", "P0142", "O2 Sensor Circuit Malfunction (Bank 1 Sensor 3)",
            "P0143", "O2 Sensor Circuit Low Voltage (Bank 1 Sensor 3)", "P0144",
            "O2 Sensor Circuit High Voltage (Bank 1 Sensor 3)", "P0145",
            "O2 Sensor Circuit Slow Response (Bank 1 Sensor 3)", "P0146",
            "O2 Sensor Circuit No Activity Detected (Bank 1 Sensor 3)", "P0147",
            "O2 Sensor Heater Circuit (Bank 1 Sensor 3)", "P0148", "Fuel Delivery Error", "P0149", "Fuel Timing Error",
            "P0150", "O2 Sensor Circuit (Bank 2 Sensor 1)", "P0151", "O2 Sensor Circuit Low Voltage (Bank 2 Sensor 1)",
            "P0152", "O2 Sensor Circuit High Voltage (Bank 2 Sensor 1)", "P0153",
            "O2 Sensor Circuit Slow Response (Bank 2 Sensor 1)", "P0154",
            "O2 Sensor Circuit No Activity Detected (Bank 2 Sensor 1)", "P0155",
            "O2 Sensor Heater Circuit (Bank 2 Sensor 1)", "P0156", "O2 Sensor Circuit Malfunction (Bank 2 Sensor 2)",
            "P0157", "O2 Sensor Circuit Low Voltage (Bank 2 Sensor 2)", "P0158",
            "O2 Sensor Circuit High Voltage (Bank 2 Sensor 2)", "P0159",
            "O2 Sensor Circuit Slow Response (Bank 2 Sensor 2)", "P0160",
            "O2 Sensor Circuit No Activity Detected (Bank 2 Sensor 2)", "P0161",
            "O2 Sensor Heater Circuit (Bank 2 Sensor 2)", "P0162", "O2 Sensor Circuit Malfunction (Bank 2 Sensor 3)",
            "P0163", "O2 Sensor Circuit Low Voltage (Bank 2 Sensor 3)", "P0164",
            "O2 Sensor Circuit High Voltage (Bank 2 Sensor 3)", "P0165",
            "O2 Sensor Circuit Slow Response (Bank 2 Sensor 3)", "P0166",
            "O2 Sensor Circuit No Activity Detected (Bank 2 Sensor 3)", "P0167",
            "O2 Sensor Heater Circuit (Bank 2 Sensor 3)", "P0168", "Fuel Temperature Too High", "P0169",
            "Incorrect Fuel Composition", "P0170", "Fuel Trim (Bank 1)", "P0171", "System too Lean (Bank 1)", "P0172",
            "System too Rich (Bank 1)", "P0173", "Fuel Trim Malfunction (Bank 2)", "P0174", "System too Lean (Bank 2)",
            "P0175", "System too Rich (Bank 2)", "P0176", "Fuel Composition Sensor Circuit", "P0177",
            "Fuel Composition Sensor Circuit Range/Performance", "P0178", "Fuel Composition Sensor Circuit Low Input",
            "P0179", "Fuel Composition Sensor Circuit High Input", "P0180", "Fuel Temperature Sensor A Circuit",
            "P0181", "Fuel Temperature Sensor A Circuit Range/Performance", "P0182",
            "Fuel Temperature Sensor A Circuit Low Input", "P0183", "Fuel Temperature Sensor A Circuit High Input",
            "P0184", "Fuel Temperature Sensor A Circuit Intermittent", "P0185", "Fuel Temperature Sensor B Circuit",
            "P0186", "Fuel Temperature Sensor B Circuit Range/Performance", "P0187",
            "Fuel Temperature Sensor B Circuit Low Input", "P0188", "Fuel Temperature Sensor B Circuit High Input",
            "P0189", "Fuel Temperature Sensor B Circuit Intermittent", "P0190", "Fuel Rail Pressure Sensor Circuit",
            "P0191", "Fuel Rail Pressure Sensor Circuit Range/Performance", "P0192",
            "Fuel Rail Pressure Sensor Circuit Low In put", "P0193", "Fuel Rail Pressure Sensor Circuit High Input",
            "P0194", "Fuel Rail Pressure Sensor Circuit Intermittent", "P0195", "Engine Oil Temperature Sensor",
            "P0196", "Engine Oil Temperature Sensor Range/Performance", "P0197", "Engine Oil Temperature Sensor Low",
            "P0198", "Engine Oil Temperature Sensor High", "P0199", "Engine Oil Temperature Sensor Intermittent",
            "P0200", "Injector Circuit", "P0201", "Injector Circuit - Cylinder 1", "P0202",
            "Injector Circuit - Cylinder 2", "P0203", "Injector Circuit - Cylinder 3", "P0204",
            "Injector Circuit - Cylinder 4", "P0205", "Injector Circuit - Cylinder 5", "P0206",
            "Injector Circuit - Cylinder 6", "P0207", "Injector Circuit - Cylinder 7", "P0208",
            "Injector Circuit - Cylinder 8", "P0209", "Injector Circuit - Cylinder 9", "P0210",
            "Injector Circuit - Cylinder 10", "P0211", "Injector Circuit - Cylinder 11", "P0212",
            "Injector Circuit - Cylinder 12", "P0213", "Cold Start Injector 1", "P0214", "Cold Start Injector 2",
            "P0215", "Engine Shut off Solenoid", "P0216", "Injector/Injection Timing Control Circuit", "P0217",
            "Engine Coolant Over Temperature Condition", "P0218", "Transmission Fluid Over Temperature Condition",
            "P0219", "Engine Over Speed Condition", "P0220", "Throttle/Pedal Position Sensor/Switch \"B\" Circuit",
            "P0221", "Throttle/Pedal Position Sensor/Switch \"B\" Circuit Range/Performance Problem", "P0222",
            "Throttle/Pedal Position Sensor/Switch \"B\" Circuit Low Input", "P0223",
            "Throttle/Pedal Position Sensor/Switch \"B\" Circuit High Input", "P0224",
            "Throttle/Pedal Position Sensor/Switch \"B\" Circuit Intermittent", "P0225",
            "Throttle/Pedal Position Sensor/Switch \"C\" Circuit", "P0226",
            "Throttle/Pedal Position Sensor/Switch \"C\" Circuit Range/Performance Problem", "P0227",
            "Throttle/Pedal Position Sensor/Switch \"C\" Circuit Low Input", "P0228",
            "Throttle/Pedal Position Sensor/Switch \"C\" Circuit High Input", "P0229",
            "Throttle/Pedal Position Sensor/Switch \"C\" Circuit Intermittent", "P0230", "Fuel Pump Primary Circuit",
            "P0231", "Fuel Pump Secondary Circuit Low", "P0232", "Fuel Pump Secondary Circuit High", "P0233",
            "Fuel Pump Secondary Circuit Intermittent", "P0234", "Turbo/Super Charger Overboost Condition", "P0235",
            "Turbo/Super Charger Boost Sensor \"A\" Circuit", "P0236",
            "Turbo/Super Charger Boost Sensor \"A\" Circuit Range/Performance", "P0237",
            "Turbo/Super Charger Boost Sensor \"A\" Circuit Low", "P0238",
            "Turbo/Super Charger Boost Sensor \"A\" Circuit High", "P0239",
            "Turbo/Super Charger Boost Sensor \"B\" Circuit", "P0240",
            "Turbo/Super Charger Boost Sensor \"B\" Circuit Range/Performance", "P0241",
            "Turbo/Super Charger Boost Sensor \"B\" Circuit Low", "P0242",
            "Turbo/Super Charger Boost Sensor \"B\" Circuit High", "P0243",
            "Turbo/Super Charger Wastegate Solenoid \"A\"", "P0244",
            "Turbo/Super Charger Wastegate Solenoid \"A\" Range/Performance", "P0245",
            "Turbo/Super Charger Wastegate Solenoid \"A\" Low", "P0246",
            "Turbo/Super Charger Wastegate Solenoid \"A\" High", "P0247",
            "Turbo/Super Charger Wastegate Solenoid \"B\"", "P0248",
            "Turbo/Super Charger Wastegate Solenoid \"B\" Range/Performance", "P0249",
            "Turbo/Super Charger Wastegate Solenoid \"B\" Low", "P0250",
            "Turbo/Super Charger Wastegate Solenoid \"B\" High", "P0251",
            "Injection Pump Fuel Metering Control \"A\" (Cam/rotor/Injector)", "P0252",
            "Injection Pump Fuel Metering Control \"A\" Range/Performance (Cam/Rotor/Injector)", "P0253",
            "Injection Pump Fuel Metering Control \"A\" Low (Cam/Rotor/Injector)", "P0254",
            "Injection Pump Fuel Metering Control \"A\" High (Cam/Rotor/Injector)", "P0255",
            "Injection Pump Fuel Metering Control \"A\" Intermittent (Cam/Rotor/Injector)", "P0256",
            "Injection Pump Fuel Metering Control \"B\" (Cam/Rotor/Injector)", "P0257",
            "Injection Pump Fuel Metering Control \"B\" Range/Performance (Cam/Rotor/Injector)", "P0258",
            "Injection Pump Fuel Metering Control \"B\" Low (Cam/Rotor/Injector)", "P0259",
            "Injection Pump Fuel Metering Control \"B\" High (Cam/Rotor/Injector)", "P0260",
            "Injection Pump Fuel Metering Control \"B\" Intermittent (Cam/Rotor/Injector)", "P0261",
            "Cylinder 1 Injector Circuit Low", "P0262", "Cylinder 1 Injector Circuit High", "P0263",
            "Cylinder 1 Contribution/Balance", "P0264", "Cylinder 2 Injector Circuit Low", "P0265",
            "Cylinder 2 Injector Circuit High", "P0266", "Cylinder 2 Contribution/Balance", "P0267",
            "Cylinder 3 Injector Circuit Low", "P0268", "Cylinder 3 Injector Circuit High", "P0269",
            "Cylinder 4 Contribution/Balance", "P0270", "Cylinder 4 Injector Circuit Low", "P0271",
            "Cylinder 4 Injector Circuit High", "P0272", "Cylinder 4 Contribution/Balance", "P0273",
            "Cylinder 5 Injector Circuit Low", "P0274", "Cylinder 5 Injector Circuit High", "P0275",
            "Cylinder 5 Contribution/Balance", "P0276", "Cylinder 6Injector Circuit Low", "P0277",
            "Cylinder 6 Injector Circuit High", "P0278", "Cylinder 6 Contribution/Balance", "P0279",
            "Cylinder 7 Injector Circuit Low", "P0280", "Cylinder 7 Injector Circuit High", "P0281",
            "Cylinder 7 Contribution/Balance", "P0282", "Cylinder 8 Injector Circuit Low", "P0283",
            "Cylinder 8 Injector Circuit High", "P0284", "Cylinder 8 Contribution/Balance", "P0285",
            "Cylinder 9 Injector Circuit Low", "P0286", "Cylinder 9 Injector Circuit High", "P0287",
            "Cylinder 9 Contribution/Balance", "P0288", "Cylinder 10 Injector Circuit Low", "P0289",
            "Cylinder 10 Injector Circuit High", "P0290", "Cylinder 10 Contribution/Balance", "P0291",
            "Cylinder 11 Injector Circuit Low", "P0292", "Cylinder 11 Injector Circuit High", "P0293",
            "Cylinder 11 Contribution/Balance", "P0294", "Cylinder 12 Injector Circuit Low", "P0295",
            "Cylinder 12 Injector Circuit High", "P0296", "Cylinder 12 Contribution/Balance", "P0298",
            "Engine Oil Over Temperature", "P03XX", " Ignition System or Misfire", "P0300",
            "Random/Multiple Cylinder Misfire Detected", "P0301", "Cylinder 1 Misfire Detected", "P0302",
            "Cylinder 2 Misfire Detected", "P0303", "Cylinder 3 Misfire Detected", "P0304",
            "Cylinder 4 Misfire Detected", "P0305", "Cylinder 5 Misfire Detected", "P0306",
            "Cylinder 6 Misfire Detected", "P0307", "Cylinder 7 Misfire Detected", "P0308",
            "Cylinder 8 Misfire Detected", "P0309", "Cylinder 9 Misfire Detected", "P0310",
            "Cylinder 10 Misfire Detected", "P0311", "Cylinder 11 Misfire Detected", "P0312",
            "Cylinder 12 Misfire Detected", "P0313", "Misfire Detected with Low Fuel", "P0314",
            "Single Cylinder Misfire (Cylinder not Specified)", "P0320",
            "Ignition/Distributor Engine Speed Input Circuit", "P0321",
            "Ignition/Distributor Engine Speed Input Circuit Range/Performance", "P0322",
            "Ignition/Distributor Engine Speed Input Circuit No Signal", "P0323",
            "Ignition/Distributor Engine Speed Input Circuit Intermittent", "P0324", "Knock Control System Error",
            "P0325", "Knock Sensor 1 Circuit (Bank 1 or Single Sensor)", "P0326",
            "Knock Sensor 1 Circuit Range/Performance (Bank 1 or Single Sensor)", "P0327",
            "Knock Sensor 1 Circuit Low Input (Bank 1 or Single Sensor)", "P0328",
            "Knock Sensor 1 Circuit High Input (Bank 1 or Single Sensor)", "P0329",
            "Knock Sensor 1 Circuit Input Intermittent (Bank 1 or Single Sensor)", "P0330",
            "Knock Sensor 2 Circuit (Bank 2)", "P0331", "Knock Sensor 2 Circuit Range/Performance (Bank 2)", "P0332",
            "Knock Sensor 2 Circuit Low Input (Bank 2)", "P0333", "Knock Sensor 2 Circuit High Input (Bank 2)", "P0334",
            "Knock Sensor 2 Circuit Input Intermittent (Bank 2)", "P0335", "Crankshaft Position Sensor A Circuit",
            "P0336", "Crankshaft Position Sensor A Circuit Range/Performance", "P0337",
            "Crankshaft Position Sensor A Circuit Low Input", "P0338",
            "Crankshaft Position Sensor A Circuit High Input", "P0339",
            "Crankshaft Position Sensor A Circuit Intermittent", "P0340",
            "Camshaft Position Sensor \"A\" Circuit (Bank 1 or Single Sensor)", "P0341",
            "Camshaft Position Sensor \"A\" Circuit Range/Performance (Bank 1 or Single Sensor)", "P0342",
            "Camshaft Position Sensor \"A\" Circuit Low Input (Bank 1 or Single Sensor)", "P0343",
            "Camshaft Position Sensor \"A\" Circuit High Input (Bank 1 or Single Sensor)", "P0344",
            "Camshaft Position Sensor \"A\" Circuit Intermittent (Bank 1 or Single Sensor)", "P0345",
            "Camshaft Position Sensor \"A\" Circuit (Bank 2)", "P0348",
            "Camshaft Position Sensor \"A\" Circuit Range/Performance (Bank 2)", "P0347",
            "Camshaft Position Sensor \"A\" Circuit Low Input (Bank 2)", "P0348",
            "Camshaft Position Sensor \"A\" Circuit High Input (Bank 2)", "P0349",
            "Camshaft Position Sensor \"A\" Circuit Intermittent (Bank 2)", "P0350",
            "Ignition Coil Primary/Secondary Circuit", "P0351", "Ignition Coil \"A\" Primary/Secondary Circuit",
            "P0352", "Ignition Coil \"B\" Primary/Secondary Circuit", "P0353",
            "Ignition Coil \"C\" Primary/Secondary Circuit", "P0354", "Ignition Coil \"D\" Primary/Secondary Circuit",
            "P0355", "Ignition Coil \"E\" Primary/Secondary Circuit", "P0356",
            "Ignition Coil \"F\" Primary/Secondary Circuit", "P0357", "Ignition Coil \"G\" Primary/Secondary Circuit",
            "P0358", "Ignition Coil \"H\" Primary/Secondary Circuit", "P0359",
            "Ignition Coil \"I\" Primary/Secondary Circuit", "P0360", "Ignition Coil \"J\" Primary/Secondary Circuit",
            "P0361", "Ignition Coil \"K\" Primary/Secondary Circuit", "P0362",
            "Ignition Coil \"L\" Primary/Secondary Circuit", "P0365", "Camshaft Position Sensor \"B\" Circuit (Bank 1)",
            "P0366", "Camshaft Position Sensor \"B\" Circuit Range/Performance (Bank 1)", "P0367",
            "Camshaft Position Sensor \"B\" Circuit Low Input (Bank 1)", "P0368",
            "Camshaft Position Sensor \"B\" Circuit High Input (Bank 1)", "P0369",
            "Camshaft Position Sensor \"B\" Circuit Intermittent (Bank 1)", "P0370",
            "Timing Reference High Resolution Signal \"A\"", "P0371",
            "Timing Reference High Resolution Signal \"A\" Too Many Pulses", "P0372",
            "Timing Reference High Resolution Signal \"A\" Too Few Pulses", "P0373",
            "Timing Reference High Resolution Signal \"A\" Intermittent/Erratic Pulses", "P0374",
            "Timing Reference High Resolution Signal \"A\" No Pulse", "P0375",
            "Timing Reference High Resolution Signal \"B\"", "P0376",
            "Timing Reference High Resolution Signal \"B\" Too Many Pulses", "P0377",
            "Timing Reference High Resolution Signal \"B\" Too Few Pulses", "P0378",
            "Timing Reference High Resolution Signal \"B\" Intermittent/Erratic Pulses", "P0379",
            "Timing Reference High Resolution Signal \"B\" No Pulses", "P0380", "Glow Plug/Heater Circuit \"A\"",
            "P0381", "Glow Plug/Heater Indicator Circuit", "P0382", "Glow Plug/Heater Circuit \"B\"", "P0385",
            "Crankshaft Position Sensor \"B\" Circuit", "P0386",
            "Crankshaft Position Sensor \"B\" Circuit Range/Performance", "P0387",
            "Crankshaft Position Sensor \"B\" Circuit Low Input", "P0388",
            "Crankshaft Position Sensor \"B\" Circuit High Input", "P0389",
            "Crankshaft Position Sensor \"B\" Circuit Intermittent", "P0390", "Camshaft Position Sensor \"B\" Circuit",
            "P0391", "Camshaft Position Sensor \"B\" circuit Range/Performance (Bank 2)", "P0392",
            "Camshaft Position Sensor \"B\" Circuit Low Input (Bank 2)", "P0393",
            "Camshaft Position Sensor \"B\" Circuit High Input (Bank 2)", "P0394",
            "Camshaft Position Sensor \"B\" Circuit Intermittent (Bank 2)", "P0400", "Exhaust Gas Recirculation Flow",
            "P0401", "Exhaust Gas Recirculation Flow Insufficient Detected", "P0402",
            "Exhaust Gas Recirculation Flow Excessive Detected", "P0403", "Exhaust Gas Recirculation Control Circuit",
            "P0404", "Exhaust Gas Recirculation Control Circuit Range/Performance", "P0405",
            "Exhaust Gas Recirculation Sensor \"A\" Circuit Low", "P0406",
            "Exhaust Gas Recirculation Sensor \"A\" Circuit High", "P0407",
            "Exhaust Gas Recirculation Sensor \"B\" Circuit Low", "P0408",
            "Exhaust Gas Recirculation Sensor \"B\" Circuit High", "P0409",
            "Exhaust Gas Recirculation Sensor \"A\" Circuit", "P0410", "Secondary Air Injection System", "P0411",
            "Secondary Air Injection System Incorrect Flow Detected", "P0412",
            "Secondary Air Injection System Switching Valve \"A\" Circuit", "P0413",
            "Secondary Air Injection System Switching Valve \"A\" Circuit Open", "P0414",
            "Secondary Air Injection System Switching Valve \"A\" Circuit Shorted", "P0415",
            "Secondary Air Injection System Switching Valve \"B\" Circuit", "P0416",
            "Secondary Air Injection System Switching Valve \"B\" Circuit Open", "P0417",
            "Secondary Air Injection System Switching Valve \"B\" Circuit Shorted", "P0416",
            "Secondary Air Injection System Relay \"A\" Circuit", "P0419",
            "Secondary Air injection System Relay \"B\" Circuit", "P0420",
            "Catalyst System Efficiency Below Threshold (Bank 1)", "P0421",
            "Warm Up Catalyst Efficiency Below Threshold (Bank 1)", "P0422",
            "Main Catalyst Efficiency Below Threshold (Bank 1)", "P0423",
            "Heated Catalyst Efficiency Below Threshold (Bank 1)", "P0424",
            "Heated Catalyst Temperature Below Threshold (Bank 1)", "P0425", "Catalyst Temperature Sensor (Bank 1)",
            "P0426", "Catalyst Temperature Sensor Range/Performance (Bank 1)", "P0427",
            "Catalyst Temperature Sensor Low Input (Bank 1)", "P0428",
            "Catalyst Temperature Sensor High Input (Bank 1)", "P0429", "Catalyst Heater Control Circuit (Bank 1)",
            "P0430", "Catalyst System Efficiency Below Threshold (Bank 2)", "P0431",
            "Warm Up Catalyst Efficiency Below Threshold (Bank 2)", "P0432",
            "Main Catalyst Efficiency Below Threshold (Bank 2)", "P0433",
            "Heated Catalyst Efficiency Below Threshold (Bank 2)", "P0434",
            "Heated Catalyst Temperature Below Threshold (Bank 2)", "P0435", "Catalyst Temperature Sensor (Bank 2)",
            "P0436", "Catalyst Temperature Sensor Range/Performance (Bank 2)", "P0437",
            "Catalyst Temperature Sensor Low Input (Bank 2)", "P0438",
            "Catalyst Temperature Sensor High Input (Bank 2)", "P0439", "Catalyst Heater Control Circuit (Bank 2)",
            "P0440", "Evaporative Emission Control System", "P0441",
            "Evaporative Emission Control System Incorrect Purge Flow", "P0442",
            "Evaporative Emission Control System Leak Detected (small leak)", "P0443",
            "Evaporative Emission Control System Purge Control Valve Circuit", "P0444",
            "Evaporative Emission Control System Purge Control Valve Circuit Open", "P0445",
            "Evaporative Emission Control System Purge Control Valve Circuit Shorted", "P0446",
            "Evaporative Emission Control System Vent Control Circuit", "P0447",
            "Evaporative Emission Control System Vent Control Circuit Open", "P0448",
            "Evaporative Emission Control System Vent Control Circuit Shorted", "P0449",
            "Evaporative Emission Control System Vent Valve/Solenoid Circuit", "P0450",
            "Evaporative Emission Control System Pressure Sensor", "P0451",
            "Evaporative Emission Control System Pressure Sensor Range/Performance", "P0452",
            "Evaporative Emission Control System Pressure Sensor Low Input", "P0453",
            "Evaporative Emission Control System Pressure Sensor High input", "P0454",
            "Evaporative Emission Control System Pressure Sensor Intermittent", "P0455",
            "Evaporative Emission Control System Leak Detected (gross leak, check fuel cap, piping etc)", "P0456",
            "Evaporative Emission Control System Leak Detected (very small leak, check fuel cap, piping, etc)", "P0457",
            "Evaporative Emission Control System Leak Detected (fuel cap loose/off)", "P0460",
            "Fuel Level Sensor Circuit", "P0461", "Fuel Level Sensor Circuit Range/Performance", "P0462",
            "Fuel Level Sensor Circuit Low Input", "P0463", "Fuel Level Sensor Circuit High Input", "P0464",
            "Fuel Level Sensor Circuit Intermittent", "P0465", "EVAP Purge Flow Sensor Circuit", "P0466",
            "EVAP Purge Flow Sensor Circuit Range/Performance", "P0467", "EVAP Purge Flow Sensor Circuit Low Input",
            "P0468", "EVAP Purge Flow Sensor Circuit High Input", "P0469",
            "EVAP Purge Flow Sensor Circuit Intermittent", "P0470", "Exhaust Pressure Sensor", "P0471",
            "Exhaust Pressure Sensor Range/Performance", "P0472", "Exhaust Pressure Sensor Low", "P0473",
            "Exhaust Pressure Sensor High", "P0474", "Exhaust Pressure Sensor Intermittent", "P0475",
            "Exhaust Pressure Control Valve", "P0476", "Exhaust Pressure Control Valve Range/Performance", "P0477",
            "Exhaust Pressure Control Valve Low", "P0478", "Exhaust Pressure Control Valve High", "P0479",
            "Exhaust Pressure Control Valve Intermittent", "P0480", "Cooling Fan 1 Control Circuit", "P0481",
            "Cooling Fan 2 Control Circuit", "P0482", "Cooling Fan 3 Control Circuit", "P0483",
            "Cooling Fan Rationality Check", "P0484", "Cooling Fan Circuit Over Current", "P0485",
            "Cooling Fan Power/Ground Circuit", "P0486", "Exhaust Gas Recirculation Sensor \"B\" Circuit", "P0487",
            "Exhaust Gas Recirculation Throttle Position Control Circuit", "P0488",
            "Exhaust Gas Recirculation Throttle Position Control Range/Performance", "P0491",
            "Secondary Air Injection System (Bank 1)", "P0492", "Secondary Air Injection System (Bank 2)", "P0500",
            "Vehicle Speed Sensor", "P0501", "Vehicle Speed Sensor Range/Performance", "P0502",
            "Vehicle Speed Sensor Circuit Low Input", "P0503", "Vehicle Speed Sensor Intermittent/Erratic/High",
            "P0505", "Idle Control System", "P0506", "Idle Control System RPM Lower Than Expected", "P0507",
            "Idle Control System RPM Higher Than Expected", "P0508", "Idle Control System Circuit Low", "P0509",
            "Idle Control System Circuit High", "P0510", "Closed Throttle Position Switch", "P0512",
            "Starter Request Circuit", "P0513", "Incorrect Irnmobilizer Key (\"Immobilizer pending SAE J1930 approval)",
            "P0515", "Battery Temperature Sensor Circuit", "P0516", "Battery Temperature Sensor Circuit Low", "P0517",
            "Battery Temperature Sensor Circuit High", "P0520", "Engine Oil Pressure Sensor/Switch Circuit", "P0521",
            "Engine Oil Pressure Sensor/Switch Range/Performance", "P0522",
            "Engine Oil Pressure Sensor/Switch Low Voltage (If Mercedes/Chrysler, could be P2006 Intake manifold tumble flap sensor/connection)",
            "P0523", "Engine Oil Pressure Sensor/Switch High Voltage", "P0524", "Engine Oil Pressure Too Low", "P0530",
            "A/C Refrigerant Pressure Sensor Circuit", "P0531",
            "A/C Refrigerant Pressure Sensor Circuit Range/Performance", "P0532",
            "A/C Refrigerant Pressure Sensor Circuit Low Input", "P0533",
            "A/C Refrigerant Pressure Sensor Circuit High Input", "P0534", "Air Conditioner Refrigerant Charge Loss",
            "P0540", "Intake Air Heater Circuit", "P0541", "Intake Air Heater Circuit Low", "P0542",
            "Intake Air Heater Circuit High", "P0544", "Exhaust Gas Temperature Sensor Circuit (Bank 1)", "P0545",
            "Exhaust Gas Temperature Sensor Circuit Low (Bank 1)", "P0546",
            "Exhaust Gas Temperature Sensor Circuit High (Bank 1)", "P0547",
            "Exhaust Gas Temperature Sensor Circuit (Bank 2)", "P0548",
            "Exhaust Gas Temperature Sensor Circuit Low (Bank 2)", "P0549",
            "Exhaust Gas Temperature Sensor Circuit High (Bank 2)", "P0550", "Power Steering Pressure Sensor Circuit",
            "P0551", "Power Steering Pressure Sensor Circuit Range/Performance", "P0552",
            "Power Steering Pressure Sensor Circuit Low Input", "P0553",
            "Power Steering Pressure Sensor Circuit High Input", "P0554",
            "Power Steering Pressure Sensor Circuit Intermittent", "P0560", "System Voltage", "P0561",
            "System Voltage Unstable", "P0562", "System Voltage Low", "P0563", "System Voltage High", "P0564",
            "Cruise Control Multi-Function Input Signal", "P0565", "Cruise Control On Signal", "P0566",
            "Cruise Control Off Signal", "P0567", "Cruise Control Resume Signal", "P0568", "Cruise Control Set Signal",
            "P0569", "Cruise Control Coast Signal", "P0570", "Cruise Control Accel Signal", "P0571",
            "Cruise Control/Brake Switch A Circuit", "P0572", "Cruise Control/Brake Switch A Circuit Low", "P0573",
            "Cruise Control/Brake Switch A Circuit High", "P0574", "Cruise Control System - Vehicle Speed Too High",
            "P0575", "Cruise Control Input Circuit", "P0576", "Cruise Control Input Circuit Low", "P0577",
            "Cruise Control input Circuit High", "P0578", " through P0580 Reserved for Cruise Control Codes", "P0600",
            "Serial Communication Link", "P0601", "Internal Control Module Memory Check Sum Error", "P0602",
            "Control Module Programming Error", "P0603", "Internal Control Module Keep Alive Memory (KAM) Error",
            "P0604", "Internal Control Module Random Access Memory (RAM) Error", "P0605",
            "Internal Control Module Read Only Memory (ROM) Error", "P0606", "ECM/PCM Processor", "P0607",
            "Control Module Performance", "P0608", "Control Module VSS Output \"A\"", "P0609",
            "Control Module VSS Output \"B\"", "P0610", "Control Module Vehicle Options Error", "P0615",
            "Starter Relay Circuit", "P0616", "Starter Relay Circuit Low", "P0617", "Starter Relay Circuit High",
            "P0618", "Alternative Fuel Control Module KAM Error", "P0619",
            "Alternative Fuel Control Module RAM/ROM Error", "P0620", "Generator Control Circuit", "P0621",
            "Generator Lamp \"L\" Terminal Control Circuit", "P0622", "Generator Field \"F\" Terminal Control Circuit",
            "P0623", "Generator Lamp Control Circuit", "P0624", "Fuel Cap Lamp Control Circuit", "P0630",
            "VIN Not Programmed or Mismatch - ECM/PCM", "P0631", "VIN Not Programmed or Mismatch - TCM", "P0635",
            "Power Steering Control Circuit", "P0836", "Power Steering Control Circuit Low", "P0637",
            "Power Steering Control Circuit High", "P0638", "Throttle Actuator Control Range/Performance (Bank 1)",
            "P0639", "Throttle Actuator Control Range/Performance (Bank 2)", "P0640",
            "Intake Air Heater Control Circuit", "P0645", "A/C Clutch Relay Control Circuit", "P0646",
            "A/C Clutch Relay Control Circuit Low", "P0647", "A/C Clutch Relay Control Circuit High", "P0648",
            "Immobilizer Lamp Control Circuit (\"Immobilizer\" pending SAE J1930 approval)", "P0649",
            "Speed Control Lamp Control Circuit", "P0650", "Malfunction Indicator Lamp (ML) Control Circuit", "P0654",
            "Engine RPM Output Circuit", "P0655", "Engine Hot Lamp Output Control Circuit", "P0656",
            "Fuel Level Output Circuit", "P0660", "Intake Manifold Tuning Valve Control Circuit (Bank 1)", "P0661",
            "Intake Manifold Tuning Valve Control Circuit Low (Bank 1)", "P0662",
            "Intake Manifold Tuning Valve Control Circuit High (Bank 1)", "P0663",
            "Intake Manifold Tuning Valve Control Circuit (Bank 2)", "P0664",
            "Intake Manifold Tuning Valve Control Circuit Low (Bank 2)", "P0665",
            "Intake Manifold Tuning Valve Control Circuit High (Bank 2)", "P0700",
            "Transmission Control System (MIL Request)", "P0701", "Transmission Control System Range/Performance",
            "P0702", "Transmission Control System Electrical", "P0703", "Torque Converter/Brake Switch B Circuit",
            "P0704", "Clutch Switch In put Circuit Malfunction", "P0705",
            "Transmission Range Sensor Circuit Malfunction (PRNDL Input)", "P0706",
            "Transmission Range Sensor Circuit Range/Performance", "P0707",
            "Transmission Range Sensor Circuit Low Input", "P0708", "Transmission Range Sensor Circuit High Input",
            "P0709", "Transmission Range Sensor Circuit intermittent", "P0710",
            "Transmission Fluid Temperature Sensor Circuit", "P0711",
            "Transmission Fluid Temperature Sensor Circuit Range/Performance", "P0712",
            "Transmission Fluid Temperature Sensor Circuit Low Input", "P0713",
            "Transmission Fluid Temperature Sensor Circuit High Input", "P0714",
            "Transmission Fluid Temperature Sensor Circuit Intermittent", "P0715", "Input/Turbine Speed Sensor Circuit",
            "P0716", "Input/Turbine Speed Sensor Circuit Range/Performance", "P0717",
            "Input/Turbine Speed Sensor Circuit No Signal", "P0718", "Input/Turbine Speed Sensor Circuit Intermittent",
            "P0719", "Torque Converter/Brake Switch B Circuit Low", "P0720", "Output Speed Sensor Circuit", "P0721",
            "Output Speed Sensor Circuit Range/Performance", "P0722", "Output Speed Sensor Circuit No Signal", "P0723",
            "Output Speed Sensor Circuit Intermittent", "P0724", "Torque Converter/Brake Switch B Circuit High",
            "P0725", "Engine Speed Input Circuit", "P0726", "Engine Speed Input Circuit Range/Performance", "P0727",
            "Engine Speed Input Circuit No Signal", "P0728", "Engine Speed Input Circuit Intermittent", "P0730",
            "Incorrect Gear Ratio", "P0731", "Gear 1 Incorrect Ratio", "P0732", "Gear 2 Incorrect Ratio", "P0733",
            "Gear 3 Incorrect Ratio", "P0734", "Gear 4 Incorrect Ratio", "P0735", "Gear 5 Incorrect Ratio", "P0736",
            "Reverse Incorrect Ratio", "P0737", "TCM Engine Speed Output Circuit", "P0739",
            "TCM Engine Speed Output Circuit Low", "P0739", "TCM Engine Speed Output Circuit High", "P0740",
            "Torque Converter Clutch Circuit", "P0741", "Torque Converter Clutch Circuit Performance or Stuck Off",
            "P0742", "Torque Converter Clutch Circuit Stuck On", "P0743", "Torque Converter Clutch Circuit Electrical",
            "P0744", "Torque Converter Clutch Circuit Intermittent", "P0745", "Pressure Control Solenoid \"A\"",
            "P0746", "Pressure Control Solenoid \"A\" Performance or Stuck Off", "P0747",
            "Pressure Control Solenoid \"A\" Stuck On", "P0748", "Pressure Control Solenoid \"A\" Electrical", "P0749",
            "Pressure Control Solenoid \"A\" Intermittent", "P0750", "Shift Solenoid \"A\"", "P0751",
            "Shift Solenoid \"A\" Performance or Stuck Off", "P0752", "Shift Solenoid \"A\" Stuck On", "P0753",
            "Shift Solenoid \"A\" Electrical", "P0754", "Shift Solenoid \"A\" Intermittent", "P0765",
            "Shift Solenoid \"B\"", "P0756", "Shift Solenoid \"B\" Performance or Stuck Off", "P0757",
            "Shift Solenoid \"B\" Stuck On", "P0758", "Shift Solenoid \"B\" Electrical", "P0759",
            "Shift Solenoid \"B\" Intermittent", "P0760", "Shift Solenoid \"C\"", "P0761",
            "Shift Solenoid \"C\" Performance or Stuck Off", "P0762", "Shift Solenoid \"C\" Stuck On", "P0763",
            "Shift Solenoid \"C\" Electrical", "P0764", "Shift Solenoid \"C\" Intermittent", "P0765",
            "Shift Solenoid \"C\"", "P0766", "Shift Solenoid \"D\" Performance or Stuck Off", "P0767",
            "Shift Solenoid \"D\" Stuck On", "P0768", "Shift Solenoid \"D\" Electrical", "P0769",
            "Shift Solenoid \"D\" Intermittent", "P0770", "Shift Solenoid \"E\"", "P0771",
            "Shift Solenoid \"E\" Performance or Stuck Off", "P0772", "Shift Solenoid \"E\" Stuck On", "P0773",
            "Shift Solenoid \"E\" Electrical", "P0774", "Shift Solenoid \"E\" Intermittent", "P0775",
            "Pressure Control Solenoid \"B\"", "P0776", "Pressure Control Solenoid \"B\" Performance or Stuck Off",
            "P0777", "Pressure Control Solenoid \"B\" Stuck On", "P0778", "Pressure Control Solenoid \"B\" Electrical",
            "P0779", "Pressure Control Solenoid \"B\" Intermittent", "P0780", "Shift", "P0781", "1-2 Shift", "P0782",
            "2-3 Shift", "P0783", "3-4 Shift", "P0784", "4-5 Shift", "P0785", "Shift/Timing Solenoid", "P0786",
            "Shift/Timing Solenoid Range/Performance", "P0787", "Shift/Timing Solenoid Low", "P0788",
            "Shift/Timing Solenoid High", "P0789", "Shift/Timing Solenoid Intermittent", "P0790",
            "Normal/Performance Switch Circuit", "P0791", "Intermediate Shaft Speed Sensor Circuit", "P0792",
            "Intermediate Shaft Speed Sensor Circuit Range/Performance", "P0793",
            "Intermediate Shaft Speed Sensor Circuit No Signal", "P0794",
            "Intermediate Shaft Speed Sensor Circuit Intermittent", "P0795", "Pressure Control Solenoid \"C\"", "P0796",
            "Pressure Control Solenoid \"C\" Performance or Stuck off", "P0797",
            "Pressure Control Solenoid \"C\" Stuck On", "P0798", "Pressure Control Solenoid \"C\" Electrical", "P0799",
            "Pressure Control Solenoid \"C\" Intermittent", "P0801", "Reverse Inhibit Control Circuit", "P0803",
            "1-4 Upshift (Skip Shift) Solenoid Control Circuit", "P0804",
            "1-4 Upshift (Skip Shift) Lamp Control Circuit", "P0805", "Clutch Position Sensor Circuit", "P0806",
            "Clutch Position Sensor Circuit Range/Performance", "P0807", "Clutch Position Sensor Circuit Low", "P0808",
            "Clutch Position Sensor Circuit High", "P0809", "Clutch Position Sensor Circuit Intermittent", "P0810",
            "Clutch Position Control Error", "P0811", "Excessive Clutch Slippage", "P0812", "Reverse Input Circuit",
            "P0813", "Reverse Output Circuit", "P0814", "Transmission Range Display Circuit", "P0815",
            "Upshift Switch Circuit", "P0816", "Downshift Switch Circuit", "P0817", "Starter Disable Circuit", "P0818",
            "Driveline Disconnect Switch Input Circuit", "P0820", "Gear Lever X-Y Position Sensor Circuit", "P0821",
            "Gear Lever X Position Circuit", "P0822", "Gear Lever Y Position Circuit", "P0823",
            "Gear Lever X Position Circuit Intermittent", "P0824", "Gear Lever Y Position Circuit Intermittent",
            "P0825", "Gear Lever Push-Pull Switch (Shift Anticipate)", "P0830", "Clutch Pedal Switch \"A\" Circuit",
            "P0831", "Clutch Pedal Switch \"A\" Circuit Low", "P0832", "Clutch Pedal Switch \"A\" Circuit High",
            "P0833", "Clutch Pedal Switch \"B\" Circuit", "P0834", "Clutch Pedal Switch \"B\" Circuit Low", "P0835",
            "Clutch Pedal Switch \"B\" Circuit High", "P0836", "Four Wheel Drive (4WD) Switch Circuit", "P0837",
            "Four Wheel Drive (4WD) Switch Circuit Range/Performance", "P0838",
            "Four Wheel Drive (4WD) Switch Circuit Low", "P0839", "Four Wheel Drive (4WD) Switch Circuit High", "P0840",
            "Transmission Fluid Pressure Sensor/Switch \"A\" Circuit", "P0841",
            "Transmission Fluid Pressure Sensor/Switch \"A\" Circuit Range/Performance", "P0842",
            "Transmission Fluid Pressure Sensor/Switch \"A\" Circuit Low", "P0843",
            "Transmission Fluid Pressure Sensor/Switch \"A\" Circuit High", "P0844",
            "Transmission Fluid Pressure Sensor/Switch \"A\" Circuit Intermittent", "P0845",
            "Transmission Fluid Pressure Sensor/Switch \"B\" Circuit", "P0846",
            "Transmission Fluid Pressure Sensor/Switch \"B\" Circuit Range/Performance", "P0847",
            "Transmission Fluid Pressure Sensor/Switch \"B\" Circuit Low", "P0848",
            "Transmission Fluid Pressure Sensor/Switch \"B\" Circuit High", "P0849",
            "Transmission Fluid Pressure Sensor/Switch \"B\" Circuit Intermittent", "P2000",
            "NOx Trap Efficiency Below Threshold bank1", "P2001", "NOx Trap Efficiency Below Threshold bank2", "P2002",
            "Particulate Trap Efficiency Below Threshold bank1", "P2003",
            "Particulate Trap Efficiency Below Threshold bank2", "P2004",
            "Intake Manf Runner Control Stuck Open bank1 a)", "P2005", "Intake Manf Runner Control Stuck Open bank2 a)",
            "P2006", "Intake Manf Runner Control Stuck Closed bank1 a)", "P2007",
            "Intake Manf Runner Control Stuck Closed bank2 a)", "P2008",
            "Intake Manf Runner Control Circuit/Open bank1 a)", "P2009",
            "Intake Manf Runner Control Circuit Low bank1 a)", "P2010",
            "Intake Manf Runner Control Circuit High bank1 a)", "P2011",
            "Intake Manf Runner Control Circuit/Open bank2 a)", "P2012",
            "Intake Manf Runner Control Circuit Low bank2 a)", "P2013",
            "Intake Manf Runner Control Circuit High bank2 a)", "P2014",
            "Intake Manf Runner Position Sensor/Switch Circuit bank1", "P2015",
            "Intake Manf Runner Position Sensor/Switch Circuit Range/Performance bank1", "P2016",
            "Intake Manf Runner Position Sensor/Switch Circuit Low bank1", "P2017",
            "Intake Manf Runner Position Sensor/Switch Circuit High bank1", "P2018",
            "Intake Manf Runner Position Sensor/Switch Circuit Intermittent bank1", "P2019",
            "Intake Manf Runner Position Sensor/Switch Circuit bank2", "P2020",
            "Intake Manf Runner Position Sensor/Switch Circuit Range/Performance bank2", "P2021",
            "Intake Manf Runner Position Sensor/Switch Circuit Low bank2", "P2022",
            "Intake Manf Runner Position Sensor/Switch Circuit High bank2", "P2023",
            "Intake Manf Runner Position Sensor/Switch Circuit Intermittent bank2", "P2024",
            "EVAP Fuel Vapor Temperature Sensor Circuit", "P2025", "EVAP Fuel Vapor Temperature Sensor Performance",
            "P2026", "EVAP Fuel Vapor Temperature Sensor Circuit Low Voltage", "P2027",
            "EVAP Fuel Vapor Temperature Sensor Circuit High Voltage", "P2028",
            "EVAP Fuel Vapor Temperature Sensor Circuit Intermittent", "P2029", "Fuel Fired Heater Disabled", "P2030",
            "Fuel Fired Heater Performance", "P2031", "Exhaust Gas Temperature Sensor Circuit bank1 Sensor2", "P2032",
            "Exhaust Gas Temperature Sensor Circuit Low bank1 Sensor2", "P2033",
            "Exhaust Gas Temperature Sensor Circuit High bank1 Sensor2", "P2034",
            "Exhaust Gas Temperature Sensor Circuit bank2 Sensor2", "P2035",
            "Exhaust Gas Temperature Sensor Circuit Low bank2 Sensor2", "P2036",
            "Exhaust Gas Temperature Sensor Circuit High bank2 Sensor2", "P2037",
            "Reductant Injection Air Pressure Sensor Circuit", "P2038",
            "Reductant Injection Air Pressure Sensor Circuit Range/Performance", "P2039",
            "Reductant Injection Air Pressure Sensor Circuit Low Input", "P2040",
            "Reductant Injection Air Pressure Sensor Circuit High Input", "P2041",
            "Reductant Injection Air Pressure Sensor Circuit Intermittent", "P2042",
            "Reductant Temperature Sensor Circuit", "P2043", "Reductant Temperature Sensor Circuit Range/Performance",
            "P2044", "Reductant Temperature Sensor Circuit Low Input", "P2045",
            "Reductant Temperature Sensor Circuit High Input", "P2046",
            "Reductant Temperature Sensor Circuit Intermittent", "P2047",
            "Reductant Injector Circuit/Open bank1 Unit 1", "P2048", "Reductant Injector Circuit Low bank1 Unit 1",
            "P2049", "Reductant Injector Circuit High bank1 Unit 1", "P2050",
            "Reductant Injector Circuit/Open bank2 Unit 1", "P2051", "Reductant Injector Circuit Low bank2 Unit 1",
            "P2052", "Reductant Injector Circuit High bank2 Unit 1", "P2053",
            "Reductant Injector Circuit/Open bank1 Unit 2", "P2054", "Reductant Injector Circuit Low bank1 Unit 2",
            "P2055", "Reductant Injector Circuit High bank1 Unit 2", "P2056",
            "Reductant Injector Circuit/Open bank2 Unit 2", "P2057", "Reductant Injector Circuit Low bank2 Unit 2",
            "P2058", "Reductant Injector Circuit High bank2 Unit 2", "P2059",
            "Reductant Injection Air Pump Control Circuit/Open", "P2060",
            "Reductant Injection Air Pump Control Circuit Low", "P2061",
            "Reductant Injection Air Pump Control Circuit High", "P2062", "Reductant Supply Control Circuit/Open",
            "P2063", "Reductant Supply Control Circuit Low", "P2064", "Reductant Supply Control Circuit High", "P2065",
            "Fuel Level Sensor B Circuit", "P2066", "Fuel Level Sensor B Performance", "P2067",
            "Fuel Level Sensor B Circuit Low", "P2068", "Fuel Level Sensor B Circuit High", "P2069",
            "Fuel Level Sensor B Circuit Intermittent", "P2070", "Intake Manf Tuning Valve Stuck Open", "P2071",
            "Intake Manf Tuning Valve Stuck Closed", "P2075", "Intake Manf Tuning Valve Position Sensor/Switch Circuit",
            "P2076", "Intake Manf Tuning Valve Position Sensor/Switch Circuit Range/Performance", "P2077",
            "Intake Manf Tuning Valve Position Sensor/Switch Circuit Low", "P2078",
            "Intake Manf Tuning Valve Position Sensor/Switch Circuit High", "P2079",
            "Intake Manf Tuning Valve Position Sensor/Switch Circuit Interm", "P2080",
            "Exhaust Gas Temperature Sensor Circuit Range/Performance bank1 Sensor1", "P2081",
            "Exhaust Gas Temperature Sensor Circuit Intermittent bank1 Sensor1", "P2082",
            "Exhaust Gas Temperature Sensor Circuit Range/Performance bank2 Sensor1", "P2083",
            "Exhaust Gas Temperature Sensor Circuit Intermittent bank2 Sensor1", "P2084",
            "Exhaust Gas Temperature Sensor Circuit Range/Performance bank1 Sensor2", "P2085",
            "Exhaust Gas Temperature Sensor Circuit Intermittent bank1 Sensor2", "P2086",
            "Exhaust Gas Temperature Sensor Circuit Range/Performance bank2 Sensor2", "P2087",
            "Exhaust Gas Temperature Sensor Circuit Intermittent bank2 Sensor2", "P2088",
            "A Camshaft Position Actuator Control Circuit Low bank1 b)", "P2089",
            "A Camshaft Position Actuator Control Circuit High bank1 b)", "P2090",
            "B Camshaft Position Actuator Control Circuit Low bank1 c)", "P2091",
            "B Camshaft Position Actuator Control Circuit High bank1 c)", "P2092",
            "A Camshaft Position Actuator Control Circuit Low bank2 b)", "P2093",
            "A Camshaft Position Actuator Control Circuit High bank2 b)", "P2094",
            "B Camshaft Position Actuator Control Circuit Low bank2 c)", "P2095",
            "B Camshaft Position Actuator Control Circuit High bank2 c)", "P2096",
            "Post Catalyst Fuel Trim System Too Lean bank1", "P2097", "Post Catalyst Fuel Trim System Too Rich bank1",
            "P2098", "Post Catalyst Fuel Trim System Too Lean bank2", "P2099",
            "Post Catalyst Fuel Trim System Too Rich bank2", "P2100", "Throttle Actuator Control Motor Circuit/Open",
            "P2101", "Throttle Actuator Control Motor Circuit Range/Performance", "P2102",
            "Throttle Actuator Control Motor Circuit Low", "P2103", "Throttle Actuator Control Motor Circuit High",
            "P2104", "Throttle Actuator Control System - Forced Idle", "P2105",
            "Throttle Actuator Control System - Forced Engine Shutdown", "P2106",
            "Throttle Actuator Control System - Forced Limited Power", "P2107",
            "Throttle Actuator Control Module Processor", "P2108", "Throttle Actuator Control Module Performance",
            "P2109", "Throttle/Pedal Position Sensor A Minimum Stop Performance", "P2110",
            "Throttle Actuator Control System - Forced Limited RPM", "P2111",
            "Throttle Actuator Control System - Stuck Open", "P2112", "Throttle Actuator Control System - Stuck Closed",
            "P2113", "Throttle/Pedal Position Sensor B Minimum Stop Performance", "P2114",
            "Throttle/Pedal Position Sensor C Minimum Stop Performance", "P2115",
            "Throttle/Pedal Position Sensor D Minimum Stop Performance", "P2116",
            "Throttle/Pedal Position Sensor E Minimum Stop Performance", "P2117",
            "Throttle/Pedal Position Sensor F Minimum Stop Performance", "P2118",
            "1) Throttle Actuator Control Motor Current Range/Performance", "P2119",
            "1) Throttle Actuator Control Throttle Body Range/Performance", "P2120",
            "Throttle/Pedal Position Sensor/Switch D Circuit", "P2121",
            "Throttle/Pedal Position Sensor/Switch D Circuit Range/Performance", "P2122",
            "Throttle/Pedal Position Sensor/Switch D Circuit Low Input", "P2123",
            "Throttle/Pedal Position Sensor/Switch D Circuit High Input", "P2124",
            "Throttle/Pedal Position Sensor/Switch D Circuit Intermittent", "P2125",
            "Throttle/Pedal Position Sensor/Switch E Circuit", "P2126",
            "Throttle/Pedal Position Sensor/Switch E Circuit Range/Performance", "P2127",
            "Throttle/Pedal Position Sensor/Switch E Circuit Low Input", "P2128",
            "Throttle/Pedal Position Sensor/Switch E Circuit High Input", "P2129",
            "Throttle/Pedal Position Sensor/Switch E Circuit Intermittent", "P2130",
            "Throttle/Pedal Position Sensor/Switch F Circuit", "P2131",
            "Throttle/Pedal Position Sensor/Switch F Circuit Range Performance", "P2132",
            "Throttle/Pedal Position Sensor/Switch F Circuit Low Input", "P2133",
            "Throttle/Pedal Position Sensor/Switch F Circuit High Input", "P2134",
            "Throttle/Pedal Position Sensor/Switch F Circuit Intermittent", "P2135",
            "Throttle/Pedal Position Sensor/Switch A/B Voltage Correlation", "P2136",
            "Throttle/Pedal Position Sensor/Switch A/C Voltage Correlation", "P2137",
            "Throttle/Pedal Position Sensor/Switch B/C Voltage Correlation", "P2138",
            "Throttle/Pedal Position Sensor/Switch D/E Voltage Correlation", "P2139",
            "Throttle/Pedal Position Sensor/Switch D/F Voltage Correlation", "P2140",
            "Throttle/Pedal Position Sensor/Switch E/F Voltage Correlation", "P2141",
            "2) Exhaust Gas Recirculation Throttle Control Circuit Low", "P2142",
            "2) Exhaust Gas Recirculation Throttle Control Circuit High", "P2143",
            "Exhaust Gas Recirculation Vent Control Circuit/Open", "P2144",
            "Exhaust Gas Recirculation Vent Control Circuit Low", "P2145",
            "Exhaust Gas Recirculation Vent Control Circuit High", "P2146",
            "Fuel Injector Group A Supply Voltage Circuit/Open", "P2147",
            "Fuel Injector Group A Supply Voltage Circuit Low", "P2148",
            "Fuel Injector Group A Supply Voltage Circuit High", "P2149",
            "Fuel Injector Group B Supply Voltage Circuit/Open", "P2150",
            "Fuel Injector Group B Supply Voltage Circuit Low", "P2151",
            "Fuel Injector Group B Supply Voltage Circuit High", "P2152",
            "Fuel Injector Group C Supply Voltage Circuit/Open", "P2153",
            "Fuel Injector Group C Supply Voltage Circuit Low", "P2154",
            "Fuel Injector Group C Supply Voltage Circuit High", "P2155",
            "Fuel Injector Group D Supply Voltage Circuit/Open", "P2156",
            "Fuel Injector Group D Supply Voltage Circuit Low", "P2157",
            "Fuel Injector Group D Supply Voltage Circuit High", "P2158", "Vehicle Speed Sensor B", "P2159",
            "Vehicle Speed Sensor B Range/Performance", "P2160", "Vehicle Speed Sensor B Circuit Low", "P2161",
            "Vehicle Speed Sensor B Intermittent/Erratic", "P2162", "Vehicle Speed Sensor A / B Correlation", "P2163",
            "Throttle/Pedal Position Sensor A Maximum Stop Performance", "P2164",
            "Throttle/Pedal Position Sensor B Maximum Stop Performance", "P2165",
            "Throttle/Pedal Position Sensor C Maximum Stop Performance", "P2166",
            "Throttle/Pedal Position Sensor D Maximum Stop Performance", "P2167",
            "Throttle/Pedal Position Sensor E Maximum Stop Performance", "P2168",
            "Throttle/Pedal Position Sensor F Maximum Stop Performance", "P2169",
            "Exhaust Pressure Regulator Vent Solenoid Control Circuit/Open", "P2170",
            "Exhaust Pressure Regulator Vent Solenoid Control Circuit Low", "P2171",
            "Exhaust Pressure Regulator Vent Solenoid Control Circuit High", "P2172",
            "Throttle Actuator Control System - Sudden High Airflow Detected", "P2173",
            "Throttle Actuator Control System - High Airflow Detected", "P2174",
            "Throttle Actuator Control System - Sudden Low Airflow Detected", "P2175",
            "Throttle Actuator Control System - Low Airflow Detected", "P2176",
            "Throttle Actuator Control System - Idle Position Not Learned", "P2177", "System Too Lean Off Idle bank1",
            "P2178", "System Too Rich Off Idle bank1", "P2179", "System Too Lean Off Idle bank2", "P2180",
            "System Too Rich Off Idle bank2", "P2181", "Cooling System Performance", "P2182",
            "Engine Coolant Temperature Sensor2 Circuit", "P2183",
            "Engine Coolant Temperature Sensor2 Circuit Range/Performance", "P2184",
            "Engine Coolant Temperature Sensor2 Circuit Low", "P2185",
            "Engine Coolant Temperature Sensor2 Circuit High", "P2186",
            "Engine Coolant Temperature Sensor2 Circuit Intermittent/Erratic", "P2187", "System Too Lean at Idle bank1",
            "P2188", "System Too Rich at Idle bank1", "P2189", "System Too Lean at Idle bank2", "P2190",
            "System Too Rich at Idle bank2", "P2191", "System Too Lean at Higher Load bank1", "P2192",
            "System Too Rich at Higher Load bank1", "P2193", "System Too Lean at Higher Load bank2", "P2194",
            "System Too Rich at Higher Load bank2", "P2195", "O2 Sensor Signal Stuck Lean bank1 Sensor1", "P2196",
            "O2 Sensor Signal Stuck Rich bank1 Sensor1", "P2197", "O2 Sensor Signal Stuck Lean bank2 Sensor1", "P2198",
            "O2 Sensor Signal Stuck Rich bank2 Sensor1", "P2199", "Intake Air Temperature Sensor1 / 2 Correlation",
            "P2200", "NOx Sensor Circuit bank1", "P2201", "NOx Sensor Circuit Range/Performance bank1", "P2202",
            "NOx Sensor Circuit Low Input bank1", "P2203", "NOx Sensor Circuit High Input bank1", "P2204",
            "NOx Sensor Circuit Intermittent Input bank1", "P2205", "NOx Sensor Heater Control Circuit/Open bank1",
            "P2206", "NOx Sensor Heater Control Circuit Low bank1", "P2207",
            "NOx Sensor Heater Control Circuit High bank1", "P2208", "NOx Sensor Heater Sensor Circuit bank1", "P2209",
            "NOx Sensor Heater Sensor Circuit Range/Performance bank1", "P2210",
            "NOx Sensor Heater Sensor Circuit Low Input bank1", "P2211",
            "NOx Sensor Heater Sensor Circuit High Input bank1", "P2212",
            "NOx Sensor Heater Sensor Circuit Intermittent bank1", "P2213", "NOx Sensor Circuit bank2", "P2214",
            "NOx Sensor Circuit Range/Performance bank2", "P2215", "NOx Sensor Circuit Low Input bank2", "P2216",
            "NOx Sensor Circuit High Input bank2", "P2217", "NOx Sensor Circuit Intermittent Input bank2", "P2218",
            "NOx Sensor Heater Control Circuit/Open bank2", "P2219", "NOx Sensor Heater Control Circuit Low bank2",
            "P2220", "NOx Sensor Heater Control Circuit High bank2", "P2221", "NOx Sensor Heater Sensor Circuit bank2",
            "P2222", "NOx Sensor Heater Sensor Circuit Range/Performance bank2", "P2223",
            "NOx Sensor Heater Sensor Circuit Low bank2", "P2224", "NOx Sensor Heater Sensor Circuit High bank2",
            "P2225", "NOx Sensor Heater Sensor Circuit Intermittent bank2", "P2226", "Barometric Pressure Circuit",
            "P2227", "Barometric Pressure Circuit Range/Performance", "P2228", "Barometric Pressure Circuit Low",
            "P2229", "Barometric Pressure Circuit High", "P2230", "Barometric Pressure Circuit Intermittent", "P2231",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank1 Sensor1", "P2232",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank1 Sensor2", "P2233",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank1 Sensor3", "P2234",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank2 Sensor1", "P2235",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank2 Sensor2", "P2236",
            "1) O2 Sensor Signal Circuit Shorted to Heater Circuit bank2 Sensor3", "P2237",
            "2) O2 Sensor Positive Current Control Circuit/Open bank1 Sensor1", "P2238",
            "2) O2 Sensor Positive Current Control Circuit Low bank1 Sensor1", "P2239",
            "2) O2 Sensor Positive Current Control Circuit High bank1 Sensor1", "P2240",
            "2) O2 Sensor Positive Current Control Circuit/Open bank2 Sensor1", "P2241",
            "2) O2 Sensor Positive Current Control Circuit Low bank2 Sensor1", "P2242",
            "2) O2 Sensor Positive Current Control Circuit High bank2 Sensor1", "P2243",
            "O2 Sensor Reference Voltage Circuit/Open bank1 Sensor1", "P2244",
            "O2 Sensor Reference Voltage Performance bank1 Sensor1", "P2245",
            "O2 Sensor Reference Voltage Circuit Low bank1 Sensor1", "P2246",
            "O2 Sensor Reference Voltage Circuit High bank1 Sensor1", "P2247",
            "O2 Sensor Reference Voltage Circuit/Open bank2 Sensor1", "P2248",
            "O2 Sensor Reference Voltage Performance bank2 Sensor1", "P2249",
            "O2 Sensor Reference Voltage Circuit Low bank2 Sensor1", "P2250",
            "O2 Sensor Reference Voltage Circuit High bank2 Sensor1", "P2251",
            "O2 Sensor Negative Current Control Circuit/Open bank1 Sensor1", "P2252",
            "O2 Sensor Negative Current Control Circuit Low bank1 Sensor1", "P2253",
            "O2 Sensor Negative Current Control Circuit High bank1 Sensor1", "P2254",
            "O2 Sensor Negative Current Control Circuit/Open bank2 Sensor1", "P2255",
            "O2 Sensor Negative Current Control Circuit Low bank2 Sensor1", "P2256",
            "O2 Sensor Negative Current Control Circuit High bank2 Sensor1", "P2257",
            "Secondary Air Injection System Control A Circuit Low", "P2258",
            "Secondary Air Injection System Control A Circuit High", "P2259",
            "Secondary Air Injection System Control B Circuit Low", "P2260",
            "Secondary Air Injection System Control B Circuit High", "P2261",
            "Turbo/Super Charger Bypass Valve - Mechanical", "P2262", "Turbo Boost Pressure Not Detected - Mechanical",
            "P2263", "Turbo/Super Charger Boost System Performance", "P2264", "Water in Fuel Sensor Circuit", "P2265",
            "Water in Fuel Sensor Circuit Range/Performance", "P2266", "Water in Fuel Sensor Circuit Low", "P2267",
            "Water in Fuel Sensor Circuit High", "P2268", "Water in Fuel Sensor Circuit Intermittent", "P2269",
            "Water in Fuel Condition", "P2270", "O2 Sensor Signal Stuck Lean bank1 Sensor2", "P2271",
            "O2 Sensor Signal Stuck Rich bank1 Sensor2", "P2272", "O2 Sensor Signal Stuck Lean bank2 Sensor2", "P2273",
            "O2 Sensor Signal Stuck Rich bank2 Sensor2", "P2274", "O2 Sensor Signal Stuck Lean bank1 Sensor3", "P2275",
            "O2 Sensor Signal Stuck Rich bank1 Sensor3", "P2276", "O2 Sensor Signal Stuck Lean bank2 Sensor3", "P2277",
            "O2 Sensor Signal Stuck Rich bank2 Sensor3", "P2278",
            "O2 Sensor Signals Swapped bank1 Sensor3 / bank2 Sensor3", "P2279", "Intake Air System Leak", "P2280",
            "Air Flow Restriction / Air Leak Between Air Filter and MAF", "P2281",
            "Air Leak Between MAF and Throttle Body", "P2282", "Air Leak Between Throttle Body and Intake Valves",
            "P2283", "Injector Control Pressure Sensor Circuit", "P2284",
            "Injector Control Pressure Sensor Circuit Range/Performance", "P2285",
            "Injector Control Pressure Sensor Circuit Low", "P2286", "Injector Control Pressure Sensor Circuit High",
            "P2287", "Injector Control Pressure Sensor Circuit Intermittent", "P2288",
            "Injector Control Pressure Too High", "P2289", "Injector Control Pressure Too High - Engine Off", "P2290",
            "Injector Control Pressure Too Low", "P2291", "Injector Control Pressure Too Low - Engine Cranking",
            "P2292", "Injector Control Pressure Erratic", "P2293", "Fuel Pressure Regulator 2 Performance", "P2294",
            "Fuel Pressure Regulator 2 Control Circuit", "P2295", "Fuel Pressure Regulator 2 Control Circuit Low",
            "P2296", "Fuel Pressure Regulator 2 Control Circuit High", "P2297",
            "O2 Sensor Out of Range During Deceleration bank1 Sensor1", "P2298",
            "O2 Sensor Out of Range During Deceleration bank2 Sensor1", "P2299",
            "Brake Pedal Position / Accelerator Pedal Position Incompatible", "P2300",
            "Ignition Coil A Primary Control Circuit Low", "P2301", "Ignition Coil A Primary Control Circuit High",
            "P2302", "Ignition Coil A Secondary Circuit", "P2303", "Ignition Coil B Primary Control Circuit Low",
            "P2304", "Ignition Coil B Primary Control Circuit High", "P2305", "Ignition Coil B Secondary Circuit",
            "P2306", "Ignition Coil C Primary Control Circuit Low", "P2307",
            "Ignition Coil C Primary Control Circuit High", "P2308", "Ignition Coil C Secondary Circuit", "P2309",
            "Ignition Coil D Primary Control Circuit Low", "P2310", "Ignition Coil D Primary Control Circuit High",
            "P2311", "Ignition Coil D Secondary Circuit", "P2312", "Ignition Coil E Primary Control Circuit Low",
            "P2313", "Ignition Coil E Primary Control Circuit High", "P2314", "Ignition Coil E Secondary Circuit",
            "P2315", "Ignition Coil F Primary Control Circuit Low", "P2316",
            "Ignition Coil F Primary Control Circuit High", "P2317", "Ignition Coil F Secondary Circuit", "P2318",
            "Ignition Coil G Primary Control Circuit Low", "P2319", "Ignition Coil G Primary Control Circuit High",
            "P2320", "Ignition Coil G Secondary Circuit", "P2321", "Ignition Coil H Primary Control Circuit Low",
            "P2322", "Ignition Coil H Primary Control Circuit High", "P2323", "Ignition Coil H Secondary Circuit",
            "P2324", "Ignition Coil I Primary Control Circuit Low", "P2325",
            "Ignition Coil I Primary Control Circuit High", "P2326", "Ignition Coil I Secondary Circuit", "P2327",
            "Ignition Coil J Primary Control Circuit Low", "P2328", "Ignition Coil J Primary Control Circuit High",
            "P2329", "Ignition Coil J Secondary Circuit", "P2330", "Ignition Coil K Primary Control Circuit Low",
            "P2331", "Ignition Coil K Primary Control Circuit High", "P2332", "Ignition Coil K Secondary Circuit",
            "P2333", "Ignition Coil L Primary Control Circuit Low", "P2334",
            "Ignition Coil L Primary Control Circuit High", "P2335", "Ignition Coil L Secondary Circuit", "P2336",
            "Cylinder #1 Above Knock Threshold", "P2337", "Cylinder #2 Above Knock Threshold", "P2338",
            "Cylinder #3 Above Knock Threshold", "P2339", "Cylinder #4 Above Knock Threshold", "P2340",
            "Cylinder #5 Above Knock Threshold", "P2341", "Cylinder #6 Above Knock Threshold", "P2342",
            "Cylinder #7 Above Knock Threshold", "P2343", "Cylinder #8 Above Knock Threshold", "P2344",
            "Cylinder #9 Above Knock Threshold", "P2345", "Cylinder #10 Above Knock Threshold", "P2346",
            "Cylinder #11 Above Knock Threshold", "P2347", "Cylinder #12 Above Knock Threshold", "P2400",
            "Evaporative Emission System Leak Detect Pump Control Circuit/Open", "P2401",
            "Evaporative Emission System Leak Detect Pump Control Circuit Low", "P2402",
            "Evaporative Emission System Leak Detect Pump Control Circuit High", "P2403",
            "Evaporative Emission System Leak Detect Pump Sensor Circuit/Open", "P2404",
            "Evaporative Emission System Leak Detect Pump Sensor Circuit Range/Performance", "P2405",
            "Evaporative Emission System Leak Detect Pump Sensor Circuit Low", "P2406",
            "Evaporative Emission System Leak Detect Pump Sensor Circuit High", "P2407",
            "Evaporative Emission System Leak Detect Pump Sensor Circuit Intermittent/Erratic", "P2408",
            "Fuel Cap Sensor/Switch Circuit", "P2409", "Fuel Cap Sensor/Switch Circuit Range/Performance", "P2410",
            "Fuel Cap Sensor/Switch Circuit Low", "P2411", "Fuel Cap Sensor/Switch Circuit High", "P2412",
            "Fuel Cap Sensor/Switch Circuit Intermittent/Erratic", "P2413",
            "Exhaust Gas Recirculation System Performance", "P2414", "O2 Sensor Exhaust Sample Error bank1 Sensor1",
            "P2415", "O2 Sensor Exhaust Sample Error bank2 Sensor1", "P2416",
            "O2 Sensor Signals Swapped bank1 Sensor2 / bank1 Sensor3", "P2417",
            "O2 Sensor Signals Swapped bank2 Sensor2 / bank2 Sensor3", "P2418",
            "Evaporative Emission System Switching Valve Control Circuit/Open", "P2419",
            "Evaporative Emission System Switching Valve Control Circuit Low", "P2420",
            "Evaporative Emission System Switching Valve Control Circuit High", "P2421",
            "Evaporative Emission System Vent Valve Stuck Open", "P2422",
            "Evaporative Emission System Vent Valve Stuck Closed", "P2423",
            "HC Adsorption Catalyst Efficiency Below Threshold bank1", "P2424",
            "HC Adsorption Catalyst Efficiency Below Threshold bank2", "P2425",
            "Exhaust Gas Recirculation Cooling Valve Control Circuit/Open", "P2426",
            "Exhaust Gas Recirculation Cooling Valve Control Circuit Low", "P2427",
            "Exhaust Gas Recirculation Cooling Valve Control Circuit High", "P2428",
            "Exhaust Gas Temperature Too High bank1", "P2429", "Exhaust Gas Temperature Too High bank2", "P2430",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit bank1", "P2431",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Range/Performance bank1", "P2432",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Low bank1", "P2433",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit High bank1", "P2434",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Intermittent/Erratic bank1", "P2435",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit bank2", "P2436",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Range/Performance bank2", "P2437",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Low bank2", "P2438",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit High bank2", "P2439",
            "Secondary Air Injection System Air Flow/Pressure Sensor Circuit Intermittent/Erratic bank2", "P2440",
            "Secondary Air Injection System Switching Valve Stuck Open bank1", "P2441",
            "Secondary Air Injection System Switching Valve Stuck Closed bank1", "P2442",
            "Secondary Air Injection System Switching Valve Stuck Open bank2", "P2443",
            "Secondary Air Injection System Switching Valve Stuck Closed bank2", "P2444",
            "Secondary Air Injection System Pump Stuck On bank1", "P2445",
            "Secondary Air Injection System Pump Stuck Off bank1", "P2446",
            "Secondary Air Injection System Pump Stuck On bank2", "P2447",
            "Secondary Air Injection System Pump Stuck Off bank2", "P2448",
            "Secondary Air Injection System High Airflow bank1", "P2449",
            "Secondary Air Injection System High Airflow bank2", "P2450",
            "Evaporative Emission Control System Switching Valve Performance or Stuck Open", "P2451",
            "Evaporative Emission Control System Switching Stuck Closed", "P2452",
            "Diesel Particulate Filter Differential Pressure Sensor Circuit", "P2453",
            "Diesel Particulate Filter Differential Pressure Sensor Circuit Range/Performance", "P2454",
            "Diesel Particulate Filter Differential Pressure Sensor Circuit Low", "P2455",
            "Diesel Particulate Filter Differential Pressure Sensor Circuit High", "P2456",
            "Diesel Particulate Filter Differential Pressure Sensor Circuit Intermittent/Erattic", "P2457",
            "Exhaust Gas Recirculation Cooler System Performance", "P2458",
            "Diesel Particulate Filter Regeneration Duration", "P2459",
            "Diesel Particulate Filter Regeneration Frequency", "P2500", "Generator Lamp/L-Terminal Circuit Low",
            "P2501", "Generator Lamp/L-Terminal Circuit High", "P2502", "Charging System Voltage", "P2503",
            "Charging System Voltage Low", "P2504", "Charging System Voltage High", "P2505",
            "1) ECM/PCM Power Input Signal", "P2506", "1) ECM/PCM Power Input Signal Range/Performance", "P2507",
            "1) ECM/PCM Power Input Signal Low", "P2508", "1) ECM/PCM Power Input Signal High", "P2509",
            "1) ECM/PCM Power Input Signal Intermittent", "P2510",
            "ECM/PCM Power Relay Sensor Circuit Range/Performance", "P2511",
            "ECM/PCM Power Relay Sensor Circuit Intermittent", "P2512", "Event Data Recorder Request Circuit/ Open",
            "P2513", "Event Data Recorder Request Circuit Low", "P2514", "Event Data Recorder Request Circuit High",
            "P2515", "A/C Refrigerant Pressure Sensor B Circuit", "P2516",
            "A/C Refrigerant Pressure Sensor B Circuit Range/Performance", "P2517",
            "A/C Refrigerant Pressure Sensor B Circuit Low", "P2518", "A/C Refrigerant Pressure Sensor B Circuit High",
            "P2519", "A/C Request A Circuit", "P2520", "A/C Request A Circuit Low", "P2521",
            "A/C Request A Circuit High", "P2522", "A/C Request B Circuit", "P2523", "A/C Request B Circuit Low",
            "P2524", "A/C Request B Circuit High", "P2525", "Vacuum Reservoir Pressure Sensor Circuit", "P2526",
            "Vacuum Reservoir Pressure Sensor Circuit Range/Performance", "P2527",
            "Vacuum Reservoir Pressure Sensor Circuit Low", "P2528", "Vacuum Reservoir Pressure Sensor Circuit High",
            "P2529", "Vacuum Reservoir Pressure Sensor Circuit Intermittent", "P2530",
            "Ignition Switch Run Position Circuit", "P2531", "Ignition Switch Run Position Circuit Low", "P2532",
            "Ignition Switch Run Position Circuit High", "P2533", "Ignition Switch Run/Start Position Circuit", "P2534",
            "Ignition Switch Run/Start Position Circuit Low", "P2535",
            "Ignition Switch Run/Start Position Circuit High", "P2536", "Ignition Switch Accessory Position Circuit",
            "P2537", "Ignition Switch Accessory Position Circuit Low", "P2538",
            "Ignition Switch Accessory Position Circuit High", "P2539", "Low Pressure Fuel System Sensor Circuit",
            "P2540", "Low Pressure Fuel System Sensor Circuit Range/Performance", "P2541",
            "Low Pressure Fuel System Sensor Circuit Low", "P2542", "Low Pressure Fuel System Sensor Circuit High",
            "P2543", "Low Pressure Fuel System Sensor Circuit Intermittent", "P2544",
            "Torque Management Request Input Signal A", "P2545",
            "Torque Management Request Input Signal A Range/Performance", "P2546",
            "Torque Management Request Input Signal A Low", "P2547", "Torque Management Request Input Signal A High",
            "P2548", "Torque Management Request Input Signal B", "P2549",
            "Torque Management Request Input Signal B Range/Performance", "P2550",
            "Torque Management Request Input Signal B Low", "P2551", "Torque Management Request Input Signal B High",
            "P2552", "Throttle/Fuel Inhibit Circuit", "P2553", "Throttle/Fuel Inhibit Circuit Range/Performance",
            "P2554", "Throttle/Fuel Inhibit Circuit Low", "P2555", "Throttle/Fuel Inhibit Circuit High", "P2556",
            "Engine Coolant Level Sensor/Switch Circuit", "P2557",
            "Engine Coolant Level Sensor/Switch Circuit Range/Performance", "P2558",
            "Engine Coolant Level Sensor/Switch Circuit Low", "P2559",
            "Engine Coolant Level Sensor/Switch Circuit High", "P2560", "Engine Coolant Level Low", "P2561",
            "A/C Control Module Requested MIL Illumination", "P2562",
            "Turbocharger Boost Control Position Sensor Circuit", "P2563",
            "Turbocharger Boost Control Position Sensor Circuit Range/Performance", "P2564",
            "Turbocharger Boost Control Position Sensor Circuit Low", "P2565",
            "Turbocharger Boost Control Position Sensor Circuit High", "P2566",
            "Turbocharger Boost Control Position Sensor Circuit Intermittent", "P2567",
            "Direct Ozone Reduction Catalyst Temperature Sensor Circuit", "P2568",
            "Direct Ozone Reduction Catalyst Temperature Sensor Circuit Range/Performance", "P2569",
            "Direct Ozone Reduction Catalyst Temperature Sensor Circuit Low", "P2570",
            "Direct Ozone Reduction Catalyst Temperature Sensor Circuit High", "P2571",
            "Direct Ozone Reduction Catalyst Temperature Sensor Circuit Intermittent/Erratic", "P2572",
            "Direct Ozone Reduction Catalyst Deterioration Sensor Circuit", "P2573",
            "Direct Ozone Reduction Catalyst Deterioration Sensor Circuit Range/Performance", "P2574",
            "Direct Ozone Reduction Catalyst Deterioration Sensor Circuit Low", "P2575",
            "Direct Ozone Reduction Catalyst Deterioration Sensor Circuit High", "P2576",
            "Direct Ozone Reduction Catalyst Deterioration Sensor Circuit Intermittent/Erratic", "P2577",
            "Direct Ozone Reduction Catalyst Efficiency Below Threshold", "P2600", "Coolant Pump Control Circuit/Open",
            "P2601", "Coolant Pump Control Circuit Range/Performance", "P2602", "Coolant Pump Control Circuit Low",
            "P2603", "Coolant Pump Control Circuit High", "P2604", "Intake Air Heater A Circuit Range/Performance",
            "P2605", "Intake Air Heater A Circuit/Open", "P2606", "Intake Air Heater B Circuit Range/Performance",
            "P2607", "Intake Air Heater B Circuit Low", "P2608", "Intake Air Heater B Circuit High", "P2609",
            "Intake Air Heater System Performance", "P2610", "M/PCM Internal Engine Off Timer Performance", "P2611",
            "A/C Refrigerant Distribution Valve Control Circuit/Open", "P2612",
            "A/C Refrigerant Distribution Valve Control Circuit Low", "P2613",
            "A/C Refrigerant Distribution Valve Control Circuit High", "P2614",
            "Camshaft Position Signal Output Circuit/Open", "P2615", "Camshaft Position Signal Output Circuit Low",
            "P2616", "Camshaft Position Signal Output Circuit High", "P2617",
            "Crankshaft Position Signal Output Circuit/Open", "P2618", "Crankshaft Position Signal Output Circuit Low",
            "P2619", "Crankshaft Position Signal Output Circuit High", "P2620", "Throttle Position Output Circuit/Open",
            "P2621", "Throttle Position Output Circuit Low", "P2622", "Throttle Position Output Circuit High", "P2623",
            "Injector Control Pressure Regulator Circuit/Open", "P2624",
            "Injector Control Pressure Regulator Circuit Low", "P2625",
            "Injector Control Pressure Regulator Circuit High", "P2626",
            "O2 Sensor Pumping Current Trim Circuit/Open bank1 Sensor1", "P2627",
            "O2 Sensor Pumping Current Trim Circuit Low bank1 Sensor1", "P2628",
            "O2 Sensor Pumping Current Trim Circuit High bank1 Sensor1", "P2629",
            "O2 Sensor Pumping Current Trim Circuit/Open bank2 Sensor1", "P2630",
            "O2 Sensor Pumping Current Trim Circuit Low bank2 Sensor1", "P2631",
            "O2 Sensor Pumping Current Trim Circuit High bank2 Sensor1", "P2632", "Fuel Pump B Control Circuit /Open",
            "P2633", "Fuel Pump B Control Circuit Low", "P2634", "Fuel Pump B Control Circuit High", "P2635",
            "Fuel Pump A Low Flow / Performance", "P2636", "Fuel Pump B Low Flow / Performance", "P2637",
            "Torque Management Feedback Signal A", "P2638", "Torque Management Feedback Signal A Range/Performance",
            "P2639", "Torque Management Feedback Signal A Low", "P2640", "Torque Management Feedback Signal A High",
            "P2641", "Torque Management Feedback Signal B", "P2642",
            "Torque Management Feedback Signal B Range/Performance", "P2643", "Torque Management Feedback Signal B Low",
            "P2644", "Torque Management Feedback Signal B High", "P2645",
            "A Rocker Arm Actuator Control Circuit/Open bank1", "P2646",
            "A Rocker Arm Actuator System Performance or Stuck Off bank1", "P2647",
            "A Rocker Arm Actuator System Stuck On bank1", "P2648", "A Rocker Arm Actuator Control Circuit Low bank1",
            "P2649", "A Rocker Arm Actuator Control Circuit High bank1", "P2650",
            "B Rocker Arm Actuator Control Circuit/Open bank1", "P2651",
            "B Rocker Arm Actuator System Performance or Stuck Off bank1", "P2652",
            "B Rocker Arm Actuator System Stuck On bank1", "P2653", "B Rocker Arm Actuator Control Circuit Low bank1",
            "P2654", "B Rocker Arm Actuator Control Circuit High bank1", "P2655",
            "A Rocker Arm Actuator Control Circuit/Open bank2", "P2656",
            "A Rocker Arm Actuator System Performance or Stuck Off bank2", "P2657",
            "A Rocker Arm Actuator System Stuck On bank2", "P2658", "A Rocker Arm Actuator Control Circuit Low bank2",
            "P2659", "A Rocker Arm Actuator Control Circuit High bank2", "P2660",
            "B Rocker Arm Actuator Control Circuit/Open bank2", "P2661",
            "B Rocker Arm Actuator System Performance or Stuck Off bank2", "P2662",
            "B Rocker Arm Actuator System Stuck On bank2", "P2663", "B Rocker Arm Actuator Control Circuit Low bank2",
            "P2664", "B Rocker Arm Actuator Control Circuit High bank2", "P2665",
            "Fuel Shutoff Valve B Control Circuit/Open", "P2666", "Fuel Shutoff Valve B Control Circuit Low", "P2667",
            "Fuel Shutoff Valve B Control Circuit High", "P2668", "Fuel Mode Indicator Lamp Control Circuit", "P2669",
            "Actuator Supply Voltage B Circuit /Open", "P2670", "Actuator Supply Voltage B Circuit Low", "P2671",
            "Actuator Supply Voltage B Circuit High", "P2672", "Injection Pump Timing Offset", "P2673",
            "Injection Pump Timing Calibration Not Learned", "P2674", "Injection Pump Fuel Calibration Not Learned",
            "P2675", "Air Cleaner Inlet Control Circuit / Open", "P2676", "Air Cleaner Inlet Control Circuit Low",
            "P2677", "Air Cleaner Inlet Control Circuit Low", "P2678", "Coolant Degassing Valve Control Circuit / Open",
            "P2679", "Coolant Degassing Valve Control Circuit Low", "P2680",
            "Coolant Degassing Valve Control Circuit High", "P2681",
            "Engine Coolant Bypass Valve Control Circuit / Open", "P2682",
            "Engine Coolant Bypass Valve Control Circuit Low", "P2683",
            "Engine Coolant Bypass Valve Control Circuit High", "P2684", "Actuator Supply Voltage C Circuit / Open",
            "P2685", "Actuator Supply Voltage C Circuit Low", "P2686", "Actuator Supply Voltage C Circuit High",
            "P2700", "Trans Friction Element A Apply Time Range/Ref", "P2701",
            "Trans Friction Element B Apply Time Range/Ref", "P2702", "Trans Friction Element C Apply Time Range/Ref",
            "P2703", "Trans Friction Element D Apply Time Range/Ref", "P2704",
            "Trans Friction Element E Apply Time Range/Ref", "P2705",
            "Trans Friction Element F Apply Time Range/Performance", "P2706", "Shift Solenoid F", "P2707",
            "Shift Solenoid F Performance or Stuck Off", "P2708", "Shift Solenoid F Stuck On", "P2709",
            "Shift Solenoid F Electrical", "P2710", "Shift Solenoid F Intermittent", "P2711",
            "Unexpected Mechanical Gear Disengagement", "P2712", "Hydraulic Power Unit Leakage", "P2713",
            "Pressure Control Solenoid D", "P2714", "Pressure Control Solenoid D Performance or Stuck Off", "P2715",
            "Pressure Control Solenoid D Stuck On", "P2716", "Pressure Control Solenoid D Electrical", "P2717",
            "Pressure Control Solenoid D Intermittent", "P2718", "Pressure Control Solenoid D Control Circuit / Open",
            "P2719", "Pressure Control Solenoid D Control Circuit Range/Performance", "P2720",
            "Pressure Control Solenoid D Control Circuit Low", "P2721",
            "Pressure Control Solenoid D Control Circuit High", "P2722", "Pressure Control Solenoid E", "P2723",
            "Pressure Control Solenoid E Performance or Stuck Off", "P2724", "Pressure Control Solenoid E Stuck On",
            "P2725", "Pressure Control Solenoid E Electrical", "P2726", "Pressure Control Solenoid E Intermittent",
            "P2727", "Pressure Control Solenoid E Control Circuit / Open", "P2728",
            "Pressure Control Solenoid E Control Circuit Range/Performance", "P2729",
            "Pressure Control Solenoid E Control Circuit Low", "P2730",
            "Pressure Control Solenoid E Control Circuit High", "P2731", "Pressure Control Solenoid F", "P2732",
            "Pressure Control Solenoid F Performance or Stuck Off", "P2733", "Pressure Control Solenoid F Stuck On",
            "P2734", "Pressure Control Solenoid F Electrical", "P2735", "Pressure Control Solenoid F Intermittent",
            "P2736", "Pressure Control Solenoid F Control Circuit/Open", "P2737",
            "Pressure Control Solenoid F Control Circuit Range/Performance", "P2738",
            "Pressure Control Solenoid F Control Circuit Low", "P2739",
            "Pressure Control Solenoid F Control Circuit High", "P2740", "Trans Fluid Temperature Sensor B Circuit",
            "P2741", "Trans Fluid Temperature Sensor B Circuit Range Performance", "P2742",
            "Trans Fluid Temperature Sensor B Circuit Low", "P2743", "Trans Fluid Temperature Sensor B Circuit High",
            "P2744", "Trans Fluid Temperature Sensor B Circuit Intermittent", "P2745",
            "Intermediate Shaft Speed Sensor B Circuit", "P2746",
            "Intermediate Shaft Speed Sensor B Circuit Range/Performance", "P2747",
            "Intermediate Shaft Speed Sensor B Circuit No Signal", "P2748",
            "Intermediate Shaft Speed Sensor B Circuit Intermittent", "P2749",
            "Intermediate Shaft Speed Sensor C Circuit", "P2750",
            "Intermediate Shaft Speed Sensor C Circuit Range/Performance", "P2751",
            "Intermediate Shaft Speed Sensor C Circuit No Signal", "P2752",
            "Intermediate Shaft Speed Sensor C Circuit Intermittent", "P2753",
            "Trans Fluid Cooler Control Circuit/Open", "P2754", "Trans Fluid Cooler Control Circuit Low", "P2755",
            "Trans Fluid Cooler Control Circuit High", "P2756", "Torque Converter Clutch Pressure Control Solenoid",
            "P2757", "Torque Converter Clutch Pressure Control Solenoid Control Circuit Performance or Stuck Off",
            "P2758", "Torque Converter Clutch Pressure Control Solenoid Control Circuit Stuck On", "P2759",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit Electrical", "P2760",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit Intermittent", "P2761",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit/Open", "P2762",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit Range/Performance", "P2763",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit High", "P2764",
            "Torque Converter Clutch Pressure Control Solenoid Control Circuit Low", "P2765",
            "Input/Turbine Speed Sensor B Circuit", "P2766", "Input/Turbine Speed Sensor B Circuit Range/Performance",
            "P2767", "Input/Turbine Speed Sensor B Circuit No Signal", "P2768",
            "Input/Turbine Speed Sensor B Circuit Intermittent", "P2769", "Torque Converter Clutch Circuit Low",
            "P2770", "Torque Converter Clutch Circuit High", "P2771", "Four Wheel Drive (4WD) Low Switch Circuit",
            "P2772", "Four Wheel Drive (4WD) Low Switch Circuit Range/Performance", "P2773",
            "Four Wheel Drive (4WD) Low Switch Circuit Low", "P2774", "Four Wheel Drive (4WD) Low Switch Circuit High",
            "P2775", "Upshift Switch Circuit Range/Performance", "P2776", "Upshift Switch Circuit Low", "P2777",
            "Upshift Switch Circuit High", "P2778", "Upshift Switch Circuit Intermittent/Erratic", "P2779",
            "Downshift Switch Circuit Range/Performance", "P2780", "Downshift Switch Circuit Low", "P2781",
            "Downshift Switch Circuit High", "P2782", "Downshift Switch Circuit Intermittent/Erratic", "P2783",
            "Torque Converter Temperature Too High", "P2784", "Input/Turbine Speed Sensor A/B Correlation", "P2785",
            "Clutch Actuator Temperature Too High", "P2786", "Gear Shift Actuator Temperature Too High", "P2787",
            "Clutch Temperature Too High", "P2788", "Auto Shift Manual Adaptive Learning at Limit", "P2789",
            "Clutch Adaptive Learning at Limit", "P2790", "Gate Select Direction Circuit", "P2791",
            "Gate Select Direction Circuit Low", "P2792", "Gate Select Direction Circuit High", "P2793",
            "Gear Shift Direction Circuit", "P2794", "Gear Shift Direction Circuit Low", "P2795",
            "Gear Shift Direction Circuit High", "P2796", "Auxilary Transmission Fluid Pump Control Circuit", "P2797",
            "Auxilary Transmission Fluid Pump Circuit Performance", "P2798",
            "Auxilary Transmission Fluid Pump Control Circuit Low", "P2799",
            "Auxilary Transmission Fluid Pump Control Circuit High", "P2800",
            "Transmission Range Sensor B Circuit (PRNDL Input)", "P2801",
            "Transmission Range Sensor B Circuit Range / Performance", "P2802",
            "Transmission Range Sensor B Circuit Low Input", "P2803", "Transmission Range Sensor B Circuit High Input",
            "P2804", "Transmission Range Sensor B Circuit Intermittent", "P2805",
            "Transmission Range Sensor A/B Correlation", "P2806", "Transmission Range Sensor Alignment", "P2807",
            "Pressure Control Solenoid G", "P2808", "Pressure Control Solenoid G Performance or Stuck Off", "P2809",
            "Pressure Control Solenoid G Stuck On", "P2810", "Pressure Control Solenoid G Electrical", "P2811",
            "Pressure Control Solenoid G Intermittent", "P2812", "Pressure Control Solenoid G Control Circuit / Open",
            "P2813", "Pressure Control Circuit Range/Performance G", "P2814",
            "Pressure Control Solenoid G Control Circuit Low", "P2815",
            "Pressure Control Solenoid G Control Circuit High", "P2816", "Pressure Control Solenoid H", "P2817",
            "Pressure Control Solenoid H Performance or Stuck Off", "P2818", "Pressure Control Solenoid H Stuck On",
            "P2819", "Pressure Control Solenoid H Electrical", "P2820",
            "Pressure Control Solenoid J Performance or Stuck Off", "P2821", "Pressure Control Solenoid J Stuck On",
            "P2822", "Pressure Control Solenoid J Electrical", "P2823", "Pressure Control Solenoid J Intermittent",
            "P2824", "Pressure Control Solenoid J Control Circuit / Open", "P2825",
            "Pressure Control Solenoid J Control Circuit Range/Performance", "P2826",
            "Pressure Control Solenoid J Control Circuit Low", "P2827",
            "Pressure Control Solenoid J Control Circuit High", "P2828", "Pressure Control Solenoid K", "P2829",
            "Pressure Control Solenoid K Performance or Stuck Off", "P2830",
            "Pressure Control Solenoid K Control Circuit High", "P2A00",
            "O2 Sensor Circuit Range/Performance bank1 Sensor1", "P2A01",
            "O2 Sensor Circuit Range/Performance bank1 Sensor2", "P2A02",
            "O2 Sensor Circuit Range/Performance bank1 Sensor3", "P2A03",
            "O2 Sensor Circuit Range/Performance bank2 Sensor1", "P2A04",
            "O2 Sensor Circuit Range/Performance bank2 Sensor2", "P2A05",
            "O2 Sensor Circuit Range/Performance bank2 Sensor3", "P3400", "Cylinder Deactivation System bank1", "P3401",
            "Cylinder 1 Deactivation/Intake Valve Control Circuit/Open", "P3402",
            "Cylinder 1 Deactivation/Intake Valve Control Performance", "P3403",
            "Cylinder 1 Deactivation/Intake Valve Control Circuit Low", "P3404",
            "Cylinder 1 Deactivation/Intake Valve Control Circuit High", "P3405",
            "Cylinder 1 Exhaust Valve Control Circuit/Open", "P3406", "Cylinder 1 Exhaust Valve Control Performance",
            "P3407", "Cylinder 1 Exhaust Valve Control Circuit Low", "P3408",
            "Cylinder 1 Exhaust Valve Control Circuit High", "P3409",
            "Cylinder 2 Deactivation/Intake Valve Control Circuit/Open", "P3410",
            "Cylinder 2 Deactivation/Intake Valve Control Performance", "P3411",
            "Cylinder 2 Deactivation/Intake Valve Control Circuit Low", "P3412",
            "Cylinder 2 Deactivation/Intake Valve Control Circuit High", "P3413",
            "Cylinder 2 Exhaust Valve Control Circuit/Open", "P3414", "Cylinder 2 Exhaust Valve Control Performance",
            "P3415", "Cylinder 2 Exhaust Valve Control Circuit Low", "P3416",
            "Cylinder 2 Exhaust Valve Control Circuit High", "P3417",
            "Cylinder 3 Deactivation/Intake Valve Control Circuit/Open", "P3418",
            "Cylinder 3 Deactivation/Intake Valve Control Performance", "P3419",
            "Cylinder 3 Deactivation/Intake Valve Control Circuit Low", "P3420",
            "Cylinder 3 Deactivation/Intake Valve Control Circuit High", "P3421",
            "Cylinder 3 Exhaust Valve Control Circuit/Open", "P3422", "Cylinder 3 Exhaust Valve Control Performance",
            "P3423", "Cylinder 3 Exhaust Valve Control Circuit Low", "P3424",
            "Cylinder 3 Exhaust Valve Control Circuit High", "P3425",
            "Cylinder 4 Deactivation/Intake Valve Control Circuit/Open", "P3426",
            "Cylinder 4 Deactivation/Intake Valve Control Performance", "P3427",
            "Cylinder 4 Deactivation/Intake Valve Control Circuit Low", "P3428",
            "Cylinder 4 Deactivation/Intake Valve Control Circuit High", "P3429",
            "Cylinder 4 Exhaust Valve Control Circuit/Open", "P3430", "Cylinder 4 Exhaust Valve Control Performance",
            "P3431", "Cylinder 4 Exhaust Valve Control Circuit Low", "P3432",
            "Cylinder 4 Exhaust Valve Control Circuit High", "P3433",
            "Cylinder 5 Deactivation/Intake Valve Control Circuit/Open", "P3434",
            "Cylinder 5 Deactivation/Intake Valve Control Performance", "P3435",
            "Cylinder 5 Deactivation/Intake Valve Control Circuit Low", "P3436",
            "Cylinder 5 Deactivation/Intake Valve Control Circuit High", "P3437",
            "Cylinder 5 Exhaust Valve Control Circuit/Open", "P3438", "Cylinder 5 Exhaust Valve Control Performance",
            "P3439", "Cylinder 5 Exhaust Valve Control Circuit Low", "P3440",
            "Cylinder 5 Exhaust Valve Control Circuit High", "P3441",
            "Cylinder 6 Deactivation/Intake Valve Control Circuit/Open", "P3442",
            "Cylinder 6 Deactivation/Intake Valve Control Performance", "P3443",
            "Cylinder 6 Deactivation/Intake Valve Control Circuit Low", "P3444",
            "Cylinder 6 Deactivation/Intake Valve Control Circuit High", "P3445",
            "Cylinder 6 Exhaust Valve Control Circuit/Open", "P3446", "Cylinder 6 Exhaust Valve Control Performance",
            "P3447", "Cylinder 6 Exhaust Valve Control Circuit Low", "P3448",
            "Cylinder 6 Exhaust Valve Control Circuit High", "P3449",
            "Cylinder 7 Deactivation/Intake Valve Control Circuit/Open", "P3450",
            "Cylinder 7 Deactivation/Intake Valve Control Performance", "P3451",
            "Cylinder 7 Deactivation/Intake Valve Control Circuit Low", "P3452",
            "Cylinder 7 Deactivation/Intake Valve Control Circuit High", "P3453",
            "Cylinder 7 Exhaust Valve Control Circuit/Open", "P3454", "Cylinder 7 Exhaust Valve Control Performance",
            "P3455", "Cylinder 7 Exhaust Valve Control Circuit Low", "P3456",
            "Cylinder 7 Exhaust Valve Control Circuit High", "P3457",
            "Cylinder 8 Deactivation/Intake Valve Control Circuit/Open", "P3458",
            "Cylinder 8 Deactivation/Intake Valve Control Performance", "P3459",
            "Cylinder 8 Deactivation/Intake Valve Control Circuit Low", "P3460",
            "Cylinder 8 Deactivation/Intake Valve Control Circuit High", "P3461",
            "Cylinder 8 Exhaust Valve Control Circuit/Open", "P3462", "Cylinder 8 Exhaust Valve Control Performance",
            "P3463", "Cylinder 8 Exhaust Valve Control Circuit Low", "P3464",
            "Cylinder 8 Exhaust Valve Control Circuit High", "P3465",
            "Cylinder 9 Deactivation/Intake Valve Control Circuit/Open", "P3466",
            "Cylinder 9 Deactivation/Intake Valve Control Performance", "P3467",
            "Cylinder 9 Deactivation/Intake Valve Control Circuit Low", "P3468",
            "Cylinder 9 Deactivation/Intake Valve Control Circuit High", "P3469",
            "Cylinder 9 Exhaust Valve Control Circuit/Open", "P3470", "Cylinder 9 Exhaust Valve Control Performance",
            "P3471", "Cylinder 9 Exhaust Valve Control Circuit Low", "P3472",
            "Cylinder 9 Exhaust Valve Control Circuit High", "P3473",
            "Cylinder 10 Deactivation/Intake Valve Control Circuit/Open", "P3474",
            "Cylinder 10 Deactivation/Intake Valve Control Performance", "P3475",
            "Cylinder 10 Deactivation/Intake Valve Control Circuit Low", "P3476",
            "Cylinder 10 Deactivation/Intake Valve Control Circuit High", "P3477",
            "Cylinder 10 Exhaust Valve Control Circuit/Open", "P3478", "Cylinder 10 Exhaust Valve Control Performance",
            "P3479", "Cylinder 10 Exhaust Valve Control Circuit Low", "P3480",
            "Cylinder 10 Exhaust Valve Control Circuit High", "P3481",
            "Cylinder 11 Deactivation/Intake Valve Control Circuit/Open", "P3482",
            "Cylinder 11 Deactivation/Intake Valve Control Performance", "P3483",
            "Cylinder 11 Deactivation/Intake Valve Control Circuit Low", "P3484",
            "Cylinder 11 Deactivation/Intake Valve Control Circuit High", "P3485",
            "Cylinder 11 Exhaust Valve Control Circuit/Open", "P3486", "Cylinder 11 Exhaust Valve Control Performance",
            "P3487", "Cylinder 11 Exhaust Valve Control Circuit Low", "P3488",
            "Cylinder 11 Exhaust Valve Control Circuit High", "P3489",
            "Cylinder 12 Deactivation/Intake Valve Control Circuit/Open", "P3490",
            "Cylinder 12 Deactivation/Intake Valve Control Performance", "P3491",
            "Cylinder 12 Deactivation/Intake Valve Control Circuit Low", "P3492",
            "Cylinder 12 Deactivation/Intake Valve Control Circuit High", "P3493",
            "Cylinder 12 Exhaust Valve Control Circuit/Open", "P3494",
            "Cylinder 12 Exhaust Valve Control Circuit Performance", "P3495",
            "Cylinder 12 Exhaust Valve Control Circuit Low", "P3496", "Cylinder 12 Exhaust Valve Control Circuit High",
            "P3497", "Cylinder Deactivation System Bank 2" };

    /* renamed from: ˈ */
    public static final String[] f1507 = { "P1111", "Intake Air Temperature (IAT) intermittent high voltage", "P1112",
            "Intake Air Temperature (IAT) intermittent low voltage", "P1113",
            "Intake Air Temperature (IAT) faulty signal", "P1131", "Front heated O2 sensor (HO2S) faulty signal",
            "P1151", "Front heated O2 sensor (HO2S) bank 2 faulty signal", "P1153",
            "Front heated O2 sensor (HO2S) bank 2 signal missing", "P1171", "Long-term fuel trim, Upper Limit", "P1172",
            "Long-term fuel trim, Lower Limit", "P1174", "Long-term fuel trim, Upper Limit", "P1175",
            "Long-term fuel trim, Lower Limit", "P1177", "Long-term fuel trim, Upper Limit", "P1178",
            "Long-term fuel trim, Lower Limit", "P1179", "Long-term fuel trim, Faulty Signal", "P1181",
            "Long-term fuel trim bank 2, Upper Limit", "P1182", "Long-term fuel trim bank 2, Lower Limit", "P1184",
            "Long-term fuel trim bank 2, Upper Limit", "P1185", "Long-term fuel trim bank 2, Lower Limit", "P1237",
            "Turbocharger control system flow fault. Flow too low.", "P1238",
            "Turbocharger control system flow fault. Flow too high.", "P1325",
            "Knock sensor (KS), test pulse. Signal too low/too high.", "P1326",
            "Knock sensor (KS), offset. Signal too low/too high.", "P1329",
            "Knock sensor (KS), test pulse. Signal too low/too high.", "P1350",
            "Ignition coil cylinder 1. Signal too low.", "P1351", "Ignition coil cylinder 1. Signal too high.", "P1352",
            "Ignition coil cylinder 2. Signal too low.", "P1353", "Ignition coil cylinder 2. Signal too high.", "P1354",
            "Ignition coil cylinder 3. Signal too low.", "P1355", "Ignition coil cylinder 3. Signal too high.", "P1356",
            "Ignition coil cylinder 4. Signal too low.", "P1357", "Ignition coil cylinder 4. Signal too high.", "P1358",
            "Ignition coil cylinder 5. Signal too low.", "P1359", "Ignition coil cylinder 5. Signal too high.", "P1360",
            "Ignition coil cylinder 6. Signal too low.", "P1361", "Ignition coil cylinder 6. Signal too high.", "P1440",
            "Fuel tank filler cap missing", "P1481", "Engine cooling fan (FC) relay. Signal too low.", "P1482",
            "Engine cooling fan (FC) relay. Signal too high.", "P1513", "Brake pedal position sensor. Faulty signal.",
            "P1520", "Accelerator pedal (AP) position sensor, internal fault.", "P1520",
            "Accelerator pedal (AP) position sensor. Faulty signal.", "P1525", "Stop lamp switch. Faulty signal.",
            "P1526", "Control module, internal fault.", "P1528", "Engine control module (ECM). Internal fault.",
            "P1550", "Speed signal.", "P1551", "Speed signal.", "P1560",
            "Control module, communication fault. Signal too high.", "P1561",
            "Control module, communication fault. Signal too low.", "P1562",
            "Control module, communication fault. Signal missing.", "P1600", "Throttle unit, internal fault.", "P1601",
            "Throttle unit, internal fault.", "P1602", "Throttle unit, internal fault.", "P1603",
            "Throttle unit, internal fault. (ETM code).", "P1604", "Throttle unit, internal fault.", "P1605",
            "Throttle unit, communication fault.", "P1606", "Engine control module (ECM) communication. Faulty Signal.",
            "P1607", "Battery voltage. Faulty signal.", "P1608",
            "Throttle unit, internal fault. Signal too low or signal missing.", "P1609",
            "Throttle unit, internal fault. Signal too low or signal missing.", "P1610",
            "Throttle unit, internal fault. Signal too high.", "P1611",
            "Throttle unit communication. Signal too high or signal missing.", "P1612",
            "Throttle unit communication. Signal too low.", "P1613",
            "Throttle unit communication. Signal too high or signal missing.", "P1614",
            "Engine control module (ECM), internal fault. Faulty signal.", "P1615",
            "Control module, internal fault. Faulty signal. Permanent Fault.", "P1618",
            "Diagnostic trouble code (DTC) in another control module.", "P1625",
            "Malfunction indicator lamp (MIL), signal. Signal too low.", "P1626",
            "Malfunction indicator lamp (MIL), signal. Signal too high.", "P1627",
            "Communication control module, communication fault. Faulty signal.", "P1628",
            "Communication control module, communication fault. Faulty signal.", "P1629",
            "Communication control module, communication fault. Faulty signal.", "P1630",
            "Control module, internal fault. Faulty signal.", "P1631", "Control module communication.", "P1632",
            "Real time clock (RTC).", "P1633", "Speed signal.", "P1635",
            "Temperature sensor control module. Faulty signal.", "P1636",
            "Temperature sensor control module. Faulty signal.", "P1637", "ECM temperature exceeded 85C/185F.", "P1638",
            "ECM temperature exceeded 85C/185F.", "P1646", "Air conditioning (A/C) relay, signal. Signal too low.",
            "P1647", "Air conditioning (A/C) relay, signal. Signal too high.", "P1649",
            "Camshaft reset valve. Signal too low.", "P1650", "Camshaft reset valve. Signal too high.", "P1651",
            "Control module, internal fault. Faulty signal.", "P1652", "Control module, internal fault. Faulty signal.",
            "P1655", "Camshaft reset valve. Signal too low.", "P1656", "Camshaft reset valve. Signal too high.",
            "P1660", "Control module, communication fault. Signal too high.", "P1661",
            "Control module, communication fault. Signal too low.", "P1662",
            "Control module, communication fault. Signal missing.", "P1672", "Power supply 5 volts.", "P1673",
            "Power supply 5 volts.", "P1680", "Immobilizer communication. Signal missing" };

    /* renamed from: ˉ */
    public static final String[] f1508 = { "P1083", "Fuel Control Mixture Lean (Bank 1 Sensor 1)", "P1084",
            "Fuel Control Mixture Rich (Bank 1 Sensor 1)", "P1085", "Fuel Control Mixture Lean (Bank 2 Sensor 1)",
            "P1086", "Fuel Control Mixture Rich (Bank 2 Sensor 1)", "P1087",
            "O2 Sensor Circuit Slow Response in Lean Control Range (Bank 1 Sensor 1)", "P1088",
            "O2 Sensor Circuit Slow Response in Rich Control Range (Bank 1 Sensor 1)", "P1089",
            "O2 Sensor Circuit Slow Response in Lean Control Range (Bank 1 Sensor 2)", "P1090",
            "Pre-Catalyst Fuel Trim Too Lean Bank 1", "P1091", "Pre-Catalyst Fuel Trim Too Rich Bank 1", "P1092",
            "Pre-Catalyst Fuel Trim Too Lean Bank 2", "P1093", "Pre-Catalyst Fuel Trim Too Rich Bank 2", "P1094",
            "O2 Sensor Circuit Slow Response in Rich Control Range (Bank 2 Sensor 1)", "P1095",
            "O2 Sensor Circuit Slow Switching From Lean to Rich (Bank 1 Sensor 1)", "P1096",
            "O2 Sensor Circuit Slow Switching From Lean to Rich (Bank 2 Sensor 1)", "P1097",
            "O2 Sensor Circuit Slow Response after Coast Down Fuel Cutoff (Bank 1 Sensor 1)", "P1098",
            "O2 Sensor Circuit Slow Response after Coast Down Fuel Cutoff (Bank 2 Sensor 2)", "P1111",
            "Engine Coolant Temperature Radiator Outlet Sensor Low Input", "P1112",
            "Engine Coolant Temperature Radiator Outlet Sensor High Input", "P1115",
            "Coolant Temperature Sensor Plausibility", "P1116",
            "Mass Or Volume Air Flow Circuit Range/Performance Problem (Bank 2)", "P1117",
            "Mass Or Volume Air Flow Circuit Low Input (Bank 2)", "P1118",
            "Mass Or Volume Air Flow Circuit High Input (Bank 2)", "P1120", "Pedal Position Sensor Circuit", "P1121",
            "Pedal Position 1 Range/Performance Problem", "P1122", "Pedal Position 1 Low Input", "P1123",
            "Pedal Position 1 High Input", "P1132", "O2 Sensor Heater Control Circuit (Bank 1 Sensor 1)", "P1133",
            "O2 Sensor Heater Control Circuit (Bank 2 Sensor 1)", "P1134",
            "O2 Sensor Heater Circuit Signal Intermittent (Bank 1 Sensor 2)", "P1135",
            "O2 Sensor Heater Circuit Low Voltage (Bank 1 Sensor 1)", "P1136",
            "O2 Sensor Heater Circuit High Voltage (Bank 1 Sensor 1)", "P1137",
            "O2 Sensor Heater Circuit Signal Intermittant (Bank 1 Sensor 2)", "P1138",
            "O2 Sensor Heater Circuit Low Voltage (Bank 1 Sensor 2)", "P1139",
            "O2 Sensor Heater Circuit High Voltage (Bank 1 Sensor 2)", "P1140",
            "Mass or Volume Air Flow Circuit Range/Performance Problem", "P1145",
            "Solenoid Valve Running Losses Control Circuit Electrical", "P1151",
            "O2 Sensor Heater Circuit Signal Intermittant (Bank 2 Sensor 1)", "P1152",
            "O2 Sensor Heater Circuit Low Voltage (Bank 2 Sensor 1)", "P1153",
            "O2 Sensor Heater Circuit High Voltage (Bank 2 Sensor 1)", "P1155",
            "O2 Sensor Heater Circuit Intermittant (Bank 2 Sensor 2)", "P1156",
            "O2 Sensor Heater Circuit Low Voltage (Bank 2 Sensor 2)", "P1157",
            "O2 Sensor Heater Circuit High Voltage (Bank 2 Sensor 2)", "P1158", "Fuel Trim Additve Bank 1 Low", "P1159",
            "Fuel Trim Additve Bank 1 High", "P1160", "Fuel Trim Additve Bank 2 Low", "P1161",
            "Fuel Trim Additve Bank 2 High", "P1162", "Fuel Trim Additve Per Ignition Bank 1 Low", "P1163",
            "Fuel Trim Additve Per Ignition Bank 1 High", "P1164", "Fuel Trim Additve Per Ignition Bank 2 Low", "P1165",
            "Fuel Trim Additve Per Ignition Bank 2 High", "P1174", "Fuel Trim Adaptation Additve Bank 1 Malfunction",
            "P1175", "Fuel Trim Adaptation Additve Bank 2 Malfunction", "P1176", "O2 Sensor Slow Response Bank 1",
            "P1177", "O2 Sensor Slow Response Bank 2", "P1178",
            "O2 Sensor Signal Circuit Slow Switching From Rich to Lean (Bank 1 Sensor 1)", "P1179",
            "O2 Sensor Signal Circuit Slow Switching From Rich to Lean (Bank 2 Sensor 1)", "P1180",
            "O2 Sensor Signal Circuit Slow Switching From Rich to Lean (Bank 1 Sensor 2)", "P1181",
            "O2 Sensor Signal Circuit Slow Switching From Rich to Lean (Bank 2 Sensor 2)", "P1182",
            "O2 Sensor (Bank 1 Sensor 2) Open Circuit During Coast Down Fuel Cut-off", "P1183",
            "O2 Sensor (Bank 2 Sensor 2) Open Circuit During Coast Down Fuel Cut-off", "P1186",
            "O2 Sensor Heater Control Circuit (Bank 1 Sensor 2)", "P1187",
            "O2 Sensor Heater Control Circuit (Bank 2 Sensor 2)", "P1188", "Fuel Control (Bank 1 Sensor 1)", "P1189",
            "Fuel Control (Bank 2 Sensor 1)", "P1190", "Pre-catalyst Fuel Trim System Bank 1", "P1191",
            "Pre-catalyst Fuel Trim System Bank 2", "P1192", "Post-catalyst Fuel Trim System Bank 1", "P1193",
            "Post-catalyst Fuel Trim System Bank 2", "P1221", "Pedal Position Sensor 2 Range/Performance Problem",
            "P1222", "Pedal Position Sensor 2 Low Input", "P1223", "Pedal Position Sensor 2 High Input", "P1270",
            "Control Module Self-Test, Torque Monitoring", "P1271", "Ambient Air Pressure Sensor Electrical", "P1283",
            "Switching Solenoid for Air Assisted Injection Valves Bank 1 Control Circuit Electrical", "P1284",
            "Switching Solenoid for Air Assisted Injection Valves Bank 1 Control Circuit Signal Low", "P1285",
            "Switching Solenoid for Air Assisted Injection Valves Bank 1 Control Circuit Signal High", "P1287",
            "Switching Solenoid for Air Assisted Injection Valves Bank 2 Control Circuit Electrical", "P1288",
            "Switching Solenoid for Air Assisted Injection Valves Bank 2 Control Circuit Signal Low", "P1289",
            "Switching Solenoid for Air Assisted Injection Valves Bank 2 Control Circuit Signal High", "P1313",
            "A Camshaft Position Plausibility", "P1317", "B Camshaft Position Plausibility", "P1327",
            "Knock Sensor 2 (Bank 1) Low Input", "P1328", "Knock Sensor 2 (Bank 1) High Input", "P1332",
            "Knock Sensor 4 Low Input", "P1333", "Knock Sensor 4 High Input", "P1340",
            "Multiple Cylinder Misfire During Start", "P1341", "Multiple Cylinder Misfire With Fuel Cut-off", "P1342",
            "Misfire During Start Cylinder 1", "P1343", "Misfire Cylinder 1 With Fuel Cut-off", "P1344",
            "Misfire During Start Cylinder 2", "P1345", "Misfire Cylinder 2 With Fuel Cut-off", "P1346",
            "Misfire During Start Cylinder 3", "P1347", "Misfire Cylinder 3 With Fuel Cut-off", "P1348",
            "Misfire During Start Cylinder 4", "P1349", "Misfire Cylinder 4 With Fuel Cut-off", "P1350",
            "Misfire During Start Cylinder 5", "P1351", "Misfire Cylinder 5 With Fuel Cut-off", "P1352",
            "Misfire During Start Cylinder 6", "P1353", "Misfire Cylinder 6 With Fuel Cut-off", "P1354",
            "Misfire During Start Cylinder 7", "P1355", "Misfire Cylinder 7 With Fuel Cut-off", "P1356",
            "Misfire During Start Cylinder 8", "P1357", "Misfire Cylinder 8 With Fuel Cut-off", "P1358",
            "Misfire During Start Cylinder 9", "P1359", "Misfire Cylinder 9 With Fuel Cut-off", "P1360",
            "Misfire During Start Cylinder 10", "P1361", "Misfire Cylinder 10 With Fuel Cut-off", "P1362",
            "Misfire During Start Cylinder 11", "P1363", "Misfire Cylinder 11 With Fuel Cut-off", "P1364",
            "Misfire During Start Cylinder 12", "P1365", "Misfire Cylinder 12 With Fuel Cut-off", "P1384",
            "Knock Sensor 3 Circuit", "P1385", "Knock Sensor 4 Circuit", "P1386",
            "Control Module Self-test, Knock Control Baseline Test Bank 1", "P1396",
            "Crankshaft Position Sensor Segment Timing Plausibility", "P1397",
            "Camshaft Position Sensor \"B\" Circuit (Bank 1)", "P1400",
            "Heated Catalyst Battery Voltage or Current too Low During Heating (Bank 1)", "P1401",
            "Heated Catalyst Current too High During Heating (Bank 1)", "P1402",
            "Heated Catalyst Power Switch Overtemperature Condition (Bank 1)", "P1403",
            "Carbon Canister Shut Off valve Control Circuit Electrical", "P1404",
            "Heated Catalyst Current too High During Heating (Bank 2)", "P1405",
            "Heated Catalyst Power Switch Overtemperature Condition (Bank 2)", "P1406",
            "Heated Catalyst Internal Control Module Checksum/ROM Error", "P1413",
            "Secondary Air Injection Pump Relay Control Circuit Signal Low", "P1414",
            "Secondary Air Injection System Monitor Circuit High", "P1420",
            "Secondary Air Valve Control Circuit Electrical", "P1421", "Secondary Air System Bank 1", "P1422",
            "Secondary Air System Bank 2", "P1432", "Secondary Air Injection System Incorrect Flow Detected", "P1438",
            "Purge Control Valve Control Open Circuit", "P1439", "Purge Control Valve Control Circuit Signal Low",
            "P1440", "Purge Control Valve Control Circuit Signal High", "P1441",
            "Leakage Diagnostic Pump Control Open Circuit", "P1442",
            "Leakage Diagnostic Pump Control Circuit Signal Low", "P1443",
            "Leakage Diagnostic Pump Control Circuit Signal High", "P1444",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Control Open Circuit", "P1445",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Control Circuit Signal Low", "P1446",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Control Circuit Signal High", "P1447",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Too High During Switching", "P1448",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Too Low During Switching", "P1449",
            "Diagnostic Module Tank Leakage (DM-TL) Pump Too High", "P1450",
            "Diagnostic Module Tank Leakage (DM-TL) Switching Solenoid Open Circuit", "P1451",
            "Diagnostic Module Tank Leakage (DM-TL) Switching Solenoid Control Circuit Signal Low", "P1452",
            "Diagnostic Module Tank Leakage (DM-TL) Switching Solenoid Control Circuit Signal High", "P1453",
            "Secondary Air Injection Pump Relay Control Circuit Electrical", "P1454",
            "Secondary Air Injection Pump With Series Resistor Control Circuit Electrical", "P1456",
            "Heated Catalyst Heater Power Supply Open Circuit (Bank 1)", "P1457",
            "Heated Catalyst Heater Power Switch Temperature Sensor Electrical (Bank 1)", "P1459",
            "Heated Catalyst Heater Power Supply Open Circuit (Bank 2)", "P1460",
            "Heated Catalyst Heater Power Switch Temperature Sensor Electrical (Bank 2)", "P1461",
            "Heated Catalyst Gate Voltage Signal Low", "P1462",
            "Heated Catalyst Internal Control Module Checksum/ROM Error", "P1463",
            "Heated Catalyst Battery Temperature Sensor 1 Electrical", "P1464",
            "Heated Catalyst Battery Temperature Sensor 2 Electrical", "P1465",
            "Heated Catalyst Battery Temperature Sensor 1 or 2 Plausibility", "P1466",
            "Heated Catalyst Power Switch Temperature Sensor Plausibility", "P1467",
            "Heated Catalyst Comparison Battery Voltages of Power Switches Plausibility", "P1468",
            "Heated Catalyst Battery Disconnecting Switch Plausibility", "P1470",
            "Leakage Diagnostic Pump Control Circuit Electrical", "P1472",
            "Diagnostic Module Tank leakage (DM-TL) Switching Solenoid Control Circuit Electrical", "P1473",
            "Diagnostic Module Tank leakage (DM-TL) Pump Current Plausibility", "P1475",
            "Leakage Diagnostic Pump Reed Switch Did Not Close", "P1476", "Leakage Diagnostic Pump Clamped Tube",
            "P1477", "Leakage Diagnostic Pump Reed Switch Did Not Open", "P1500", "Idle Speed Control Valve Stuck Open",
            "P1501", "Idle Speed Control Valve Stuck Closed", "P1502",
            "Idle Speed Control Valve Closing Solenoid Control Circuit Signal High or Low", "P1503",
            "Idle Speed Control Valve Closing Solenoid Control Circuit Signal Low", "P1504",
            "Idle Speed Control Valve Closing Solenoid Control Open Circuit", "P1505",
            "Idle Speed Control Valve Closing Solenoid Control Circuit Electrial", "P1506",
            "Idle Speed Control Valve Open Solenoid Control Circuit Signal High", "P1507",
            "Idle Speed Control Valve Open Solenoid Control Circuit Signal Low", "P1508",
            "Idle Speed Control Valve Opening Solenoid Control Open Circuit", "P1509",
            "Idle Speed Control Valve Opening Solenoid Control Circuit Electrial", "P1510",
            "Idle Speed Control Valve Stuck", "P1511", "DISA Control Circuit Electrical", "P1512",
            "DISA Control Circuit Signal Low", "P1513", "DISA Control Circuit Signal High", "P1519",
            "A Camshaft Position Actuator Bank 1", "P1520", "B Camshaft Position Actuator Bank 1", "P1522",
            "A Camshaft Position Actuator Bank 2", "P1523", "A Camshaft Position Actuator Signal Low Bank 1", "P1524",
            "A Camshaft Position Actuator Signal High Bank 1", "P1525",
            "A Camshaft Position Actuator Control Open Circuit Bank 1", "P1526",
            "A Camshaft Position Actuator Control Open Circuit Bank 2", "P1527",
            "A Camshaft Position Actuator Control Circuit Signal Low Bank 1", "P1528",
            "A Camshaft Position Actuator Control Circuit Signal High Bank 1", "P1529",
            "B Camshaft Position Actuator Control Circuit Signal Low Bank 1", "P1530",
            "B Camshaft Position Actuator Control Circuit Signal High Bank 1", "P1531",
            "B Camshaft Position Actuator Control Open Circuit Bank 1", "P1532",
            "B Camshaft Position Actuator Control Open Circuit Bank 2", "P1533",
            "B Camshaft Position Actuator Control Circuit Signal Low Bank 2", "P1534",
            "B Camshaft Position Actuator Control Circuit Signal High Bank 2", "P1540", "Pedal Position Sensor",
            "P1541", "Pedal Position Sensor Double Error", "P1542", "Pedal Position Sensor Electrical", "P1543",
            "Pedal Position Sensor", "P1544", "Pedal Position Sensor", "P1545", "Pedal Position Sensor", "P1546",
            "Pedal Position Sensor", "P1550", "Idle Speed Control valve Closing Solenoid Control Circuit Electrical",
            "P1551", "A Camshaft Position Actuator Control Open Circuit Bank 1", "P1552",
            "A Camshaft Position Actuator Control Open Circuit Bank 1", "P1556",
            "A Camshaft Position Actuator Control Open Circuit Bank 1", "P1560",
            "B Camshaft Position Actuator Control Open Circuit Bank 1", "P1564", "Control Module Selection", "P1565",
            "B Camshaft Position Actuator Control Open Circuit Bank 1", "P1569",
            "A Camshaft Position Actuator Control Open Circuit Bank 2", "P1580", "Throttle Valve Mechanically Stuck",
            "P1581", "B Camshaft Position Actuator Control Open Circuit Bank 2", "P1589",
            "Control Module Self Test, Knock Control Test Pulse Bank 1", "P1593", "DISA Control Circuit Electrical",
            "P1594", "B Camshaft Position Actuator Control Open Circuit Bank 2", "P1602",
            "Control Module Self Test, Control Module Defective", "P1603",
            "Control Module Self Test, Torque Monitoring", "P1604", "Control Module Self Test, Speed Monitoring",
            "P1607", "CAN Version", "P1608", "Serial Communicating Link Control Module", "P1609",
            "Serial Communicating Link EML", "P1611", "Serial Communicating Link Transmission Control Module", "P1619",
            "MAP Cooling Control Circuit Signal Low", "P1620", "MAP Cooling Control Circuit Signal High", "P1622",
            "MAP Cooling Control Circuit Electrical", "P1623", "Pedal Position Sensor Potentiometer Supply", "P1624",
            "Aux control or Thermostat - coolant below regulating temperature", "P1625",
            "Pedal Position Sensor Potentiometer Supply Channel 2 Electrical", "P1632",
            "Throttle Valve Adaptation; Adaptation Condition Not Met", "P1633",
            "Throttle Valve Adaptation; Limp Home Position", "P1634", "Throttle Valve Adaptation; Spring Test Failed",
            "P1635", "Throttle Valve Adaptation; Lower Mechanical Stop Not Adapted", "P1636",
            "Throttle Valve Control Circuit", "P1637", "Throttle Valve Position Control; Control Deviation", "P1638",
            "Throttle Valve Position Control; Throttle Stuck Temporarily", "P1639",
            "Throttle Valve Position Control; Throttle Stuck Permanently", "P1640",
            "Internal Control Module (ROM/RAM) Error", "P1690", "Malfunction Indicator Lamp (MIL) Electrical", "P1734",
            "Pressure Control Solenoid \"B\" Electrical", "P1738", "Pressure Control Solenoid \"C\" Electrical",
            "P1743", "Pressure Control Solenoid \"E\" Electrical", "P1744",
            "Pressure Control Solenoid \"A\" Electrical", "P1746", "Transmission Control Module Output Stage", "P1747",
            "CAN Bus Monitoring", "P1748", "Transmission Control Module Self Test", "P1749",
            "Secondary Pressure Solenoid Communication Error", "P1750",
            "Secondary Pressure Solenoid Circuit Range/Performance", "P1751",
            "Secondary Pressure Solenoid Open Circuit", "P1761", "Shift Solenoid Malfunction", "P1765",
            "CAN Throttle Valve", "P1770", "CAN Torque Interface", "P1780", "CAN Torque Reduction" };

    /* renamed from: ˊ */
    public static final File f1509 = new File(
            Environment.getExternalStorageDirectory() + File.separator + ".torque" + File.separator + "faultlogs");

    /* renamed from: ˋ */
    public static final int f1510 = 1;

    /* renamed from: ˌ */
    public static final String[] f1511 = { "P1000", "OBD-II Monitor Testing Incomplete", "P1001",
            "KOER Test Cannot Be Completed", "P1039", "Vehicle Speed Signal Missing or Improper", "P1051",
            "Brake Switch Signal Missing or Improper", "P1100", "Mass Air Flow Sensor Intermittent", "P1101",
            "Mass Air Flow Sensor out of Self-Test Range", "P1112", "Intake Air Temperature Sensor Intermittent",
            "P1116", "Engine Coolant Temperature Sensor is out of Self-Test Range", "P1117",
            "Engine Coolant Temperature Sensor Intermittent", "P1120", "Throttle Position Sensor out of range", "P1121",
            "Throttle Position Sensor Inconsistent with Mass Air Flow Sensor", "P1124",
            "Throttle Position Sensor out of Self-Test Range", "P1125", "Throttle Position Sensor Intermittent",
            "P1127", "Heated Oxygen Sensor Heater not on During KOER Test", "P1128",
            "Heated Oxygen Sensor Signals reversed", "P1129", "Heated Oxygen Sensor Signals reversed", "P1130",
            "Lack of Upstream Heated Oxygen Sensor Switch - Adaptive Fuel Limit - Bank No. 1", "P1131",
            "Lack of Upstream Heated Oxygen Sensor Switch - Sensor Indicates Lean - Bank No. 1", "P1132",
            "Lack of Upstream Heated Oxygen Sensor Switch - Sensor Indicates Rich - Bank No. 1", "P1135",
            "Ignition Switch Signal Missing or Improper", "P1137",
            "Lack of Downstream Heated Oxygen Sensor Switch - Sensor Indicates Lean - Bank No. 1", "P1138",
            "Lack of Downstream Heated Oxygen Sensor Switch - Sensor Indicates Rich - Bank No. 1", "P1150",
            "Lack of Upstream Heated Oxygen Sensor Switch - Adaptive Fuel Limit - Bank No. 2", "P1151",
            "Lack of Upstream Heated Oxygen Sensor Switch - Sensor Indicates Lean - Bank No. 2", "P1152",
            "Lack of Upstream Heated Oxygen Sensor Switch - Sensor Indicates Rich - Bank No. 2", "P1157",
            "Lack of Downstream Heated Oxygen Sensor Switch - Sensor Indicates Lean - Bank No. 2", "P1158",
            "Lack of Downstream Heated Oxygen Sensor Switch - Sensor Indicates Rich - Bank No. 2", "P1220",
            "Series Throttle Control fault", "P1224", "Throttle Position Sensor B out of Self-Test Range", "P1230",
            "Open Power to Fuel Pump circuit", "P1231", "High Speed Fuel Pump Relay activated", "P1232",
            "Low Speed Fuel Pump Primary circuit failure", "P1233", "Fuel Pump Driver Module off-line", "P1234",
            "Fuel Pump Driver Module off-line", "P1235", "Fuel Pump Control out of range", "P1236",
            "Fuel Pump Control out of range", "P1237", "Fuel Pump Secondary circuit fault", "P1238",
            "Fuel Pump Secondary circuit fault", "P1250", "Lack of Power to FPRC Solenoid", "P1260",
            "Theft Detected - Engine Disabled", "P1270", "Engine RPM or Vehicle Speed Limiter Reached", "P1288",
            "Cylinder Head Temperature Sensor out of Self-Test Range", "P1289",
            "Cylinder Head Temperature Sensor Signal Greater Than Self-Test Range", "P1290",
            "Cylinder Head Temperature Sensor Signal Less Than Self-Test Range", "P1299",
            "Cylinder Head Temperature Sensor Detected Engine Overheating Condition", "P1309",
            "Misfire Detection Monitor not enabled", "P1351", "Ignition Diagnostic Monitor circuit Input fault",
            "P1352", "Ignition Coil A - Primary circuit fault", "P1353", "Ignition Coil B - Primary circuit fault",
            "P1354", "Ignition Coil C - Primary circuit fault", "P1355", "Ignition Coil D - Primary circuit fault",
            "P1356", "Loss of Ignition Diagnostic Module Input to PCM", "P1358",
            "Ignition Diagnostic Monitor Signal out of Self-Test Range", "P1359", "Spark Output circuit fault", "P1364",
            "Ignition Coil Primary circuit fault", "P1380", "VCT Solenoid Valve circuit Short or Open", "P1381",
            "Cam Timing Advance is excessive", "P1383", "Cam Timing Advance is excessive", "P1390",
            "Octane Adjust out of Self-Test Range", "P1400",
            "Differential Pressure Feedback Electronic Sensor circuit Low Voltage", "P1401",
            "Differential Pressure Feedback Electronic Sensor circuit High Voltage", "P1403",
            "Differential Pressure Feedback Electronic Sensor Hoses Reversed", "P1405",
            "Differential Pressure Feedback Electronic Sensor circuit Upstream Hose", "P1406",
            "Differential Pressure Feedback Electronic Sensor circuit Downstream Hose", "P1407", "EGR No Flow Detected",
            "P1408", "EGR Flow out of Self-Test Range", "P1409", "EGR Vacuum Regulator circuit malfunction", "P1409",
            "Electronic Vacuum Regulator Control circuit fault", "P1410", "EGR Barometric Pressure Sensor VREF Voltage",
            "P1411", "Secondary Air is not being diverted", "P1413",
            "Secondary Air Injection System Monitor circuit Low Voltage", "P1414",
            "Secondary Air Injection System Monitor circuit High Voltage", "P1442",
            "Secondary Air Injection System Monitor circuit High Voltage", "P1443",
            "Evaporative Emission Control System - Vacuum System - Purge Control Solenoid or Purge Control Valve fault",
            "P1444", "Purge Flow Sensor circuit Input Low", "P1445", "Purge Flow Sensor circuit Input High", "P1450",
            "Inability of Evaporative Emission Control System to Bleed Fuel Tank", "P1451",
            "EVAP Control System Canister Vent Solenoid Circuit Malfunction", "P1452",
            "Inability of Evaporative Emission Control System to Bleed Fuel Tank", "P1455",
            "Substantial Leak or Blockage in Evaporative Emission Control System", "P1460",
            "Wide Open Throttle Air Conditioning Cutoff circuit malfunction", "P1461",
            "Air Conditioning Pressure Sensor circuit Low Input", "P1462",
            "Air Conditioning Pressure Sensor circuit high Input", "P1463",
            "Air Conditioning Pressure Sensor Insufficient Pressure change", "P1464",
            "ACCS to PCM High During Self-Test", "P1469", "Low Air Conditioning Cycling Period", "P1473",
            "Fan Secondary High with Fans Off", "P1474", "Low Fan Control Primary circuit", "P1479",
            "High Fan Control Primary circuit", "P1480", "Fan Secondary Low with Low Fans On", "P1481",
            "Fan Secondary Low with High Fans On", "P1483", "Power to Cooling Fan Exceeded Normal Draw", "P1484",
            "Variable Load Control Module Pin 1 Open", "P1500", "Vehicle Speed Sensor Intermittent", "P1501",
            "Programmable Speedometer & Odometer Module/Vehicle Speed Sensor Intermittent circuit-failure", "P1502",
            "Invalid or Missing Vehicle Speed Message or Brake Data", "P1504", "Intake Air Control circuit malfunction",
            "P1505", "Idle Air Control System at Adaptive Clip", "P1506", "Idle Air Control Over Speed Error", "P1507",
            "Idle Air Control Under Speed Error", "P1512", "Intake Manifold Runner Control Stuck Closed", "P1513",
            "Intake Manifold Runner Control Stuck Closed", "P1516", "Intake Manifold Runner Control Input Error",
            "P1517", "Intake Manifold Runner Control Input Error", "P1518",
            "Intake Manifold Runner Control fault - Stuck Open", "P1519", "Intake Manifold Runner Control Stuck Open",
            "P1520", "Intake Manifold Runner Control circuit fault", "P1519",
            "Intake Manifold Runner Control fault - Stuck Closed", "P1520", "Intake Manifold Runner Control fault",
            "P1530", "Open or Short to A/C Compressor Clutch circuit", "P1537",
            "Intake Manifold Runner Control Stuck Open", "P1538", "Intake Manifold Runner Control Stuck Open", "P1539",
            "Power to A/C Compressor Clutch circuit Exceeded Normal Current Draw", "P1549",
            "Intake Manifold Temperature Valve Vacuum Actuator Connection", "P1550",
            "Power Steering Pressure Sensor out of Self-Test Range", "P1605", "PCM Keep Alive Memory Test Error",
            "P1625", "Voltage to Vehicle Load Control Module Fan circuit not detected", "P1626",
            "Voltage to Vehicle Load Control Module circuit not detected", "P1633",
            "Keep Alive Memory (KAM) voltage low (Check PWM fuses and battery or replace PWM)", "P1650",
            "Power Steering Pressure Switch out of Self-Test Range", "P1651",
            "Power Steering Pressure Switch Input fault", "P1700", "Transmission system problems", "P1701",
            "Reverse Engagement Error", "P1702", "Transmission system problems", "P1703",
            "Brake On/Off Switch out of Self-Test Range", "P1704", "Transmission system problems", "P1705",
            "Manual Lever Position Sensor out of Self-Test Range", "P1709",
            "Park or Neutral Position Switch out of Self-Test Range", "P1710", "Transmission system problems", "P1711",
            "Transmission Fluid Temperature Sensor out of Self-Test Range", "P1720", "Transmission system problems",
            "P1729", "4x4 Low Switch Error", "P1740", "Transmission system problems", "P1741",
            "Torque Converter Clutch Control Error", "P1742", "Torque Converter Clutch Solenoid Faulty", "P1743",
            "Torque Converter Clutch Solenoid Faulty", "P1744", "Torque Converter Clutch System Stuck in Off Position",
            "P1745", "Transmission system problems", "P1746", "Electronic Pressure Control Solenoid - Open circuit",
            "P1747", "Electronic Pressure Control Solenoid - Short circuit", "P1749",
            "Electronic Pressure Control Solenoid Failed Low", "P1751", "Shift Solenoid No. 1 Performance", "P1754",
            "Coast Clutch Solenoid circuit malfunction", "P1756", "Shift Solenoid No. 2 Performance", "P1760",
            "Transmission system problems", "P1761", "Shift Solenoid No. 3 Performance", "P1762",
            "Transmission system problems", "P1767", "Transmission system problems", "P1780",
            "Transmission Control Switch circuit is out of Self-Test Range", "P1781",
            "4x4 Low Switch is out of Self-Test Range", "P1783", "Transmission Over-Temperature Condition", "P1784",
            "Transmission system problems", "P1785", "Transmission system problems", "P1786",
            "Transmission system problems", "P1787", "Transmission system problems", "P1788",
            "Transmission system problems", "P1789", "Transmission system problems", "P1900",
            "Output Shaft Speed Sensor Circuit Failure", "P1001", "KOER Not Able To Complete, KOER Aborted (Ford)",
            "P1106", "Manifold Absolute Pressure (MAP) sensor circuit intermittent high voltage", "P1107",
            "Manifold Absolute Pressure (MAP) sensor circuit intermittent low voltage", "P1108",
            "BARO to MAP signal circuit comparison too high", "P1111",
            "Intake Air Temperature (IAT) sensor intermittent high voltage", "P1114",
            "Engine Coolant Temperature (ECT) sensor circuit intermittent low voltage", "P1115",
            "Intake Air Temperature 2 Circuit High Input", "P1120", "TPS Out Of Range Low (Ford)", "P1134",
            "Heated Oxygen Sensor (HO2S) transition time ratio bank 1 sensor 1 (Rear Bank)", "P1137",
            "Lack Of HO2S-12 Switch Indicates Lean (Ford)", "P1138", "Lack Of HO2S-12 Switch Indicates Rich (Ford) ",
            "P1610", "Loss of PZM Serial Data", "P1611", "Loss of CVRTD Serial Data", "P1617",
            "Engine Oil Level Switch Circuit", "P1621", "PCM Memory Performance", "P1626",
            "Theft Deterrent System - Fuel Enable Circuit", "P1630", "Theft Deterrent - PCM in Learn Mode", "P1631",
            "Theft Deterrent - Password Incorrect", "P1632", "Theft Deterrent - Fuel Disabled", "P1633",
            "Ignition Supplement Power Circuit Low Voltage", "P1633", "Keep Alive Power Voltage Too Low (Ford)",
            "P1634", "Ignition 1 Power Circuit Low Voltage", "P1635", "Tire/Axle Out Of Acceptable Range (Ford)",
            "P1639", "Vehicle ID Block Not Programmed Or Corrupt (Ford)", "P1640",
            "DTC's Available In Another Module (Ford)", "P1640", "Driver 1 - Input High Voltage", "P1641",
            "Malfunction Indicator Lamp (MIL) Control Circuit", "P1642", "Vehicle Speed Output Circuit", "P1644",
            "Delivered Torque Output Circuit", "P1645", "EVAP Solenoid Output Circuit", "P1646",
            "EVAP Vent Valve Output Circuit", "P1650", "Driver 2 - Input High Voltage", "P1650",
            "Power Steering Pressure Switch Malfunction (Ford)", "P1651",
            "Power Steering Pressure Switch Signal Malfunction (Ford)", "P1652", "Lift/Dive Circuit", "P1654",
            "Cruise Disable Output Circuit", "P1660", "Cooling Fan Control Circuits " };

    /* renamed from: ˍ */
    public static final String[] f1512 = { "P1106", "Barometric Pressure Circuit Range/Performance", "P1107",
            "Barometric Pressure Circuit Low Input", "P1108", "Barometric Pressure Circuit High Input", "P1121",
            "Throttle Position Lower Than Expected", "P1122", "Throttle Position Higher Than Expected", "P1128",
            "MAP Lower Than Expected", "P1129", "MAP Higher Than Expected", "P1149",
            "Primary HO2S (Sensor 1) Circuit Range/Performance Problem", "P1162",
            "Primary HO2S (No. 1) Circuit Malfunction", "P1163", "Primary HO2S (No. 1) Circuit Slow Response", "P1164",
            "Primary HO2S (No. 1) Circuit Range/Performance", "P1165", "Primary HO2S (No. 1) Circuit Range/Performance",
            "P1166", "Primary HO2S (No. 1) Heater System Electrical", "P1167", "Primary HO2S (No. 1) Heater System",
            "P1168", "Primary HO2S (No. 1) LABEL Low Input", "P1169", "Primary HO2S (No. 1) LABEL High Input", "P1253",
            "VTEC System Malfunction", "P1257", "VTEC System Malfunction", "P1258", "VTEC System Malfunction", "P1259",
            "VTEC System Malfunction", "P1297", "Electrical Load Detector Circuit Low Input", "P1298",
            "Electrical Load Detector Circuit High Input", "P1300", "Multiple Cylinder Misfire Detected", "P1336",
            "CSF Sensor Intermittent Interruption", "P1337", "CSF Sensor No Signal", "P1359",
            "CKP/TDC Sensor Connector Disconnection", "P1361", "Intermittent Interruption In TDC 1 Sensor Circuit",
            "P1362", "No Signal In TDC 1 Sensor Circuit", "P1366", "Intermittent Interruption In TDC 2 Sensor Circuit",
            "P1367", "No Signal In TDC 2 Sensor Circuit", "P1381", "Cylinder Position Sensor Intermittent Interruption",
            "P1382", "Cylinder Position Sensor No Signal", "P1456",
            "EVAP Emission Control System Leak Detected (Fuel Tank System)", "P1457",
            "EVAP Emission Control System Leak Detected (Control Canister System)", "P1459",
            "EVAP Emission Purge Flow Switch Malfunction", "P1486", "Thermostat Range/Performance Problem", "P1491",
            "EGR Valve Lift Insufficient Detected", "P1498", "EGR Valve Lift Sensor High Voltage", "P1508",
            "IAC Valve Circuit Failure", "P1509", "IAC Valve Circuit Failure", "P1519",
            "Idle Air Control Valve Circuit Failure", "P1607", "ECM/PCM Internal Circuit Failure A", "P1655",
            "SEAF/SEFA/TMA/TMB Signal Line Failure", "P1656", "Automatic Transaxle", "P1660",
            "Automatic Transaxle FI Signal A Circuit Failure", "P1676", "FPTDR Signal Line Failure", "P1678",
            "FPTDR Signal Line Failure", "P1681", "Automatic Transaxle FI Signal A Low Input", "P1682",
            "Automatic Transaxle FI Signal A High Input", "P1686", "Automatic Transaxle FI Signal B Low Input", "P1687",
            "Automatic Transaxle FI Signal B High Input", "P1705", "Automatic Transaxle Concerns", "P1706",
            "Automatic Transaxle Concerns", "P1738", "Automatic Transaxle Concerns", "P1739",
            "Automatic Transaxle Concerns", "P1753", "Automatic Transaxle Concerns", "P1758",
            "Automatic Transaxle Concerns", "P1768", "Automatic Transaxle Concerns", "P1773",
            "Automatic Transaxle Concerns", "P1785", "Automatic Transaxle Concerns", "P1786",
            "Automatic Transaxle Concerns", "P1790", "Automatic Transaxle Concerns", "P1791",
            "Automatic Transaxle Concerns", "P1792", "Automatic Transaxle Concerns", "P1793",
            "Automatic Transaxle Concerns", "P1794", "Automatic Transaxle Concerns", "P1870",
            "Automatic Transaxle Concerns", "P1873", "Automatic Transaxle Concerns", "P1879",
            "Automatic Transaxle Concerns", "P1885", "Automatic Transaxle Concerns", "P1886",
            "Automatic Transaxle Concerns", "P1888", "Automatic Transaxle Concerns", "P1890",
            "Automatic Transaxle Concerns", "P1891", "Automatic Transaxle Concerns" };

    /* renamed from: ˎ */
    public static final int f1513 = 2;

    /* renamed from: ˏ */
    public static final int f1514 = 3;

    /* renamed from: ˑ */
    public static final String[] f1515 = { "P1100", "Manifold Absolute Pressure (MAP) Sensor Malfunction (Open/Short)",
            "P1102", "Manifold Absolute Pressure (MAP) Sensor Malfunction - Low Voltage", "P1103",
            "Manifold Absolute Pressure (MAP) Sensor Malfunction - High Voltage", "P1147",
            "ETS Sub Accel Position Sensor 1 Malfunction", "P1151", "ETS Main Accel Position Sensor 2 Malfunction",
            "P1155", "ETS Limp Home Valve", "P1159", "Variable Intake Motor Malfunction", "P1171",
            "Electronic Throttle System Open", "P1172", "Electronic Throttle System Motor Current", "P1173",
            "Electronic Throttle System Rationality Malfunction", "P1174",
            "Electronic Throttle System #1 Close Malfunction", "P1175",
            "Electronic Throttle System #2 Close Malfunction", "P1176", "ETS Motor Open/Short #1", "P1176",
            "ETS Motor Open/Short #2", "P1178", "ETS Motor Battery Voltage Open", "P1330",
            "Spark Timing Adjust Malfunction", "P1521", "Power Steering Switch Malfunction", "P1607",
            "Electronic Throttle System Communication Error", "P1614", "Electronic Throttle System Module Malfunction",
            "P1632", "Traction Control System Malfunction" };

    /* renamed from: ͺ */
    public static final String[] f1516 = { "PowerTrain", "Chassis", "Body", "Network" };

    /* renamed from: ՙ */
    public static final String[] f1517 = { "P1101", "O2 Sensor Circ.,Bank1-Sensor1Voltage too Low/Air Leak", "P1102",
            "O2 Sensor Heating Circ.,Bank1-Sensor1 Short to B+", "P1103",
            "O2 Sensor Heating Circ.,Bank1-Sensor1 Output too Low", "P1104", "Bank1-Sensor2 Voltage too Low/Air Leak",
            "P1105", "O2 Sensor Heating Circ.,Bank1-Sensor2 Short to B+", "P1106",
            "O2 Sensor Circ.,Bank2-Sensor1 Voltage too Low/Air Leak", "P1107",
            "O2 Sensor Heating Circ.,Bank2-Sensor1 Short to B+", "P1108",
            "O2 Sensor Heating Circ.,Bank2-Sensor1 Output too Low", "P1109",
            "O2 Sensor Circ.,Bank2-Sensor2 Voltage too Low/Air Leak", "P1110",
            "O2 Sensor Heating Circ.,Bank2-Sensor2 Short to B+", "P1111", "O2 Control (Bank 1) System too lean",
            "P1112", "O2 Control (Bank 1) System too rich", "P1113", "Bank1-Sensor1 Internal Resistance too High",
            "P1114", "Bank1-Sensor2 Internal Resistant too High", "P1115",
            "O2 Sensor Heater Circ.,Bank1-Sensor1 Short to Ground", "P1116",
            "O2 Sensor Heater Circ.,Bank1-Sensor1 Open", "P1117",
            "O2 Sensor Heater Circ.,Bank1-Sensor2 Short to Ground", "P1118",
            "O2 Sensor Heater Circ.,Bank1-Sensor2 Open", "P1119",
            "O2 Sensor Heater Circ.,Bank2-Sensor1 Short to Ground", "P1120",
            "O2 Sensor Heater Circ.,Bank2-Sensor1 Open", "P1121",
            "O2 Sensor Heater Circ.,Bank2-Sensor2 Short to Ground", "P1122",
            "O2 Sensor Heater Circ.,Bank2-Sensor2 Open", "P1123", "Long Term Fuel Trim Add.Air.,Bank1 System too Rich",
            "P1124", "Long Term Fuel Trim Add.Air.,Bank1 System too Lean", "P1125",
            "Long Term Fuel Trim Add.Air.,Bank2 System too Rich", "P1126",
            "Long Term Fuel Trim Add.Air.,Bank2 System too Lean", "P1127",
            "Long Term Fuel Trim mult.,Bank1 System too Rich", "P1128",
            "Long Term Fuel Trim mult.,Bank1 System too Lean", "P1129",
            "Long Term Fuel Trim mult.,Bank2 System too Rich", "P1130",
            "Long Term Fuel Trim mult.,Bank2 System too Lean", "P1131", "Bank2-Sensor1 Internal Rsistance too High",
            "P1132", "O2 Sensor Heating Circ.,Bank1+2-Sensor1 Short to B+", "P1133",
            "O2 Sensor Heating Circ.,Bank1+2-Sensor1 Electrical Malfunction", "P1134",
            "O2 Sensor Heating Circ.,Bank1+2-Sensor2 Short to B+", "P1135",
            "O2 Sensor Heating Circ.,Bank1+2-Sensor2 Electrical Malfunction", "P1136",
            "Long Term Fuel Trim Add.Fuel,Bank1 System too Lean", "P1137",
            "Long Term Fuel Trim Add.Fuel,Bank1 System too Rich", "P1138",
            "Long Term Fuel Trim Add.Fuel,Bank2 System too Lean", "P1139",
            "Long Term Fuel Trim Add.Fuel,Bank2 System too Rich", "P1140", "Bank2-Sensor2 Internal Resistance too High",
            "P1141", "Load Calculation Cross Check Range/Performance", "P1142",
            "Load Calculation Cross Check Lower Limit Exceeded", "P1143",
            "Load Calculation Cross Check Upper Limit Exceeded", "P1144",
            "Mass or Volume Air Flow Circ Open/Short to Ground", "P1145", "Mass or Volume Air Flow Circ Short to B+",
            "P1146", "Mass or Volume Air Flow Circ Supply Malfunction", "P1147", "O2 Control (Bank 2) System too lean",
            "P1148", "O2 Control (Bank 2) System too rich", "P1149", "O2 Control (Bank 1) Out of range", "P1150",
            "O2 Control (Bank 2) Out of range", "P1151",
            "Bank1, Long Term Fuel Trim, Range 1 Leanness Lower Limit Exceeded", "P1152",
            "Bank1, Long Term Fuel Trim, Range 2 Leanness Lower Limit Exceeded", "P1154",
            "Manifold Switch Over Malfunction", "P1155", "Manifold Abs.Pressure Sensor Circ. Short to B+", "P1156",
            "Manifold Abs.Pressure Sensor Circ. Open/Short to Ground", "P1157",
            "Manifold Abs.Pressure Sensor Circ. Power Supply Malfunction", "P1158",
            "Manifold Abs.Pressure Sensor Circ. Range/Performance", "P1160",
            "Manifold Temp.Sensor Circ. Short to Ground", "P1161", "Manifold Temp.Sensor Circ. Open/Short to B+",
            "P1162", "Fuel Temp.Sensor Circ. Short to Ground", "P1163", "Fuel Temp.Sensor Circ. Open/Short to B+",
            "P1164", "Fuel Temperature Sensor Range/Performance/Incorrect Signal", "P1165",
            "Bank1, Long Term Fuel Trim, Range 1 Rich Limit Exceeded", "P1166",
            "Bank1, Long Term Fuel Trim, Range 2 Rich Limit Exceeded", "P1171",
            "Throttle Actuation Potentiometer Sign.2 Range/Performance", "P1172",
            "Throttle Actuation Potentiometer Sign.2 Signal too Low", "P1173",
            "Throttle Actuation Potentiometer Sign.2 Signal too High", "P1174",
            "Fuel Trim, Bank 1 Different injection times", "P1176", "O2 Correction Behind Catalyst,B1 Limit Attained",
            "P1177", "O2 Correction Behind Catalyst,B2 Limit Attained", "P1178",
            "Linear 02 Sensor / Pump Current Open Circuit", "P1179", "Linear 02 Sensor / Pump Current Short to ground",
            "P1180", "Linear 02 Sensor / Pump Current Short to B+", "P1181",
            "Linear 02 Sensor / Reference Voltage Open Circuit", "P1182",
            "Linear 02 Sensor / Reference Voltage Short to ground", "P1183",
            "Linear 02 Sensor / Reference Voltage Short to B+", "P1184",
            "Linear 02 Sensor / Common Ground Wire Open Circuit", "P1185",
            "Linear 02 Sensor / Common Ground Wire Short to ground", "P1186",
            "Linear 02 Sensor / Common Ground Wire Short to B+", "P1187",
            "Linear 02 Sensor / Compens. Resistor Open Circuit", "P1188",
            "Linear 02 Sensor / Compens. Resistor Short to ground", "P1189",
            "Linear 02 Sensor / Compens. Resistor Short to B+", "P1190",
            "Linear 02 Sensor / Reference Voltage Incorrect Signal", "P1196",
            "O2 Sensor Heater Circ.,Bank1-Sensor1 Electrical Malfunction", "P1197",
            "O2 Sensor Heater Circ.,Bank2-Sensor1 Electrical Malfunction", "P1198",
            "O2 Sensor Heater Circ.,Bank1-Sensor2 Electrical Malfunction", "P1199",
            "O2 Sensor Heater Circ.,Bank2-Sensor2 Electrical Malfunction", "P1201",
            "Cyl.1-Fuel Inj.Circ. Electrical Malfunction", "P1202", "Cyl.2-Fuel Inj.Circ. Electrical Malfunction",
            "P1203", "Cyl.3-Fuel Inj.Circ. Electrical Malfunction", "P1204",
            "Cyl.4-Fuel Inj.Circ. Electrical Malfunction", "P1205", "Cyl.5-Fuel Inj.Circ. Electrical Malfunction",
            "P1206", "Cyl.6-Fuel Inj.Circ. Electrical Malfunction", "P1207",
            "Cyl.7-Fuel Inj.Circ. Electrical Malfunction", "P1208", "Cyl.8-Fuel Inj.Circ. Electrical Malfunction",
            "P1209", "Intake valves for cylinder shut-off Short circuit to ground", "P1210",
            "Intake valves for cylinder shut-off Short to B+", "P1211",
            "Intake valves for cylinder shut-off Open circuit", "P1213", "Cyl.1-Fuel Inj.Circ. Short to B+", "P1214",
            "Cyl.2-Fuel Inj.Circ. Short to B+", "P1215", "Cyl.3-Fuel Inj.Circ. Short to B+", "P1216",
            "Cyl.4-Fuel Inj.Circ. Short to B+", "P1217", "Cyl.5-Fuel Inj.Circ. Short to B+", "P1218",
            "Cyl.6-Fuel Inj.Circ. Short to B+", "P1219", "Cyl.7-Fuel Inj.Circ. Short to B+", "P1220",
            "Cyl.8-Fuel Inj.Circ. Short to B+", "P1221", "Cylinder shut-off exhaust valves Short circuit to ground",
            "P1222", "Cylinder shut-off exhaust valves Short to B+", "P1223",
            "Cylinder shut-off exhaust valves Open circuit", "P1225", "Cyl.1-Fuel Inj.Circ. Short to Ground", "P1226",
            "Cyl.2-Fuel Inj.Circ. Short to Ground", "P1227", "Cyl.3-Fuel Inj.Circ. Short to Ground", "P1228",
            "Cyl.4-Fuel Inj.Circ. Short to Ground", "P1229", "Cyl.5-Fuel Inj.Circ. Short to Ground", "P1230",
            "Cyl.6-Fuel Inj.Circ. Short to Ground", "P1231", "Cyl.7-Fuel Inj.Circ. Short to Ground", "P1232",
            "Cyl.8-Fuel Inj.Circ. Short to Ground", "P1237", "Cyl.1-Fuel Inj.Circ. Open Circ.", "P1238",
            "Cyl.2-Fuel Inj.Circ. Open Circ.", "P1239", "Cyl.3-Fuel Inj.Circ. Open Circ.", "P1240",
            "Cyl.4-Fuel Inj.Circ. Open Circ.", "P1241", "Cyl.5-Fuel Inj.Circ. Open Circ.", "P1242",
            "Cyl.6-Fuel Inj.Circ. Open Circ.", "P1243", "Cyl.7-Fuel Inj.Circ. Open Circ.", "P1244",
            "Cyl.8-Fuel Inj.Circ. Open Circ.", "P1245", "Needle Lift Sensor Circ. Short to Ground", "P1246",
            "Needle Lift Sensor Circ. Range/Performance", "P1247", "Needle Lift Sensor Circ. Open/Short to B+", "P1248",
            "Injection Start Control Deviation", "P1249", "Fuel consumption signal Electrical Fault in Circuit",
            "P1250", "Fuel Level Too Low", "P1251", "Start of Injection Solenoid Circ Short to B+", "P1252",
            "Start of Injection Solenoid Circ Open/Short to Ground", "P1253", "Fuel consumption signal Short to ground",
            "P1254", "Fuel consumption signal Short to B+", "P1255", "Engine Coolant Temp.Circ Short to Ground",
            "P1256", "Engine Coolant Temp.Circ Open/Short to B+", "P1257", "Engine Coolant System Valve Open", "P1258",
            "Engine Coolant System Valve Short to B+", "P1259", "Engine Coolant System Valve Short to Ground", "P1280",
            "Fuel Inj.Air Contr.Valve Circ. Flow too Low", "P1283",
            "Fuel Inj.Air Contr.Valve Circ. Electrical Malfunction", "P1284", "Fuel Inj.Air Contr.Valve Circ. Open",
            "P1285", "Fuel Inj.Air Contr.Valve Circ. Short to Ground", "P1286",
            "Fuel Inj.Air Contr.Valve Circ. Short to B+", "P1287", "Turbocharger bypass valve open", "P1288",
            "Turbocharger bypass valve short to B+", "P1289", "Turbocharger bypass valve short to ground", "P1296",
            "Cooling system malfunction", "P1297", "Connection turbocharger - throttle valve pressure hose", "P1300",
            "Misfire detected Reason: Fuel level too low", "P1319", "Knock Sensor 1 Circ. Short to Ground", "P1320",
            "Knock Sensor 2 Circ. Short to Ground", "P1321", "Knock Sensor 3 Circ. Low Input", "P1322",
            "Knock Sensor 3 Circ. High Input", "P1323", "Knock Sensor 4 Circ. Low Input", "P1324",
            "Knock Sensor 4 Circ. High Input", "P1325", "Cyl.1-Knock Contr. Limit Attained", "P1326",
            "Cyl.2-Knock Contr. Limit Attained", "P1327", "Cyl.3-Knock Contr. Limit Attained", "P1328",
            "Cyl.4-Knock Contr. Limit Attained", "P1329", "Cyl.5-Knock Contr. Limit Attained", "P1330",
            "Cyl.6-Knock Contr. Limit Attained", "P1331", "Cyl.7-Knock Contr. Limit Attained", "P1332",
            "Cyl.8-Knock Contr. Limit Attained", "P1335", "Engine Torque Monitoring 2 Control Limint Exceeded", "P1336",
            "Engine Torque Monitoring Adaptation at limit", "P1337", "Camshaft Pos.Sensor,Bank1 Short to Ground",
            "P1338", "Camshaft Pos.Sensor,Bank1 Open Circ./Short to B+", "P1339",
            "Crankshaft Pos./Engine Speed Sensor Cross Connected", "P1340",
            "Crankshaft-/Camshaft Pos.Sens.Signals Out of Sequence", "P1341",
            "Ignition Coil Power Output Stage 1 Short to Ground", "P1342",
            "Ignition Coil Power Output Stage 1 Short to B+", "P1343",
            "Ignition Coil Power Output Stage 2 Short to Ground", "P1344",
            "Ignition Coil Power Output Stage 2 Short to B+", "P1345",
            "Ignition Coil Power Output Stage 3 Short to Ground", "P1346",
            "Ignition Coil Power Output Stage 3 Short to B+", "P1347",
            "Bank2,Crankshaft-/Camshaft os.Sens.Sign. Out of Sequence", "P1348",
            "Ignition Coil Power Output Stage 1 Open Circuit", "P1349",
            "Ignition Coil Power Output Stage 2 Open Circuit", "P1350",
            "Ignition Coil Power Output Stage 3 Open Circuit", "P1354",
            "Modulation Piston Displ.Sensor Circ. Malfunction", "P1355", "Cyl. 1, ignition circuit Open Circuit",
            "P1356", "Cyl. 1, ignition circuit Short to B+", "P1357", "Cyl. 1, ignition circuit Short to ground",
            "P1358", "Cyl. 2, ignition circuit Open Circuit", "P1359", "Cyl. 2, ignition circuit Short Circuit to B+",
            "P1360", "Cyl. 2, ignition circuit Short Circuit to Ground", "P1361",
            "Cyl. 3, ignition circuit Open Circuit", "P1362", "Cyl. 3, ignition circuit Short Circuit to B+", "P1363",
            "Cyl. 3, ignition circuit Short Circuit to ground", "P1364", "Cyl. 4 ignition circuit Open Circuit",
            "P1365", "Cyl. 4 ignition circuit Short circuit to B+", "P1366",
            "Cyl. 4 ignition circuit Short circuit to ground", "P1367", "Cyl. 5, ignition circuit Open Circuit",
            "P1368", "Cyl. 5, ignition circuit Short Circuit to B+", "P1369",
            "Cyl. 5, ignition circuit short to ground", "P1370", "Cyl. 6, ignition circuit Open Circuit", "P1371",
            "Cyl. 6, ignition circuit Short Circuit to B+", "P1372", "Cyl. 6, ignition circuit short to ground",
            "P1373", "Cyl. 7, ignition circuit Open Circuit", "P1374", "Cyl. 7, ignition circuit Short Circuit to B+",
            "P1375", "Cyl. 7, ignition circuit short to ground", "P1376", "Cyl. 8, ignition circuit Open Circuit",
            "P1377", "Cyl. 8, ignition circuit Short Circuit to B+", "P1378",
            "Cyl. 8, ignition circuit short to ground", "P1386", "Internal Control Module Knock Control Circ.Error",
            "P1387", "Internal Contr. Module altitude sensor error", "P1388",
            "Internal Contr. Module drive by wire error", "P1391", "Camshaft Pos.Sensor,Bank2 Short to Ground", "P1392",
            "Camshaft Pos.Sensor,Bank2 Open Circ./Short to B+", "P1393",
            "Ignition Coil Power Output Stage 1 Electrical Malfunction", "P1394",
            "Ignition Coil Power Output Stage 2 Electrical Malfunction", "P1395",
            "Ignition Coil Power Output Stage 3 Electrical Malfunction", "P1396", "Engine Speed Sensor Missing Tooth",
            "P1397", "Engine speed wheel Adaptation limit reached", "P1398", "Engine RPM signal, TD Short to ground",
            "P1399", "Engine RPM signal, TD Short Circuit to B+", "P1400", "EGR Valve Circ Electrical Malfunction",
            "P1401", "EGR Valve Circ Short to Ground", "P1402", "EGR Valve Circ Short to B+", "P1403",
            "EGR Flow Deviation", "P1404", "EGR Flow Basic Setting not carried out", "P1406",
            "EGR Temp.Sensor Range/Performance", "P1407", "EGR Temp.Sensor Signal too Low", "P1408",
            "EGR Temp.Sensor Signal too High", "P1409", "Tank Ventilation Valve Circ. Electrical Malfunction", "P1410",
            "Tank Ventilation Valve Circ. Short to B+", "P1411", "Sec.Air Inj.Sys.,Bank2 Flow too Flow", "P1412",
            "EGR Different.Pressure Sensor Signal too Low", "P1413", "EGR Different.Pressure Sensor Signal too High",
            "P1414", "Sec.Air Inj.Sys.,Bank2 Leak Detected", "P1417", "Fuel Level Sensor Circ Signal too Low", "P1418",
            "Fuel Level Sensor Circ Signal too High", "P1420", "Sec.Air Inj.Valve Circ Electrical Malfunction", "P1421",
            "Sec.Air Inj.Valve Circ Short to Ground", "P1422", "Sec.Air Inj.Sys.Contr.Valve Circ Short to B+", "P1423",
            "Sec.Air Inj.Sys.,Bank1 Flow too Low", "P1424", "Sec.Air Inj.Sys.,Bank1 Leak Detected", "P1425",
            "Tank Vent.Valve Short to Ground", "P1426", "Tank Vent.Valve Open", "P1432", "Sec.Air Inj.Valve Open",
            "P1433", "Sec.Air Inj.Sys.Pump Relay Circ. open", "P1434", "Sec.Air Inj.Sys.Pump Relay Circ. Short to B+",
            "P1435", "Sec.Air Inj.Sys.Pump Relay Circ. Short to ground", "P1436",
            "Sec.Air Inj.Sys.Pump Relay Circ. Electrical Malfunction", "P1439",
            "EGR Potentiometer Error in Basic Seting", "P1440", "EGR Valve Power Stage Open", "P1441",
            "EGR Valve Circ Open/Short to Ground", "P1442", "EGR Valve Position Sensor Signal too high", "P1443",
            "EGR Valve Position Sensor Signal too low", "P1444", "EGR Valve Position Sensor range/performance", "P1445",
            "Catalyst Temp.Sensor 2 Circ. Range/Performance", "P1446", "Catalyst Temp.Circ Short to Ground", "P1447",
            "Catalyst Temp.Circ Open/Short to B+", "P1448", "Catalyst Temp.Sensor 2 Circ. Short to Ground", "P1449",
            "Catalyst Temp.Sensor 2 Circ. Open/Short to B+", "P1450", "Sec.Air Inj.Sys.Circ Short to B+", "P1451",
            "Sec.Air Inj.Sys.Circ Short to Ground", "P1452", "Sec.Air Inj.Sys. Open Circ.", "P1453",
            "Exhaust gas temperature sensor 1 open/short to B+", "P1454",
            "Exhaust gas temperature sensor short 1 to ground", "P1455",
            "Exhaust gas temperature sensor 1 range/performance", "P1456",
            "Exhaust gas temperature control bank 1 limit attained", "P1457",
            "Exhaust gas temperature sensor 2 open/short to B+", "P1458",
            "Exhaust gas temperature sensor 2 short to ground", "P1459",
            "Exhaust gas temperature sensor 2 range/performance", "P1460",
            "Exhaust gas temperature control bank 2 limit attained", "P1461",
            "Exhaust gas temperature control bank 1 Range/Performance", "P1462",
            "Exhaust gas temperature control bank 2 Range/Performance", "P1465", "Additive Pump Short Circuit to B+",
            "P1466", "Additive Pump Open/Short to Ground", "P1467",
            "EVAP Canister Purge Solenoid Valve Short Circuit to B+", "P1468",
            "EVAP Canister Purge Solenoid Valve Short Circuit to Ground", "P1469",
            "EVAP Canister Purge Solenoid Valve Open Circuit", "P1470",
            "EVAP Emission Contr.LDP Circ Electrical Malfunction", "P1471", "EVAP Emission Contr.LDP Circ Short to B+",
            "P1472", "EVAP Emission Contr.LDP Circ Short to Ground", "P1473", "EVAP Emission Contr.LDP Circ Open Circ.",
            "P1474", "EVAP Canister Purge Solenoid Valve electrical malfunction", "P1475",
            "EVAP Emission Contr.LDP Circ Malfunction/Signal Circ.Open", "P1476",
            "EVAP Emission Contr.LDP Circ Malfunction/Insufficient Vacuum", "P1477",
            "EVAP Emission Contr.LDP Circ Malfunction", "P1478", "EVAP Emission Contr.LDP Circ Clamped Tube Detected",
            "P1500", "Fuel Pump Relay Circ. Electrical Malfunction", "P1501", "Fuel Pump Relay Circ. Short to Ground",
            "P1502", "Fuel Pump Relay Circ. Short to B+", "P1503",
            "Load signal from Alternator Term. DF Range/performance/Incorrect Signal", "P1504",
            "Intake Air Sys.Bypass Leak Detected", "P1505", "Closed Throttle Pos. Does Not Close/Open Circ", "P1506",
            "Closed Throttle Pos.Switch Does Not Open/Short to Ground", "P1507",
            "Idle Sys.Learned Value Lower Limit Attained", "P1508", "Idle Sys.Learned Value Upper Limit Attained",
            "P1509", "Idle Air Control Circ. Electrical Malfunction", "P1510", "Idle Air Control Circ. Short to B+",
            "P1511", "Intake Manifold Changeover Valve circuit electrical malfunction", "P1512",
            "Intake Manifold Changeover Valve circuit Short to B+", "P1513",
            "Intake Manifold Changeover Valve2 circuit Short to B+", "P1514",
            "Intake Manifold Changeover Valve2 circuit Short to ground", "P1515",
            "Intake Manifold Changeover Valve circuit Short to Ground", "P1516",
            "Intake Manifold Changeover Valve circuit Open", "P1517", "Main Relay Circ. Electrical Malfunction",
            "P1518", "Main Relay Circ. Short to B+", "P1519", "Intake Camshaft Contr.,Bank1 Malfunction", "P1520",
            "Intake Manifold Changeover Valve2 circuit Open", "P1521",
            "Intake Manifold Changeover Valve2 circuit electrical malfunction", "P1522",
            "Intake Camshaft Contr.,Bank2 Malfunction", "P1523",
            "Crash Signal from Airbag Control Unit range/performance", "P1525",
            "Intake Camshaft Contr.Circ.,Bank1 Electrical Malfunction", "P1526",
            "Intake Camshaft Contr.Circ.,Bank1 Short to B+", "P1527",
            "Intake Camshaft Contr.Circ.,Bank1 Short to Ground", "P1528", "Intake Camshaft Contr.Circ.,Bank1 Open",
            "P1529", "Camshaft Control Circuit Short to B+", "P1530", "Camshaft Control Circuit Short to ground",
            "P1531", "Camshaft Control Circuit open", "P1533",
            "Intake Camshaft Contr.Circ.,Bank2 Electrical Malfunction", "P1534",
            "Intake Camshaft Contr.Circ.,Bank2 Short to B+", "P1535",
            "Intake Camshaft Contr.Circ.,Bank2 Short to Ground", "P1536", "Intake Camshaft Contr.Circ.,Bank2 Open",
            "P1537", "Engine Shutoff Solenoid Malfunction", "P1538", "Engine Shutoff Solenoid Open/Short to Ground",
            "P1539", "Clutch Vacuum Vent Valve Switch Incorrect signal", "P1540", "Vehicle Speed Sensor High Input",
            "P1541", "Fuel Pump Relay Circ Open", "P1542", "Throttle Actuation Potentiometer Range/Performance",
            "P1543", "Throttle Actuation Potentiometer Signal too Low", "P1544",
            "Throttle Actuation Potentiometer Signal too High", "P1545", "Throttle Pos.Contr Malfunction", "P1546",
            "Boost Pressure Contr.Valve Short to B+", "P1547", "Boost Pressure Contr.Valve Short to Ground", "P1548",
            "Boost Pressure Contr.Valve Open", "P1549", "Boost Pressure Contr.Valve Short to Ground", "P1550",
            "Charge Pressure Deviation", "P1551", "Barometric Pressure Sensor Circ. Short to B+", "P1552",
            "Barometric Pressure Sensor Circ. Open/Short to Ground", "P1553",
            "Barometric/manifold pressure signal ratio out of range", "P1554",
            "Idle Speed Contr.Throttle Pos. Basic Setting Conditions not met", "P1555",
            "Charge Pressure Upper Limit exceeded", "P1556", "Charge Pressure Contr. Negative Deviation", "P1557",
            "Charge Pressure Contr. Positive Deviation", "P1558", "Throttle Actuator Electrical Malfunction", "P1559",
            "Idle Speed Contr.Throttle Pos. Adaptation Malfunction", "P1560", "Maximum Engine Speed Exceeded", "P1561",
            "Quantity Adjuster Deviation", "P1562", "Quantity Adjuster Upper Limit Attained", "P1563",
            "Quantity Adjuster Lower Limit Attained", "P1564",
            "Idle Speed Contr.Throttle Pos. Low Voltage During Adaptation", "P1565",
            "Idle Speed Control Throttle Position lower limit not attained", "P1566",
            "Load signal from A/C compressor range/performance", "P1567", "Load signal from A/C compressor no signal",
            "P1568", "Idle Speed Contr.Throttle Pos. mechanical Malfunction", "P1569",
            "Cruise control switch Incorrect signal", "P1570", "Contr.Module Locked", "P1571",
            "Left Eng. Mount Solenoid Valve Short to B+", "P1572", "Left Eng. Mount Solenoid Valve Short to ground",
            "P1573", "Left Eng. Mount Solenoid Valve Open circuit", "P1574",
            "Left Eng. Mount Solenoid Valve Electrical fault in circuit", "P1575",
            "Right Eng. Mount Solenoid Valve Short to B+", "P1576", "Right Eng. Mount Solenoid Valve Short to ground",
            "P1577", "Right Eng. Mount Solenoid Valve Open circuit", "P1578",
            "Right Eng. Mount Solenoid Valve Electrical fault in circuit", "P1579",
            "Idle Speed Contr.Throttle Pos. Adaptation not started", "P1580", "Throttle Actuator B1 Malfunction",
            "P1581", "Idle Speed Contr.Throttle Pos. Basic Setting Not Carried Out", "P1582",
            "Idle Adaptation at Limit", "P1583", "Transmission mount valves Short to B+", "P1584",
            "Transmission mount valves Short to ground", "P1585", "Transmission mount valves Open circuit", "P1586",
            "Engine mount solenoid valves Short to B+", "P1587", "Engine mount solenoid valves Short to ground",
            "P1588", "Engine mount solenoid valves Open circuit", "P1600", "Power Supply (B+) Terminal 15 Low Voltage",
            "P1602", "Power Supply (B+) Terminal 30 Low Voltage", "P1603", "Internal Control Module Malfunction",
            "P1604", "Internal Control Module Driver Error", "P1605",
            "Rough Road/Acceleration Sensor Electrical Malfunction", "P1606",
            "Rough Road Spec Engine Torque ABS-ECU Electrical Malfunction", "P1607",
            "Vehicle speed signal Error message from instrument cluster", "P1608",
            "Steering angle signal Error message from steering angle sensor", "P1609", "Crash shut-down activated",
            "P1611", "MIL Call-up Circ./Transm.Contr.Module Short to Ground", "P1612",
            "Electronic Control Module Incorrect Coding", "P1613", "MIL Call-up Circ Open/Short to B+", "P1614",
            "MIL Call-up Circ./Transm.Contr.Module Range/Performance", "P1615",
            "Engine Oil Temperature Sensor Circuit range/performance", "P1616",
            "Glow Plug/Heater Indicator Circ. Short to B+", "P1617",
            "Glow Plug/Heater Indicator Circ. Open/Short to Ground", "P1618",
            "Glow Plug/Heater Relay Circ. Short to B+", "P1619", "Glow Plug/Heater Relay Circ. Open/Short to Ground",
            "P1620", "Engine coolant temperature signal open/short to B+", "P1621",
            "Engine coolant temperature signal short to ground", "P1622",
            "Engine coolant temperature signal range/performance", "P1623", "Data Bus Powertrain No Communication",
            "P1624", "MIL Request Sign.active", "P1625", "Data-Bus Powertrain Unplausible Message from Transm.Contr.",
            "P1626", "Data-Bus Powertrain Missing Message from Transm.Contr.", "P1627",
            "Data-Bus Powertrain missing message from fuel injection pump", "P1628",
            "Data-Bus Powertrain missing message from steering sensor", "P1629",
            "Data-Bus Powertrain missing message from distance control", "P1630",
            "Accelera.Pedal Pos.Sensor 1 Signal too Low", "P1631", "Accelera.Pedal Pos.Sensor 1 Signal too High",
            "P1632", "Accelera.Pedal Pos.Sensor 1 Power Supply Malfunction", "P1633",
            "Accelera.Pedal Pos.Sensor 2 Signal too Low", "P1634", "Accelera.Pedal Pos.Sensor 2 Signal too High",
            "P1635", "Data Bus Powertrain missing message f.air condition control", "P1636",
            "Data Bus Powertrain missing message from Airbag control", "P1637",
            "Data Bus Powertrain missing message f.central electr.control", "P1638",
            "Data Bus Powertrain missing message from clutch control", "P1639",
            "Accelera.Pedal Pos.Sensor 1+2 Range/Performance", "P1640", "Internal Contr.Module (EEPROM) Error", "P1641",
            "Please check DTC Memory of Air Condition ECU", "P1642", "Please check DTC Memory of Airbag ECU", "P1643",
            "Please check DTC Memory of central electric ECU", "P1644", "Please check DTC Memory of clutch ECU",
            "P1645", "Data Bus Powertrain missing message f.all wheel drive contr.", "P1646",
            "Please Check DTC Memory of all wheel drive ECU", "P1647",
            "Please check coding of ECUs in Data Bus Powertrain", "P1648", "Data Bus Powertrain Malfunction", "P1649",
            "Data Bus Powertrain Missing message from ABS Control Module", "P1650",
            "Data Bus Powertrain Missing message fr.instrument panel ECU", "P1651",
            "Data Bus Powertrain missing messages", "P1652", "Please check DTC Memory of transmission ECU", "P1653",
            "Please check DTC Memory of ABS Control Module", "P1654", "Please check DTC Memory of control panel ECU",
            "P1655", "Please check DTC Memory of ADR Control Module", "P1656",
            "A/C clutch relay circuit short to ground", "P1657", "A/C clutch relay circuit short to B+", "P1658",
            "Data Bus Powertrain Incorrect signal from ADR Control Module", "P1676",
            "Drive by Wire-MIL Circ. Electrical Malfunction", "P1677", "Drive by Wire-MIL Circ. Short to B+", "P1678",
            "Drive by Wire-MIL Circ. Short to Ground", "P1679", "Drive by Wire-MIL Circ. Open", "P1681",
            "Contr.Unit Programming, Programming not Finished", "P1684", "Contr.Unit Programming Communication Error",
            "P1686", "Contr.Unit Error Programming Error", "P1690", "Malfunction Indication Light Malfunction", "P1691",
            "Malfunction Indication Light Open", "P1692", "Malfunction Indication Light Short to Ground", "P1693",
            "Malfunction Indication Light Short to B+", "P1694", "Malfunction Indication Light Open/Short to Ground",
            "P1704", "Kick Down Switch Malfunction", "P1705", "Gear/Ratio Monitoring Adaptation limit reached", "P1711",
            "Wheel Speed Signal 1 Range/Performance", "P1716", "Wheel Speed Signal 2 Range/Performance", "P1721",
            "Wheel Speed Signal 3 Range/Performance", "P1723", "Starter Interlock Circ. Open", "P1724",
            "Starter Interlock Circ. Short to Ground", "P1726", "Wheel Speed Signal 4 Range/Performance", "P1728",
            "Different Wheel Speed Signals Range/Performance", "P1729", "Starter Interlock Circ. Short to B+", "P1733",
            "Tiptronic Switch Down Circ. Short to Ground", "P1739", "Tiptronic Switch up Circ. Short to Ground",
            "P1740", "Clutch temperature control", "P1741", "Clutch pressure adaptation at limit", "P1742",
            "Clutch frontPage adaptation at limit", "P1743", "Clutch slip control signal too high", "P1744",
            "Tiptronic Switch Recognition Circ. Short to Ground", "P1745", "Transm.Contr.Unit Relay Short to B+",
            "P1746", "Transm.Contr.Unit Relay Malfunction", "P1747", "Transm.Contr.Unit Relay Open/Short to Ground",
            "P1748", "Transm.Contr.Unit Self-Check", "P1749", "Transm.Contr.Unit Incorrect Coded", "P1750",
            "Power Supply Voltage Low Voltage", "P1751", "Power Supply Voltage High Voltage", "P1752",
            "Power Supply Malfunction", "P1760", "Shift Lock Malfunction", "P1761", "Shift Lock Short to Ground",
            "P1762", "Shift Lock Short to B+", "P1763", "Shift Lock Open", "P1764", "Transmission temperature control",
            "P1765", "Hydraulic Pressure Sensor 2 adaptation at limit", "P1766", "Throttle Angle Signal Stuck Off",
            "P1767", "Throttle Angle Signal Stuck On", "P1768", "Hydraulic Pressure Sensor 2 Too High", "P1769",
            "Hydraulic Pressure Sensor 2 Too Low", "P1770", "Load Signal Range/Performance", "P1771",
            "Load Signal Stuck Off", "P1772", "Load Signal Stuck On", "P1773", "Hydraulic Pressure Sensor 1 Too High",
            "P1774", "Hydraulic Pressure Sensor 1 Too Low", "P1775", "Hydraulic Pressure Sensor 1 adaptation at limit",
            "P1776", "Hydraulic Pressure Sensor 1 range/performance", "P1777",
            "Hydraulic Pressure Sensor 2 range/performance", "P1778", "Solenoid EV7 Electrical Malfunction", "P1781",
            "Engine Torque Reduction Open/Short to Ground", "P1782", "Engine Torque Reduction Short to B+", "P1784",
            "Shift up/down Wire Open/Short to Ground", "P1785", "Shift up/down Wire Short to B+", "P1786",
            "Reversing Light Circ. Open", "P1787", "Reversing Light Circ. Short to Ground", "P1788",
            "Reversing Light Circ. Short to B+", "P1789",
            "Idle Speed Intervention Circ. Error Message from Engine Contr.", "P1790",
            "Transmission Range Display Circ. Open", "P1791", "Transmission Range Display Circ. Short to Ground",
            "P1792", "Transmission Range Display Circ. Short to B+", "P1793", "Output Speed Sensor 2 Circ. No Signal",
            "P1795", "Vehicle Speed Signal Circ. Open", "P1796", "Vehicle Speed Signal Circ. Short to Ground", "P1797",
            "Vehicle Speed Signal Circ. Short to B+", "P1798", "Output Speed Sensor 2 Circ. Range/Performance", "P1799",
            "Output Speed Sensor 2 Circ. Rpm too High", "P1813", "Pressure Contr.Solenoid 1 Electrical", "P1814",
            "Pressure Contr.Solenoid 1 Open/Short to Ground", "P1815", "Pressure Contr.Solenoid 1 Short to B+", "P1818",
            "Pressure Contr.Solenoid 2 Electrical", "P1819", "Pressure Contr.Solenoid 2 Open/Short to Ground", "P1820",
            "Pressure Contr.Solenoid 2 Short to B+", "P1823", "Pressure Contr.Solenoid 3 Electrical", "P1824",
            "Pressure Contr.Solenoid 3 Open/Short to Ground", "P1825", "Pressure Contr.Solenoid 3 Short to B+", "P1828",
            "Pressure Contr.Solenoid 4 Electrical", "P1829", "Pressure Contr.Solenoid 4 Open/Short to Ground", "P1830",
            "Pressure Contr.Solenoid 4 Short to B+", "P1834", "Pressure Contr.Solenoid 5 Open/Short to Ground", "P1835",
            "Pressure Contr.Solenoid 5 Short to B+", "P1841",
            "Engine/Transmission Control Modules Versions do not match", "P1842",
            "Please check DTC Memory of instrument panel ECU", "P1843", "Please check DTC Memory of ADR Control Module",
            "P1844", "Please check DTC Memory of central electric control ECU", "P1847",
            "Please check DTC Memory of brake system ECU", "P1848", "Please check DTC Memory of engine ECU", "P1849",
            "Please check DTC Memory of transmission ECU", "P1850",
            "Data-Bus Powertrain Missing Message from Engine Contr.", "P1851",
            "Data-Bus Powertrain Missing Message from Brake Contr.", "P1852",
            "Data-Bus Powertrain Unplausible Message from Engine Contr.", "P1853",
            "Data-Bus Powertrain Unplausible Message from Brake Contr.", "P1854",
            "Data-Bus Powertrain Hardware Defective", "P1855", "Data-Bus Powertrain Software version Contr.", "P1856",
            "Throttle/Pedal Pos.Sensor A Circ. Error Message from Engine Contr.", "P1857",
            "Load Signal Error Message from Engine Contr.", "P1858",
            "Engine Speed Input Circ. Error Message from Engine Contr.", "P1859",
            "Brake Switch Circ. Error Message from Engine Contr.", "P1860",
            "Kick Down Switch Error Message from Engine Contr.", "P1861",
            "Throttle Position (TP) sensor Error Message from ECM", "P1862",
            "Data Bus Powertrain Missing message from instr. panel ECU", "P1863",
            "Data Bus Powertrain Missing Message from St. Angle Sensor", "P1864",
            "Data Bus Powertrain Missing message from ADR control module", "P1865",
            "Data Bus Powertrain Missing message from central electronics", "P1866",
            "Data Bus Powertrain Missing messages" };

    /* renamed from: י */
    public static final String[] f1518 = { "P1131", "Oxygen sensor reverse connection", "P1105",
            "Manifold absolute pressure sensor 1 pipe malfunction", "P1687",
            "Manifold absolute pressure sensor 2 low voltage", "P1688",
            "Manifold absolute pressure sensor 2 high voltage", "P1106",
            "Manifold absolute pressure sensor 2 pipe malfunction", "P1111",
            "Manifold absolute pressure sensor reverse connection", "P1107",
            "Ambient air pressure sensor circuit low Voltage", "P1108",
            "Ambient air pressure sensor circuit high Voltage", "P1552", "Cooling fan short circuit/open circuit",
            "P1553", "Cooling fan short to battery Voltage/over temperature", "P1231",
            "Fuel pump short circuit to ground or open circuit", "P1232", "Fuel pump relay short circuit to battery",
            "P1631", "Fall detection sensor circuit low Voltage", "P1632", "Fall detection sensor circuit high Voltage",
            "P1500", "Vehicle speed output circuit malfunction", "P1690", "CAN communication fault", "P1696",
            "Voltage control circuit short to ground", "P1697", "Voltage control circuit short to Vbatt", "P1698",
            "Voltage control circuit malfunction", "P1602", "Tunelock", "P1614", "ECM or tune ID Incorrect", "P1685",
            "EMS main relay circuit", "P1659", "EMS ignition Voltage input circuit" };

    /* renamed from: ـ */
    public static final String[] f1519;

    /* renamed from: ᐝ */
    public static final int f1520 = 4;

    /* renamed from: ᐧ */
    public static final String[] f1521 = { "P1105", "MAP/BARO Pressure Switch Solenoid Valve", "P1126",
            "Thermostat Function", "P1130", "Swirl Control Valve Control Solenoid Valve", "P1148",
            "Closed Loop Control (Bank 1)", "P1165", "Swirl Control Valve Control Vacuum Switch", "P1168",
            "Closed Loop Control (Bank 2)", "P1320", "Ignition Signal", "P1211", "ABS/TCS Control Unit", "P1212",
            "ABS/TCS Communication Line", "P1217", "Engine Over Temperature (Overheat)", "P1320", "Ignition Signal",
            "P1335", "Crankshaft Position Sensor (REF)", "P1336", "Crankshaft Position Sensor (CKPS)", "P1400",
            "EGRC Solenoid Valve", "P1401", "EGR Temperature Sensor", "P1402", "EGR System", "P1440",
            "EVAP Control System Small Leak", "P1441", "Vacuum Cut Valve Bypass Valve", "P1444",
            "Canister Purge Volume Control Solenoid Valve", "P1445", "EVAP Canister Purge Volume Control Valve",
            "P1446", "EVAP Canister Vent Control Valve (Closed)", "P1447", "EVAP Control System Purge Flow Monitoring",
            "P1448", "EVAP Canister Vent Control Valve (Open)", "P1464", "Fuel Level Sensor Circuit (Ground Signal)",
            "P1490", "Vacuum Cut Valve Bypass Valve (Circuit)", "P1491", "Vacuum Cut Valve Bypass Valve", "P1492",
            "EVAP Canister Purge Control/Solenoid Valve (Circuit)", "P1493",
            "EVAP Canister Purge Control Valve/Solenoid Valve", "P1550", "TCC Solenoid Valve", "P1605",
            "A/T Diagnostic Communication Line", "P1705", "Throttle Position Sensor Circuit A/T", "P1706",
            "Park/Neutral Position (PNP) Switch", "P1760", "Overrun Clutch Solenoid Valve (Circuit)" };

    /* renamed from: ᐨ */
    public static final String[] f1522 = { "P1115", "Engine Coolant Temperature Signal from ECM to TCM.", "P1121",
            "Throttle Position Sensor Signal Malfunction from ECM to TCM.", "P1170",
            "Front Heated Oxygen Sensor Stuck.", "P1195",
            "EGR Pressure Sensor (1.6L) or Boost Sensor (1.8L) Open or Short.", "P1196",
            "Ignition Switch \"Start\" Open or Short (1.6L).", "P1250",
            "Pressure Regulator Control Solenoid Valve Open or Short.", "P1252",
            "Pressure Regulator Control Solenoid Valve No. 2 Circuit Malfunction.", "P1307",
            "Chassis Acceleration Sensor Signal Malfunction.", "P1308", "Chassis Acceleration Sensor Signal Low.",
            "P1309", "Chassis Acceleration Sensor Signal High.", "P1345", "No SGC Signal (1.6L).", "P1386",
            "Knock Sensor Control Zero Test.", "P1402", "EGR Valve Position Sensor Open or Short.", "P1449",
            "Canister Drain Cut Valve Open or Short (1.8L).", "P1450", "Excessive Vacuum Leak.", "P1455",
            "Fuel Tank Sending Unit Open or Short (1.8L).", "P1457", "Purge Solenoid Valve Low System Malfunction.",
            "P1458", "A/C Compressor Control Signal Malfunction.", "P1485", "EGR Solenoid Valve Vacuum Open or Short.",
            "P1486", "EGR Solenoid Valve Vent Open or Short.", "P1487",
            "EGR Boost Sensor Solenoid Valve Open or Short.", "P1496",
            "EGR Stepper Motor Malfunction - Circuit 1 (1.8L).", "P1497",
            "EGR Stepper Motor Malfunction - Circuit 2 (1.8L).", "P1498",
            "EGR Stepper Motor Malfunction - Circuit 3 (1.8L).", "P1499",
            "EGR Stepper Motor Malfunction - Circuit 4 (1.8L).", "P1500", "No Vehicle Speed Signal to TCM.", "P1505",
            "Idle Air Control Valve Opening Coil Voltage Low.", "P1506",
            "Idle Air Control Valve Opening Coil Voltage High.", "P1507",
            "Idle Air Control Valve Closing Coil Voltage Low.", "P1508",
            "Idle Air Control Valve Closing Coil Voltage High.", "P1523", "VICS Solenoid Valve.", "P1586",
            "A/T-M/T Codification.", "P1608", "PCM Malfunction.", "P1611", "MIL Request Circuit Voltage Low.", "P1614",
            "MIL Request Circuit Voltage High.", "P1624", "MIL Request Signal from TCM to ECM.", "P1631",
            "Alternator \"T\" Open or No Power Output (1.8L).", "P1632",
            "Battery Voltage Detection Circuit for Alternator Regulator (1.8L).", "P1633", "Battery Overcharge.",
            "P1634", "Alternator \"B\" Open (1.8L).", "P1693", "MIL Circuit Malfunction.", "P1743",
            "Torque Converter Clutch Solenoid Valve Open or Short.", "P1794", "Battery or Circuit Failure.", "P1795",
            "4WD Switch Signal Malfunction.", "P1797",
            "P or N Range Signal or Clutch Pedal Position Switch Open or Short." };

    /* renamed from: ι */
    public static final String[] f1523 = { "General", "Manufacturer Specific" };

    /* renamed from: ﹳ */
    public static final String[] f1524 = { "P1100", "BARO Sensor Circuit Malfunction", "P1120",
            "Accelerator Pedal Position Sensor Circuit Malfunction", "P1121",
            "Accelerator Pedal Position Sensor Range/Performance Problem", "P1125",
            "Throttle Control Motor Circuit Malfunction", "P1126", "Magnetic Clutch Circuit Malfunction", "P1127",
            "ECTS Actuator Power Source Circuit Malfunction", "P1128", "Throttle Control Motor Lock Malfunction",
            "P1129", "Electronic Throttle Control System", "P1130",
            "Air/Fuel Ratio Sensor Circuit Range/Performance Malfunction (Bank 1 Sensor 1)", "P1133",
            "Air/Fuel Ratio Sensor Circuit Response Malfunction (Bank 1 Sensor 1)", "P1135",
            "Air/Fuel Ratio Sensor Heater Circuit Malfunction (Bank 1 Sensor 1)", "P1150",
            "Air/Fuel Ratio Sensor Circuit Range/Performance Malfunction (Bank 2 Sensor 1)", "P1153",
            "Air/Fuel Ratio Sensor Circuit Response Malfunction (Bank 2 Sensor 1)", "P1155",
            "Air/Fuel Ratio Sensor Heater Circuit Malfunction (Bank 2 Sensor 1)", "P1200",
            "Fuel Pump Relay/ECU Circuit Malfunction", "P1300", "Igniter Circuit Malfunction (Bank 1 Or No. 1)",
            "P1305", "Igniter Circuit Malfunction, (Bank 2 Or No. 2)", "P1310", "Igniter Circuit Malfunction (No. 3)",
            "P1315", "Igniter Circuit Malfunction (No. 4)", "P1320", "Igniter Circuit Malfunction (No. 5)", "P1325",
            "Igniter Circuit Malfunction (No. 6)", "P1330", "Igniter Circuit Malfunction (No. 7)", "P1335",
            "CKP Sensor Circuit Malfunction During Engine Running", "P1340", "Igniter Circuit Malfunction (No. 8)",
            "P1345", "VVT Sensor Circuit Malfunction (Bank 1)", "P1346", "VVT Sensor Rang/Performance Problem (Bank 1)",
            "P1349", "VVT System Malfunction (Bank 1)", "P1350", "VVT Sensor Circuit Malfunction (Bank 2)", "P1351",
            "VVT Sensor Range/Performance Problem (Bank 2)", "P1354", "VVT System Malfunction (Bank 2)", "P1400",
            "Sub-TP Sensor Malfunction", "P1401", "Sub-TP Sensor Range/Performance", "P1410",
            "EGR Valve Position Sensor Circuit Malfunction", "P1411",
            "EGR Valve Position Sensor Circuit Range/Performance Malfunction", "P1500",
            "Starter Signal Circuit Malfunction", "P1520", "Stop Lamp Switch Malfunction", "P1565",
            "Cruise Control Main Switch Circuit Malfunction", "P1566", "Cruise Control Main Switch Circuit Malfunction",
            "P1600", "ECM BATT Malfunction", "P1605", "Knock Control CPU Malfunction", "P1633",
            "ECM Malfunction (ETCS Circuit)", "P1645", "Body ECU Malfunction", "P1656",
            "OCV Circuit Malfunction (Bank 1)", "P1663", "OCV Circuit Malfunction (Bank 2)", "P1780",
            "PNP Switch Malfunction", "B2785", "Ignition Switch On Malfunction (Immobilizer System)", "B2786",
            "Ignition Switch Off Malfunction (Immobilizer System)", "B2785",
            "Ignition Switch On Malfunction (Immobilizer System)", "B2791",
            "Key Unlock Warning Switch Malfunction (Immobilizer System)", "B2795",
            "Unmatch Key Code (Immobilizer System)", "B2796", "No Communication In Immobilizer System", "B2797",
            "Communication Malfunction No. 1 (Immobilizer System)", "B2798",
            "Communication Malfunction No. 2 (Immobilizer System)" };

    /* renamed from: ﹶ */
    private static C0267 f1525;

    /* renamed from: ﹺ */
    private static long f1526 = 0;

    /* renamed from: ﾞ */
    public static final String[] f1527 = { "P1000", "OBD II Monitor Testing Not Completed", "P1001",
            "Unable to Achieve Self-Test Function or SCP Error", "P1100", "Mass Airflow Sensor Circuit Intermittent",
            "P1101", "Mass Airflow Sensor Circuit out of Self-Test Range", "P1102",
            "Mass Airflow Sensor Signal Inconsistent with Throttle Position Sensor", "P1103",
            "Mass Airflow Sensor Signal Inconsistent with Engine Speed", "P1110",
            "Intake Air Temperature Sensor Signal (Dynamic Chamber) Circuit", "P1112",
            "Intake Air Temperature Sensor Circuit Intermittent", "P1113",
            "Intake Air Temperature Sensor Signal (Dynamic Chamber) Circuit", "P1114",
            "Intake Air Temperature Sensor Circuit Low Input", "P1116", "ECT Sensor Circuit Out of Self Test Range",
            "P1117", "ECT Sensor Signal Intermittent", "P1120", "Throttle Position Sensor out of Range Low", "P1121",
            "Throttle Position Sensor Signal Not Consistent with Mass Airflow Signal", "P1122",
            "Throttle Position Stuck Closed", "P1123", "Throttle Position Stuck Open", "P1124",
            "Throttle Position Sensor Signal Out of Self Test Range", "P1125",
            "Throttle Position Sensor Signal Intermittent", "P1127",
            "HO2S Bank 1 Sensor 2 Heater Not On During Key On Engine Running Self Test", "P1128",
            "HO2S Bank 1 Sensor 1 Signals Swapped in Key On Engine Running Self Test", "P1130",
            "HO2S Bank 1 Sensor 1 Not Switching (Fuel Control Limit Reached)", "P1131",
            "HO2S Bank 1 Sensor 1 Signal Below 0.45v (A/F Ratio Too Lean)", "P1132",
            "HO2S Bank 1 Sensor 1 Signal Above 0.45v (A/F Ratio Too Rich)", "P1135",
            "HO2S Bank 1 Sensor 1 Heater Circuit Low Input", "P1136", "HO2S Bank 1 Sensor 1 Heater Circuit High Input",
            "P1137", "HO2S Bank 1 Sensor 2 Not Switching (Fuel Control Limit Reached)", "P1138",
            "HO2S Bank 1 Sensor 2 Signal Above 0.45v (A/F Ratio Too Rich)", "P1141",
            "HO2S Bank 1 Sensor 2 Heater Circuit Low Input", "P1142", "HO2S Bank 1 Sensor 2 Heater Circuit High Input",
            "P1143", "HO2S Bank 1 Sensor 3 Signal Below 0.45v (A/F Ratio Too Lean)", "P1144",
            "HO2S Bank 1 Sensor 3 Signal Above 0.45v (A/F Ratio Too Rich)", "P1150",
            "HO2S Bank 2 Sensor 1 Not Switching (Fuel Control Limit Reached)", "P1151",
            "HO2S Bank 2 Sensor 1 Signal Below 0.45v (A/F Ratio Too Lean)", "P1152",
            "HO2S Bank 2 Sensor 1 Signal Above 0.45v (A/F Ratio Too Rich)", "P1169",
            "HO2S Bank 1 Sensor 1 Circuit Fixed (Bank 1 Sensor 1)", "P1170",
            "HO2S Bank 1 Sensor 1 Circuit Fixed (Bank 1 Sensor 1)", "P1173",
            "HO2S Bank 2 Sensor 1 Circuit Fixed (Bank 2 Sensor 1)", "P1195", "EGR Boost Sensor Circuit", "P1196",
            "Ignition Switch Start Circuit", "P1235", "Fuel Pump Control Circuit", "P1236",
            "Fuel Pump Control Out Range", "P1250", "Pressure Regulator Control Solenoid Circuit", "P1252",
            "Pressure Regulator Control Solenoid '2' Circuit", "P1260",
            "Anti-Theft System Signal Detected - Engine Disabled", "P1270", "Engine RPM or Vehicle Speed Limit Reached",
            "P1309", "Misfire Detection Monitor", "P1345", "No CMP or SGC Signal", "P1351",
            "Ignition Diagnostic Monitor Signal Lost to PCM or Out Of Range", "P1352",
            "Ignition Coil 'A' Primary Circuit", "P1353", "Ignition Coil 'B' Primary Circuit", "P1354",
            "Ignition Coil 'C' Primary Circuit", "P1358", "Ignition Diagnostic Monitor Signal Out Of Self Test Range",
            "P1359", "SPOUT Signal Lost To Powertrain Control Module Or Out Of Range", "P1360",
            "Ignition Coil 'A' Secondary Circuit", "P1361", "Ignition Coil 'B' Secondary Circuit", "P1362",
            "Ignition Coil 'C' Secondary Circuit", "P1364", "Ignition Coil Primary Circuit", "P1365",
            "Ignition Coil Secondary Circuit", "P1390", "Octane Adjust Shorting Bar Out or Circuit Open", "P1400",
            "DPFE Sensor Circuit Low Input", "P1401", "DPFE Sensor Circuit High Input", "P1402",
            "EGR Valve Position Sensor Circuit", "P1405", "DPFE Sensor Upstream Hose Off Or Plugged", "P1406",
            "DPFE Sensor Downstream Hose Off or Plugged", "P1407", "No EGR Flow Detected", "P1408",
            "EGR System Flow Out of Key On Engine Running Self Test Range", "P1409",
            "EGR Vacuum Regulator Solenoid Circuit", "P1410", "EGR Boost Solenoid Valve Stuck", "P1443",
            "EVAP System Purge Flow Fault", "P1444", "EVAP Purge Flow Sensor Circuit Low Voltage", "P1446",
            "EVAP Purge Flow Sensor Circuit High Voltage", "P1449", "CDCV or Throttle PositionCV Circuit", "P1450",
            "EVAP Control System Fault", "P1451", "Canister Vent Solenoid Circuit", "P1455",
            "Fuel Tank Level Sensor Circuit", "P1460", "Wide Open Throttle A/C Cut-Off Relay Circuit", "P1464",
            "Air Conditioning Control Signal Circuit", "P1474", "Fan Control (Primary Winding) Circuit", "P1479",
            "Fan Control (Condenser Primary) Circuit", "P1485", "EGR Vacuum Solenoid Circuit", "P1486",
            "EGR Vent Solenoid Circuit", "P1487", "EGR-CHK (Boost) Solenoid Circuit", "P1496",
            "EGR Valve Motor Coil '1' Open or Shorted", "P1497", "EGR Valve Motor Coil '2' Open or Shorted", "P1498",
            "EGR Valve Motor Coil '3 Open or Shorted", "P1499", "EGR Valve Motor Coil '4' Open or Shorted", "P1500",
            "Vehicle Speed Sensor Intermittent Signal", "P1501", "Vehicle Speed Sensor Out of Self Test Range", "P1502",
            "Vehicle Speed Sensor Circuit Error", "P1504", "Idle Air Control Solenoid Circuit Intermittent", "P1505",
            "Idle Air Control System at Adaptive Clip", "P1506", "Idle Air Control System Overspeed Detected", "P1507",
            "Idle Air Control System Underspeed Detected", "P1508", "Bypass Air Solenoid '1' Circuit", "P1509",
            "Bypass Air Solenoid '2 Circuit", "P1512", "VTCS Fault", "P1521", "VRIS Solenoid '1' Circuit", "P1522",
            "VRIS Solenoid '2 Circuit", "P1523", "VICS Solenoid Circuit", "P1524",
            "Charge Air Cooler Bypass Solenoid Circuit", "P1525", "ABV Vacuum Solenoid Circuit", "P1526",
            "ABV Vent Solenoid Circuit", "P1529", "L/C Atmospheric Balance Air Control Valve Circuit", "P1540",
            "ABV System Fault", "P1562", "Powertrain Control Module +BB Voltage Low", "P1569", "VTCS Circuit Low Input",
            "P1570", "VTCS Circuit High Input", "P1601", "Powertrain Control Module Communication Line to TCM Error",
            "P1602", "Powertrain Control Module Communication Line to TCM Error", "P1602",
            "Immobilizer System Communication Error with Powertrain Control Module", "P1603",
            "Immobilizer System Fault", "P1604", "Immobilizer System Fault", "P1605",
            "Powertrain Control Module Keep Alive Memory Test Error", "P1608",
            "Powertrain Control Module (ECM CPU) DTC Test Fault", "P1609",
            "Powertrain Control Module (ECM CPU) Knock Sensor Circuit", "P1621", "lmmobilizer System Fault", "P1622",
            "lmmobilizer System Fault", "P1623", "lmmobilizer System Fault", "P1624", "lmmobilizer System Fault",
            "P1627", "Powertrain Control Module (ECM/TCS) Line Communication Error", "P1628",
            "Powertrain Control Module (ECM/TCS) Any Line Communication Error", "P1631",
            "Generator Output Voltage Signal (No Output)", "P1632", "Battery Voltage Monitor Circuit", "P1633",
            "Battery Overcharge Fault", "P1634", "Generator Terminal 'B' Circuit Open", "P1650",
            "Power Steering Pressure Switch Out of Range Fault", "P1651", "Power Steering Pressure Switch Circuit",
            "P1652", "Power Steering Pressure Switch Circuit", "P1701",
            "Transmission Range Sensor Reverse Engagement Error", "P1702",
            "Transmission Range Sensor Circuit Intermittent", "P1703", "Brake On/Off Switch Out of Self Test Range",
            "P1705", "Transmission Range Sensor out of Self Test Range", "P1709",
            "Clutch Pedal Position Switch Circuit", "P1711",
            "Transmission Fluid Temperature Sensor Circuit out of Self Test Range", "P1713",
            "Transmission Fluid Temperature Sensor Circuit", "P1714", "Shift Solenoid '1' Mechanical Fault", "P1715",
            "Shift Solenoid '2' Mechanical Fault", "P1716", "Shift Solenoid '3' Mechanical Fault", "P1717",
            "Shift Solenoid '4' Mechanical Fault", "P1718", "Transmission Fluid Temperature Sensor Circuit", "P1720",
            "Vehicle Speed Sensor '2' Signal Error", "P1729", "Transmission 4x4 Low Switch Error", "P1740",
            "Torque Converter Clutch Solenoid Mechanical Fault", "P1741",
            "Torque Converter Clutch Control Electrical Fault", "P1742", "Torque Converter Clutch Solenoid Shorted",
            "P1743", "Torque Converter Clutch Failed On - TCIL is On", "P1744",
            "Torque Converter Clutch Solenoid Mechanical Fault", "P1746",
            "Electronic Pressure Control Solenoid Circuit Open", "P1747",
            "Electronic Pressure Control Solenoid Circuit", "P1749", "Electronic Pressure Control Solenoid Circuit Low",
            "P1751", "Transmission Shift Solenoid 'A' Mechanical Fault", "P1752",
            "Transmission Shift Solenoid 'A' Circuit Shorted", "P1754",
            "Transmission Coast Clutch Solenoid Electrical Fault", "P1756",
            "Transmission Shift Solenoid 'B' Mechanical Fault", "P1757",
            "Transmission Shift Solenoid 'B' Circuit Shorted", "P1761",
            "Transmission Shift Solenoid '3' Mechanical Fault", "P1762", "Transmission SS3/SS4/OD Band Fault", "P1765",
            "Transmission 3-2 Timing Solenoid Valve", "P1767", "Torque Converter Clutch Solenoid Circuit", "P1771",
            "Throttle Position Sensor Circuit Open to Transmission Control Module", "P1772",
            "Throttle Position Sensor Circuit Shorted to Transmission Control Module", "P1780",
            "Transmission Control Switch Circuit", "P1780", "Overdrive Off Switch not Cycled during the Self Test",
            "P1781", "Transmission 4x4 Low Switch out of Range Fault", "P1783",
            "Transmission Fluid Temperature High Input", "P1788", "3-2T/CCS Circuit Open", "P1789",
            "3-2T/CCS Circuit Shorted", "P1794", "Powertrain Control Module Battery Direct Power Circuit", "P1797",
            "P/N Switch Open or Short Circuit", "P1900", "Turbine Speed Sensor Circuit Intermittent", "P1901",
            "Torque Converter Clutch Circuit Intermittent" };

    /* renamed from: ٴ */
    private Vector<C0042> f1528 = new Vector<>();

    /* renamed from: ᴵ */
    private Vector<C0042> f1529 = new Vector<>();

    /* renamed from: ᵎ */
    private Vector<C0042> f1530 = new Vector<>();

    /* renamed from: ᵔ */
    private Vector<C0042> f1531 = new Vector<>();

    /* renamed from: ᵢ */
    private Vector<C0042> f1532 = new Vector<>();

    /* renamed from: ⁱ */
    private Vector<C0042> f1533 = new Vector<>();

    static {
        String[] strArr = new String[C0432.f2688];
        strArr[0] = "P1100";
        strArr[1] = "BARO Sensor Circuit";
        strArr[2] = "P1120";
        strArr[3] = "Accelerator Pedal Position Sensor Circuit.";
        strArr[4] = "P1121";
        strArr[5] = "Accelerator Pedal Position Sensor Range/Performance Problem.";
        strArr[6] = "P1125";
        strArr[7] = "Throttle Control Motor Circuit";
        strArr[8] = "P1126";
        strArr[9] = "Magnetic Clutch Circuit";
        strArr[10] = "P1127";
        strArr[11] = "ETCS Actuator Power Source Circuit";
        strArr[12] = "P1128";
        strArr[13] = "Throttle Control Motor Lock";
        strArr[14] = "P1129";
        strArr[15] = "Electric Throttle Control System";
        strArr[16] = "P1130";
        strArr[17] = "Air/Fuel Sensor Circuit Range/Performance. (Bank 1 Sensor 1)";
        strArr[18] = "P1133";
        strArr[19] = "Air/Fuel Sensor Circuit Response. (Bank 1 Sensor 1)";
        strArr[20] = "P1135";
        strArr[21] = "Air/Fuel Sensor Heater Circuit Response. (Bank 1 Sensor 1)";
        strArr[22] = "P1150";
        strArr[23] = "Air/Fuel Sensor Circuit Range/Performance. (Bank 2 Sensor 1)";
        strArr[24] = "P1153";
        strArr[25] = "Air/Fuel Sensor Circuit Response. (Bank 2 Sensor 1)";
        strArr[26] = "P1155";
        strArr[27] = "Air/Fuel Sensor Heater Circuit. (Bank 2 Sensor 1)";
        strArr[28] = "P1200";
        strArr[29] = "Fuel Pump Relay Circuit";
        strArr[30] = "P1300";
        strArr[31] = "Igniter Circuit Fault (Bank #1)";
        strArr[32] = "P1305";
        strArr[33] = "Igniter Circuit Fault (Bank #2)";
        strArr[34] = "P1310";
        strArr[35] = "Igniter Circuit Fault (Bank #3)";
        strArr[36] = "P1315";
        strArr[37] = "Igniter Circuit Fault (Bank #4)";
        strArr[38] = "P1320";
        strArr[39] = "Igniter Circuit Fault (Bank #5)";
        strArr[40] = "P1325";
        strArr[41] = "Igniter Circuit Fault (Bank #6)";
        strArr[42] = "P1330";
        strArr[43] = "Igniter Circuit Fault (Bank #7)";
        strArr[44] = "P1335";
        strArr[45] = "No Crankshaft Position Sensor Signal - Engine Running.";
        strArr[46] = "P1340";
        strArr[47] = "Igniter Circuit Fault (Bank #8)";
        strArr[48] = "P1346";
        strArr[49] = "VVT Sensor Circuit (Bank 1)";
        strArr[50] = "P1350";
        strArr[51] = "VVT Sensor/Camshaft Position Sensor Circuit Malfunction (Bank 2)";
        strArr[52] = "P1351";
        strArr[53] = "VVT Sensor/Camshaft Position Sensor Circuit Range/Performance Problem (Bank 2)";
        strArr[54] = "P1354";
        strArr[55] = "VVT System Malfunction (Bank 2)";
        strArr[56] = "P1349";
        strArr[57] = "VVT System Malfunction (Bank 1)";
        strArr[58] = "P1400";
        strArr[59] = "Sub-Throttle Position Sensor.";
        strArr[60] = "P1401";
        strArr[61] = "Sub-Throttle Position Sensor Range/Performance Problem.";
        strArr[62] = "P1405";
        strArr[63] = "Turbo Pressure Sensor Circuit.";
        strArr[64] = "P1406";
        strArr[65] = "Turbo Pressure Sensor Range/Performance Problem.";
        strArr[66] = "P1410";
        strArr[67] = "EGR Valve Position Sensor Circuit Malfunction.";
        strArr[68] = "P1411";
        strArr[69] = "EGR Valve Position Sensor Circuit Range/Performance.";
        strArr[70] = "P1500";
        strArr[71] = "Starter Signal Circuit Fault";
        strArr[72] = "P1510";
        strArr[73] = "Boost Pressure Control Circuit/Air Volume Too Low With Supercharger On";
        strArr[74] = "P1511";
        strArr[75] = "Boost Pressure Low.";
        strArr[76] = "P1512";
        strArr[77] = "Boost Pressure High.";
        strArr[78] = "P1520";
        strArr[79] = "Stop Lamp Switch Signal Malfunction.";
        strArr[80] = "P1565";
        strArr[81] = "Cruise Control Main Switch Circuit.";
        strArr[82] = "P1600";
        strArr[83] = "ECM Battery Malfunction/ECM Battery Back-up Circuit Fault";
        strArr[84] = "P1605";
        strArr[85] = "Knock Control CPU.";
        strArr[86] = "P1630";
        strArr[87] = "Traction Control System.";
        strArr[88] = "P1633";
        strArr[89] = "ECM Malfunction (ETCS Circuit)";
        strArr[90] = "P1645";
        strArr[91] = "Body ECU Malfunction";
        strArr[92] = "P1646";
        strArr[93] = "No communication between ECM and and transmission ECU";
        strArr[94] = "P1647";
        strArr[95] = "No communication between ECM and and transmission ECU";
        strArr[96] = "P1651";
        strArr[97] = "VSV for ACIS Circuit Malfunction (European spec.)";
        strArr[98] = "P1652";
        strArr[99] = "Idle Air Control Valve Control Circuit.";
        strArr[100] = "P1656";
        strArr[101] = "OCV Circuit Malfunction (Bank 1)";
        strArr[102] = "P1658";
        strArr[103] = "Wastegate Valve Control Circuit.";
        strArr[104] = "P1661";
        strArr[105] = "EGR Circuit.";
        strArr[106] = "P1662";
        strArr[107] = "EGR by-pass Valve Control Circuit.";
        strArr[108] = "P1666";
        strArr[109] = "VSV for ACIS Circuit Malfunction";
        strArr[110] = "P1700";
        strArr[111] = "Vehicle Speed Sensor Circuit Fault";
        strArr[112] = "P1705";
        strArr[113] = "Direct Clutch Speed Sensor Circuit Fault";
        strArr[114] = "P1765";
        strArr[115] = "Linear Shift Solenoid Circuit Fault";
        strArr[116] = "P1780";
        strArr[117] = "Park/Neutral Position Switch Malfunction (Only For A/T)";
        strArr[118] = "P1870";
        strArr[119] = "Shift Stroke Sensor Malfunction";
        strArr[120] = "P1881";
        strArr[121] = "Reverse switch malfunction";
        f1519 = strArr;
    }

    /* renamed from: ˉ */
    public static final void m1306() {
        try {
            if (!f1509.exists()) {
                f1509.mkdirs();
            }
            if (!f1509.isDirectory()) {
                f1509.delete();
                f1509.mkdirs();
            }
        } catch (Throwable th) {
            C0362.m1836(th);
        }
    }

    /* renamed from: ˊ */
    public static final String m1307(String str, int i, boolean z) {
        String upperCase = str.toUpperCase();
        String r2 = m1308(upperCase, f1506);
        if (r2 != null) {
            return r2;
        }
        String str2 = "";
        String[] r4 = m1310(i);
        if (r4 != null) {
            str2 = new StringBuilder(String.valueOf(str2)).append(m1308(upperCase, r4)).toString();
        } else if (!z) {
            for (int i2 = 0; i2 < C0254.f1381.length; i2++) {
                String[] r6 = m1310(i2);
                if (r6 != null) {
                    String r7 = m1308(upperCase, r6);
                    if (r7 != null) {
                        str2 = new StringBuilder(String.valueOf(str2)).append("[").append(C0254.m1255(i2)).append("] ")
                                .append(r7).append("\n").toString();
                    }
                }
            }
        }
        return str2.length() == 0
                ? !z ? C0483.m2490("Unknown code - More information may be available on the web", new String[0]) : ""
                : str2;
    }

    /* renamed from: ˊ */
    private static final String m1308(String str, String[] strArr) {
        String upperCase = str.toUpperCase();
        for (int i = 0; i < strArr.length; i += 2) {
            if (strArr[i].equals(upperCase)) {
                return strArr[i + 1];
            }
        }
        return null;
    }

    /* renamed from: ˊ */
    public static final synchronized C0267 m1309() {
        C0267 r0;
        synchronized (C0267.class) {
            if (f1525 == null) {
                f1525 = new C0267();
            }
            r0 = f1525;
        }
        return r0;
    }

    /* renamed from: ˊ */
    public static final String[] m1310(int i) {
        if (i == 1) {
            return f1508;
        }
        if (i == 35) {
            return f1507;
        }
        if (i == 5) {
            return f1511;
        }
        if (i == 6) {
            return f1512;
        }
        if (i == 7) {
            return f1515;
        }
        if (i == 10) {
            return f1522;
        }
        if (i == 12) {
            return f1527;
        }
        if (i == 13) {
            return C0281.f1606;
        }
        if (i == 9) {
            return f1521;
        }
        if (i == 8) {
            return f1519;
        }
        if (i == 11) {
            return f1524;
        }
        if (i == 28) {
            return f1517;
        }
        if (i == 26 || i == 27 || i == 4) {
            return f1501;
        }
        if (i == 29) {
            return f1518;
        }
        return null;
    }

    /* renamed from: ˋ */
    public static final String m1311(String str, int i, boolean z) {
        String upperCase = str.toUpperCase();
        String r2 = m1308(upperCase, f1506);
        if (r2 != null) {
            return r2;
        }
        String str2 = "";
        String[] r4 = m1310(i);
        if (r4 != null) {
            return m1308(upperCase, r4);
        }
        for (int i2 = 0; i2 < C0254.f1381.length; i2++) {
            String[] r6 = m1310(i2);
            if (r6 != null) {
                String r7 = m1308(upperCase, r6);
                if (r7 != null) {
                    str2 = new StringBuilder(String.valueOf(str2)).append("[").append(C0254.m1255(i2)).append("] ")
                            .append(r7).append("\n").toString();
                }
            }
        }
        return z ? str2.length() == 0 ? C0483.m2490("Tap 'Web' for more information", new String[0])
                : C0483.m2490("Tap for multiple descriptions", new String[0]) : str2.length() == 0 ? "" : "";
    }

    /* renamed from: ˌ */
    public static final File[] m1312() {
        m1306();
        Vector vector = new Vector();
        File[] listFiles = f1509.listFiles();
        if (listFiles != null) {
            File[] fileArr = listFiles;
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                File file = fileArr[i];
                if (!file.isDirectory() && file.getName().endsWith(".flg")) {
                    vector.add(file);
                }
            }
        }
        return (File[]) vector.toArray(new File[vector.size()]);
    }

    /* renamed from: ʻ */
    public String[] mo3638() {
        String[] strArr;
        synchronized (this.f1532) {
            strArr = new String[this.f1532.size()];
            int i = 0;
            Iterator it = this.f1532.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* renamed from: ʼ */
    public String[] mo3639() {
        String[] strArr;
        synchronized (this.f1533) {
            strArr = new String[this.f1533.size()];
            int i = 0;
            Iterator it = this.f1533.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* renamed from: ʽ */
    public void mo3640() {
        this.f1528.clear();
    }

    /* renamed from: ʾ */
    public void mo3641() {
        this.f1531.clear();
    }

    /* renamed from: ʿ */
    public void mo3642() {
        this.f1532.clear();
    }

    /* renamed from: ˈ */
    public void mo3643() {
        this.f1533.clear();
    }

    /* renamed from: ˊ */
    public final int mo3644(int i, int i2, int i3) {
        int i4 = 8 - i2;
        String binaryString = Integer.toBinaryString(i);
        if (binaryString.length() < 8) {
            for (int length = binaryString.length(); length < 8; length++) {
                binaryString = new StringBuilder(TorqueSettings.f6202).append(binaryString).toString();
            }
        }
        return Integer.parseInt(binaryString.substring(i4, i4 + i3), 2);
    }

    /* renamed from: ˊ */
    public final void mo3645(String str) {
        byte[] bytes = str.getBytes();
        int r4 = mo3644((int) bytes[2], 8, 2);
        int r5 = mo3644((int) bytes[2], 6, 2);
        int r6 = mo3644((int) bytes[2], 4, 4);
        int r7 = mo3644((int) bytes[3], 8, 4);
        String sb = new StringBuilder(String.valueOf(f1504[r4])).append(r5).append(r6).append(r7)
                .append(mo3644((int) bytes[3], 4, 4)).toString();
        this.f1528.add(new C0042(sb, 0));
        FrontPage.m6034(new StringBuilder(String.valueOf(C0483.m2490("Fault code found:", new String[0]))).append(sb)
                .toString());
    }

    /* renamed from: ˋ */
    public String[] mo3646() {
        String[] strArr;
        synchronized (this.f1528) {
            strArr = new String[this.f1528.size()];
            int i = 0;
            Iterator it = this.f1528.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 211 */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3647(java.lang.String r10, int r11, boolean r12) {
        /*
         * r9 = this; if (r10 != 0) goto L_0x0003 return L_0x0003: if (r10 == 0) goto
         * L_0x0035 java.lang.String r0 = r10.toUpperCase() // Catch:{ Throwable ->
         * 0x0031 } java.lang.String r1 = "ERROR" boolean r0 = r0.contains(r1) //
         * Catch:{ Throwable -> 0x0031 } if (r0 == 0) goto L_0x0035 long r0 =
         * java.lang.System.currentTimeMillis() // Catch:{ Throwable -> 0x0031 } long r2
         * = f1526 // Catch:{ Throwable -> 0x0031 } long r0 = r0 - r2 r2 = 5000(0x1388,
         * double:2.4703E-320) int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1)) if (r0 <= 0)
         * goto L_0x0035 java.lang.String r0 = "Data Error from Adapter" r1 = 0
         * java.lang.String[] r1 = new java.lang.String[r1] // Catch:{ Throwable ->
         * 0x0031 } java.lang.String r0 = p001o.C0483.m2490(r0, r1) // Catch:{ Throwable
         * -> 0x0031 } org.prowl.torque.landing.FrontPage.m6038(r0) // Catch:{ Throwable
         * -> 0x0031 } long r0 = java.lang.System.currentTimeMillis() // Catch:{
         * Throwable -> 0x0031 } f1526 = r0 // Catch:{ Throwable -> 0x0031 } goto
         * L_0x0035 L_0x0031: r4 = move-exception p001o.C0362.m1836(r4) L_0x0035:
         * java.lang.String r4 = "" int r0 = r10.length() r1 = 14 if (r0 != r1) goto
         * L_0x0046 r0 = 2 java.lang.String r10 = r10.substring(r0) goto L_0x0226
         * L_0x0046: r0 = 4 java.lang.String r10 = r10.substring(r0) goto L_0x0226
         * L_0x004d: java.lang.String r5 = "" java.lang.String r0 = r10.toUpperCase() //
         * Catch:{ Throwable -> 0x0235 } r1 = 0 r2 = 1 java.lang.String r6 =
         * r0.substring(r1, r2) // Catch:{ Throwable -> 0x0235 } java.lang.String r0 =
         * "0" boolean r0 = r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0)
         * goto L_0x0065 java.lang.String r5 = "P0" goto L_0x0111 L_0x0065:
         * java.lang.String r0 = "1" boolean r0 = r6.equals(r0) // Catch:{ Throwable ->
         * 0x0235 } if (r0 == 0) goto L_0x0071 java.lang.String r5 = "P1" goto L_0x0111
         * L_0x0071: java.lang.String r0 = "2" boolean r0 = r6.equals(r0) // Catch:{
         * Throwable -> 0x0235 } if (r0 == 0) goto L_0x007d java.lang.String r5 = "P2"
         * goto L_0x0111 L_0x007d: java.lang.String r0 = "3" boolean r0 = r6.equals(r0)
         * // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto L_0x0089 java.lang.String
         * r5 = "P3" goto L_0x0111 L_0x0089: java.lang.String r0 = "4" boolean r0 =
         * r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto L_0x0095
         * java.lang.String r5 = "C0" goto L_0x0111 L_0x0095: java.lang.String r0 = "5"
         * boolean r0 = r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto
         * L_0x00a1 java.lang.String r5 = "C1" goto L_0x0111 L_0x00a1: java.lang.String
         * r0 = "6" boolean r0 = r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0
         * == 0) goto L_0x00ad java.lang.String r5 = "C2" goto L_0x0111 L_0x00ad:
         * java.lang.String r0 = "7" boolean r0 = r6.equals(r0) // Catch:{ Throwable ->
         * 0x0235 } if (r0 == 0) goto L_0x00b9 java.lang.String r5 = "C3" goto L_0x0111
         * L_0x00b9: java.lang.String r0 = "8" boolean r0 = r6.equals(r0) // Catch:{
         * Throwable -> 0x0235 } if (r0 == 0) goto L_0x00c5 java.lang.String r5 = "B0"
         * goto L_0x0111 L_0x00c5: java.lang.String r0 = "9" boolean r0 = r6.equals(r0)
         * // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto L_0x00d0 java.lang.String
         * r5 = "B1" goto L_0x0111 L_0x00d0: java.lang.String r0 = "A" boolean r0 =
         * r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto L_0x00db
         * java.lang.String r5 = "B2" goto L_0x0111 L_0x00db: java.lang.String r0 = "B"
         * boolean r0 = r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto
         * L_0x00e6 java.lang.String r5 = "B3" goto L_0x0111 L_0x00e6: java.lang.String
         * r0 = "C" boolean r0 = r6.equals(r0) // Catch:{ Throwable -> 0x0235 } if (r0
         * == 0) goto L_0x00f1 java.lang.String r5 = "U0" goto L_0x0111 L_0x00f1:
         * java.lang.String r0 = "D" boolean r0 = r6.equals(r0) // Catch:{ Throwable ->
         * 0x0235 } if (r0 == 0) goto L_0x00fc java.lang.String r5 = "U1" goto L_0x0111
         * L_0x00fc: java.lang.String r0 = "E" boolean r0 = r6.equals(r0) // Catch:{
         * Throwable -> 0x0235 } if (r0 == 0) goto L_0x0107 java.lang.String r5 = "U2"
         * goto L_0x0111 L_0x0107: java.lang.String r0 = "F" boolean r0 = r6.equals(r0)
         * // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto L_0x0111 java.lang.String
         * r5 = "U3" L_0x0111: r0 = 1 r1 = 4 java.lang.String r7 = r10.substring(r0, r1)
         * // Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x0235 } java.lang.String r1
         * = java.lang.String.valueOf(r5) // Catch:{ Throwable -> 0x0235 } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r0 = r0.append(r7)
         * // Catch:{ Throwable -> 0x0235 } java.lang.String r5 = r0.toString() //
         * Catch:{ Throwable -> 0x0235 } if (r12 == 0) goto L_0x0130 r0 = 6
         * java.lang.String r10 = r10.substring(r0) // Catch:{ Throwable -> 0x0235 }
         * goto L_0x0135 L_0x0130: r0 = 4 java.lang.String r10 = r10.substring(r0) //
         * Catch:{ Throwable -> 0x0235 } L_0x0135: o.ȑ r8 = new o.ȑ // Catch:{ Throwable
         * -> 0x0235 } r8.<init>(r5, r11) // Catch:{ Throwable -> 0x0235 } r0 = 1 if
         * (r11 != r0) goto L_0x0162 java.util.Vector<o.ȑ> r0 = r9.f1528 // Catch:{
         * Throwable -> 0x0235 } boolean r0 = r0.contains(r8) // Catch:{ Throwable ->
         * 0x0235 } if (r0 != 0) goto L_0x0226 java.util.Vector<o.ȑ> r0 = r9.f1528 //
         * Catch:{ Throwable -> 0x0235 } r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ
         * r0 = p001o.C0351.m1693() // Catch:{ Throwable -> 0x0235 }
         * java.lang.StringBuilder r1 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x0235 } java.lang.String r2 = "Fault code found: " r1.<init>(r2) //
         * Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 = r1.append(r5) //
         * Catch:{ Throwable -> 0x0235 } java.lang.String r1 = r1.toString() // Catch:{
         * Throwable -> 0x0235 } r0.mo4995(r1) // Catch:{ Throwable -> 0x0235 } goto
         * L_0x0226 L_0x0162: r0 = 3 if (r11 != r0) goto L_0x018a java.util.Vector<o.ȑ>
         * r0 = r9.f1529 // Catch:{ Throwable -> 0x0235 } boolean r0 = r0.contains(r8)
         * // Catch:{ Throwable -> 0x0235 } if (r0 != 0) goto L_0x0226
         * java.util.Vector<o.ȑ> r0 = r9.f1529 // Catch:{ Throwable -> 0x0235 }
         * r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ r0 = p001o.C0351.m1693() //
         * Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x0235 } java.lang.String r2
         * = "Pending fault code found: " r1.<init>(r2) // Catch:{ Throwable -> 0x0235 }
         * java.lang.StringBuilder r1 = r1.append(r5) // Catch:{ Throwable -> 0x0235 }
         * java.lang.String r1 = r1.toString() // Catch:{ Throwable -> 0x0235 }
         * r0.mo4995(r1) // Catch:{ Throwable -> 0x0235 } goto L_0x0226 L_0x018a: r0 = 2
         * if (r11 != r0) goto L_0x01b2 java.util.Vector<o.ȑ> r0 = r9.f1530 // Catch:{
         * Throwable -> 0x0235 } boolean r0 = r0.contains(r8) // Catch:{ Throwable ->
         * 0x0235 } if (r0 != 0) goto L_0x0226 java.util.Vector<o.ȑ> r0 = r9.f1530 //
         * Catch:{ Throwable -> 0x0235 } r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ
         * r0 = p001o.C0351.m1693() // Catch:{ Throwable -> 0x0235 }
         * java.lang.StringBuilder r1 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x0235 } java.lang.String r2 = "Historic/Cleared fault code found:"
         * r1.<init>(r2) // Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 =
         * r1.append(r5) // Catch:{ Throwable -> 0x0235 } java.lang.String r1 =
         * r1.toString() // Catch:{ Throwable -> 0x0235 } r0.mo4995(r1) // Catch:{
         * Throwable -> 0x0235 } goto L_0x0226 L_0x01b2: r0 = 4 if (r11 != r0) goto
         * L_0x01d9 java.util.Vector<o.ȑ> r0 = r9.f1531 // Catch:{ Throwable -> 0x0235 }
         * boolean r0 = r0.contains(r8) // Catch:{ Throwable -> 0x0235 } if (r0 != 0)
         * goto L_0x0226 java.util.Vector<o.ȑ> r0 = r9.f1531 // Catch:{ Throwable ->
         * 0x0235 } r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ r0 =
         * p001o.C0351.m1693() // Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder
         * r1 = new java.lang.StringBuilder // Catch:{ Throwable -> 0x0235 }
         * java.lang.String r2 = "Manufacturer13 fault code found:" r1.<init>(r2) //
         * Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 = r1.append(r5) //
         * Catch:{ Throwable -> 0x0235 } java.lang.String r1 = r1.toString() // Catch:{
         * Throwable -> 0x0235 } r0.mo4995(r1) // Catch:{ Throwable -> 0x0235 } goto
         * L_0x0226 L_0x01d9: r0 = 5 if (r11 != r0) goto L_0x0200 java.util.Vector<o.ȑ>
         * r0 = r9.f1532 // Catch:{ Throwable -> 0x0235 } boolean r0 = r0.contains(r8)
         * // Catch:{ Throwable -> 0x0235 } if (r0 != 0) goto L_0x0226
         * java.util.Vector<o.ȑ> r0 = r9.f1532 // Catch:{ Throwable -> 0x0235 }
         * r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ r0 = p001o.C0351.m1693() //
         * Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x0235 } java.lang.String r2
         * = "Manufacturer18 fault code found:" r1.<init>(r2) // Catch:{ Throwable ->
         * 0x0235 } java.lang.StringBuilder r1 = r1.append(r5) // Catch:{ Throwable ->
         * 0x0235 } java.lang.String r1 = r1.toString() // Catch:{ Throwable -> 0x0235 }
         * r0.mo4995(r1) // Catch:{ Throwable -> 0x0235 } goto L_0x0226 L_0x0200: r0 = 6
         * if (r11 != r0) goto L_0x0226 java.util.Vector<o.ȑ> r0 = r9.f1533 // Catch:{
         * Throwable -> 0x0235 } boolean r0 = r0.contains(r8) // Catch:{ Throwable ->
         * 0x0235 } if (r0 != 0) goto L_0x0226 java.util.Vector<o.ȑ> r0 = r9.f1533 //
         * Catch:{ Throwable -> 0x0235 } r0.add(r8) // Catch:{ Throwable -> 0x0235 } o.ᵐ
         * r0 = p001o.C0351.m1693() // Catch:{ Throwable -> 0x0235 }
         * java.lang.StringBuilder r1 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x0235 } java.lang.String r2 = "Manufacturer19 fault code found:"
         * r1.<init>(r2) // Catch:{ Throwable -> 0x0235 } java.lang.StringBuilder r1 =
         * r1.append(r5) // Catch:{ Throwable -> 0x0235 } java.lang.String r1 =
         * r1.toString() // Catch:{ Throwable -> 0x0235 } r0.mo4995(r1) // Catch:{
         * Throwable -> 0x0235 } L_0x0226: int r0 = r10.length() // Catch:{ Throwable ->
         * 0x0235 } if (r0 <= 0) goto L_0x0239 java.lang.String r0 = "0000" boolean r0 =
         * r10.startsWith(r0) // Catch:{ Throwable -> 0x0235 } if (r0 == 0) goto
         * L_0x004d goto L_0x0239 L_0x0235: r5 = move-exception p001o.C0362.m1836(r5)
         * L_0x0239: return
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: p001o.C0267.mo3647(java.lang.String, int, boolean):void");
    }

    /* renamed from: ˎ */
    public String[] mo3648() {
        String[] strArr;
        synchronized (this.f1529) {
            strArr = new String[this.f1529.size()];
            int i = 0;
            Iterator it = this.f1529.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* renamed from: ˏ */
    public String[] mo3649() {
        String[] strArr;
        synchronized (this.f1530) {
            strArr = new String[this.f1530.size()];
            int i = 0;
            Iterator it = this.f1530.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* renamed from: ͺ */
    public void mo3650() {
        this.f1529.clear();
    }

    /* renamed from: ᐝ */
    public String[] mo3651() {
        String[] strArr;
        synchronized (this.f1531) {
            strArr = new String[this.f1531.size()];
            int i = 0;
            Iterator it = this.f1531.iterator();
            while (it.hasNext()) {
                int i2 = i;
                i++;
                strArr[i2] = ((C0042) it.next()).mo2891();
            }
        }
        return strArr;
    }

    /* renamed from: ι */
    public void mo3652() {
        this.f1530.clear();
    }
}
