package HI0;

import SJ0.IE;
import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.PowerManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.database.sqlite.cL.PtsLKY;
import com.alightcreative.app.motion.scene.TimeKt;
import com.fyber.inneractive.sdk.player.exoplayer2.util.LU.LHbnkhI;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class afx {
    public static final File HI(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getCacheDir(), "videothumbs");
        file.mkdirs();
        return file;
    }

    public static final File Ik(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xml.bak");
    }

    public static final int J2(Context context, int i2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }

    public static final File KN(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getFilesDir(), "dlfonts");
        file.mkdirs();
        return file;
    }

    public static final ClipboardManager O(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        return (ClipboardManager) systemService;
    }

    public static final File S(Context context, UUID id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xmlbak");
    }

    public static final String Uo(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String DEVICE = Build.DEVICE;
        if (DEVICE != null) {
            Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
            if (new Regex(".+_cheets|cheets_.+").matches(DEVICE)) {
                return "Chromebook";
            }
        }
        return context.getResources().getBoolean(2131034118) ? "Android Tablet" : "Android Phone";
    }

    public static final void ViF(TextView textView, float f3, float f4, float f5, int i2) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setShadowLayer(t(textView, f3), t(textView, f4), t(textView, f5), i2);
    }

    public static final File WPU(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xmltmp");
    }

    public static final File XQ(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, LHbnkhI.HZoqCFBukuMLN);
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xmlbak");
    }

    public static final File Z(Context context, UUID id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xml");
    }

    public static final File aYN(Context context, UUID id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xmltmp");
    }

    public static final File az(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getFilesDir(), "projects");
        file.mkdirs();
        return file;
    }

    public static final WindowManager ck(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    public static final File gh(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getFilesDir(), "media");
        file.mkdirs();
        return file;
    }

    public static /* synthetic */ void iF(Context context, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = 200;
        }
        te(context, j2);
    }

    public static final InputMethodManager mUb(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    public static final void nY(Context context, tu.aC info, LayoutInflater layoutInflater) {
        int i2;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        IE ieT = IE.t(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(ieT, "inflate(...)");
        TableLayout root = ieT.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        new AlertDialog.Builder(context).o(2132019597).setView(root).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: HI0.g9s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                afx.g(dialogInterface, i3);
            }
        }).create().show();
        String strMUb = info.mUb();
        if (strMUb != null) {
            ieT.gh.setText(strMUb);
        } else {
            ieT.gh.setVisibility(8);
        }
        if (tu.r.HI(info)) {
            ieT.f9152t.setText(info.qie() + " x " + info.J2());
            TextView textView = ieT.Uo;
            String upperCase = StringsKt.removePrefix(info.KN(), (CharSequence) "image/").toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            textView.setText(upperCase);
            ieT.HI.setText(com.alightcreative.app.motion.activities.lej.rl(info.nr(), true));
            ieT.KN.setVisibility(8);
            ieT.nr.setVisibility(8);
            ieT.qie.setVisibility(8);
            return;
        }
        int length = 0;
        if (!tu.r.ck(info)) {
            if (tu.r.ty(info)) {
                ieT.f9152t.setText(info.qie() + " x " + info.J2());
                ieT.HI.setText(com.alightcreative.app.motion.activities.lej.rl(info.nr(), true));
                tu.Ml mlN = info.n();
                if (mlN != null) {
                    List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(mlN.J2() / 1000.0f), new String[]{"."}, false, 0, 6, (Object) null);
                    int length2 = (listSplit$default.size() <= 1 || Integer.parseInt((String) listSplit$default.get(1)) == 0) ? 0 : ((String) listSplit$default.get(1)).length();
                    TextView textView2 = ieT.az;
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str3 = String.format("%." + length2 + "fkHz", Arrays.copyOf(new Object[]{Float.valueOf(mlN.J2() / 1000.0f)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    textView2.setText(str3);
                    ieT.f9150O.setText(TimeKt.formatTimeMillis$default((int) (mlN.nr() / ((long) 1000)), "hhh:mm:ss.ttt", false, 4, null));
                    TextView textView3 = ieT.Uo;
                    String strT = mlN.t();
                    if (strT == null) {
                        strT = "-";
                    }
                    textView3.setText(strT);
                    i2 = 8;
                } else {
                    i2 = 8;
                    ieT.nr.setVisibility(8);
                    ieT.qie.setVisibility(8);
                }
                ieT.rl.setVisibility(i2);
                ieT.KN.setVisibility(i2);
                return;
            }
            return;
        }
        ieT.f9152t.setText(info.qie() + " x " + info.J2());
        tu.u uVarGh = info.gh();
        String str4 = "";
        if (uVarGh != null) {
            TextView textView4 = ieT.xMQ;
            String str5 = String.format("%.02f", Arrays.copyOf(new Object[]{Float.valueOf(uVarGh.O() / 100.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            textView4.setText(str5);
            str = "fkHz";
            ieT.f9150O.setText(TimeKt.formatTimeMillis$default((int) (uVarGh.nr() / ((long) 1000)), "hhh:mm:ss", false, 4, null));
            str2 = ((Object) "") + uVarGh.t();
        } else {
            str = "fkHz";
            ieT.KN.setVisibility(8);
            ieT.nr.setVisibility(8);
            str2 = "";
        }
        ieT.HI.setText(com.alightcreative.app.motion.activities.lej.rl(info.nr(), true));
        tu.Ml mlN2 = info.n();
        if (mlN2 != null) {
            List listSplit$default2 = StringsKt.split$default((CharSequence) String.valueOf(mlN2.J2() / 1000.0f), new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default2.size() > 1 && Integer.parseInt((String) listSplit$default2.get(1)) != 0) {
                length = ((String) listSplit$default2.get(1)).length();
            }
            TextView textView5 = ieT.az;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str6 = String.format("%." + length + str, Arrays.copyOf(new Object[]{Float.valueOf(mlN2.J2() / 1000.0f)}, 1));
            Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
            textView5.setText(str6);
            if (mlN2.t() != null) {
                str4 = "\n" + mlN2.t();
            }
            str2 = ((Object) str2) + str4;
        } else {
            ieT.qie.setVisibility(8);
        }
        ieT.Uo.setText(str2);
    }

    public static final ActivityManager nr(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return (ActivityManager) systemService;
    }

    public static final File o(Context context, String id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xml");
    }

    public static final PowerManager qie(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return (PowerManager) systemService;
    }

    public static final File r(Context context, UUID id) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(id, "id");
        return FilesKt.resolve(az(context), id + ".xml.bak");
    }

    public static final float rl(Context context, float f3) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return TypedValue.applyDimension(1, f3, context.getResources().getDisplayMetrics());
    }

    public static final float t(View view, float f3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return TypedValue.applyDimension(1, f3, view.getResources().getDisplayMetrics());
    }

    public static final void te(Context context, long j2) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Vibrator vibratorNr = com.alightcreative.widget.LEl.nr(context);
        if (Build.VERSION.SDK_INT < 29) {
            vibratorNr.vibrate(j2);
            return;
        }
        VibrationEffect vibrationEffectCreatePredefined = VibrationEffect.createPredefined(0);
        Intrinsics.checkNotNullExpressionValue(vibrationEffectCreatePredefined, "createPredefined(...)");
        vibratorNr.cancel();
        vibratorNr.vibrate(vibrationEffectCreatePredefined);
    }

    public static final File ty(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File file = new File(context.getCacheDir(), "temp");
        file.mkdirs();
        return file;
    }

    public static final File xMQ(Context context) {
        Intrinsics.checkNotNullParameter(context, PtsLKY.EdUVoqIpmpJgcZ);
        File file = new File(context.getFilesDir(), "userfonts");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }
}
