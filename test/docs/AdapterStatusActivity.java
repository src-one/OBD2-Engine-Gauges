package org.prowl.torque.adapter;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import org.prowl.torque.R;
import org.prowl.torque.TorqueSettings;
import org.prowl.torque.benchmark.BenchmarkActivity;
import org.prowl.torque.comms.utils.j1939.SPN;
import org.prowl.torque.landing.FrontPage;
import org.prowl.torque.pid.PID;
import org.prowl.torque.profiles.ProfileActivity;
import p001o.C0254;
import p001o.C0351;
import p001o.C0362;
import p001o.C0432;
import p001o.C0483;
import p001o.C0532;
import p001o.C0540;
import p001o.C0562;
import p001o.C0643;
import p001o.C0679;
import p001o.C0799;

public class AdapterStatusActivity extends ListActivity {

    /* renamed from: ˊ */
    public static final String[] f6421 = { "", "Number of trouble codes and I/M info", "Freeze DTC",
            "Fuel system status", "Calculated engine load value", "Engine coolant temperature",
            "Short term fuel % trim - Bank1", "Long term fuel % trim - Bank1", "Short term fuel % trim - Bank2",
            "Long term fuel % trim - Bank2", "Fuel pressure", "Intake manifold pressure", "Engine RPM", "Vehicle speed",
            "Timing advance", "Intake air temperature", "MAF air flow rate", "Throttle position", "Sec. air status",
            "Oxygen sensors present", "Bank 1, Sensor 1:Oxygen sensor & Short Term Fuel Trim",
            "Bank 1, Sensor 2:Oxygen sensor & Short Term Fuel Trim",
            "Bank 1, Sensor 3:Oxygen sensor & Short Term Fuel Trim",
            "Bank 1, Sensor 4:Oxygen sensor & Short Term Fuel Trim",
            "Bank 2, Sensor 1:Oxygen sensor & Short Term Fuel Trim",
            "Bank 2, Sensor 2:Oxygen sensor & Short Term Fuel Trim",
            "Bank 2, Sensor 3:Oxygen sensor & Short Term Fuel Trim",
            "Bank 2, Sensor 4:Oxygen sensor & Short Term Fuel Trim", "OBD standards this vehicle conforms to",
            "Oxygen sensors present", "Auxiliary input status", "Run time since engine start", "",
            "Distance traveled with malfunction indicator lamp on", "Fuel Rail Pressure", "Fuel Rail Pressure",
            "O2 S1 Equiv. Ratio and/or Voltage", "O2 S2 Equiv. Ratio and/or Voltage",
            "O2 S3 Equiv. Ratio and/or Voltage", "O2 S4 Equiv. Ratio and/or Voltage",
            "O2 S5 Equiv. Ratio and/or Voltage", "O2 S6 Equiv. Ratio and/or Voltage",
            "O2 S7 Equiv. Ratio and/or Voltage", "O2 S8 Equiv. Ratio and/or Voltage", "Commanded EGR", "EGR Error",
            "Commanded evaporative purge", "Fuel Level Input", "Number of warm-ups since codes cleared",
            "Distance traveled since codes cleared", "Evap. System Vapor Pressure", "Barometric pressure",
            "O2 S1 Equiv. Ratio and/or Current", "O2 S2 Equiv. Ratio and/or Current",
            "O2 S3 Equiv. Ratio and/or Current", "O2 S4 Equiv. Ratio and/or Current",
            "O2 S5 Equiv. Ratio and/or Current", "O2 S6 Equiv. Ratio and/or Current",
            "O2 S7 Equiv. Ratio and/or Current", "O2 S8 Equiv. Ratio and/or Current",
            "Catalyst Temp - Bank 1, Sensor 1", "Catalyst Temp - Bank 2, Sensor 1", "Catalyst Temp - Bank 1, Sensor 2",
            "Catalyst Temp - Bank 2, Sensor 2", "", "Monitor status this drive cycle", "Control module voltage",
            "Absolute load value", "Command equivalence ratio", "Relative throttle position", "Ambient air temperature",
            "Absolute throttle position B", "Absolute throttle position C", "Accelerator pedal position D",
            "Accelerator pedal position E", "Accelerator pedal position F", "Commanded throttle actuator",
            "Time run with MIL on", "Time since trouble codes cleared",
            "Max val for equivalence ratio, oxygen sensor voltage, oxygen sensor current, and intake manifold absolute pressure",
            "Max val for air flow rate from mass air flow sensor", "Fuel Type", "Ethanol fuel%",
            "Absoulute Evap system Vapour Pressure", "Evap system vapor pressure",
            "Short term secondary oxygen sensor trim bank 1 and bank 3",
            "Long term secondary oxygen sensor trim bank 1 and bank 3",
            "Short term secondary oxygen sensor trim bank 2 and bank 4",
            "Long term secondary oxygen sensor trim bank 2 and bank 4", "Fuel rail pressure (absolute)",
            "Relative accelerator pedal position", "Hybrid battery pack remaining life", "Engine oil temperature",
            "Fuel injection timing", "Engine fuel rate", "Emission requirements to which vehicle is designed",
            "Driver's demand engine - percent torque", "Actual engine - percent torque", "Engine reference torque",
            "Engine percent torque data", "Auxiliary input / output supported", "Mass air flow sensor",
            "Engine coolant temperature", "Intake air temperature sensor", "Commanded EGR and EGR Error",
            "Commanded Diesel intake air flow control and relative intake air flow position",
            "Exhaust gas recirculation temperature",
            "Commanded throttle actuator control and relative throttle position", "Fuel pressure control system",
            "Injection pressure control system", "Turbocharger compressor inlet pressure", "Boost pressure control",
            "Variable Geometry turbo (VGT) control", "Wastegate control", "Exhaust pressure", "Turbocharger RPM",
            "Turbocharger temperature", "Turbocharger temperature", "Charge air cooler temperature (CACT)",
            "Exhaust Gas temperature (EGT) Bank 1", "Exhaust Gas temperature (EGT) Bank 2",
            "Diesel particulate filter (DPF)", "Diesel particulate filter (DPF)",
            "Diesel Particulate filter (DPF) temperature", "NOx NTE control area status", "PM NTE control area status",
            "Engine run time", "Engine run time for AECD", "Engine run time for AECD", "NOx sensor",
            "Manifold surface temperature", "NOx reagent system", "Particulate matter (PM) sensor",
            "Intake manifold absolute pressure" };

    /* renamed from: ˏ */
    public static final String f6422 = "OBDII to RS232 Interpreter";

    /* renamed from: ˮ */
    private static final byte[] f6423 = { 72, 122, -20, -64, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11, 15, -8,
            16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, 22, 15, -11,
            8, 0, 15, -15, 15, 3, -8, 8, 1, -30, 21, 14, -6, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68,
            68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -26, 39, -6, 11 };

    /* renamed from: ۥ */
    private static int f6424 = 1;

    /* renamed from: ᐝ */
    public static final String f6425 = "ELM327";

    /* renamed from: ᐠ */
    private static int f6426 = 0;

    /* renamed from: ᐣ */
    private static int f6427 = 1;
    /* access modifiers changed from: private */

    /* renamed from: ʳ */
    public C0532 f6428;
    /* access modifiers changed from: private */

    /* renamed from: ʴ */
    public long f6429 = 0;

    /* renamed from: ʹ */
    private C0532 f6430;

    /* renamed from: ʻ */
    String f6431 = C0483.m2490(
            "Cheap clone versions of this adapter (mostly found via Amazon/eBay) may not function with protocol J1850-PWM(Ford/other), and also may have issues with corrupted communications (resulting in pausing dials or other strange things happening).",
            new String[0]);

    /* renamed from: ʼ */
    String f6432 = C0483.m2490(
            "This type of clone adapter is known to be problematic.  You may repeatedly need to pair the adapter with the android device, and the adapter may stop functioning if another adapter of the same type comes into range of it",
            new String[0]);

    /* renamed from: ʽ */
    String f6433 = C0483.m2490(
            "The adapter has a known issue that may cause it to may stop communicating if another adapter of the same type comes into range of it. This is because the adapters bluetooth 'MAC' address has been re-used with other OBD2 adapters",
            new String[0]);
    /* access modifiers changed from: private */

    /* renamed from: ʾ */
    public C0540 f6434;
    /* access modifiers changed from: private */

    /* renamed from: ʿ */
    public C0532 f6435;

    /* renamed from: ˆ */
    private Timer f6436;

    /* renamed from: ˇ */
    private Handler f6437;
    /* access modifiers changed from: private */

    /* renamed from: ˈ */
    public C0532 f6438;
    /* access modifiers changed from: private */

    /* renamed from: ˉ */
    public C0532 f6439;

    /* renamed from: ˋ */
    String f6440 = C0483.m2490("Nothing to report", new String[0]);
    /* access modifiers changed from: private */

    /* renamed from: ˌ */
    public C0532 f6441;
    /* access modifiers changed from: private */

    /* renamed from: ˍ */
    public C0532 f6442;

    /* renamed from: ˎ */
    String f6443 = this.f6440;
    /* access modifiers changed from: private */

    /* renamed from: ˑ */
    public C0532 f6444;
    /* access modifiers changed from: private */

    /* renamed from: ˡ */
    public NumberFormat f6445;

    /* renamed from: ͺ */
    String f6446 = "11:22:33:DD:EE:FF";

    /* renamed from: ՙ */
    private C0532 f6447;
    /* access modifiers changed from: private */

    /* renamed from: י */
    public C0532 f6448;
    /* access modifiers changed from: private */

    /* renamed from: ـ */
    public C0532 f6449;

    /* renamed from: ٴ */
    private C0532 f6450;
    /* access modifiers changed from: private */

    /* renamed from: ᐧ */
    public C0532 f6451;
    /* access modifiers changed from: private */

    /* renamed from: ᐨ */
    public C0532 f6452;
    /* access modifiers changed from: private */

    /* renamed from: ᴵ */
    public C0532 f6453;

    /* renamed from: ᵎ */
    private C0532 f6454;
    /* access modifiers changed from: private */

    /* renamed from: ᵔ */
    public C0532 f6455;
    /* access modifiers changed from: private */

    /* renamed from: ᵢ */
    public C0532 f6456;

    /* renamed from: ι */
    String f6457 = "00:0D:18:3A:67:89";
    /* access modifiers changed from: private */

    /* renamed from: ⁱ */
    public C0532 f6458;
    /* access modifiers changed from: private */

    /* renamed from: ﹳ */
    public C0532 f6459;
    /* access modifiers changed from: private */

    /* renamed from: ﹶ */
    public C0532 f6460;
    /* access modifiers changed from: private */

    /* renamed from: ﹺ */
    public C0532 f6461;
    /* access modifiers changed from: private */

    /* renamed from: ｰ */
    public C0532 f6462;
    /* access modifiers changed from: private */

    /* renamed from: ﾞ */
    public C0532 f6463;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m5755(int r8, byte r9, int r10) {
        /*
         * goto L_0x0003 L_0x0001: r0 = move-exception throw r0 L_0x0003:
         * java.lang.String r0 = new java.lang.String int r10 = r10 * 3 int r10 = 118 -
         * r10 byte[] r6 = f6423 int r9 = 58 - r9 int r8 = 33 - r8 r7 = 0 byte[] r1 =
         * new byte[r8] if (r6 != 0) goto L_0x0015 goto L_0x0047 L_0x0015: L_0x0016: r2
         * = r7 int r7 = r7 + 1 byte r3 = (byte) r10 r1[r2] = r3 if (r7 != r8) goto
         * L_0x001f goto L_0x0024 L_0x001f: goto L_0x004a L_0x0020: int r2 = r2 + r3 int
         * r10 = r2 + -2 goto L_0x0029 L_0x0024: r2 = 0 r0.<init>(r1, r2) // Catch:{
         * Exception -> 0x0001 } return r0 L_0x0029: int r2 = f6427 int r2 = r2 + 73 int
         * r3 = r2 % 128 f6426 = r3 int r2 = r2 % 2 if (r2 == 0) goto L_0x0036 goto
         * L_0x0037 L_0x0036: goto L_0x0016 L_0x0037: goto L_0x0016 L_0x0038: int r4 =
         * f6426 int r4 = r4 + 79 int r5 = r4 % 128 f6427 = r5 int r4 = r4 % 2 if (r4 !=
         * 0) goto L_0x0045 goto L_0x0046 L_0x0045: goto L_0x0020 L_0x0046: goto
         * L_0x0020 L_0x0047: r2 = r9 r3 = r8 goto L_0x0020 L_0x004a: r2 = r10 int r9 =
         * r9 + 1 byte r3 = r6[r9] goto L_0x0038
         */
        throw new UnsupportedOperationException(
                "Method not decompiled: org.prowl.torque.adapter.AdapterStatusActivity.m5755(int, byte, int):java.lang.String");
    }

    /* renamed from: ᐝ */
    public static final String m5765() {
        StringBuilder sb = new StringBuilder(2024);
        C0679 r3 = C0351.m1773();
        if (!r3.mo5275()) {
            return C0483.m2490("Not connected to ECU", new String[0]);
        }
        for (int i = 0; i < f6421.length; i++) {
            if (C0351.m1773().mo5239(i)) {
                String str = f6421[i];
                if (str.length() > 0) {
                    sb.append("* " + str + "\n");
                }
            }
        }
        if (r3.mo5215() == 10) {
            PID[] r4 = FrontPage.m6172();
            PID[] pidArr = r4;
            int length = r4.length;
            for (int i2 = 0; i2 < length; i2++) {
                PID pid = pidArr[i2];
                if (pid instanceof SPN) {
                    SPN spn = (SPN) pid;
                    if (spn.mo7250()) {
                        sb.append("* [J1939] " + spn.mo7266() + "\n");
                    }
                }
            }
        }
        return sb.toString();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0351.m1731(getApplicationContext());
        setTitle(C0483.m2490("Adapter Status Information", new String[0]));
        if (this.f6434 == null) {
            this.f6434 = new C0540(this);
        }
        setListAdapter(this.f6434);
        getWindow().setBackgroundDrawableResource(R.drawable.APKTOOL_DUMMYVAL_0x7f020003);
        getListView().setBackgroundColor(0);
        getListView().setCacheColorHint(0);
        getListView().setKeepScreenOn(true);
        this.f6445 = NumberFormat.getInstance();
        this.f6445.setMaximumFractionDigits(1);
        this.f6445.setMinimumFractionDigits(1);
        this.f6437 = new Handler();
        mo7141();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(FrontPage.f6825).setIcon(R.drawable.APKTOOL_DUMMYVAL_0x7f02007c);
        menu.add(FrontPage.f6854).setIcon(R.drawable.APKTOOL_DUMMYVAL_0x7f020077);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onListItemClick(ListView listView, View view, int i, long j) {
        super.onListItemClick(listView, view, i, j);
        C0532 r3 = (C0532) this.f6434.getItem(i);
        if (r3 == null) {
            return;
        }
        if (r3 == this.f6430) {
            startActivity(new Intent("android.intent.action.VIEW",
                    Uri.parse("http://torque-bhp.com/forums/?wpforumaction=viewtopic&t=3.0")).setFlags(1610612740));
        } else if (r3 == this.f6452) {
            startActivity(new Intent(this, BenchmarkActivity.class));
        } else if (r3 == this.f6447) {
            openOptionsMenu();
        }
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (FrontPage.f6825.equals(menuItem.getTitle())) {
            startActivity(new Intent(this, TorqueSettings.class));
        } else if (FrontPage.f6854.equals(menuItem.getTitle())) {
            FrontPage.m6101((Context) this);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C0351.f1932 = false;
        if (this.f6436 != null) {
            this.f6436.cancel();
            this.f6436 = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C0562.m3038((Context) this);
        C0351.f1932 = true;
        mo7139();
    }

    /* renamed from: ˊ */
    public void mo7139() {
        if (this.f6436 != null) {
            this.f6436.cancel();
        }
        this.f6436 = new Timer();
        this.f6436.scheduleAtFixedRate(new TimerTask() {
            public final void run() {
                try {
                    if (System.currentTimeMillis() > AdapterStatusActivity.this.f6429 + 1000) {
                        AdapterStatusActivity.this.f6429 = System.currentTimeMillis();
                        AdapterStatusActivity.this.mo7140();
                    }
                    C0679 r6 = C0351.m1773();
                    if (r6.mo5239(14)) {
                        C0351.m1740(14);
                    } else if (r6.mo5239(7)) {
                        C0351.m1740(7);
                    } else if (r6.mo5239(10)) {
                        C0351.m1740(10);
                    } else if (r6.mo5239(35)) {
                        C0351.m1740(35);
                    } else if (r6.mo5239(11)) {
                        C0351.m1740(11);
                    } else if (r6.mo5239(16)) {
                        C0351.m1740(16);
                    } else if (r6.mo5239(12)) {
                        C0351.m1740(12);
                    }
                } catch (Throwable th) {
                    C0362.m1836(th);
                }
            }
        }, 500, 800);
    }

    /* renamed from: ˋ */
    public void mo7140() {
        this.f6437.post(new Runnable() {
            public void run() {
                try {
                    C0679 r6 = C0351.m1773();
                    String r7 = r6.mo5262();
                    String str = "";
                    C0799 r9 = C0351.m1782();
                    if (!r9.mo5923().equals(ProfileActivity.f7425)) {
                        String r10 = r9.mo5923();
                        r7 = r9.mo5964().length() == 0 ? C0483.m2490("Device set in vehicle profile", new String[0])
                                : r9.mo5964();
                        str = " " + C0483.m2490("(Overridden by vehicle profile settings)", new String[0]);
                    }
                    AdapterStatusActivity.this.f6435.mo4697(
                            r6.mo5248() ? C0483.m2490("Yes", new String[0]) : C0483.m2490("No", new String[0]),
                            r6.mo5248() ? 1 : 2);
                    AdapterStatusActivity.this.f6438.mo4697(r6.mo5256()
                            ? new StringBuilder(String.valueOf(C0483.m2490("Yes", new String[0]))).append(" - ")
                                    .append(C0483.m2490("Connected to:", new String[0])).append(" ").append(r6.mo5240())
                                    .toString()
                            : new StringBuilder(String.valueOf(C0483.m2490("No", new String[0]))).append(" - ")
                                    .append(C0483.m2490("Connecting to:", new String[0])).append(" ").append(r7)
                                    .append(str).toString(),
                            r6.mo5256() ? 1 : 2);
                    AdapterStatusActivity.this.f6439.mo4697(r6.mo5267(), r6.mo5263() ? 2 : 0);
                    AdapterStatusActivity.this.f6441.mo4697(r6.mo5266(), 0);
                    int r102 = r6.mo5280();
                    int r11 = r6.mo5281();
                    int i = 1;
                    if (r102 > 0 || r11 > 0) {
                        i = 2;
                    }
                    if (r102 > 1) {
                        i = 3;
                    }
                    AdapterStatusActivity.this.f6442.mo4697(
                            C0483.m2490("%1 errors, %2 other faults", Integer.toString(r102), Integer.toString(r11)),
                            i);
                    AdapterStatusActivity.this.f6449.mo4697(
                            r6.mo5275() ? C0483.m2490("Yes", new String[0]) : C0483.m2490("No", new String[0]),
                            r6.mo5275() ? 1 : 2);
                    AdapterStatusActivity.this.f6452.mo4697(C0483.m2490("Current: %1, Max: %2, Avg: %3",
                            AdapterStatusActivity.this.f6445.format((double) r6.mo5252()),
                            AdapterStatusActivity.this.f6445.format((double) r6.mo5206()),
                            AdapterStatusActivity.this.f6445.format((double) r6.mo5204())), 0);
                    AdapterStatusActivity.this.f6459.mo4697(
                            r6.mo5259() ? C0483.m2490("Yes", new String[0]) : C0483.m2490("No", new String[0]), 0);
                    if (AdapterStatusActivity.f6422.equals(r6.mo5267())
                            && r6.mo5266().contains(AdapterStatusActivity.f6425)) {
                        AdapterStatusActivity.this.f6443 = AdapterStatusActivity.this.f6431;
                    }
                    if (r6.mo5264() != null && r6.mo5264().toUpperCase().equals(AdapterStatusActivity.this.f6446)) {
                        AdapterStatusActivity.this.f6443 = AdapterStatusActivity.this.f6432;
                    }
                    if (r6.mo5264() != null && r6.mo5264().toUpperCase().equals(AdapterStatusActivity.this.f6457)) {
                        AdapterStatusActivity.this.f6443 = AdapterStatusActivity.this.f6433;
                    }
                    AdapterStatusActivity.this.f6444.mo4697(AdapterStatusActivity.this.f6443, 0);
                    if (r6.mo5215() == -1) {
                        AdapterStatusActivity.this.f6455.mo4697(C0483.m2490("Waiting for connection", new String[0]),
                                0);
                    } else {
                        AdapterStatusActivity.this.f6455.mo4697(r6.mo5243(r6.mo5215()), 0);
                    }
                    if (FrontPage.m6092(TorqueSettings.f5933, TorqueSettings.f6036)) {
                        AdapterStatusActivity.this.f6453.mo4697(C0483.m2490("Yes", new String[0]), 1);
                    } else {
                        AdapterStatusActivity.this.f6453.mo4697(C0483.m2490("No", new String[0]), 2);
                    }
                    if (FrontPage.m6092(TorqueSettings.f6019, false)) {
                        AdapterStatusActivity.this.f6448.mo4697(C0483.m2490("Yes", new String[0]), 0);
                    } else {
                        AdapterStatusActivity.this.f6448.mo4697(C0483.m2490("No", new String[0]), 0);
                    }
                    AdapterStatusActivity.this.f6460.mo4697(C0254.m1256(r6.mo5245()), 0);
                    AdapterStatusActivity.this.f6458.mo4697(r6.mo5245(), 0);
                    AdapterStatusActivity.this.f6461.mo4697(r6.mo5291(), 0);
                    AdapterStatusActivity.this.f6462.mo4697(r6.mo5202(), 0);
                    AdapterStatusActivity.this.f6463.mo4697(AdapterStatusActivity.m5765(), 0);
                    C0643 r13 = C0351.m1789();
                    if (!(AdapterStatusActivity.this.f6451 == null || r13 == null)) {
                        String r14 = C0483.m2490("Idle", new String[0]);
                        int i2 = 0;
                        if (C0351.m1719((int) C0432.f2568) != null && r13.mo5066()) {
                            r14 = C0483.m2490("Connected, receiving position", new String[0]);
                            i2 = 1;
                        } else if (r13.mo5066()) {
                            r14 = C0483.m2490("Connected, waiting for device to get GPS lock", new String[0]);
                            i2 = 2;
                        } else if (r13.mo5065()) {
                            r14 = C0483.m2490("Connecting to bluetooth GPS...", new String[0]);
                            i2 = 2;
                        } else if (!r13.mo5065()) {
                            r14 = C0483.m2490("Idle - not required or no bluetooth device set in settings",
                                    new String[0]);
                            i2 = 0;
                        }
                        AdapterStatusActivity.this.f6451.mo4697(r14, i2);
                    }
                    AdapterStatusActivity.this.f6456.mo4697(r6.mo5209(), 0);
                    if (!(AdapterStatusActivity.this.f6428 == null || C0351.f1980 == null)) {
                        String str2 = "";
                        String sb = C0351.f1980.mo5495()
                                ? new StringBuilder(String.valueOf(str2))
                                        .append(C0483.m2490("Logging enabled,\n", new String[0])).toString()
                                : new StringBuilder(String.valueOf(str2))
                                        .append(C0483.m2490("Not logging,\n", new String[0])).toString();
                        String r15 = C0351.m1706().mo5479();
                        if (r15 == null) {
                            r15 = C0483.m2490("None", new String[0]);
                        }
                        String sb2 = new StringBuilder(String.valueOf(sb)).append(C0483.m2490(
                                "%1 samples being uploaded,\n%2 items waiting to upload,\n%3 items failed to upload,\n%4 items sent total\nLast Message: %5",
                                Integer.toString(C0351.f1980.mo5481()), Integer.toString(C0351.f1980.mo5482()),
                                Integer.toString(C0351.f1980.mo5478()), Integer.toString(C0351.f1980.mo5498()), r15))
                                .toString();
                        int i3 = 1;
                        if (C0351.f1980.mo5482() > C0351.f1980.mo5498() && C0351.f1980.mo5482() > 25) {
                            i3 = 2;
                        }
                        if (C0351.f1980.mo5478() > C0351.f1980.mo5482()) {
                            i3 = 3;
                        }
                        if (C0351.f1980.mo5481() == 0 && C0351.f1980.mo5482() == 0 && C0351.f1980.mo5498() == 0) {
                            i3 = 0;
                        }
                        AdapterStatusActivity.this.f6428.mo4697(sb2, i3);
                    }
                    AdapterStatusActivity.this.f6434.notifyDataSetChanged();
                } catch (Throwable th) {
                    C0362.m1836(th);
                }
            }
        });
    }

    /* renamed from: ˎ */
    public void mo7141() {
        this.f6434.mo4737();
        Vector vector = new Vector();
        this.f6435 = new C0532(C0483.m2490("Bluetooth Enabled", new String[0]),
                C0483.m2490("Is the device bluetooth enabled?", new String[0]));
        if (FrontPage.m6100(TorqueSettings.f6111, TorqueSettings.f6005).equals(TorqueSettings.f6059)) {
            vector.add(this.f6435);
        }
        C0532 r0 = new C0532(C0483.m2490("Connection to adapter", new String[0]),
                C0483.m2490("Are you connected to the OBD2 adapter?", new String[0]));
        this.f6438 = r0;
        vector.add(r0);
        C0532 r02 = new C0532(C0483.m2490("Connection to ECU", new String[0]),
                C0483.m2490("Can the adapter talk OK to the vehicle ECU?", new String[0]));
        this.f6449 = r02;
        vector.add(r02);
        C0643 r6 = C0351.m1789();
        if (r6 != null && r6.mo5061()) {
            C0532 r03 = new C0532(C0483.m2490("Bluetooth GPS State", new String[0]),
                    C0483.m2490("The external bluetooth GPS connection state", new String[0]));
            this.f6451 = r03;
            vector.add(r03);
        }
        C0532 r04 = new C0532(C0483.m2490("Adapter Error Count", new String[0]), C0483
                .m2490("This should stay on 0, if not then you potentially have a faulty adapter.", new String[0]));
        this.f6442 = r04;
        vector.add(r04);
        C0532 r05 = new C0532(C0483.m2490("Adapter Manufacturer", new String[0]),
                C0483.m2490("Who made the OBD2 adapter", new String[0]));
        this.f6439 = r05;
        vector.add(r05);
        C0532 r06 = new C0532(C0483.m2490("Adapter Version", new String[0]),
                C0483.m2490("The firmware version of the adapter", new String[0]));
        this.f6441 = r06;
        vector.add(r06);
        if (FrontPage.m6092(TorqueSettings.f6211, false)) {
            vector.add(new C0532(C0483.m2490("F150 bugged ECU workaround", new String[0]), C0483.m2490(
                    "You have enabled the F150 workaround for Fords with bugged ECUs - this will affect Fault Code reading, and only a 'quick' fault code scan will be done which may not pick up all faults",
                    new String[0]),
                    C0483.m2490("You can turn it off in Settings->Special Settings->F150 Workaround", new String[0]),
                    2));
        }
        C0799 r7 = C0351.m1782();
        if (r7.mo5977()) {
            vector.add(new C0532(C0483.m2490("Alternate OBD Header enabled", new String[0]), C0483.m2490(
                    "You have enabled the 'Use Alternate OBD Header' option in the vehicle profile. This can cause connection problems on vehicles that don't need it enabled.. This option should usually be left disabled except for a few specific older vehicles.",
                    new String[0]),
                    C0483.m2490(
                            "You can turn it off in the Vehicle Profile->Advanced Settings->Use Alternate OBD Header",
                            new String[0]),
                    2));
        }
        if (r7.mo5948() != null && r7.mo5948().trim().length() > 0) {
            vector.add(new C0532(C0483.m2490("Custom Init Enabled", new String[0]), C0483.m2490(
                    "You have enabled 'Custom Init' in the vehicle profile - this can cause connection problems on vehicles that do not need it enabled, so if unsure then leave it blank",
                    new String[0]),
                    C0483.m2490(
                            "You can leave it blank in the Vehicle Profile->Advanced Settings->ELM327 Custom Configuration",
                            new String[0]),
                    2));
        }
        if (FrontPage.m6092(TorqueSettings.f6058, false)) {
            vector.add(new C0532(C0483.m2490("Debugging mode enabled", new String[0]), C0483.m2490(
                    "You have enabled debug mode in the settings. Collecting debug data will make the app slower so you should disable it when you are finished",
                    new String[0]),
                    C0483.m2490("You can turn it off in Settings->General Settings->Enable Debugging", new String[0]),
                    2));
        }
        C0532 r07 = new C0532(C0483.m2490("Adapter Notes", new String[0]),
                C0483.m2490("Information about the OBD2 adapter", new String[0]));
        this.f6444 = r07;
        vector.add(r07);
        C0532 r08 = new C0532(C0483.m2490("Enhanced MPG Calculation", new String[0]), C0483.m2490(
                "Enhance the MPG calculation so that it is more accurate. (This may mean slower refresh rates on older vehicles as more sensors are used) - can be set in the OBD2 adapter settings",
                new String[0]));
        this.f6448 = r08;
        vector.add(r08);
        C0532 r09 = new C0532(C0483.m2490("Faster communication", new String[0]), C0483.m2490(
                "Is Torque configured for the fastest possible sensor read speed - this can be changed in the 'OBD2 Adapter Settings' in the app",
                new String[0]));
        this.f6453 = r09;
        vector.add(r09);
        C0532 r010 = new C0532(C0483.m2490("Adapter PID read speed", new String[0]),
                new StringBuilder(String.valueOf(
                        C0483.m2490("The rate of PIDs/second that have been read from the ECU", new String[0])))
                                .append(". ")
                                .append(C0483.m2490(
                                        "You can increase this by enabling 'Faster Communication' in the OBD2 settings",
                                        new String[0]))
                                .append("\n\n").append(C0483.m2490("Tap here to benchmark your adapter", new String[0]))
                                .toString());
        this.f6452 = r010;
        vector.add(r010);
        this.f6459 = new C0532(C0483.m2490("Multiple Controllers", new String[0]),
                C0483.m2490("Does the vehicle have multiple ECUs (Engine, Transmission, etc)", new String[0]));
        C0532 r011 = new C0532(C0483.m2490("Vehicle OBD Standard", new String[0]),
                C0483.m2490("The OBD standard that the vehicle ECU conforms to", new String[0]));
        this.f6462 = r011;
        vector.add(r011);
        C0532 r012 = new C0532(C0483.m2490("OBD Protocol", new String[0]),
                C0483.m2490("The protocol used to talk to the vehicle ECU", new String[0]));
        this.f6455 = r012;
        vector.add(r012);
        this.f6460 = new C0532(C0483.m2490("Vehicle Manufacturer", new String[0]),
                C0483.m2490("Who the vehicle is made by", new String[0]));
        this.f6458 = new C0532(C0483.m2490("VIN Code", new String[0]),
                C0483.m2490("Vehicle identification number (check against your logbook)", new String[0]));
        this.f6461 = new C0532(C0483.m2490("Calibration ID ", new String[0]),
                C0483.m2490("Vehicle Calibration ID", new String[0]));
        this.f6463 = new C0532(C0483.m2490("Available sensors", new String[0]),
                C0483.m2490("Your engine ECU has said it supports these OBD sensors:", new String[0]));
        this.f6456 = new C0532(C0483.m2490("ECU Identification", new String[0]),
                C0483.m2490("The coding of the ECU", new String[0]));
        if (C0351.m1782().mo5929() == 16) {
            vector.add(this.f6456);
        } else {
            vector.add(this.f6460);
            vector.add(this.f6458);
            vector.add(this.f6461);
            vector.add(this.f6463);
        }
        if (C0351.f1980 != null && FrontPage.m6092(TorqueSettings.f6041, false)) {
            C0532 r013 = new C0532(C0483.m2490("Web Upload Status", new String[0]),
                    C0483.m2490(
                            "Shows you how many samples have been uploaded to the webserver if you enabled web logging",
                            new String[0]));
            this.f6428 = r013;
            vector.add(r013);
        }
        C0532 r014 = new C0532(C0483.m2490("Application Version", new String[0]),
                C0483.m2490("Tap for list of changes", new String[0]));
        this.f6430 = r014;
        vector.add(r014);
        C0532 r015 = new C0532(C0483.m2490("Settings", new String[0]),
                C0483.m2490("Tap to access settings (or press 'menu' from main app screen)", new String[0]));
        this.f6447 = r015;
        vector.add(r015);
        this.f6430.mo4697(mo7142(), 0);
        this.f6447.mo4697("", 4);
        String str = "ATTENTION - if you translated the language files, put your name here to recieve credit for your hard work! (in the adapter status screen)";
        if (!C0483.m2490(str, new String[0]).equals(str)) {
            C0532 r016 = new C0532(C0483.m2490("Translation by", new String[0]), C0483.m2490(str, new String[0]));
            this.f6454 = r016;
            vector.add(r016);
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            this.f6434.mo4738((C0532) it.next());
        }
        try {
            if (!FrontPage.m6092(TorqueSettings.f6211, false) && C0351.m1773().mo5215() < 13) {
                C0351.m1773().mo5207("0902\r");
                C0351.m1773().mo5207("0904\r");
                C0351.m1773().mo5207("090A\r");
                C0351.m1773().mo5207("0151\r");
                C0351.m1773().mo5207("011C\r");
                C0351.m1773().mo5207("0140\r");
                C0351.m1773().mo5207("0160\r");
            }
        } catch (Throwable th) {
            C0362.m1836(th);
        }
    }

    /* renamed from: ˏ */
    public String mo7142() {
        PackageManager packageManager = C0351.f2003.getPackageManager();
        String packageName = C0351.f2003.getPackageName();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = Integer.valueOf(0);
            objArr[0] = packageName;
            byte b = (byte) f6423[4];
            byte b2 = (byte) f6423[24];
            Object invoke = Class.forName(m5755(b, (byte) (b | 42), (byte) (f6424 | 6)).intern())
                    .getMethod(m5755((byte) f6423[7], b2, (byte) (b2 & 13)).intern(),
                            new Class[] { String.class, Integer.TYPE })
                    .invoke(packageManager, objArr);
            byte b3 = (byte) f6423[4];
            return (String) Class.forName(m5755((byte) f6423[51], b3, (byte) (b3 | 7)).intern())
                    .getField(m5755((byte) f6423[43], (byte) f6423[9], (byte) f6423[4]).intern()).get(invoke);
        } catch (Throwable th) {
            return C0483.m2490("Application version not accessible", new String[0]);
        }
    }
}
