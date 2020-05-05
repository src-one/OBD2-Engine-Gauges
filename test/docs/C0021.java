package p001o;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.lingala.zip4j.util.InternalZipConstants;
import org.prowl.torque.comms.utils.j1939.SPN;
import p001o.C0463.C0464if;

/* renamed from: o.ĸ */
public class C0021 {

    /* renamed from: ʻ */
    private static final String f206 = "\"";

    /* renamed from: ʼ */
    private static final String f207 = "";

    /* renamed from: ˊ */
    private static final HashMap<Integer, List<SPN>> f208 = new HashMap<>();

    /* renamed from: ˎ */
    private static final byte[] f209 = "awef!VRafrosu v3rvA#534m6345^@4hmg2v@R".getBytes();

    /* renamed from: ˋ */
    private Context f210;

    /* renamed from: ˏ */
    private final Object[][] f211 = { new Object[] { Integer.valueOf(0), "Engine #1" },
            new Object[] { Integer.valueOf(1), "Engine #2" }, new Object[] { Integer.valueOf(2), "Turbocharger" },
            new Object[] { Integer.valueOf(3), "Transmission #1" },
            new Object[] { Integer.valueOf(4), "Transmission #2" },
            new Object[] { Integer.valueOf(5), "Shift Console - Primary" },
            new Object[] { Integer.valueOf(6), "Shift Console - Secondary" },
            new Object[] { Integer.valueOf(7), "Power TakeOff - (Main or Rear)" },
            new Object[] { Integer.valueOf(8), "Axle - Steering" },
            new Object[] { Integer.valueOf(9), "Axle - Drive #1" },
            new Object[] { Integer.valueOf(10), "Axle - Drive #2" },
            new Object[] { Integer.valueOf(11), "Brakes - System Controller" },
            new Object[] { Integer.valueOf(12), "Brakes - Steer Axle" },
            new Object[] { Integer.valueOf(13), "Brakes - Drive axle #1" },
            new Object[] { Integer.valueOf(14), "Brakes - Drive Axle #2" },
            new Object[] { Integer.valueOf(15), "Retarder - Engine" },
            new Object[] { Integer.valueOf(16), "Retarder - Driveline" },
            new Object[] { Integer.valueOf(17), "Cruise Control" }, new Object[] { Integer.valueOf(18), "Fuel System" },
            new Object[] { Integer.valueOf(19), "Steering Controller" },
            new Object[] { Integer.valueOf(20), "Suspension - Steer Axle" },
            new Object[] { Integer.valueOf(21), "Suspension - Drive Axle #1" },
            new Object[] { Integer.valueOf(22), "Suspension - Drive Axle #2" },
            new Object[] { Integer.valueOf(23), "Instrument Cluster #1" },
            new Object[] { Integer.valueOf(24), "Trip Recorder" },
            new Object[] { Integer.valueOf(25), "Passenger-Operator Climate Control #1" },
            new Object[] { Integer.valueOf(26), "Alternator/Electrical Charging System" },
            new Object[] { Integer.valueOf(27), "Aerodynamic Control" },
            new Object[] { Integer.valueOf(28), "Vehicle Navigation" },
            new Object[] { Integer.valueOf(29), "Vehicle Security" },
            new Object[] { Integer.valueOf(30), "Electrical System" },
            new Object[] { Integer.valueOf(31), "Starter System" },
            new Object[] { Integer.valueOf(32), "Tractor-Trailer Bridge #1" },
            new Object[] { Integer.valueOf(33), "Body Controller" },
            new Object[] { Integer.valueOf(34), "Auxiliary Valve Control" },
            new Object[] { Integer.valueOf(35), "Hitch Control" },
            new Object[] { Integer.valueOf(36), "Power TakeOff (Front or Secondary)" },
            new Object[] { Integer.valueOf(37), "Off Vehicle Gateway" },
            new Object[] { Integer.valueOf(38), "Virtual Terminal (in cab)" },
            new Object[] { Integer.valueOf(39), "Management Computer #1" },
            new Object[] { Integer.valueOf(40), "Cab Display #1" },
            new Object[] { Integer.valueOf(41), "Retarder, Exhaust, Engine #1" },
            new Object[] { Integer.valueOf(42), "Headway Controller" },
            new Object[] { Integer.valueOf(43), "On-Board Diagnostic Unit" },
            new Object[] { Integer.valueOf(44), "Retarder, Exhaust, Engine #2" },
            new Object[] { Integer.valueOf(45), "Endurance Braking System" },
            new Object[] { Integer.valueOf(46), "Hydraulic Pump Controller" },
            new Object[] { Integer.valueOf(47), "Suspension - System Controller #1" },
            new Object[] { Integer.valueOf(48), "Pneumatic - System Controller" },
            new Object[] { Integer.valueOf(49), "Cab Controller - Primary" },
            new Object[] { Integer.valueOf(50), "Cab Controller - Secondary" },
            new Object[] { Integer.valueOf(51), "Tire Pressure Controller" },
            new Object[] { Integer.valueOf(52), "Ignition Control Module #1" },
            new Object[] { Integer.valueOf(53), "Ignition Control Module #2" },
            new Object[] { Integer.valueOf(54), "Seat Control #1" },
            new Object[] { Integer.valueOf(55), "Lighting - Operator Controls" },
            new Object[] { Integer.valueOf(56), "Rear Axle Steering Controller #1" },
            new Object[] { Integer.valueOf(57), "Water Pump Controller" },
            new Object[] { Integer.valueOf(58), "Passenger-Operator Climate Control #2" },
            new Object[] { Integer.valueOf(59), "Transmission Display - Primary" },
            new Object[] { Integer.valueOf(60), "Transmission Display - Secondary" },
            new Object[] { Integer.valueOf(61), "Exhaust Emission Controller" },
            new Object[] { Integer.valueOf(62), "Vehicle Dynamic Stability Controller" },
            new Object[] { Integer.valueOf(63), "Oil Sensor" },
            new Object[] { Integer.valueOf(64), "Suspension - System Controller #2" },
            new Object[] { Integer.valueOf(65), "Information System Controller #1" },
            new Object[] { Integer.valueOf(66), "Ramp Control" },
            new Object[] { Integer.valueOf(67), "Clutch/Converter Unit" },
            new Object[] { Integer.valueOf(68), "Auxiliary Heater #1" },
            new Object[] { Integer.valueOf(69), "Auxiliary Heater #2" },
            new Object[] { Integer.valueOf(70), "Engine Valve Controller" },
            new Object[] { Integer.valueOf(71), "Chassis Controller #1" },
            new Object[] { Integer.valueOf(72), "Chassis Controller #2" },
            new Object[] { Integer.valueOf(73), "Propulsion Battery Charger" },
            new Object[] { Integer.valueOf(74), "Communications Unit, Cellular" },
            new Object[] { Integer.valueOf(75), "Communications Unit, Satellite" },
            new Object[] { Integer.valueOf(76), "Communications Unit, Radio" },
            new Object[] { Integer.valueOf(77), "Steering Column Unit" },
            new Object[] { Integer.valueOf(78), "Fan Drive Controller" },
            new Object[] { Integer.valueOf(79), "Seat Control #2" },
            new Object[] { Integer.valueOf(80), "Parking brake controller" },
            new Object[] { Integer.valueOf(81), "Aftertreatment #1 system gas intake" },
            new Object[] { Integer.valueOf(82), "Aftertreatment #1 system gas outlet" },
            new Object[] { Integer.valueOf(83), "Safety Restraint System" },
            new Object[] { Integer.valueOf(84), "Cab Display #2" },
            new Object[] { Integer.valueOf(85), "Diesel Particulate Filter Controller" },
            new Object[] { Integer.valueOf(86), "Aftertreatment #2 system gas intake" },
            new Object[] { Integer.valueOf(87), "Aftertreatment #2 system gas outlet" },
            new Object[] { Integer.valueOf(88), "Safety Restraint System #2" },
            new Object[] { Integer.valueOf(89), "Atmospheric Sensor" },
            new Object[] { Integer.valueOf(90), "thru 127 are reserved for future assignment by SAE" },
            new Object[] { Integer.valueOf(248), "File Server / Printer" },
            new Object[] { Integer.valueOf(249), "Off Board Diagnostic-Service Tool #1" },
            new Object[] { Integer.valueOf(250), "Off Board Diagnostic-Service Tool #2" },
            new Object[] { Integer.valueOf(251), "On-Board Data Logger" },
            new Object[] { Integer.valueOf(252), "Reserved for Experimental Use" },
            new Object[] { Integer.valueOf(253), "Reserved for OEM" },
            new Object[] { Integer.valueOf(254), "Null Address" },
            new Object[] { Integer.valueOf(255), "GLOBAL (All-Any Node)" } };

    /* renamed from: ᐝ */
    private final Object[][] f212 = { new Object[] { Integer.valueOf(0), "Torque/Speed Control 1" },
            new Object[] { Integer.valueOf(256), "Transmission Control 1" },
            new Object[] { Integer.valueOf(512), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(C0464if.f2842), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(1024), "External Brake Request" },
            new Object[] { Integer.valueOf(C0464if.f2844), "Reserved for CANopen" },
            new Object[] { Integer.valueOf(C0464if.f2845), "Reserved for CANopen" },
            new Object[] { Integer.valueOf(1792), "General Purpose Valve Pressure" },
            new Object[] { Integer.valueOf(2048), "Auxiliary Input/Output Status 5" },
            new Object[] { Integer.valueOf(38400), "LVD Set Operating Mode" },
            new Object[] { Integer.valueOf(38656), "Noise Control Status" },
            new Object[] { Integer.valueOf(38912), "Noise Control 1" },
            new Object[] { Integer.valueOf(39168), "Joystick Lamp Command Message" },
            new Object[] { Integer.valueOf(39424), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(39680), "Proprietary Method Identification" },
            new Object[] { Integer.valueOf(39936), "Auxiliary Input/Output Status 7" },
            new Object[] { Integer.valueOf(40192), "Auxiliary Input/Output Status 6" },
            new Object[] { Integer.valueOf(40448), "DTC Counts (DM29)" },
            new Object[] { Integer.valueOf(40704), "Immediate Fault Status (DM35)" },
            new Object[] { Integer.valueOf(40960), "NTE Status (DM34)" },
            new Object[] { Integer.valueOf(41216),
                    "Emission Increasing Auxiliary Emission Control Device Active Time (DM33)" },
            new Object[] { Integer.valueOf(41472), "Regulated Exhaust Emission Level Exceedance (DM32)" },
            new Object[] { Integer.valueOf(41728), "DTC To Lamp Association (DM31)" },
            new Object[] { Integer.valueOf(41984), "Scaled Test Results (DM30)" },
            new Object[] { Integer.valueOf(42240), "Auxiliary Input/Output Status 4" },
            new Object[] { Integer.valueOf(42496), "Auxiliary Input/Output Status 3" },
            new Object[] { Integer.valueOf(42752), "Auxiliary Input/Output Status 2" },
            new Object[] { Integer.valueOf(43008), "Text Display" },
            new Object[] { Integer.valueOf(43264), "Forward Lane Image Command" },
            new Object[] { Integer.valueOf(43520), "Client (ECU) to File Server message" },
            new Object[] { Integer.valueOf(43776), "File Server to Client (ECU) message" },
            new Object[] { Integer.valueOf(44032), "Agricultural Guidance Machine Info" },
            new Object[] { Integer.valueOf(44288), "Agricultural Guidance System Command" },
            new Object[] { Integer.valueOf(44544), "Tire Pressure Reference Setting" },
            new Object[] { Integer.valueOf(44800), "Parameter Locate Message" },
            new Object[] { Integer.valueOf(45056), "Configuration Identification Message" },
            new Object[] { Integer.valueOf(45312), "Proprietarily Configurable Message #1" },
            new Object[] { Integer.valueOf(45568), "Proprietarily Configurable Message #2" },
            new Object[] { Integer.valueOf(45824), "Proprietarily Configurable Message #3" },
            new Object[] { Integer.valueOf(46080), "Proprietarily Configurable Message #4" },
            new Object[] { Integer.valueOf(46336), "Proprietarily Configurable Message #5" },
            new Object[] { Integer.valueOf(46592), "Proprietarily Configurable Message #6" },
            new Object[] { Integer.valueOf(46848), "Proprietarily Configurable Message #7" },
            new Object[] { Integer.valueOf(47104), "Proprietarily Configurable Message #8" },
            new Object[] { Integer.valueOf(47360), "Proprietarily Configurable Message #9" },
            new Object[] { Integer.valueOf(47616), "Proprietarily Configurable Message #10" },
            new Object[] { Integer.valueOf(47872), "Proprietarily Configurable Message #11" },
            new Object[] { Integer.valueOf(48128), "Proprietarily Configurable Message #12" },
            new Object[] { Integer.valueOf(48384), "Proprietarily Configurable Message #13" },
            new Object[] { Integer.valueOf(48640), "Proprietarily Configurable Message #14" },
            new Object[] { Integer.valueOf(48896), "Proprietarily Configurable Message #15" },
            new Object[] { Integer.valueOf(49152), "Proprietarily Configurable Message #16" },
            new Object[] { Integer.valueOf(49408), "Diagnostic Readiness 2" },
            new Object[] { Integer.valueOf(49664), "Monitor Performance Ratio" },
            new Object[] { Integer.valueOf(49920), "Individual Clear/Reset Of Active And Previously Active DTC" },
            new Object[] { Integer.valueOf(50176), "General Purpose Valve Command" },
            new Object[] { Integer.valueOf(50432), "General Purpose Valve Measured Flow" },
            new Object[] { Integer.valueOf(50688), "General Purpose Valve Estimated Flow" },
            new Object[] { Integer.valueOf(50944), "Extended Transport Protocol - Data Transfer" },
            new Object[] { Integer.valueOf(51200), "Extended Transport Protocol - Connection Management" },
            new Object[] { Integer.valueOf(51456), "Request 2" }, new Object[] { Integer.valueOf(51712), "Transfer" },
            new Object[] { Integer.valueOf(51968), "Process Data Message" },
            new Object[] { Integer.valueOf(52224), "Request for Repetition Rate" },
            new Object[] { Integer.valueOf(52480), "Reserved for ISO 15765" },
            new Object[] { Integer.valueOf(52736), "Reserved for ISO 15765" },
            new Object[] { Integer.valueOf(52992), "Continuous Torque & Speed Limit Request" },
            new Object[] { Integer.valueOf(53248), "Cab Illumination Message" },
            new Object[] { Integer.valueOf(53504), "Air Suspension Control 6" },
            new Object[] { Integer.valueOf(53760), "Air Suspension Control 2" },
            new Object[] { Integer.valueOf(54016), "Calibration Information" },
            new Object[] { Integer.valueOf(54272), "Data Security" },
            new Object[] { Integer.valueOf(54528), "Time/Date Adjust" },
            new Object[] { Integer.valueOf(54784), "Boot Load Data" },
            new Object[] { Integer.valueOf(55040), "Binary Data Transfer" },
            new Object[] { Integer.valueOf(55296), "Memory Access Response" },
            new Object[] { Integer.valueOf(55552), "Memory Access Request" },
            new Object[] { Integer.valueOf(55808), "Reserved for ISO 15765" },
            new Object[] { Integer.valueOf(56064), "Reserved for ISO 15765" },
            new Object[] { Integer.valueOf(56320), "Anti-theft Status" },
            new Object[] { Integer.valueOf(56576), "Anti-theft Request" },
            new Object[] { Integer.valueOf(56832), "Reset" },
            new Object[] { Integer.valueOf(57088), "Stop Start Broadcast" },
            new Object[] { Integer.valueOf(57344), "Cab Message 1" },
            new Object[] { Integer.valueOf(57600), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(57856), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(58112), "Command Non-continuously Monitored Test" },
            new Object[] { Integer.valueOf(58368), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(58624), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(58880), "Virtual Terminal-to-Node" },
            new Object[] { Integer.valueOf(59136), "Node-to-Virtual Terminal" },
            new Object[] { Integer.valueOf(59392), "Acknowledgment Message" },
            new Object[] { Integer.valueOf(59904), "Request" },
            new Object[] { Integer.valueOf(60160), "Transport Protocol - Data Transfer" },
            new Object[] { Integer.valueOf(60416), "Transport Protocol - Connection Mgmt" },
            new Object[] { Integer.valueOf(60672), "Network Layer" },
            new Object[] { Integer.valueOf(60928), "Address Claimed" },
            new Object[] { Integer.valueOf(61184), "Proprietary A" },
            new Object[] { Integer.valueOf(61440), "Electronic Retarder Controller 1" },
            new Object[] { Integer.valueOf(61441), "Electronic Brake Controller 1" },
            new Object[] { Integer.valueOf(61442), "Electronic Transmission Controller 1" },
            new Object[] { Integer.valueOf(61443), "Electronic Engine Controller 2" },
            new Object[] { Integer.valueOf(61444), "Electronic Engine Controller 1" },
            new Object[] { Integer.valueOf(61445), "Electronic Transmission Controller 2" },
            new Object[] { Integer.valueOf(61446), "Electronic Axle Controller 1" },
            new Object[] { Integer.valueOf(61447), "Forward Lane Image urgent msg" },
            new Object[] { Integer.valueOf(61448), "Hydraulic Pressure Governor Info" },
            new Object[] { Integer.valueOf(61449), "Vehicle Dynamic Stability Control 2" },
            new Object[] { Integer.valueOf(61450), "Engine Gas Flow Rate" },
            new Object[] { Integer.valueOf(61451), "Electronic Steering Control" },
            new Object[] { Integer.valueOf(61452), "Electronic Transmission Controller #8" },
            new Object[] { Integer.valueOf(61453), "Land Leveling System Operational Information" },
            new Object[] { Integer.valueOf(61454), "Aftertreatment 1 Intake Gas 1" },
            new Object[] { Integer.valueOf(61455), "Aftertreatment 1 Outlet Gas 1" },
            new Object[] { Integer.valueOf(61456), "Aftertreatment 2 Intake Gas 1" },
            new Object[] { Integer.valueOf(61457), "Aftertreatment 2 Outlet Gas 1" },
            new Object[] { Integer.valueOf(61458), "Fifth Wheel Smart Systems 1" },
            new Object[] { Integer.valueOf(61459), "Slope Sensor Information" },
            new Object[] { Integer.valueOf(61460), "Blade Information" },
            new Object[] { Integer.valueOf(61461), "Requested Generator Total AC Reactive Power" },
            new Object[] { Integer.valueOf(61462), "Cylinder Combustion Status" },
            new Object[] { Integer.valueOf(61463), "Engine Knock Level #1" },
            new Object[] { Integer.valueOf(61464), "Engine Knock Level #2" },
            new Object[] { Integer.valueOf(61465), "Engine Knock Level #3" },
            new Object[] { Integer.valueOf(61466), "Engine Throttle / Fuel Actuator Control Command" },
            new Object[] { Integer.valueOf(61467), "General Purpose Message #1/7" },
            new Object[] { Integer.valueOf(61468), "Requested Generator Average Basic AC Quantities" },
            new Object[] { Integer.valueOf(61469), "Steering Angle Sensor Information" },
            new Object[] { Integer.valueOf(61470), "Generator Control 2" },
            new Object[] { Integer.valueOf(61471), "Electronic Brake System #2/6" },
            new Object[] { Integer.valueOf(61472), "Electronic Brake System #2/5" },
            new Object[] { Integer.valueOf(61473), "Engine Speed Sensor Information" },
            new Object[] { Integer.valueOf(61474), "Machine Selected Speed" },
            new Object[] { Integer.valueOf(61475), "Aftertreatment 1 SCR Dosing System Information 1" },
            new Object[] { Integer.valueOf(61476), "Aftertreatment 1 SCR Dosing System Requests 1" },
            new Object[] { Integer.valueOf(61477), "Aftertreatment 1 SCR Ammonia Information" },
            new Object[] { Integer.valueOf(61478), "Aftertreatment 2 SCR Dosing System Information 1" },
            new Object[] { Integer.valueOf(61479), "Aftertreatment 2 SCR Dosing System Requests 1" },
            new Object[] { Integer.valueOf(61480), "Aftertreatment 2 SCR Ammonia Information" },
            new Object[] { Integer.valueOf(61481), "Slope Sensor Information 2" },
            new Object[] { Integer.valueOf(61482), "Angular Rate Information" },
            new Object[] { Integer.valueOf(61483), "Crash Notification" },
            new Object[] { Integer.valueOf(61484), "Magnet Status Information 2" },
            new Object[] { Integer.valueOf(64769), "LVD Status" },
            new Object[] { Integer.valueOf(64770), "All implements stop operations switch state" },
            new Object[] { Integer.valueOf(64771), "Implement Operating State Command" },
            new Object[] { Integer.valueOf(64772), "Direct Lamp Control Data 2" },
            new Object[] { Integer.valueOf(64773), "Direct Lamp Control Data 1" },
            new Object[] { Integer.valueOf(64774), "Direct Lamp Control Command 2" },
            new Object[] { Integer.valueOf(64775), "Direct Lamp Control Command 1" },
            new Object[] { Integer.valueOf(64776), "Engine oil message" },
            new Object[] { Integer.valueOf(64777), "High Resolution Fuel Consumption (Liquid)" },
            new Object[] { Integer.valueOf(64778), "Aftertreatment 2 Outlet Gas NOx Sensor correction data 2" },
            new Object[] { Integer.valueOf(64779), "Aftertreatment 2 Outlet Gas NOx Sensor correction data" },
            new Object[] { Integer.valueOf(64780), "Aftertreatment 2 Intake Gas NOx Sensor correction data 2" },
            new Object[] { Integer.valueOf(64781), "Aftertreatment 2 Intake Gas NOx Sensor correction data" },
            new Object[] { Integer.valueOf(64782), "Aftertreatment 1 Outlet Gas NOx Sensor correction data 2" },
            new Object[] { Integer.valueOf(64783), "Aftertreatment 1 Outlet Gas NOx Sensor correction data" },
            new Object[] { Integer.valueOf(64784), "Aftertreatment 1 Intake Gas NOx Sensor correction data 2" },
            new Object[] { Integer.valueOf(64785), "Aftertreatment 1 Intake Gas  NOx Sensor correction data" },
            new Object[] { Integer.valueOf(64786), "Magnet Status Information 1" },
            new Object[] { Integer.valueOf(64787), "Magnet System Configuration Information" },
            new Object[] { Integer.valueOf(64788), "Battery Charger 2" },
            new Object[] { Integer.valueOf(64789), "Battery Charger 1" },
            new Object[] { Integer.valueOf(64790), "Occupant Classification System Information" },
            new Object[] { Integer.valueOf(64791), "Beltlock and Airbag Deactivation Switch Information" },
            new Object[] { Integer.valueOf(64792), "Collision Sensor Information" },
            new Object[] { Integer.valueOf(64793), "Ignitor Loop Information" },
            new Object[] { Integer.valueOf(64794), "Aftertreatment 1 Warm Up Diesel Oxidation Catalyst Information" },
            new Object[] { Integer.valueOf(64795), "Diesel Particulate Filter 2 Soot" },
            new Object[] { Integer.valueOf(64796), "Diesel Particulate Filter 1 Soot" },
            new Object[] { Integer.valueOf(64797), "Aftertreatment Differential Temperature 2 " },
            new Object[] { Integer.valueOf(64798), "Aftertreatment Differential Temperature 1 " },
            new Object[] { Integer.valueOf(64799), "Aftertreatment 2 Diesel Oxidation Catalyst" },
            new Object[] { Integer.valueOf(64800), "Aftertreatment 1 Diesel Oxidation Catalyst" },
            new Object[] { Integer.valueOf(64801), "Aftertreatment 2 Gas Oxidation Catalyst" },
            new Object[] { Integer.valueOf(64802), "Aftertreatment 1 Gas Oxidation Catalyst" },
            new Object[] { Integer.valueOf(64803), "Extended Joystick Message 10" },
            new Object[] { Integer.valueOf(64804), "Basic Joystick Message 10" },
            new Object[] { Integer.valueOf(64805), "Extended Joystick Message 9" },
            new Object[] { Integer.valueOf(64806), "Basic Joystick Message 9" },
            new Object[] { Integer.valueOf(64807), "Extended Joystick Message 8" },
            new Object[] { Integer.valueOf(64808), "Basic Joystick Message 8" },
            new Object[] { Integer.valueOf(64809), "Extended Joystick Message 7" },
            new Object[] { Integer.valueOf(64810), "Basic Joystick Message 7" },
            new Object[] { Integer.valueOf(64811), "Extended Joystick Message 6" },
            new Object[] { Integer.valueOf(64812), "Basic Joystick Message 6" },
            new Object[] { Integer.valueOf(64813), "Extended Joystick Message 5" },
            new Object[] { Integer.valueOf(64814), "Basic Joystick Message 5" },
            new Object[] { Integer.valueOf(64815), "Extended Joystick Message 4" },
            new Object[] { Integer.valueOf(64816), "Basic Joystick Message 4" },
            new Object[] { Integer.valueOf(64819), "Aftertreatment 2 SCR Reagent Supply Information" },
            new Object[] { Integer.valueOf(64820), "Aftertreatment 2 SCR Reagant Tank 2 Information" },
            new Object[] { Integer.valueOf(64821), "Aftertreatment 2 SCR Reagant Tank 1 Information" },
            new Object[] { Integer.valueOf(64822), "Aftertreatment 2 SCR Reagent Information" },
            new Object[] { Integer.valueOf(64823), "Aftertreatment 2 SCR Service Information" },
            new Object[] { Integer.valueOf(64824), "Aftertreatment 2 SCR Exhaust Gas Temperature" },
            new Object[] { Integer.valueOf(64825), "Aftertreatment 2 SCR Exhaust Gas Pressures" },
            new Object[] { Integer.valueOf(64826), "Aftertreatment 2 SCR Dosing System Requests 2" },
            new Object[] { Integer.valueOf(64827), "Aftertreatment 2 SCR Dosing System Information 2" },
            new Object[] { Integer.valueOf(64828), "Aftertreatment 1 SCR Reagent Supply Information" },
            new Object[] { Integer.valueOf(64829), "Aftertreatment 1 SCR Reagant Tank 2 Information" },
            new Object[] { Integer.valueOf(64830), "Aftertreatment 1 SCR Exhaust Gas Temperature" },
            new Object[] { Integer.valueOf(64831), "Aftertreatment 1 SCR Exhaust Gas Pressures" },
            new Object[] { Integer.valueOf(64832), "Aftertreatment 1 SCR Dosing System Requests 2" },
            new Object[] { Integer.valueOf(64833), "Aftertreatment 1 SCR Dosing System Information 2" },
            new Object[] { Integer.valueOf(64834), "ISOBUS compliance certification" },
            new Object[] { Integer.valueOf(64835), "Machine Selected Speed Command" },
            new Object[] { Integer.valueOf(64836), "Aftertreatment 2 Fuel Control 2" },
            new Object[] { Integer.valueOf(64837), "Aftertreatment 2 Three Way Catalytic Converter" },
            new Object[] { Integer.valueOf(64838), "Aftertreatment 1 Three Way Catalytic Converter" },
            new Object[] { Integer.valueOf(64839), "Transmission Mode Labels" },
            new Object[] { Integer.valueOf(64840), "Engine Exhaust Bank 2 O2 Fuel Trim" },
            new Object[] { Integer.valueOf(64841), "Engine Exhaust Bank 1 O2 Fuel Trim" },
            new Object[] { Integer.valueOf(64842), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64843), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64844), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64845), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64846), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64847), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64848), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(64849), "Aftercooler Coolant Control Valve Command" },
            new Object[] { Integer.valueOf(64850), "Engine Coolant Control Valve Command" },
            new Object[] { Integer.valueOf(64851), "Engine Average Information" },
            new Object[] { Integer.valueOf(64852), "DTCs - C, Previously Active" },
            new Object[] { Integer.valueOf(64853), "DTCs - C, Confirmed and Active" },
            new Object[] { Integer.valueOf(64854), "DTCs - C, Pending" },
            new Object[] { Integer.valueOf(64855), "DTCs - B2, Previously Active" },
            new Object[] { Integer.valueOf(64856), "DTCs - B2, Confirmed and Active" },
            new Object[] { Integer.valueOf(64857), "DTCs - B2, Pending" },
            new Object[] { Integer.valueOf(64858), "DTCs - B1, Previously Active" },
            new Object[] { Integer.valueOf(64859), "DTCs - B1, Confirmed and Active" },
            new Object[] { Integer.valueOf(64860), "DTCs - B1, Pending" },
            new Object[] { Integer.valueOf(64861), "DTCs - A, Previously Active" },
            new Object[] { Integer.valueOf(64862), "DTCs - A, Confirmed and Active" },
            new Object[] { Integer.valueOf(64863), "DTCs - A, Pending" },
            new Object[] { Integer.valueOf(64864), "Harmonized B1 Failure Counts (HB1C)" },
            new Object[] { Integer.valueOf(64865), "Cumulative Continuous MI – System (HCMI) " },
            new Object[] { Integer.valueOf(64866), "Harmonized Global Regulation Description (HGRD)" },
            new Object[] { Integer.valueOf(64867), " Harmonized Roadworthiness – System (HRWS)" },
            new Object[] { Integer.valueOf(64868), "Harmonized Roadworthiness - Vehicle (HRWV)" },
            new Object[] { Integer.valueOf(64869), "Aftertreatment 1 Fuel Control 2" },
            new Object[] { Integer.valueOf(64870), "Engine Temperature 4" },
            new Object[] { Integer.valueOf(64871), "Zero Net Vehicle Weight Change" },
            new Object[] { Integer.valueOf(64872), "Gross Combination Vehicle Weight" },
            new Object[] { Integer.valueOf(64873), "Axle Group Calibration Weights" },
            new Object[] { Integer.valueOf(64874), "Axle Group Weight" },
            new Object[] { Integer.valueOf(64875), "Available Axle Group Weights" },
            new Object[] { Integer.valueOf(64876), "Aftertreatment 2 Air Control 2" },
            new Object[] { Integer.valueOf(64877), "Aftertreatment 1 Air Control 2" },
            new Object[] { Integer.valueOf(64878), "Aftertreatment 1 SCR Service Information" },
            new Object[] { Integer.valueOf(64879), "Electronic Engine Controller 8" },
            new Object[] { Integer.valueOf(64880), "Door ramp control" },
            new Object[] { Integer.valueOf(64881), "Brake actuator stroke status" },
            new Object[] { Integer.valueOf(64882), "Engine Spark Voltage 6" },
            new Object[] { Integer.valueOf(64883), "Engine Spark Voltage 5" },
            new Object[] { Integer.valueOf(64884), "Engine Spark Voltage 4" },
            new Object[] { Integer.valueOf(64885), "Engine Spark Voltage 3" },
            new Object[] { Integer.valueOf(64886), "Engine Spark Voltage 2" },
            new Object[] { Integer.valueOf(64887), "Engine Spark Voltage 1" },
            new Object[] { Integer.valueOf(64888), "Aftertreatment 2 Trip Information" },
            new Object[] { Integer.valueOf(64889), "Aftertreatment 1 Trip Information" },
            new Object[] { Integer.valueOf(64890), "Aftertreatment 2 Service" },
            new Object[] { Integer.valueOf(64891), "Aftertreatment 1 Service" },
            new Object[] { Integer.valueOf(64892), "Diesel Particulate Filter Control 1" },
            new Object[] { Integer.valueOf(64894), "Adaptive Front-Lighting System Status" },
            new Object[] { Integer.valueOf(64895), "Engine Configuration 2" },
            new Object[] { Integer.valueOf(64896), "Permanent DTCs" },
            new Object[] { Integer.valueOf(64897), "EGR Cooler Bypass" },
            new Object[] { Integer.valueOf(64898), "All Pending DTCs" },
            new Object[] { Integer.valueOf(64899), "Transfer Case Information" },
            new Object[] { Integer.valueOf(64900), "Engine Fluid Level/Pressure 9" },
            new Object[] { Integer.valueOf(64901), "Engine Fluid Level/Pressure 8" },
            new Object[] { Integer.valueOf(64902), "Engine Fluid Level/Pressure 7" },
            new Object[] { Integer.valueOf(64903), "Engine Fluid Level/Pressure 6" },
            new Object[] { Integer.valueOf(64904), "Engine Fluid Level/Pressure 5" },
            new Object[] { Integer.valueOf(64905), "Vehicle Direction/Speed 2" },
            new Object[] { Integer.valueOf(64906), "SAE J2012 DTC Display" },
            new Object[] { Integer.valueOf(64907), "Aftertreatment 2 Gas Parameters" },
            new Object[] { Integer.valueOf(64908), "Aftertreatment 1 Gas Parameters" },
            new Object[] { Integer.valueOf(64909), "Utility Total AC Reactive Energy" },
            new Object[] { Integer.valueOf(64910), "Generator Total AC Reactive Energy" },
            new Object[] { Integer.valueOf(64911), "Generator Total AC Percent Power" },
            new Object[] { Integer.valueOf(64912), "Advertised Engine Torque Curve" },
            new Object[] { Integer.valueOf(64913), "AC Switching Device Status" },
            new Object[] { Integer.valueOf(64914), "Engine Operating Information" },
            new Object[] { Integer.valueOf(64915), "Generator Control 1" },
            new Object[] { Integer.valueOf(64916), "Electronic Engine Controller 7" },
            new Object[] { Integer.valueOf(64917), "Transmission Fluids 2" },
            new Object[] { Integer.valueOf(64920), "Aftertreatment 1 Historical Information" },
            new Object[] { Integer.valueOf(64921), "Aftertreatment 2 Historical information" },
            new Object[] { Integer.valueOf(64922), "Electronic Brake System #2/4" },
            new Object[] { Integer.valueOf(64923), "Aftertreatment 1 SCR Reagent Information" },
            new Object[] { Integer.valueOf(64924), "Sensor Electrical Power #2" },
            new Object[] { Integer.valueOf(64925), "Sensor Electrical Power #1" },
            new Object[] { Integer.valueOf(64926), "Aftertreatment 2 Air Control 1" },
            new Object[] { Integer.valueOf(64927), "Aftertreatment 1 Air Control 1" },
            new Object[] { Integer.valueOf(64928), "Aftertreatment 2 Fuel Control 1" },
            new Object[] { Integer.valueOf(64929), "Aftertreatment 1 Fuel Control 1" },
            new Object[] { Integer.valueOf(64930), "Fuel Information 3 (Gaseous)" },
            new Object[] { Integer.valueOf(64931), "Electronic Engine Controller 6" },
            new Object[] { Integer.valueOf(64932), "PTO Drive Engagement" },
            new Object[] { Integer.valueOf(64933), "Door Control 2" },
            new Object[] { Integer.valueOf(64934), "Voltage Regulator Excitation Status" },
            new Object[] { Integer.valueOf(64935), "Voltage Regulator Operating Mode" },
            new Object[] { Integer.valueOf(64936), "Wireless Communications Message 2" },
            new Object[] { Integer.valueOf(64937), "Wireless Communications Message 1" },
            new Object[] { Integer.valueOf(64938), "Engine Fluid Level/Pressure 4" },
            new Object[] { Integer.valueOf(64939), "Request For Complete Configurable Message Set" },
            new Object[] { Integer.valueOf(64941), "Request For Complete Configurable Message Set" },
            new Object[] { Integer.valueOf(64942), "Fifth Wheel Smart Systems 2" },
            new Object[] { Integer.valueOf(64943), "Aftertreatment 2 Intermediate Gas" },
            new Object[] { Integer.valueOf(64944), "Aftertreatment 2 Outlet Gas 2" },
            new Object[] { Integer.valueOf(64945), "Aftertreatment 2 Intake Gas 2" },
            new Object[] { Integer.valueOf(64946), "Aftertreatment 1 Intermediate Gas" },
            new Object[] { Integer.valueOf(64947), "Aftertreatment 1 Outlet Gas 2" },
            new Object[] { Integer.valueOf(64948), "Aftertreatment 1 Intake Gas 2" },
            new Object[] { Integer.valueOf(64949), "Previously Active Emission Related Faults" },
            new Object[] { Integer.valueOf(64950), "SPN Support" },
            new Object[] { Integer.valueOf(64951), "Expanded Freeze Frame" },
            new Object[] { Integer.valueOf(64952), "Diagnostic Readiness 3" },
            new Object[] { Integer.valueOf(64953), "Tire Pressure Reference Information" },
            new Object[] { Integer.valueOf(64954), "Farebox Status" },
            new Object[] { Integer.valueOf(64955), "Farebox Point of Sale" },
            new Object[] { Integer.valueOf(64956), "Farebox Service Detail" },
            new Object[] { Integer.valueOf(64957), "Signal Preemption" },
            new Object[] { Integer.valueOf(64958), "Transit Route" },
            new Object[] { Integer.valueOf(64959), "Transit Milepost" },
            new Object[] { Integer.valueOf(64960), "Passenger Counter" },
            new Object[] { Integer.valueOf(64961), "Engine Fluid Level/Pressure 3" },
            new Object[] { Integer.valueOf(64964), "Electronic Brake Controller 5" },
            new Object[] { Integer.valueOf(64965), "ECU Identification Information" },
            new Object[] { Integer.valueOf(64966), "Cold Start Aids" },
            new Object[] { Integer.valueOf(64967), "Off-Highway Engine Control Selection States" },
            new Object[] { Integer.valueOf(64968), "Operator Primary Intermediate Speed Control state" },
            new Object[] { Integer.valueOf(64969), "Electronic Control Module Information" },
            new Object[] { Integer.valueOf(64970), "Intermediate Speed Control" },
            new Object[] { Integer.valueOf(64971), "Off-Highway Engine Control Selection" },
            new Object[] { Integer.valueOf(64972), "Operators External Light Controls Message" },
            new Object[] { Integer.valueOf(64973), "Operator Wiper and Washer Controls Message" },
            new Object[] { Integer.valueOf(64974), "Working Set Member Message" },
            new Object[] { Integer.valueOf(64975), "Working Set Master Message" },
            new Object[] { Integer.valueOf(64976), "Inlet/Exhaust Conditions 2" },
            new Object[] { Integer.valueOf(64977), "FMS-standard Interface Identity/Capabilities" },
            new Object[] { Integer.valueOf(64978), "ECU Performance" },
            new Object[] { Integer.valueOf(64979), "Turbocharger Information 6" },
            new Object[] { Integer.valueOf(64980), "Cab Message 3" },
            new Object[] { Integer.valueOf(64981), "Electronic Engine Controller 5" },
            new Object[] { Integer.valueOf(64982), "Basic Joystick Message 1" },
            new Object[] { Integer.valueOf(64983), "Extended Joystick Message 1" },
            new Object[] { Integer.valueOf(64984), "Basic Joystick Message 2" },
            new Object[] { Integer.valueOf(64985), "Extended Joystick Message 2" },
            new Object[] { Integer.valueOf(64986), "Basic Joystick Message 3" },
            new Object[] { Integer.valueOf(64987), "Extended Joystick Message 3" },
            new Object[] { Integer.valueOf(64988), "Marine Control Information" },
            new Object[] { Integer.valueOf(64989), "ISO 11992 Military Application Tractor - Trailer Message" },
            new Object[] { Integer.valueOf(64990),
                    "ISO 11992 Military Application Trailer - Tractor Feedback Message" },
            new Object[] { Integer.valueOf(64991), "Front Wheel Drive Status" },
            new Object[] { Integer.valueOf(64992), "Ambient Conditions 2" },
            new Object[] { Integer.valueOf(64993), "Cab A/C Climate System Information" },
            new Object[] { Integer.valueOf(64994), "Supply Pressure Demand" },
            new Object[] { Integer.valueOf(64995), "Equipment Operation and Control" },
            new Object[] { Integer.valueOf(64996), "Equipment Performance Data" },
            new Object[] { Integer.valueOf(64997), "Maximum Vehicle Speed Limit Status" },
            new Object[] { Integer.valueOf(64998), "Hydraulic Braking System" },
            new Object[] { Integer.valueOf(64999), "Bus #1/Utility Sync Check Status" },
            new Object[] { Integer.valueOf(65000), "Bus #1/Generator Sync Check Status" },
            new Object[] { Integer.valueOf(65001), "Bus #1 Phase C  Basic AC Quantities" },
            new Object[] { Integer.valueOf(65002), "Bus #1 Phase B  Basic AC Quantities" },
            new Object[] { Integer.valueOf(65003), "Bus #1 Phase A  Basic AC Quantities" },
            new Object[] { Integer.valueOf(65004), "Bus #1 Average Basic AC Quantities" },
            new Object[] { Integer.valueOf(65005), "Utility Total AC Energy" },
            new Object[] { Integer.valueOf(65006), "Utility Phase C AC Reactive Power" },
            new Object[] { Integer.valueOf(65007), "Utility Phase C AC Power" },
            new Object[] { Integer.valueOf(65008), "Utility Phase C AC Basic Quantities" },
            new Object[] { Integer.valueOf(65009), "Utility Phase B AC Reactive Power" },
            new Object[] { Integer.valueOf(65010), "Utility Phase B AC Power" },
            new Object[] { Integer.valueOf(65011), "Utility Phase B AC Basic Quantities" },
            new Object[] { Integer.valueOf(65012), "Utility Phase A  AC Reactive Power" },
            new Object[] { Integer.valueOf(65013), "Utility Phase A  AC Power" },
            new Object[] { Integer.valueOf(65014), "Utility Phase A Basic AC Quantities" },
            new Object[] { Integer.valueOf(65015), "Utility Total AC Reactive Power" },
            new Object[] { Integer.valueOf(65016), "Utility Total AC Power" },
            new Object[] { Integer.valueOf(65017), "Utility Average Basic AC Quantities" },
            new Object[] { Integer.valueOf(65018), "Generator Total AC Energy" },
            new Object[] { Integer.valueOf(65019), "Generator Phase C AC Reactive Power" },
            new Object[] { Integer.valueOf(65020), "Generator Phase C AC Power" },
            new Object[] { Integer.valueOf(65021), "Generator Phase C Basic AC Quantities" },
            new Object[] { Integer.valueOf(65022), "Generator Phase B AC Reactive Power" },
            new Object[] { Integer.valueOf(65023), "Generator Phase B AC Power" },
            new Object[] { Integer.valueOf(65024), "Generator Phase B Basic AC Quantities" },
            new Object[] { Integer.valueOf(65025), "Generator Phase A AC Reactive Power" },
            new Object[] { Integer.valueOf(65026), "Generator Phase A AC Power" },
            new Object[] { Integer.valueOf(65027), "Generator Phase A Basic AC Quantities" },
            new Object[] { Integer.valueOf(65028), "Generator Total AC Reactive Power" },
            new Object[] { Integer.valueOf(65029), "Generator Total AC Power" },
            new Object[] { Integer.valueOf(65030), "Generator Average Basic AC Quantities" },
            new Object[] { Integer.valueOf(65031), "Exhaust Temperature" },
            new Object[] { Integer.valueOf(65032), "Required Tractor Facilities message" },
            new Object[] { Integer.valueOf(65033), "Tractor Facilities response message" },
            new Object[] { Integer.valueOf(65034), "Implement Remote Control Command Tractor Response" },
            new Object[] { Integer.valueOf(65035), "Implement Remote Control Command" },
            new Object[] { Integer.valueOf(65036), "Working Set Member" },
            new Object[] { Integer.valueOf(65037), "Working Set Master" },
            new Object[] { Integer.valueOf(65038), "Response for Repetition Rate" },
            new Object[] { Integer.valueOf(65039), "Language Command" },
            new Object[] { Integer.valueOf(65040), "Auxiliary Valve Number 0 Estimated Flow" },
            new Object[] { Integer.valueOf(65041), "Auxiliary Valve Number 1 Estimated Flow" },
            new Object[] { Integer.valueOf(65042), "Auxiliary Valve Number 2 Estimated Flow" },
            new Object[] { Integer.valueOf(65043), "Auxiliary Valve Number 3 Estimated Flow" },
            new Object[] { Integer.valueOf(65044), "Auxiliary Valve Number 4 Estimated Flow" },
            new Object[] { Integer.valueOf(65045), "Auxiliary Valve Number 5 Estimated Flow" },
            new Object[] { Integer.valueOf(65046), "Auxiliary Valve Number 6 Estimated Flow" },
            new Object[] { Integer.valueOf(65047), "Auxiliary Valve Number 7 Estimated Flow" },
            new Object[] { Integer.valueOf(65048), "Auxiliary Valve Number 8 Estimated Flow" },
            new Object[] { Integer.valueOf(65049), "Auxiliary Valve Number 9 Estimated Flow" },
            new Object[] { Integer.valueOf(65050), "Auxiliary Valve Number 10 Estimated Flow" },
            new Object[] { Integer.valueOf(65051), "Auxiliary Valve Number 11 Estimated Flow" },
            new Object[] { Integer.valueOf(65052), "Auxiliary Valve Number 12 Estimated Flow" },
            new Object[] { Integer.valueOf(65053), "Auxiliary Valve Number 13 Estimated Flow" },
            new Object[] { Integer.valueOf(65054), "Auxiliary Valve Number 14 Estimated Flow" },
            new Object[] { Integer.valueOf(65055), "Auxiliary Valve Number 15 Estimated Flow" },
            new Object[] { Integer.valueOf(65056), "Auxiliary Valve Number 0 Measured Flow" },
            new Object[] { Integer.valueOf(65057), "Auxiliary Valve Number 1 Measured Flow" },
            new Object[] { Integer.valueOf(65058), "Auxiliary Valve Number 2 Measured Flow" },
            new Object[] { Integer.valueOf(65059), "Auxiliary Valve Number 3 Measured Flow" },
            new Object[] { Integer.valueOf(65060), "Auxiliary Valve Number 4 Measured Flow" },
            new Object[] { Integer.valueOf(65061), "Auxiliary Valve Number 5 Measured Flow" },
            new Object[] { Integer.valueOf(65062), "Auxiliary Valve Number 6 Measured Flow" },
            new Object[] { Integer.valueOf(65063), "Auxiliary Valve Number 7 Measured Flow" },
            new Object[] { Integer.valueOf(65064), "Auxiliary Valve Number 8 Measured Flow" },
            new Object[] { Integer.valueOf(65065), "Auxiliary Valve Number 9 Measured Flow" },
            new Object[] { Integer.valueOf(65066), "Auxiliary Valve Number 10 Measured Flow" },
            new Object[] { Integer.valueOf(65067), "Auxiliary Valve Number 11 Measured Flow" },
            new Object[] { Integer.valueOf(65068), "Auxiliary Valve Number 12 Measured Flow" },
            new Object[] { Integer.valueOf(65069), "Auxiliary Valve Number 13 Measured Flow" },
            new Object[] { Integer.valueOf(65070), "Auxiliary Valve Number 14 Measured Flow" },
            new Object[] { Integer.valueOf(65071), "Auxiliary Valve Number 15 Measured Flow" },
            new Object[] { Integer.valueOf(65072), "Auxiliary Valve Number 0 Command" },
            new Object[] { Integer.valueOf(65073), "Auxiliary Valve Number 1 Command" },
            new Object[] { Integer.valueOf(65074), "Auxiliary Valve Number 2 Command" },
            new Object[] { Integer.valueOf(65075), "Auxiliary Valve Number 3 Command" },
            new Object[] { Integer.valueOf(65076), "Auxiliary Valve Number 4 Command" },
            new Object[] { Integer.valueOf(65077), "Auxiliary Valve Number 5 Command" },
            new Object[] { Integer.valueOf(65078), "Auxiliary Valve Number 6 Command" },
            new Object[] { Integer.valueOf(65079), "Auxiliary Valve Number 7 Command" },
            new Object[] { Integer.valueOf(65080), "Auxiliary Valve Number 8 Command" },
            new Object[] { Integer.valueOf(65081), "Auxiliary Valve Number 9 Command" },
            new Object[] { Integer.valueOf(65082), "Auxiliary Valve Number 10 Command" },
            new Object[] { Integer.valueOf(65083), "Auxiliary Valve Number 11 Command" },
            new Object[] { Integer.valueOf(65084), "Auxiliary Valve Number 12 Command" },
            new Object[] { Integer.valueOf(65085), "Auxiliary Valve Number 13 Command" },
            new Object[] { Integer.valueOf(65086), "Auxiliary Valve Number 14 Command" },
            new Object[] { Integer.valueOf(65087), "Auxiliary Valve Number 15 Command" },
            new Object[] { Integer.valueOf(65088), "Lighting Data" },
            new Object[] { Integer.valueOf(65089), "Lighting Command" },
            new Object[] { Integer.valueOf(65090), "Hitch and PTO Commands" },
            new Object[] { Integer.valueOf(65091), "Primary or Rear Power Take off Output Shaft" },
            new Object[] { Integer.valueOf(65092), "Secondary or Front Power Take off Output Shaft" },
            new Object[] { Integer.valueOf(65093), "Primary or Rear Hitch Status" },
            new Object[] { Integer.valueOf(65094), "Secondary or Front Hitch Status" },
            new Object[] { Integer.valueOf(65095), "Maintain Power" },
            new Object[] { Integer.valueOf(65096), "Wheel-based Speed and Distance" },
            new Object[] { Integer.valueOf(65097), "Ground-based Speed and Distance" },
            new Object[] { Integer.valueOf(65098), "Electronic Transmission Controller 7" },
            new Object[] { Integer.valueOf(65099), "Transmission Configuration 2" },
            new Object[] { Integer.valueOf(65100), "Military Lighting Command" },
            new Object[] { Integer.valueOf(65101), "Total Averaged Information" },
            new Object[] { Integer.valueOf(65102), "Door Control 1" },
            new Object[] { Integer.valueOf(65103), "Vehicle Dynamic Stability Control 1" },
            new Object[] { Integer.valueOf(65104), "Battery Temperature" },
            new Object[] { Integer.valueOf(65105), "Adaptive Cruise Control, Operator Input" },
            new Object[] { Integer.valueOf(65106), "Vehicle Electrical Power #3" },
            new Object[] { Integer.valueOf(65107), "Retarder Continuous Torque & Speed Limit" },
            new Object[] { Integer.valueOf(65108), "Engine Continuous Torque & Speed Limit" },
            new Object[] { Integer.valueOf(65109), "Gaseous Fuel Properties" },
            new Object[] { Integer.valueOf(65110), "Aftertreatment 1 SCR Reagent Tank 1 Information" },
            new Object[] { Integer.valueOf(65111), "Air Suspension Control 5" },
            new Object[] { Integer.valueOf(65112), "Air Suspension Control 4" },
            new Object[] { Integer.valueOf(65113), "Air Suspension Control 3" },
            new Object[] { Integer.valueOf(65114), "Air Suspension Control 1" },
            new Object[] { Integer.valueOf(65115), "Forward Lane Image" },
            new Object[] { Integer.valueOf(65116), "ISO 11992 (even) - Running Gear Equipment #2/2" },
            new Object[] { Integer.valueOf(65117), "ISO 11992 (odd) - General Purpose Message #1/2" },
            new Object[] { Integer.valueOf(65118), "ISO 11992 (even) - Running Gear Equipment #2/3" },
            new Object[] { Integer.valueOf(65119), "ISO 11992 (odd) - General Purpose Message #1/3" },
            new Object[] { Integer.valueOf(65120), "ISO 11992 (even) - General Purpose Message #2/3" },
            new Object[] { Integer.valueOf(65121), "ISO 11992 (odd) - General Purpose Message #1/4" },
            new Object[] { Integer.valueOf(65122), "ISO 11992 (even) - General Purpose Message #2/4" },
            new Object[] { Integer.valueOf(65123), "ISO 11992 (odd) - General Purpose Message #1/5" },
            new Object[] { Integer.valueOf(65124), "ISO 11992 (even) - General Purpose Message #2/5" },
            new Object[] { Integer.valueOf(65125), "ISO 11992 (odd) - General Purpose Message #1/6" },
            new Object[] { Integer.valueOf(65126), "Battery Main Switch Information" },
            new Object[] { Integer.valueOf(65127), "Climate Control Configuration" },
            new Object[] { Integer.valueOf(65128), "Vehicle Fluids" },
            new Object[] { Integer.valueOf(65129), "Engine Temperature 3" },
            new Object[] { Integer.valueOf(65130), "Engine Fuel/lube systems" },
            new Object[] { Integer.valueOf(65131), "Driver's Identification" },
            new Object[] { Integer.valueOf(65132), "Tachograph" },
            new Object[] { Integer.valueOf(65133), "Heater Information" },
            new Object[] { Integer.valueOf(65134), "High Resolution Wheel Speed" },
            new Object[] { Integer.valueOf(65135), "Adaptive Cruise Control" },
            new Object[] { Integer.valueOf(65136), "Combination Vehicle Weight" },
            new Object[] { Integer.valueOf(65137), "Laser Tracer Position" },
            new Object[] { Integer.valueOf(65138), "Laser Leveling System Blade Control" },
            new Object[] { Integer.valueOf(65139), "Laser Receiver Mast Position" },
            new Object[] { Integer.valueOf(65140), "Modify Leveling System Control Set Point" },
            new Object[] { Integer.valueOf(65141), "Laser Leveling System Vertical Deviation" },
            new Object[] { Integer.valueOf(65142), "Laser Leveling System Vertical Position Display Data" },
            new Object[] { Integer.valueOf(65143), "Auxiliary Pressures" },
            new Object[] { Integer.valueOf(65144), "Tire Pressure Control Unit Mode and Status" },
            new Object[] { Integer.valueOf(65145), "Tire Pressure Control Unit Target Pressures" },
            new Object[] { Integer.valueOf(65146), "Tire Pressure Control Unit Current Pressures" },
            new Object[] { Integer.valueOf(65147), "Combustion Time 1" },
            new Object[] { Integer.valueOf(65148), "Combustion Time 2" },
            new Object[] { Integer.valueOf(65149), "Combustion Time 3" },
            new Object[] { Integer.valueOf(65150), "Combustion Time 4" },
            new Object[] { Integer.valueOf(65151), "Combustion Time 5" },
            new Object[] { Integer.valueOf(65152), "Combustion Time 6" },
            new Object[] { Integer.valueOf(65153), "Fuel Information 2 (Gaseous)" },
            new Object[] { Integer.valueOf(65154), "Ignition Timing 1" },
            new Object[] { Integer.valueOf(65155), "Ignition Timing 2" },
            new Object[] { Integer.valueOf(65156), "Ignition Timing 3" },
            new Object[] { Integer.valueOf(65157), "Ignition Timing 4" },
            new Object[] { Integer.valueOf(65158), "Ignition Timing 5" },
            new Object[] { Integer.valueOf(65159), "Ignition Timing 6" },
            new Object[] { Integer.valueOf(65160), "Ignition Transformer Secondary Output 1" },
            new Object[] { Integer.valueOf(65161), "Ignition Transformer Secondary Output 2" },
            new Object[] { Integer.valueOf(65162), "Ignition Transformer Secondary Output 3" },
            new Object[] { Integer.valueOf(65163), "Gaseous Fuel Pressure" },
            new Object[] { Integer.valueOf(65164), "Auxiliary Analog Information" },
            new Object[] { Integer.valueOf(65165), "Vehicle Electrical Power #2" },
            new Object[] { Integer.valueOf(65166), "Service 2" },
            new Object[] { Integer.valueOf(65167), "Supply Pressure 2" },
            new Object[] { Integer.valueOf(65168), "Engine Torque History" },
            new Object[] { Integer.valueOf(65169), "Fuel Leakage" },
            new Object[] { Integer.valueOf(65170), "Engine Information" },
            new Object[] { Integer.valueOf(65171), "Engine Electrical System/Module Information" },
            new Object[] { Integer.valueOf(65172), "Engine Auxiliary Coolant" },
            new Object[] { Integer.valueOf(65173), "Rebuild Information" },
            new Object[] { Integer.valueOf(65174), "Turbocharger Wastegate" },
            new Object[] { Integer.valueOf(65175), "Turbocharger Information 5" },
            new Object[] { Integer.valueOf(65176), "Turbocharger Information 4" },
            new Object[] { Integer.valueOf(65177), "Turbocharger Information 3" },
            new Object[] { Integer.valueOf(65178), "Turbocharger Information 2" },
            new Object[] { Integer.valueOf(65179), "Turbocharger Information 1" },
            new Object[] { Integer.valueOf(65180), "Main Bearing Temperature 3" },
            new Object[] { Integer.valueOf(65181), "Main Bearing Temperature 2" },
            new Object[] { Integer.valueOf(65182), "Main Bearing Temperature 1" },
            new Object[] { Integer.valueOf(65183), "Exhaust Port Temperature 5" },
            new Object[] { Integer.valueOf(65184), "Exhaust Port Temperature 4" },
            new Object[] { Integer.valueOf(65185), "Exhaust Port Temperature 3" },
            new Object[] { Integer.valueOf(65186), "Exhaust Port Temperature 2" },
            new Object[] { Integer.valueOf(65187), "Exhaust Port Temperature 1" },
            new Object[] { Integer.valueOf(65188), "Engine Temperature 2" },
            new Object[] { Integer.valueOf(65189), "Intake Manifold Information 2" },
            new Object[] { Integer.valueOf(65190), "Intake Manifold Information 1" },
            new Object[] { Integer.valueOf(65191), "Alternator Temperature" },
            new Object[] { Integer.valueOf(65192), "Articulation Control" },
            new Object[] { Integer.valueOf(65193), "Exhaust Oxygen 1" },
            new Object[] { Integer.valueOf(65194), "Alternate Fuel 2" },
            new Object[] { Integer.valueOf(65195), "Electronic Transmission Controller 6" },
            new Object[] { Integer.valueOf(65196), "Wheel Brake Lining Remaining Information" },
            new Object[] { Integer.valueOf(65197), "Wheel Application Pressure High Range Information" },
            new Object[] { Integer.valueOf(65198), "Air Supply Pressure" },
            new Object[] { Integer.valueOf(65199), "Fuel Consumption (Gaseous)" },
            new Object[] { Integer.valueOf(65200), "Trip Time Information 2" },
            new Object[] { Integer.valueOf(65201), "ECU History" },
            new Object[] { Integer.valueOf(65202), "Fuel Information 1 (Gaseous)" },
            new Object[] { Integer.valueOf(65203), "Fuel Information (Liquid)" },
            new Object[] { Integer.valueOf(65204), "Trip Time Information 1" },
            new Object[] { Integer.valueOf(65205), "Trip Shutdown Information" },
            new Object[] { Integer.valueOf(65206), "Trip Vehicle Speed/Cruise Distance Information" },
            new Object[] { Integer.valueOf(65207), "Engine Speed/Load Factor Information" },
            new Object[] { Integer.valueOf(65208), "Trip Fuel Information (Gaseous)" },
            new Object[] { Integer.valueOf(65209), "Trip Fuel Information (Liquid)" },
            new Object[] { Integer.valueOf(65210), "Trip Distance Information" },
            new Object[] { Integer.valueOf(65211), "Trip Fan Information" },
            new Object[] { Integer.valueOf(65212), "Compression/Service Brake Information" },
            new Object[] { Integer.valueOf(65213), "Fan Drive" },
            new Object[] { Integer.valueOf(65214), "Electronic Engine Controller 4" },
            new Object[] { Integer.valueOf(65215), "Wheel Speed Information" },
            new Object[] { Integer.valueOf(65216), "Service Information" },
            new Object[] { Integer.valueOf(65217), "High Resolution Vehicle Distance" },
            new Object[] { Integer.valueOf(65218), "Electronic Retarder Controller 2" },
            new Object[] { Integer.valueOf(65219), "Electronic Transmission Controller 5" },
            new Object[] { Integer.valueOf(65220), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(65221), "Electronic Transmission Controller 4" },
            new Object[] { Integer.valueOf(65222), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(65223), "Electronic Transmission Controller 3" },
            new Object[] { Integer.valueOf(65224), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(65225), "Reserved for ISO 11992" },
            new Object[] { Integer.valueOf(65226), "Active Diagnostic Trouble Codes" },
            new Object[] { Integer.valueOf(65227), "Previously Active Diagnostic Trouble Codes" },
            new Object[] { Integer.valueOf(65228), "Diagnostics Data Clear/Reset for Previously Active DTCs" },
            new Object[] { Integer.valueOf(65229), "Freeze Frame Parameters" },
            new Object[] { Integer.valueOf(65230), "Diagnostic Readiness 1" },
            new Object[] { Integer.valueOf(65231), "Pending DTCs" },
            new Object[] { Integer.valueOf(65232), "Test Results for Non-continuously Monitored Systems" },
            new Object[] { Integer.valueOf(65233), "Oxygen Sensor Test Results" },
            new Object[] { Integer.valueOf(65234), "Non-continuously Monitored System Test Identifiers Support" },
            new Object[] { Integer.valueOf(65235), "Diagnostic Data Clear/Reset for Active DTCs" },
            new Object[] { Integer.valueOf(65236), "Emissions Related Active DTCs" },
            new Object[] { Integer.valueOf(65237), "Alternator Information" },
            new Object[] { Integer.valueOf(65238), "Reserved for Network Management" },
            new Object[] { Integer.valueOf(65240), "Commanded Address" },
            new Object[] { Integer.valueOf(65241), "Auxiliary Input/Output Status 1" },
            new Object[] { Integer.valueOf(65242), "Software Identification" },
            new Object[] { Integer.valueOf(65243), "Engine Fluid Level/Pressure 2" },
            new Object[] { Integer.valueOf(65244), "Idle Operation" },
            new Object[] { Integer.valueOf(65245), "Turbocharger" },
            new Object[] { Integer.valueOf(65246), "Air Start Pressure" },
            new Object[] { Integer.valueOf(65247), "Electronic Engine Controller 3" },
            new Object[] { Integer.valueOf(65248), "Vehicle Distance" },
            new Object[] { Integer.valueOf(65249), "Retarder Configuration" },
            new Object[] { Integer.valueOf(65250), "Transmission Configuration" },
            new Object[] { Integer.valueOf(65251), "Engine Configuration 1" },
            new Object[] { Integer.valueOf(65252), "Shutdown" },
            new Object[] { Integer.valueOf(65253), "Engine Hours, Revolutions" },
            new Object[] { Integer.valueOf(65254), "Time/Date" },
            new Object[] { Integer.valueOf(65255), "Vehicle Hours" },
            new Object[] { Integer.valueOf(65256), "Vehicle Direction/Speed" },
            new Object[] { Integer.valueOf(65257), "Fuel Consumption (Liquid)" },
            new Object[] { Integer.valueOf(65258), "Vehicle Weight" },
            new Object[] { Integer.valueOf(65259), "Component Identification" },
            new Object[] { Integer.valueOf(65260), "Vehicle Identification" },
            new Object[] { Integer.valueOf(65261), "Cruise Control/Vehicle Speed Setup" },
            new Object[] { Integer.valueOf(65262), "Engine Temperature 1" },
            new Object[] { Integer.valueOf(65263), "Engine Fluid Level/Pressure 1" },
            new Object[] { Integer.valueOf(65264), "Power Takeoff Information" },
            new Object[] { Integer.valueOf(65265), "Cruise Control/Vehicle Speed" },
            new Object[] { Integer.valueOf(65266), "Fuel Economy (Liquid)" },
            new Object[] { Integer.valueOf(65267), "Vehicle Position" },
            new Object[] { Integer.valueOf(65268), "Tire Condition" },
            new Object[] { Integer.valueOf(65269), "Ambient Conditions" },
            new Object[] { Integer.valueOf(65270), "Inlet/Exhaust Conditions 1" },
            new Object[] { Integer.valueOf(65271), "Vehicle Electrical Power 1" },
            new Object[] { Integer.valueOf(65272), "Transmission Fluids 1" },
            new Object[] { Integer.valueOf(65273), "Axle Information" },
            new Object[] { Integer.valueOf(65274), "Brakes" },
            new Object[] { Integer.valueOf(65275), "Retarder fluids" },
            new Object[] { Integer.valueOf(65276), "Dash Display" },
            new Object[] { Integer.valueOf(65277), "Alternate Fuel 1" },
            new Object[] { Integer.valueOf(65278), "Auxiliary Water Pump Pressure" },
            new Object[] { Integer.valueOf(65279), "Water in Fuel Indicator" },
            new Object[] { Integer.valueOf(65280), "Proprietary B (first entry)" },
            new Object[] { Integer.valueOf(65281), "Proprietary B" },
            new Object[] { Integer.valueOf(65282), "Proprietary B" },
            new Object[] { Integer.valueOf(65283), "Proprietary B" },
            new Object[] { Integer.valueOf(65284), "Proprietary B" },
            new Object[] { Integer.valueOf(65285), "Proprietary B" },
            new Object[] { Integer.valueOf(65286), "Proprietary B" },
            new Object[] { Integer.valueOf(65287), "Proprietary B" },
            new Object[] { Integer.valueOf(65288), "Proprietary B" },
            new Object[] { Integer.valueOf(65289), "Proprietary B" },
            new Object[] { Integer.valueOf(65290), "Proprietary B" },
            new Object[] { Integer.valueOf(65291), "Proprietary B" },
            new Object[] { Integer.valueOf(65292), "Proprietary B" },
            new Object[] { Integer.valueOf(65293), "Proprietary B" },
            new Object[] { Integer.valueOf(65294), "Proprietary B" },
            new Object[] { Integer.valueOf(65295), "Proprietary B" },
            new Object[] { Integer.valueOf(65296), "Proprietary B" },
            new Object[] { Integer.valueOf(65297), "Proprietary B" },
            new Object[] { Integer.valueOf(65298), "Proprietary B" },
            new Object[] { Integer.valueOf(65299), "Proprietary B" },
            new Object[] { Integer.valueOf(65300), "Proprietary B" },
            new Object[] { Integer.valueOf(65301), "Proprietary B" },
            new Object[] { Integer.valueOf(65302), "Proprietary B" },
            new Object[] { Integer.valueOf(65303), "Proprietary B" },
            new Object[] { Integer.valueOf(65304), "Proprietary B" },
            new Object[] { Integer.valueOf(65305), "Proprietary B" },
            new Object[] { Integer.valueOf(65306), "Proprietary B" },
            new Object[] { Integer.valueOf(65307), "Proprietary B" },
            new Object[] { Integer.valueOf(65308), "Proprietary B" },
            new Object[] { Integer.valueOf(65309), "Proprietary B" },
            new Object[] { Integer.valueOf(65310), "Proprietary B" },
            new Object[] { Integer.valueOf(65311), "Proprietary B" },
            new Object[] { Integer.valueOf(65312), "Proprietary B" },
            new Object[] { Integer.valueOf(65313), "Proprietary B" },
            new Object[] { Integer.valueOf(65314), "Proprietary B" },
            new Object[] { Integer.valueOf(65315), "Proprietary B" },
            new Object[] { Integer.valueOf(65316), "Proprietary B" },
            new Object[] { Integer.valueOf(65317), "Proprietary B" },
            new Object[] { Integer.valueOf(65318), "Proprietary B" },
            new Object[] { Integer.valueOf(65319), "Proprietary B" },
            new Object[] { Integer.valueOf(65320), "Proprietary B" },
            new Object[] { Integer.valueOf(65321), "Proprietary B" },
            new Object[] { Integer.valueOf(65322), "Proprietary B" },
            new Object[] { Integer.valueOf(65323), "Proprietary B" },
            new Object[] { Integer.valueOf(65324), "Proprietary B" },
            new Object[] { Integer.valueOf(65325), "Proprietary B" },
            new Object[] { Integer.valueOf(65326), "Proprietary B" },
            new Object[] { Integer.valueOf(65327), "Proprietary B" },
            new Object[] { Integer.valueOf(65328), "Proprietary B" },
            new Object[] { Integer.valueOf(65329), "Proprietary B" },
            new Object[] { Integer.valueOf(65330), "Proprietary B" },
            new Object[] { Integer.valueOf(65331), "Proprietary B" },
            new Object[] { Integer.valueOf(65332), "Proprietary B" },
            new Object[] { Integer.valueOf(65333), "Proprietary B" },
            new Object[] { Integer.valueOf(65334), "Proprietary B" },
            new Object[] { Integer.valueOf(65335), "Proprietary B" },
            new Object[] { Integer.valueOf(65336), "Proprietary B" },
            new Object[] { Integer.valueOf(65337), "Proprietary B" },
            new Object[] { Integer.valueOf(65338), "Proprietary B" },
            new Object[] { Integer.valueOf(65339), "Proprietary B" },
            new Object[] { Integer.valueOf(65340), "Proprietary B" },
            new Object[] { Integer.valueOf(65341), "Proprietary B" },
            new Object[] { Integer.valueOf(65342), "Proprietary B" },
            new Object[] { Integer.valueOf(65343), "Proprietary B" },
            new Object[] { Integer.valueOf(65344), "Proprietary B" },
            new Object[] { Integer.valueOf(65345), "Proprietary B" },
            new Object[] { Integer.valueOf(65346), "Proprietary B" },
            new Object[] { Integer.valueOf(65347), "Proprietary B" },
            new Object[] { Integer.valueOf(65348), "Proprietary B" },
            new Object[] { Integer.valueOf(65349), "Proprietary B" },
            new Object[] { Integer.valueOf(65350), "Proprietary B" },
            new Object[] { Integer.valueOf(65351), "Proprietary B" },
            new Object[] { Integer.valueOf(65352), "Proprietary B" },
            new Object[] { Integer.valueOf(65353), "Proprietary B" },
            new Object[] { Integer.valueOf(65354), "Proprietary B" },
            new Object[] { Integer.valueOf(65355), "Proprietary B" },
            new Object[] { Integer.valueOf(65356), "Proprietary B" },
            new Object[] { Integer.valueOf(65357), "Proprietary B" },
            new Object[] { Integer.valueOf(65358), "Proprietary B" },
            new Object[] { Integer.valueOf(65359), "Proprietary B" },
            new Object[] { Integer.valueOf(65360), "Proprietary B" },
            new Object[] { Integer.valueOf(65361), "Proprietary B" },
            new Object[] { Integer.valueOf(65362), "Proprietary B" },
            new Object[] { Integer.valueOf(65363), "Proprietary B" },
            new Object[] { Integer.valueOf(65364), "Proprietary B" },
            new Object[] { Integer.valueOf(65365), "Proprietary B" },
            new Object[] { Integer.valueOf(65366), "Proprietary B" },
            new Object[] { Integer.valueOf(65367), "Proprietary B" },
            new Object[] { Integer.valueOf(65368), "Proprietary B" },
            new Object[] { Integer.valueOf(65369), "Proprietary B" },
            new Object[] { Integer.valueOf(65370), "Proprietary B" },
            new Object[] { Integer.valueOf(65371), "Proprietary B" },
            new Object[] { Integer.valueOf(65372), "Proprietary B" },
            new Object[] { Integer.valueOf(65373), "Proprietary B" },
            new Object[] { Integer.valueOf(65374), "Proprietary B" },
            new Object[] { Integer.valueOf(65375), "Proprietary B" },
            new Object[] { Integer.valueOf(65376), "Proprietary B" },
            new Object[] { Integer.valueOf(65377), "Proprietary B" },
            new Object[] { Integer.valueOf(65378), "Proprietary B" },
            new Object[] { Integer.valueOf(65379), "Proprietary B" },
            new Object[] { Integer.valueOf(65380), "Proprietary B" },
            new Object[] { Integer.valueOf(65381), "Proprietary B" },
            new Object[] { Integer.valueOf(65382), "Proprietary B" },
            new Object[] { Integer.valueOf(65383), "Proprietary B" },
            new Object[] { Integer.valueOf(65384), "Proprietary B" },
            new Object[] { Integer.valueOf(65385), "Proprietary B" },
            new Object[] { Integer.valueOf(65386), "Proprietary B" },
            new Object[] { Integer.valueOf(65387), "Proprietary B" },
            new Object[] { Integer.valueOf(65388), "Proprietary B" },
            new Object[] { Integer.valueOf(65389), "Proprietary B" },
            new Object[] { Integer.valueOf(65390), "Proprietary B" },
            new Object[] { Integer.valueOf(65391), "Proprietary B" },
            new Object[] { Integer.valueOf(65392), "Proprietary B" },
            new Object[] { Integer.valueOf(65393), "Proprietary B" },
            new Object[] { Integer.valueOf(65394), "Proprietary B" },
            new Object[] { Integer.valueOf(65395), "Proprietary B" },
            new Object[] { Integer.valueOf(65396), "Proprietary B" },
            new Object[] { Integer.valueOf(65397), "Proprietary B" },
            new Object[] { Integer.valueOf(65398), "Proprietary B" },
            new Object[] { Integer.valueOf(65399), "Proprietary B" },
            new Object[] { Integer.valueOf(65400), "Proprietary B" },
            new Object[] { Integer.valueOf(65401), "Proprietary B" },
            new Object[] { Integer.valueOf(65402), "Proprietary B" },
            new Object[] { Integer.valueOf(65403), "Proprietary B" },
            new Object[] { Integer.valueOf(65404), "Proprietary B" },
            new Object[] { Integer.valueOf(65405), "Proprietary B" },
            new Object[] { Integer.valueOf(65406), "Proprietary B" },
            new Object[] { Integer.valueOf(65407), "Proprietary B" },
            new Object[] { Integer.valueOf(65408), "Proprietary B" },
            new Object[] { Integer.valueOf(65409), "Proprietary B" },
            new Object[] { Integer.valueOf(65410), "Proprietary B" },
            new Object[] { Integer.valueOf(65411), "Proprietary B" },
            new Object[] { Integer.valueOf(65412), "Proprietary B" },
            new Object[] { Integer.valueOf(65413), "Proprietary B" },
            new Object[] { Integer.valueOf(65414), "Proprietary B" },
            new Object[] { Integer.valueOf(65415), "Proprietary B" },
            new Object[] { Integer.valueOf(65416), "Proprietary B" },
            new Object[] { Integer.valueOf(65417), "Proprietary B" },
            new Object[] { Integer.valueOf(65418), "Proprietary B" },
            new Object[] { Integer.valueOf(65419), "Proprietary B" },
            new Object[] { Integer.valueOf(65420), "Proprietary B" },
            new Object[] { Integer.valueOf(65421), "Proprietary B" },
            new Object[] { Integer.valueOf(65422), "Proprietary B" },
            new Object[] { Integer.valueOf(65423), "Proprietary B" },
            new Object[] { Integer.valueOf(65424), "Proprietary B" },
            new Object[] { Integer.valueOf(65425), "Proprietary B" },
            new Object[] { Integer.valueOf(65426), "Proprietary B" },
            new Object[] { Integer.valueOf(65427), "Proprietary B" },
            new Object[] { Integer.valueOf(65428), "Proprietary B" },
            new Object[] { Integer.valueOf(65429), "Proprietary B" },
            new Object[] { Integer.valueOf(65430), "Proprietary B" },
            new Object[] { Integer.valueOf(65431), "Proprietary B" },
            new Object[] { Integer.valueOf(65432), "Proprietary B" },
            new Object[] { Integer.valueOf(65433), "Proprietary B" },
            new Object[] { Integer.valueOf(65434), "Proprietary B" },
            new Object[] { Integer.valueOf(65435), "Proprietary B" },
            new Object[] { Integer.valueOf(65436), "Proprietary B" },
            new Object[] { Integer.valueOf(65437), "Proprietary B" },
            new Object[] { Integer.valueOf(65438), "Proprietary B" },
            new Object[] { Integer.valueOf(65439), "Proprietary B" },
            new Object[] { Integer.valueOf(65440), "Proprietary B" },
            new Object[] { Integer.valueOf(65441), "Proprietary B" },
            new Object[] { Integer.valueOf(65442), "Proprietary B" },
            new Object[] { Integer.valueOf(65443), "Proprietary B" },
            new Object[] { Integer.valueOf(65444), "Proprietary B" },
            new Object[] { Integer.valueOf(65445), "Proprietary B" },
            new Object[] { Integer.valueOf(65446), "Proprietary B" },
            new Object[] { Integer.valueOf(65447), "Proprietary B" },
            new Object[] { Integer.valueOf(65448), "Proprietary B" },
            new Object[] { Integer.valueOf(65449), "Proprietary B" },
            new Object[] { Integer.valueOf(65450), "Proprietary B" },
            new Object[] { Integer.valueOf(65451), "Proprietary B" },
            new Object[] { Integer.valueOf(65452), "Proprietary B" },
            new Object[] { Integer.valueOf(65453), "Proprietary B" },
            new Object[] { Integer.valueOf(65454), "Proprietary B" },
            new Object[] { Integer.valueOf(65455), "Proprietary B" },
            new Object[] { Integer.valueOf(65456), "Proprietary B" },
            new Object[] { Integer.valueOf(65457), "Proprietary B" },
            new Object[] { Integer.valueOf(65458), "Proprietary B" },
            new Object[] { Integer.valueOf(65459), "Proprietary B" },
            new Object[] { Integer.valueOf(65460), "Proprietary B" },
            new Object[] { Integer.valueOf(65461), "Proprietary B" },
            new Object[] { Integer.valueOf(65462), "Proprietary B" },
            new Object[] { Integer.valueOf(65463), "Proprietary B" },
            new Object[] { Integer.valueOf(65464), "Proprietary B" },
            new Object[] { Integer.valueOf(65465), "Proprietary B" },
            new Object[] { Integer.valueOf(65466), "Proprietary B" },
            new Object[] { Integer.valueOf(65467), "Proprietary B" },
            new Object[] { Integer.valueOf(65468), "Proprietary B" },
            new Object[] { Integer.valueOf(65469), "Proprietary B" },
            new Object[] { Integer.valueOf(65470), "Proprietary B" },
            new Object[] { Integer.valueOf(65471), "Proprietary B" },
            new Object[] { Integer.valueOf(65472), "Proprietary B" },
            new Object[] { Integer.valueOf(65473), "Proprietary B" },
            new Object[] { Integer.valueOf(65474), "Proprietary B" },
            new Object[] { Integer.valueOf(65475), "Proprietary B" },
            new Object[] { Integer.valueOf(65476), "Proprietary B" },
            new Object[] { Integer.valueOf(65477), "Proprietary B" },
            new Object[] { Integer.valueOf(65478), "Proprietary B" },
            new Object[] { Integer.valueOf(65479), "Proprietary B" },
            new Object[] { Integer.valueOf(65480), "Proprietary B" },
            new Object[] { Integer.valueOf(65481), "Proprietary B" },
            new Object[] { Integer.valueOf(65482), "Proprietary B" },
            new Object[] { Integer.valueOf(65483), "Proprietary B" },
            new Object[] { Integer.valueOf(65484), "Proprietary B" },
            new Object[] { Integer.valueOf(65485), "Proprietary B" },
            new Object[] { Integer.valueOf(65486), "Proprietary B" },
            new Object[] { Integer.valueOf(65487), "Proprietary B" },
            new Object[] { Integer.valueOf(65488), "Proprietary B" },
            new Object[] { Integer.valueOf(65489), "Proprietary B" },
            new Object[] { Integer.valueOf(65490), "Proprietary B" },
            new Object[] { Integer.valueOf(65491), "Proprietary B" },
            new Object[] { Integer.valueOf(65492), "Proprietary B" },
            new Object[] { Integer.valueOf(65493), "Proprietary B" },
            new Object[] { Integer.valueOf(65494), "Proprietary B" },
            new Object[] { Integer.valueOf(65495), "Proprietary B" },
            new Object[] { Integer.valueOf(65496), "Proprietary B" },
            new Object[] { Integer.valueOf(65497), "Proprietary B" },
            new Object[] { Integer.valueOf(65498), "Proprietary B" },
            new Object[] { Integer.valueOf(65499), "Proprietary B" },
            new Object[] { Integer.valueOf(65500), "Proprietary B" },
            new Object[] { Integer.valueOf(65501), "Proprietary B" },
            new Object[] { Integer.valueOf(65502), "Proprietary B" },
            new Object[] { Integer.valueOf(65503), "Proprietary B" },
            new Object[] { Integer.valueOf(65504), "Proprietary B" },
            new Object[] { Integer.valueOf(65505), "Proprietary B" },
            new Object[] { Integer.valueOf(65506), "Proprietary B" },
            new Object[] { Integer.valueOf(65507), "Proprietary B" },
            new Object[] { Integer.valueOf(65508), "Proprietary B" },
            new Object[] { Integer.valueOf(65509), "Proprietary B" },
            new Object[] { Integer.valueOf(65510), "Proprietary B" },
            new Object[] { Integer.valueOf(65511), "Proprietary B" },
            new Object[] { Integer.valueOf(65512), "Proprietary B" },
            new Object[] { Integer.valueOf(65513), "Proprietary B" },
            new Object[] { Integer.valueOf(65514), "Proprietary B" },
            new Object[] { Integer.valueOf(65515), "Proprietary B" },
            new Object[] { Integer.valueOf(65516), "Proprietary B" },
            new Object[] { Integer.valueOf(65517), "Proprietary B" },
            new Object[] { Integer.valueOf(65518), "Proprietary B" },
            new Object[] { Integer.valueOf(65519), "Proprietary B" },
            new Object[] { Integer.valueOf(65520), "Proprietary B" },
            new Object[] { Integer.valueOf(65521), "Proprietary B" },
            new Object[] { Integer.valueOf(65522), "Proprietary B" },
            new Object[] { Integer.valueOf(65523), "Proprietary B" },
            new Object[] { Integer.valueOf(65524), "Proprietary B" },
            new Object[] { Integer.valueOf(65525), "Proprietary B" },
            new Object[] { Integer.valueOf(65526), "Proprietary B" },
            new Object[] { Integer.valueOf(65527), "Proprietary B" },
            new Object[] { Integer.valueOf(65528), "Proprietary B" },
            new Object[] { Integer.valueOf(65529), "Proprietary B" },
            new Object[] { Integer.valueOf(65530), "Proprietary B" },
            new Object[] { Integer.valueOf(65531), "Proprietary B" },
            new Object[] { Integer.valueOf(65532), "Proprietary B" },
            new Object[] { Integer.valueOf(65533), "Proprietary B" },
            new Object[] { Integer.valueOf(65534), "Proprietary B" },
            new Object[] { Integer.valueOf(InternalZipConstants.f25), "Proprietary B (last entry)" },
            new Object[] { Integer.valueOf(126208), "NMEA - Request/Command/Acknowledge group function" },
            new Object[] { Integer.valueOf(126464), "PGN List - Transmit/Receive PGN's group function" },
            new Object[] { Integer.valueOf(126720), "Proprietary A2" },
            new Object[] { Integer.valueOf(126992), "System Time" },
            new Object[] { Integer.valueOf(126996), "Product Information" },
            new Object[] { Integer.valueOf(126998), "Configuration Information" },
            new Object[] { Integer.valueOf(127237), "Heading/Track Control" },
            new Object[] { Integer.valueOf(127245), "Rudder" },
            new Object[] { Integer.valueOf(127250), "Vessel Heading" },
            new Object[] { Integer.valueOf(127251), "Rate of Turn" },
            new Object[] { Integer.valueOf(127257), "Attitude" },
            new Object[] { Integer.valueOf(127488), "Engine Parameters, Rapid Update" },
            new Object[] { Integer.valueOf(127489), "Engine Parameters, Dynamic" },
            new Object[] { Integer.valueOf(127493), "Transmission Parameters, Dynamic" },
            new Object[] { Integer.valueOf(127497), "Trip Parameters, Small Craft" },
            new Object[] { Integer.valueOf(127498), "Engine Parameters, Static" },
            new Object[] { Integer.valueOf(127501), "Binary Switch Bank Status" },
            new Object[] { Integer.valueOf(127502), "Switch Bank Control" },
            new Object[] { Integer.valueOf(127505), "Fluid Level" },
            new Object[] { Integer.valueOf(127508), "Battery Status" },
            new Object[] { Integer.valueOf(128259), "Speed" }, new Object[] { Integer.valueOf(128267), "Water Depth" },
            new Object[] { Integer.valueOf(128275), "Distance Log" },
            new Object[] { Integer.valueOf(128520), "Tracked Target Data" },
            new Object[] { Integer.valueOf(129025), "Position, Rapid Update" },
            new Object[] { Integer.valueOf(129026), "COG & SOG, Rapid Update" },
            new Object[] { Integer.valueOf(129029), "GNSS Position Data" },
            new Object[] { Integer.valueOf(129033), "Time & Date" }, new Object[] { Integer.valueOf(129044), "Datum" },
            new Object[] { Integer.valueOf(129045), "User Datum Settings" },
            new Object[] { Integer.valueOf(129283), "Cross Track Error" },
            new Object[] { Integer.valueOf(129284), "Navigation Data" },
            new Object[] { Integer.valueOf(129291), "Set & Drift, Rapid Update" },
            new Object[] { Integer.valueOf(129301), "Time to/from Mark" },
            new Object[] { Integer.valueOf(129302), "Bearing and Distance between two Marks" },
            new Object[] { Integer.valueOf(129538), "GNSS Control Status" },
            new Object[] { Integer.valueOf(129539), "GNSS DOPs" },
            new Object[] { Integer.valueOf(129540), "GNSS Sats in View" },
            new Object[] { Integer.valueOf(129541), "GPS Almanac Data" },
            new Object[] { Integer.valueOf(129542), "GNSS Pseudorange Noise Statistics" },
            new Object[] { Integer.valueOf(129545), "GNSS RAIM Output" },
            new Object[] { Integer.valueOf(129546), "GNSS RAIM Settings" },
            new Object[] { Integer.valueOf(129547), "GNSS Pseudorange Error Statistics" },
            new Object[] { Integer.valueOf(129549), "DGNSS Corrections" },
            new Object[] { Integer.valueOf(129550), "GNSS Differential Correction Receiver Interface" },
            new Object[] { Integer.valueOf(129551), "GNSS Differential Correction Receiver Signal" },
            new Object[] { Integer.valueOf(129556), "GLONASS Almanac Data" },
            new Object[] { Integer.valueOf(129799), "Radio Frequency/Mode/Power" },
            new Object[] { Integer.valueOf(129808), "DSC Call Information" },
            new Object[] { Integer.valueOf(130052), "Loran-C TD Data" },
            new Object[] { Integer.valueOf(130053), "Loran-C Range Data" },
            new Object[] { Integer.valueOf(130054), "Loran-C Signal Data" },
            new Object[] { Integer.valueOf(130306), "Wind Data" },
            new Object[] { Integer.valueOf(130310), "Environmental Parameters" },
            new Object[] { Integer.valueOf(130320), "Tide Station Data" },
            new Object[] { Integer.valueOf(130321), "Salinity Station Data" },
            new Object[] { Integer.valueOf(130322), "Current Station Data" },
            new Object[] { Integer.valueOf(130323), "Meteorological Station Data" },
            new Object[] { Integer.valueOf(130324), "Moored Buoy Station Data" },
            new Object[] { Integer.valueOf(130576), "Small Craft Status" },
            new Object[] { Integer.valueOf(130577), "Direction Data" },
            new Object[] { Integer.valueOf(130578), "Vessel Speed Components" } };

    public C0021(Context context) {
        this.f210 = context;
    }

    /* renamed from: ˊ */
    public static final int m115(String str, int i) {
        try {
            if ((i * 2) + 2 > str.length()) {
                return -1;
            }
            if (i < 0) {
                return -1;
            }
            return Integer.parseInt(str.substring(i * 2, (i * 2) + 2), 16);
        } catch (Throwable th) {
            C0362.m1836(th);
            return -1;
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 134 */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List m116(java.lang.String r9, java.lang.String r10) {
        /*
         * r3 = 0 java.lang.String r4 = "" java.util.ArrayList r6 = new
         * java.util.ArrayList r6.<init>() java.util.StringTokenizer r7 = new
         * java.util.StringTokenizer r0 = 1 r7.<init>(r9, r10, r0) r8 = 0 goto L_0x009f
         * L_0x0011: java.lang.String r0 = r7.nextToken() java.lang.String r5 =
         * r0.trim() boolean r0 = r5.equals(r10) if (r0 == 0) goto L_0x0021 if (r3 == 0)
         * goto L_0x0091 L_0x0021: java.lang.String r0 = "\"" boolean r0 =
         * r5.startsWith(r0) if (r0 == 0) goto L_0x004f if (r3 != 0) goto L_0x004f r3 =
         * 1 r0 = 1 java.lang.String r4 = r5.substring(r0) java.lang.String r0 = "\""
         * boolean r0 = r5.endsWith(r0) if (r0 == 0) goto L_0x008a int r0 = r5.length()
         * r1 = 1 if (r0 <= r1) goto L_0x008a int r0 = r4.length() int r0 = r0 + -1 r1 =
         * 0 java.lang.String r5 = r4.substring(r1, r0) java.lang.String r4 = "" r3 = 0
         * goto L_0x008a L_0x004f: if (r3 == 0) goto L_0x008a java.lang.String r0 = "\""
         * boolean r0 = r5.endsWith(r0) if (r0 == 0) goto L_0x0079
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder java.lang.String r1
         * = java.lang.String.valueOf(r4) r0.<init>(r1) int r1 = r5.length() int r1 = r1
         * + -1 r2 = 0 java.lang.String r1 = r5.substring(r2, r1)
         * java.lang.StringBuilder r0 = r0.append(r1) java.lang.String r5 =
         * r0.toString() java.lang.String r4 = "" r3 = 0 goto L_0x008a L_0x0079:
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder java.lang.String r1
         * = java.lang.String.valueOf(r4) r0.<init>(r1) java.lang.StringBuilder r0 =
         * r0.append(r5) java.lang.String r4 = r0.toString() L_0x008a: if (r3 != 0) goto
         * L_0x008f r6.add(r5) L_0x008f: r8 = 0 goto L_0x009f L_0x0091: if (r8 != 0)
         * goto L_0x0099 int r0 = r6.size() if (r0 != 0) goto L_0x009e L_0x0099:
         * java.lang.String r0 = "" r6.add(r0) L_0x009e: r8 = 1 L_0x009f: boolean r0 =
         * r7.hasMoreTokens() if (r0 != 0) goto L_0x0011 if (r8 == 0) goto L_0x00af
         * java.lang.String r0 = new java.lang.String r0.<init>() r6.add(r0) L_0x00af:
         * return r6
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: p001o.C0021.m116(java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: ˊ */
    private final void m117(Context context, int i, int i2) {
        InputStream inputStream = null;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(
                    context.getAssets().open("faultcodes.dat"));
            String[][] r4 = m118((InputStream) bufferedInputStream, ",");
            String[][] strArr = r4;
            int length = r4.length;
            for (int i3 = 0; i3 < length; i3++) {
                String[] strArr2 = strArr[i3];
                int parseDouble = (int) Double.parseDouble(strArr2[0]);
                if (parseDouble == i) {
                    String str = strArr2[1];
                    int parseDouble2 = (int) Double.parseDouble(strArr2[2]);
                    double parseDouble3 = Double.parseDouble(strArr2[3]);
                    int parseDouble4 = (int) Double.parseDouble(strArr2[4]);
                    String str2 = strArr2[5];
                    if (str2.equals("C")) {
                        str2 = "°C";
                    }
                    double parseDouble5 = Double.parseDouble(strArr2[6]);
                    double parseDouble6 = Double.parseDouble(strArr2[7]);
                    double parseDouble7 = Double.parseDouble(strArr2[8]);
                    double parseDouble8 = Double.parseDouble(strArr2[9]);
                    String[] split = strArr2[10].split("\\|");
                    String r25 = mo2704(parseDouble);
                    SPN spn = new SPN(parseDouble2);
                    spn.mo7254(parseDouble);
                    spn.mo7268(i2);
                    spn.mo7246(r25);
                    spn.mo7248(mo2710(i2));
                    spn.mo7244(str);
                    spn.mo7253(parseDouble3);
                    spn.mo7264(parseDouble4);
                    spn.mo7575((float) parseDouble5);
                    spn.mo7579((float) parseDouble6);
                    spn.mo7258(parseDouble7);
                    spn.mo7263(parseDouble8);
                    spn.mo7256(split);
                    spn.mo7271(str2);
                    spn.mo7582(str);
                    spn.mo7584(mo2705(parseDouble, parseDouble2, str));
                    if (parseDouble == 65270 && parseDouble2 == 102 && i2 == 0) {
                        spn.mo7602(11);
                    } else if (parseDouble == 65262 && parseDouble2 == 110 && i2 == 0) {
                        spn.mo7602(5);
                    } else if (parseDouble == 61444 && parseDouble2 == 190 && i2 == 0) {
                        spn.mo7602(12);
                    } else if (parseDouble == 65269 && parseDouble2 == 172 && i2 == 0) {
                        spn.mo7602(15);
                    } else if (parseDouble == 65132 && parseDouble2 == 1624 && i2 == 0) {
                        spn.mo7602(13);
                    } else if (parseDouble == 61443) {
                    }
                    mo2708(Integer.valueOf(parseDouble), spn);
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th) {
                }
            }
        } catch (Throwable th2) {
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 126 */
    /*
     * JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
     * if (r8 != 10) goto L_0x0049;
     */
    /*
     * JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
     * r4 = m116(r9.toString().trim(), r14); r9.delete(0, r9.length()); r3.add(r4);
     */
    /*
     * JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
     * if (r4.size() <= r6) goto L_0x0049;
     */
    /*
     * JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
     * r6 = r4.size();
     */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[][] m118(java.io.InputStream r13, java.lang.String r14)
            throws java.io.IOException {
        /*
         * java.util.ArrayList r3 = new java.util.ArrayList r3.<init>() r6 = 0 r7 = 0
         * java.lang.StringBuilder r9 = new java.lang.StringBuilder r0 = 100
         * r9.<init>(r0) goto L_0x0049 L_0x000f: byte[] r0 = f209 byte[] r1 = f209 int
         * r1 = r1.length int r1 = r7 % r1 byte r0 = r0[r1] r8 = r8 ^ r0 int r7 = r7 + 1
         * r0 = 13 if (r8 <= r0) goto L_0x0024 char r0 = (char) r8 r9.append(r0) goto
         * L_0x0049 L_0x0024: r0 = 10 if (r8 != r0) goto L_0x0049 java.lang.String r0 =
         * r9.toString() java.lang.String r0 = r0.trim() java.util.List r4 = m116(r0,
         * r14) int r0 = r9.length() r1 = 0 r9.delete(r1, r0) r3.add(r4) int r0 =
         * r4.size() if (r0 <= r6) goto L_0x0049 int r6 = r4.size() L_0x0049: int r0 =
         * r13.read() r8 = r0 r1 = -1 if (r0 != r1) goto L_0x000f r13.close() int r0 =
         * r3.size() int[] r1 = new int[]{r0, r6} java.lang.Class<java.lang.String> r2 =
         * java.lang.String.class java.lang.Object r10 =
         * java.lang.reflect.Array.newInstance(r2, r1) java.lang.String[][] r10 =
         * (java.lang.String[][]) r10 r11 = 0 goto L_0x0092 L_0x0066: java.lang.Object
         * r0 = r3.get(r11) r4 = r0 java.util.List r4 = (java.util.List) r4 r12 = 0 goto
         * L_0x007b L_0x006f: r0 = r10[r11] java.lang.Object r1 = r4.get(r12)
         * java.lang.String r1 = (java.lang.String) r1 r0[r12] = r1 int r12 = r12 + 1
         * L_0x007b: int r0 = r4.size() if (r12 < r0) goto L_0x006f int r12 = r4.size()
         * goto L_0x008e L_0x0086: r0 = r10[r11] java.lang.String r1 = "" r0[r12] = r1
         * int r12 = r12 + 1 L_0x008e: if (r12 < r6) goto L_0x0086 int r11 = r11 + 1
         * L_0x0092: int r0 = r3.size() if (r11 < r0) goto L_0x0066 return r10
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: p001o.C0021.m118(java.io.InputStream, java.lang.String):java.lang.String[][]");
    }

    /* renamed from: ˊ */
    public String mo2704(int i) {
        Object[][] objArr;
        Integer valueOf = Integer.valueOf(i);
        for (Object[] objArr2 : this.f212) {
            if (objArr2[0].equals(valueOf)) {
                return (String) objArr2[1];
            }
        }
        return "Unknown PGN";
    }

    /* renamed from: ˊ */
    public String mo2705(int i, int i2, String str) {
        String str2 = "";
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= '0' && charAt <= '9')) {
                str2 = new StringBuilder(String.valueOf(str2)).append(charAt).toString();
            }
        }
        return str2;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 165 */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<org.prowl.torque.comms.utils.j1939.SPN> mo2706(char r24, int r25, int r26,
            java.lang.String r27) {
        /*
         * r23 = this; r4 = 0 r0 = r23 r1 = r25 r2 = r26 java.util.List r0 =
         * r0.mo2707(r1, r2) // Catch:{ Throwable -> 0x0274 } r4 = r0 if (r4 == 0) goto
         * L_0x024b java.util.Iterator r6 = r4.iterator() // Catch:{ Throwable -> 0x0274
         * } goto L_0x0244 L_0x0014: java.lang.Object r0 = r6.next() // Catch:{
         * Throwable -> 0x0274 } r5 = r0 org.prowl.torque.comms.utils.j1939.SPN r5 =
         * (org.prowl.torque.comms.utils.j1939.SPN) r5 // Catch:{ Throwable -> 0x0274 }
         * double r0 = r5.mo7243() // Catch:{ Throwable -> 0x0274 } r2 =
         * 4607182418800017408(0x3ff0000000000000, double:1.0) double r7 = r0 - r2 int
         * r9 = r5.mo7272() // Catch:{ Throwable -> 0x0274 } int r10 = (int) r7 //
         * Catch:{ Throwable -> 0x0274 } double r0 = (double) r10 // Catch:{ Throwable
         * -> 0x0274 } double r0 = r7 - r0 r2 = 4621819117588971520(0x4024000000000000,
         * double:10.0) double r0 = r0 * r2 int r11 = (int) r0 // Catch:{ Throwable ->
         * 0x0274 } if (r11 == 0) goto L_0x0033 int r11 = r11 + -1 L_0x0033: int r0 =
         * r10 * 8 int r12 = r0 + r11 int r13 = r12 + r9 java.lang.String r14 = "" r15 =
         * 0 goto L_0x0082 L_0x003d: r0 = r27 int r16 = m115(r0, r15) // Catch:{
         * Throwable -> 0x0274 } java.lang.String r17 =
         * java.lang.Integer.toBinaryString(r16) // Catch:{ Throwable -> 0x0274 } int r0
         * = r17.length() // Catch:{ Throwable -> 0x0274 } r1 = 8 if (r0 >= r1) goto
         * L_0x006d int r18 = r17.length() // Catch:{ Throwable -> 0x0274 } goto
         * L_0x0067 L_0x0054: java.lang.StringBuilder r0 = new java.lang.StringBuilder
         * // Catch:{ Throwable -> 0x0274 } java.lang.String r1 = "0" r0.<init>(r1) //
         * Catch:{ Throwable -> 0x0274 } r1 = r17 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x0274 } java.lang.String r17 =
         * r0.toString() // Catch:{ Throwable -> 0x0274 } int r18 = r18 + 1 L_0x0067: r0
         * = r18 r1 = 8 if (r0 < r1) goto L_0x0054 L_0x006d: java.lang.StringBuilder r0
         * = new java.lang.StringBuilder // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r1 = java.lang.String.valueOf(r14) // Catch:{ Throwable ->
         * 0x0274 } r0.<init>(r1) // Catch:{ Throwable -> 0x0274 } r1 = r17
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r14 = r0.toString() // Catch:{ Throwable -> 0x0274 } int r15
         * = r15 + 1 L_0x0082: r0 = 8 if (r15 < r0) goto L_0x003d r15 = 0 boolean r0 =
         * r5.mo7260() // Catch:{ Throwable -> 0x0274 } if (r0 == 0) goto L_0x00d2
         * java.lang.String r17 = "" int r18 = r9 / 8 r19 = 0 goto L_0x00ca L_0x0095:
         * int r0 = r19 * 8 int r0 = r0 + r12 java.lang.String r20 = r14.substring(r12,
         * r0) // Catch:{ Throwable -> 0x0274 } r0 = r20 r1 = 2 int r21 =
         * java.lang.Integer.parseInt(r0, r1) // Catch:{ Throwable -> 0x0274 } r0 = r21
         * char r0 = (char) r0 // Catch:{ Throwable -> 0x0274 } r22 = r0
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x0274 } java.lang.String r1 = java.lang.String.valueOf(r17) // Catch:{
         * Throwable -> 0x0274 } r0.<init>(r1) // Catch:{ Throwable -> 0x0274 } r1 = r22
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r17 = r0.toString() // Catch:{ Throwable -> 0x0274 } r0 = 0
         * java.lang.Float r0 = java.lang.Float.valueOf(r0) // Catch:{ Throwable ->
         * 0x0274 } r5.mo7577(r0) // Catch:{ Throwable -> 0x0274 } r0 = r17
         * r5.mo7608(r0) // Catch:{ Throwable -> 0x0274 } int r19 = r19 + 1 L_0x00ca: r0
         * = r19 r1 = r18 if (r0 < r1) goto L_0x0095 goto L_0x0244 L_0x00d2: boolean r0
         * = r5.mo7265() // Catch:{ Throwable -> 0x0274 } if (r0 == 0) goto L_0x00ed
         * java.lang.String r17 = r14.substring(r12, r13) // Catch:{ Throwable -> 0x0274
         * } r0 = 0 java.lang.Float r0 = java.lang.Float.valueOf(r0) // Catch:{
         * Throwable -> 0x0274 } r5.mo7577(r0) // Catch:{ Throwable -> 0x0274 } r0 = r23
         * r1 = r17 r0.mo2709(r5, r1) // Catch:{ Throwable -> 0x0274 } goto L_0x0244
         * L_0x00ed: r0 = 16 if (r9 <= r0) goto L_0x0176 java.lang.String r17 =
         * r14.substring(r12, r13) // Catch:{ Throwable -> 0x0274 }
         * java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{ Throwable
         * -> 0x0274 } r1 = r17 r2 = 24 java.lang.String r1 = r1.substring(r2) //
         * Catch:{ Throwable -> 0x0274 } java.lang.String r1 =
         * java.lang.String.valueOf(r1) // Catch:{ Throwable -> 0x0274 } r0.<init>(r1)
         * // Catch:{ Throwable -> 0x0274 } r1 = r17 r2 = 16 r3 = 24 java.lang.String r1
         * = r1.substring(r2, r3) // Catch:{ Throwable -> 0x0274 }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * r1 = r17 r2 = 8 r3 = 16 java.lang.String r1 = r1.substring(r2, r3) // Catch:{
         * Throwable -> 0x0274 } java.lang.StringBuilder r0 = r0.append(r1) // Catch:{
         * Throwable -> 0x0274 } r1 = r17 r2 = 0 r3 = 8 java.lang.String r1 =
         * r1.substring(r2, r3) // Catch:{ Throwable -> 0x0274 } java.lang.StringBuilder
         * r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 } java.lang.String r17 =
         * r0.toString() // Catch:{ Throwable -> 0x0274 } r0 = r17 r1 = 2 long r0 =
         * java.lang.Long.parseLong(r0, r1) // Catch:{ Throwable -> 0x0274 } double r15
         * = (double) r0 // Catch:{ Throwable -> 0x0274 } double r0 = r5.mo7245() //
         * Catch:{ Throwable -> 0x0274 } double r15 = r15 * r0 double r0 = r5.mo7247()
         * // Catch:{ Throwable -> 0x0274 } double r15 = r15 + r0 java.lang.String r0 =
         * "0" r1 = r17 boolean r0 = r1.contains(r0) // Catch:{ Throwable -> 0x0274 } if
         * (r0 == 0) goto L_0x0159 java.lang.String r0 = "1" r1 = r17 boolean r0 =
         * r1.contains(r0) // Catch:{ Throwable -> 0x0274 } if (r0 != 0) goto L_0x0163
         * L_0x0159: java.lang.String r0 = "N/A" r5.mo7608(r0) // Catch:{ Throwable ->
         * 0x0274 } r0 = 0 r5.mo7255(r0) // Catch:{ Throwable -> 0x0274 } goto L_0x016b
         * L_0x0163: r0 = 0 r5.mo7608(r0) // Catch:{ Throwable -> 0x0274 } r0 = 1
         * r5.mo7255(r0) // Catch:{ Throwable -> 0x0274 } L_0x016b: r0 = r15 float r0 =
         * (float) r0 // Catch:{ Throwable -> 0x0274 } java.lang.Float r0 =
         * java.lang.Float.valueOf(r0) // Catch:{ Throwable -> 0x0274 } r5.mo7577(r0) //
         * Catch:{ Throwable -> 0x0274 } goto L_0x0244 L_0x0176: r0 = 16 if (r9 != r0)
         * goto L_0x01e3 java.lang.String r17 = r14.substring(r12, r13) // Catch:{
         * Throwable -> 0x0274 } java.lang.StringBuilder r0 = new
         * java.lang.StringBuilder // Catch:{ Throwable -> 0x0274 } r1 = r17 r2 = 8
         * java.lang.String r1 = r1.substring(r2) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r1 = java.lang.String.valueOf(r1) // Catch:{ Throwable ->
         * 0x0274 } r0.<init>(r1) // Catch:{ Throwable -> 0x0274 } r1 = r17 r2 = 0 r3 =
         * 8 java.lang.String r1 = r1.substring(r2, r3) // Catch:{ Throwable -> 0x0274 }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r17 = r0.toString() // Catch:{ Throwable -> 0x0274 } r0 =
         * r17 r1 = 2 int r0 = java.lang.Integer.parseInt(r0, r1) // Catch:{ Throwable
         * -> 0x0274 } double r15 = (double) r0 // Catch:{ Throwable -> 0x0274 } double
         * r0 = r5.mo7245() // Catch:{ Throwable -> 0x0274 } double r15 = r15 * r0
         * double r0 = r5.mo7247() // Catch:{ Throwable -> 0x0274 } double r15 = r15 +
         * r0 java.lang.String r0 = "0" r1 = r17 boolean r0 = r1.contains(r0) // Catch:{
         * Throwable -> 0x0274 } if (r0 == 0) goto L_0x01c6 java.lang.String r0 = "1" r1
         * = r17 boolean r0 = r1.contains(r0) // Catch:{ Throwable -> 0x0274 } if (r0 !=
         * 0) goto L_0x01d0 L_0x01c6: java.lang.String r0 = "N/A" r5.mo7608(r0) //
         * Catch:{ Throwable -> 0x0274 } r0 = 0 r5.mo7255(r0) // Catch:{ Throwable ->
         * 0x0274 } goto L_0x01d8 L_0x01d0: r0 = 0 r5.mo7608(r0) // Catch:{ Throwable ->
         * 0x0274 } r0 = 1 r5.mo7255(r0) // Catch:{ Throwable -> 0x0274 } L_0x01d8: r0 =
         * r15 float r0 = (float) r0 // Catch:{ Throwable -> 0x0274 } java.lang.Float r0
         * = java.lang.Float.valueOf(r0) // Catch:{ Throwable -> 0x0274 } r5.mo7577(r0)
         * // Catch:{ Throwable -> 0x0274 } goto L_0x0244 L_0x01e3: r0 = 8 if (r9 != r0)
         * goto L_0x0223 java.lang.String r17 = r14.substring(r12, r13) // Catch:{
         * Throwable -> 0x0274 } r0 = r17 r1 = 2 int r0 = java.lang.Integer.parseInt(r0,
         * r1) // Catch:{ Throwable -> 0x0274 } double r15 = (double) r0 // Catch:{
         * Throwable -> 0x0274 } double r0 = r5.mo7245() // Catch:{ Throwable -> 0x0274
         * } double r15 = r15 * r0 double r0 = r5.mo7247() // Catch:{ Throwable ->
         * 0x0274 } double r15 = r15 + r0 r0 = r15 float r0 = (float) r0 // Catch:{
         * Throwable -> 0x0274 } java.lang.Float r0 = java.lang.Float.valueOf(r0) //
         * Catch:{ Throwable -> 0x0274 } r5.mo7577(r0) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r0 = "0" r1 = r17 boolean r0 = r1.contains(r0) // Catch:{
         * Throwable -> 0x0274 } if (r0 != 0) goto L_0x021a java.lang.String r0 = "N/A"
         * r5.mo7608(r0) // Catch:{ Throwable -> 0x0274 } r0 = 0 r5.mo7255(r0) //
         * Catch:{ Throwable -> 0x0274 } goto L_0x0244 L_0x021a: r0 = 0 r5.mo7608(r0) //
         * Catch:{ Throwable -> 0x0274 } r0 = 1 r5.mo7255(r0) // Catch:{ Throwable ->
         * 0x0274 } goto L_0x0244 L_0x0223: r0 = 8 if (r9 > r0) goto L_0x0244
         * java.lang.String r0 = r14.substring(r12, r13) // Catch:{ Throwable -> 0x0274
         * } r1 = 2 int r0 = java.lang.Integer.parseInt(r0, r1) // Catch:{ Throwable ->
         * 0x0274 } double r15 = (double) r0 // Catch:{ Throwable -> 0x0274 } double r0
         * = r5.mo7245() // Catch:{ Throwable -> 0x0274 } double r15 = r15 * r0 double
         * r0 = r5.mo7247() // Catch:{ Throwable -> 0x0274 } double r15 = r15 + r0 r0 =
         * r15 float r0 = (float) r0 // Catch:{ Throwable -> 0x0274 } java.lang.Float r0
         * = java.lang.Float.valueOf(r0) // Catch:{ Throwable -> 0x0274 } r5.mo7577(r0)
         * // Catch:{ Throwable -> 0x0274 } L_0x0244: boolean r0 = r6.hasNext() //
         * Catch:{ Throwable -> 0x0274 } if (r0 != 0) goto L_0x0014 goto L_0x0278
         * L_0x024b: java.lang.StringBuilder r0 = new java.lang.StringBuilder // Catch:{
         * Throwable -> 0x0274 } java.lang.String r1 = "No SPNs found for PGN:"
         * r0.<init>(r1) // Catch:{ Throwable -> 0x0274 } java.lang.String r1 =
         * p001o.C0211.m974(r25) // Catch:{ Throwable -> 0x0274 }
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r1 = " (" java.lang.StringBuilder r0 = r0.append(r1) //
         * Catch:{ Throwable -> 0x0274 } r1 = r25 java.lang.StringBuilder r0 =
         * r0.append(r1) // Catch:{ Throwable -> 0x0274 } java.lang.String r1 = ")"
         * java.lang.StringBuilder r0 = r0.append(r1) // Catch:{ Throwable -> 0x0274 }
         * java.lang.String r0 = r0.toString() // Catch:{ Throwable -> 0x0274 }
         * p001o.C0362.m1835(r0) // Catch:{ Throwable -> 0x0274 } goto L_0x0278
         * L_0x0274: r5 = move-exception p001o.C0362.m1836(r5) L_0x0278: return r4
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: p001o.C0021.mo2706(char, int, int, java.lang.String):java.util.List");
    }

    /* renamed from: ˊ */
    public final synchronized List<SPN> mo2707(int i, int i2) {
        List<SPN> list;
        list = (List) f208.get(Integer.valueOf(i));
        if (list == null) {
            m117(this.f210, i, i2);
            list = (List) f208.get(Integer.valueOf(i));
        }
        return list;
    }

    /* renamed from: ˊ */
    public void mo2708(Integer num, SPN spn) {
        List list = (List) f208.get(num);
        if (list == null) {
            list = new ArrayList();
            f208.put(num, list);
        }
        if (spn != null) {
            list.add(spn);
        }
    }

    /* renamed from: ˊ */
    public void mo2709(SPN spn, String str) {
        String[] r7;
        String str2 = str;
        boolean z = false;
        if (spn.mo7269() != null) {
            for (String str3 : spn.mo7269()) {
                if (str3 != null && str3.length() > 0) {
                    int indexOf = str3.indexOf("=");
                    if (indexOf != -1 && str.equals(str3.substring(0, indexOf))) {
                        z = true;
                        str2 = str3.substring(str3.indexOf("=") + 1).trim();
                    }
                }
            }
        }
        if (z) {
            spn.mo7608(str2);
        } else {
            spn.mo7608(str);
        }
    }

    /* renamed from: ˋ */
    public String mo2710(int i) {
        Object[][] objArr;
        for (Object[] objArr2 : this.f211) {
            String str = (String) objArr2[1];
            if (((Integer) objArr2[0]).intValue() == i) {
                return str;
            }
        }
        return "Unknown ECU:" + i;
    }
}
