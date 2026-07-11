package qHw;

import QmE.iF;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.preference.Preference;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.QuaternionKt;
import com.alightcreative.app.motion.scene.scripting.ACScript;
import com.alightcreative.app.motion.scene.scripting.ACScriptType;
import com.alightcreative.app.motion.scene.userparam.ChoiceInfo;
import com.alightcreative.app.motion.scene.userparam.SelectorStyle;
import com.alightcreative.app.motion.scene.userparam.SliderType;
import com.alightcreative.app.motion.scene.userparam.StaticTextStyle;
import com.alightcreative.app.motion.scene.userparam.UserParameter;
import com.alightcreative.app.motion.scene.userparam.UserParameterKt;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffect;
import com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import z8.C2484Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LqHw/vd;", "Landroidx/preference/PreferenceFragmentCompat;", "<init>", "()V", "", "GD", "Landroid/os/Bundle;", "savedInstanceState", "", "rootKey", "E2", "(Landroid/os/Bundle;Ljava/lang/String;)V", "LQmE/iF;", "v", "LQmE/iF;", "tUK", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "LkgE/fuX;", "Xw", "LkgE/fuX;", "ER", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "Landroid/os/Handler;", "jB", "Landroid/os/Handler;", "handler", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDevSettingsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DevSettingsFragment.kt\ncom/alightcreative/app/motion/activities/settings/DevSettingsFragment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,538:1\n3829#2:539\n4344#2,2:540\n1863#3,2:542\n1557#3:560\n1628#3,3:561\n774#3:564\n865#3,2:565\n1567#3:567\n1598#3,3:568\n543#3,6:572\n1601#3:578\n1557#3:579\n1628#3,2:580\n1782#3,4:582\n1782#3,4:586\n1782#3,4:590\n1782#3,4:594\n1630#3:598\n774#3:599\n865#3,2:600\n1863#3:602\n1611#3,9:603\n1863#3:612\n1864#3:614\n1620#3:615\n774#3:616\n865#3,2:617\n1611#3,9:619\n1863#3:628\n1864#3:630\n1620#3:631\n1611#3,9:632\n1863#3:641\n1864#3:647\n1620#3:648\n1864#3:649\n126#4:544\n153#4,3:545\n126#4:548\n153#4,3:549\n126#4:552\n153#4,3:553\n126#4:556\n153#4,3:557\n126#4:642\n153#4,3:643\n1#5:571\n1#5:613\n1#5:629\n1#5:646\n*S KotlinDebug\n*F\n+ 1 DevSettingsFragment.kt\ncom/alightcreative/app/motion/activities/settings/DevSettingsFragment\n*L\n259#1:539\n259#1:540,2\n263#1:542,2\n291#1:560\n291#1:561,3\n292#1:564\n292#1:565,2\n299#1:567\n299#1:568,3\n305#1:572,6\n299#1:578\n325#1:579\n325#1:580,2\n329#1:582,4\n331#1:586,4\n337#1:590,4\n339#1:594,4\n325#1:598\n288#1:599\n288#1:600,2\n288#1:602\n353#1:603,9\n353#1:612\n353#1:614\n353#1:615\n354#1:616\n354#1:617,2\n358#1:619,9\n358#1:628\n358#1:630\n358#1:631\n375#1:632,9\n375#1:641\n375#1:647\n375#1:648\n288#1:649\n182#1:544\n182#1:545,3\n192#1:548\n192#1:549,3\n196#1:552\n196#1:553,3\n185#1:556\n185#1:557,3\n463#1:642\n463#1:643,3\n353#1:613\n358#1:629\n375#1:646\n*E\n"})
public final class vd extends K {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final Handler handler = new Handler();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public iF eventLogger;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f72421n;
        private final String nr;
        private final UserParameter rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f72422t;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Intrinsics.areEqual(this.f72421n, nVar.f72421n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f72422t, nVar.f72422t) && Intrinsics.areEqual(this.nr, nVar.nr);
        }

        public n(String label, UserParameter param, String section, String control) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(control, "control");
            this.f72421n = label;
            this.rl = param;
            this.f72422t = section;
            this.nr = control;
        }

        public static /* synthetic */ n rl(n nVar, String str, UserParameter userParameter, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = nVar.f72421n;
            }
            if ((i2 & 2) != 0) {
                userParameter = nVar.rl;
            }
            if ((i2 & 4) != 0) {
                str2 = nVar.f72422t;
            }
            if ((i2 & 8) != 0) {
                str3 = nVar.nr;
            }
            return nVar.n(str, userParameter, str2, str3);
        }

        public final String J2() {
            return this.f72422t;
        }

        public final UserParameter O() {
            return this.rl;
        }

        public int hashCode() {
            return (((((this.f72421n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f72422t.hashCode()) * 31) + this.nr.hashCode();
        }

        public final n n(String label, UserParameter param, String section, String control) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(param, "param");
            Intrinsics.checkNotNullParameter(section, "section");
            Intrinsics.checkNotNullParameter(control, "control");
            return new n(label, param, section, control);
        }

        public final String nr() {
            return this.f72421n;
        }

        public final String t() {
            return this.nr;
        }

        public String toString() {
            return "ParamInfo(label=" + this.f72421n + ", param=" + this.rl + ", section=" + this.f72422t + ", control=" + this.nr + ")";
        }
    }

    private static final List UhV(List list, VisualEffect visualEffect, Context context) {
        int i2;
        int i3;
        int i5;
        int i7;
        String strValueOf;
        Object objPrevious;
        String strN;
        String str;
        String text;
        ArrayList<n> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i8 = 0;
        for (Object obj : list) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserParameter userParameter = (UserParameter) obj;
            String string = StringsKt.trim((CharSequence) Iy.w6.n(visualEffect.getLocalizedStrings(), context, userParameter.getLabel())).toString();
            if (StringsKt.isBlank(string)) {
                string = i(userParameter.getName());
            }
            List listFilterIsInstance = CollectionsKt.filterIsInstance(list.subList(0, i8), UserParameter.StaticText.class);
            ListIterator listIterator = listFilterIsInstance.listIterator(listFilterIsInstance.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (((UserParameter.StaticText) objPrevious).getStyle() == StaticTextStyle.SECTION) {
                    break;
                }
            }
            UserParameter.StaticText staticText = (UserParameter.StaticText) objPrevious;
            if (staticText == null || (text = staticText.getText()) == null || (strN = Iy.w6.n(visualEffect.getLocalizedStrings(), context, text)) == null) {
                strN = "";
            }
            if (userParameter instanceof UserParameter.Slider) {
                str = "slider";
            } else if (userParameter instanceof UserParameter.StaticText) {
                str = "statictext";
            } else if (userParameter instanceof UserParameter.Spinner) {
                str = "spinner";
            } else if (userParameter instanceof UserParameter.Angle) {
                str = "angle";
            } else if (userParameter instanceof UserParameter.Orientation) {
                str = "orientation";
            } else if (userParameter instanceof UserParameter.Color) {
                str = TtmlNode.ATTR_TTS_COLOR;
            } else if (userParameter instanceof UserParameter.HueRing) {
                str = "huering";
            } else if (userParameter instanceof UserParameter.HueDisc) {
                str = "huedisc";
            } else if (userParameter instanceof UserParameter.Texture) {
                str = "texture";
            } else if (userParameter instanceof UserParameter.FloatValue) {
                str = "float";
            } else if (userParameter instanceof UserParameter.Switch) {
                str = "switch";
            } else if ((userParameter instanceof UserParameter.Point) || (userParameter instanceof UserParameter.XYZ)) {
                str = "position";
            } else {
                if (!(userParameter instanceof UserParameter.Selector)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "selector";
            }
            arrayList.add(new n(string, userParameter, strN, str));
            i8 = i9;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (n nVarRl : arrayList) {
            String strT = nVarRl.t();
            if (strT.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char cCharAt = strT.charAt(0);
                if (Character.isLowerCase(cCharAt)) {
                    Locale locale = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(locale, wDgKoYAES.JtEZZGEwfmQOl);
                    strValueOf = CharsKt.titlecase(cCharAt, locale);
                } else {
                    strValueOf = String.valueOf(cCharAt);
                }
                sb.append((Object) strValueOf);
                String strSubstring = strT.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb.append(strSubstring);
                strT = sb.toString();
            }
            if (arrayList.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = arrayList.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((n) it.next()).nr(), nVarRl.nr()) && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i2 > 1) {
                if (arrayList.isEmpty()) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    for (n nVar : arrayList) {
                        if ((Intrinsics.areEqual(nVar.nr(), nVarRl.nr()) && Intrinsics.areEqual(nVar.J2(), nVarRl.J2())) && (i3 = i3 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i3 > 1) {
                    if (arrayList.isEmpty()) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (n nVar2 : arrayList) {
                            if ((Intrinsics.areEqual(nVar2.nr(), nVarRl.nr()) && Intrinsics.areEqual(nVar2.t(), nVarRl.t())) && (i5 = i5 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i5 <= 1) {
                        nVarRl = n.rl(nVarRl, nVarRl.nr() + " (" + strT + ")", null, null, null, 14, null);
                    } else {
                        if (arrayList.isEmpty()) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                            for (n nVar3 : arrayList) {
                                if ((Intrinsics.areEqual(nVar3.nr(), nVarRl.nr()) && Intrinsics.areEqual(nVar3.J2(), nVarRl.J2()) && Intrinsics.areEqual(nVar3.t(), nVarRl.t())) && (i7 = i7 + 1) < 0) {
                                    CollectionsKt.throwCountOverflow();
                                }
                            }
                        }
                        if (i7 <= 1) {
                            nVarRl = nVarRl.J2().length() == 0 ? n.rl(nVarRl, nVarRl.nr() + " (" + strT + ")", null, null, null, 14, null) : n.rl(nVarRl, nVarRl.J2() + " - " + strT + ")", null, null, null, 14, null);
                        }
                    }
                } else if (!(nVarRl.J2().length() == 0)) {
                    nVarRl = n.rl(nVarRl, nVarRl.J2() + " - " + nVarRl.nr(), null, null, null, 14, null);
                }
            }
            arrayList2.add(nVarRl);
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH() {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[StaticTextStyle.values().length];
            try {
                iArr[StaticTextStyle.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StaticTextStyle.SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SliderType.values().length];
            try {
                iArr2[SliderType.FLOAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SliderType.RELATIVE_FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SliderType.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SliderType.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SliderType.RELATIVE_PERCENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SliderType.ANGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SliderType.ANGLE_RANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SliderType.SECONDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SliderType.FRAMES.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SliderType.RPM.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SliderType.f46339HZ.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SliderType.KELVIN.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SelectorStyle.values().length];
            try {
                iArr3[SelectorStyle.DROPDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[SelectorStyle.RADIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ACScriptType.values().length];
            try {
                iArr4[ACScriptType.JS.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ACScriptType.External.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Aum(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setInstalledAppVersions(SetsKt.setOf("5.0.273.1028425"));
        HI0.fuX.KN(vdVar, "Installed Version History", jVar.getInstalledAppVersions().isEmpty() ? "Empty" : CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.toList(jVar.getInstalledAppVersions())), "\n", null, null, 0, null, null, 62, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String Bu(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("\"" + ((String) entry.getKey()) + "\",\"" + ((String) entry.getValue()) + "\"");
        }
        return "Device Info\n\n\n==== DEVICE INFO ========================================\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null) + "\n===================================================\n\n\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EF(final vd vdVar, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(preference, "<unused var>");
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.c
            @Override // java.lang.Runnable
            public final void run() {
                vd.uG(this.f72399n);
            }
        }, 30L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence EWS(VisualEffect visualEffect, Context context, UserParameter.StaticText it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Iy.w6.n(visualEffect.getLocalizedStrings(), context, it.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HBN(FragmentActivity fragmentActivity, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.getSeenElementDownloads().clear();
        jVar.setElementTabVisitTimestamp(0L);
        com.alightcreative.app.motion.activities.main.Ml.mUb();
        Toast.makeText(fragmentActivity, "New Element Recommendations - Reset Complete", 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit How(AlertDialog alertDialog, vd vdVar, File file, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        alertDialog.dismiss();
        FragmentActivity fragmentActivityRequireActivity = vdVar.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        com.alightcreative.share.j.T(fragmentActivityRequireActivity, file, null, (768 & 4) != 0 ? false : false, 0, 0, "application/zip", "Share Effect Doc Templates ZIP", vdVar.tUK(), (768 & 256) != 0 ? Ken.n.f5625O : null, (768 & 512) != 0 ? new Function1() { // from class: Ken.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.share.j.bzg((com.alightcreative.share.n) obj);
            }
        } : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence K(String it) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 0) {
            return it;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = it.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            strValueOf = CharsKt.titlecase(cCharAt, ROOT);
        } else {
            strValueOf = String.valueOf(cCharAt);
        }
        sb.append((Object) strValueOf);
        String strSubstring = it.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:197:0x077f A[Catch: all -> 0x0269, TryCatch #5 {all -> 0x0269, blocks: (B:71:0x0253, B:77:0x0271, B:197:0x077f, B:198:0x0790, B:200:0x0796, B:201:0x07c2, B:204:0x07f6, B:81:0x029c, B:84:0x02b2, B:85:0x02c1, B:86:0x02c4, B:87:0x02c9, B:100:0x02ed, B:102:0x034b, B:104:0x034f, B:108:0x0364, B:109:0x038b, B:110:0x0390, B:113:0x039e, B:115:0x03a2, B:116:0x03b1, B:117:0x03b4, B:118:0x03b9, B:131:0x03dd, B:132:0x0436, B:135:0x043c, B:138:0x0448, B:139:0x0499, B:142:0x04a5, B:144:0x04a9, B:147:0x04b8, B:151:0x0519, B:153:0x05c2, B:157:0x05d9, B:152:0x055f, B:159:0x05ef, B:162:0x0606, B:165:0x060b, B:167:0x060f, B:171:0x0628, B:172:0x0635, B:174:0x0639, B:176:0x0683, B:178:0x0689, B:179:0x06ce, B:181:0x06d2, B:185:0x06e7, B:186:0x0706, B:188:0x070c, B:192:0x0722, B:193:0x073c, B:194:0x0741, B:195:0x0742, B:207:0x0812, B:208:0x0817, B:232:0x0898, B:236:0x08b4, B:239:0x08c3, B:240:0x08c8), top: B:292:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07f6 A[Catch: all -> 0x0269, TryCatch #5 {all -> 0x0269, blocks: (B:71:0x0253, B:77:0x0271, B:197:0x077f, B:198:0x0790, B:200:0x0796, B:201:0x07c2, B:204:0x07f6, B:81:0x029c, B:84:0x02b2, B:85:0x02c1, B:86:0x02c4, B:87:0x02c9, B:100:0x02ed, B:102:0x034b, B:104:0x034f, B:108:0x0364, B:109:0x038b, B:110:0x0390, B:113:0x039e, B:115:0x03a2, B:116:0x03b1, B:117:0x03b4, B:118:0x03b9, B:131:0x03dd, B:132:0x0436, B:135:0x043c, B:138:0x0448, B:139:0x0499, B:142:0x04a5, B:144:0x04a9, B:147:0x04b8, B:151:0x0519, B:153:0x05c2, B:157:0x05d9, B:152:0x055f, B:159:0x05ef, B:162:0x0606, B:165:0x060b, B:167:0x060f, B:171:0x0628, B:172:0x0635, B:174:0x0639, B:176:0x0683, B:178:0x0689, B:179:0x06ce, B:181:0x06d2, B:185:0x06e7, B:186:0x0706, B:188:0x070c, B:192:0x0722, B:193:0x073c, B:194:0x0741, B:195:0x0742, B:207:0x0812, B:208:0x0817, B:232:0x0898, B:236:0x08b4, B:239:0x08c3, B:240:0x08c8), top: B:292:0x0253 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit Po6(File file, final Context context) {
        ZipOutputStream zipOutputStream;
        Throwable th;
        Iterator it;
        String strJoinToString$default;
        String str;
        String str2;
        String str3;
        String strSubstringAfterLast$default;
        ZipOutputStream zipOutputStream2;
        String str4;
        ArrayList arrayList;
        String str5;
        Map mapMapOf;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        ArrayList arrayList2;
        String str12;
        String str13;
        Object next;
        String str14;
        String str15;
        Map mapMapOf2;
        String str16;
        String str17;
        String str18 = ".";
        String str19 = "getPathSegments(...)";
        String str20 = "selector";
        String str21 = "position";
        String str22 = "max";
        String str23 = "min";
        String str24 = "float";
        String str25 = "relative-float";
        String str26 = "integer";
        String str27 = "percent";
        ZipOutputStream zipOutputStream3 = new ZipOutputStream(new FileOutputStream(file));
        try {
            List<VisualEffect> visualEffects = VisualEffectKt.getVisualEffects();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = visualEffects.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                try {
                    Object next2 = it3.next();
                    VisualEffect visualEffect = (VisualEffect) next2;
                    if (!visualEffect.getExperimental() && !visualEffect.getDeprecated() && !visualEffect.getInternal()) {
                        arrayList3.add(next2);
                    }
                    it2 = it3;
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream3;
                }
            }
            it = arrayList3.iterator();
        } catch (Throwable th3) {
            th = th3;
            zipOutputStream = zipOutputStream3;
        }
        while (true) {
            Iterator it4 = it;
            if (!it.hasNext()) {
                ZipOutputStream zipOutputStream4 = zipOutputStream3;
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipOutputStream4, null);
                return Unit.INSTANCE;
            }
            final VisualEffect visualEffect2 = (VisualEffect) it4.next();
            String str28 = str24;
            String strN = Iy.w6.n(visualEffect2.getLocalizedStrings(), context, visualEffect2.getName());
            String str29 = str25;
            String strReplace = new Regex("[^A-Za-z0-9]").replace(strN, "-");
            Locale ENGLISH = Locale.ENGLISH;
            String str30 = str26;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String lowerCase = strReplace.toLowerCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            List<UserParameter> parameters = visualEffect2.getParameters();
            ArrayList arrayList4 = new ArrayList();
            Iterator it5 = parameters.iterator();
            while (it5.hasNext()) {
                Iterator it6 = it5;
                UserParameter userParameter = (UserParameter) it5.next();
                String str31 = str27;
                UserParameter.StaticText staticText = userParameter instanceof UserParameter.StaticText ? (UserParameter.StaticText) userParameter : null;
                if (staticText != null) {
                    arrayList4.add(staticText);
                }
                str27 = str31;
                it5 = it6;
            }
            String str32 = str27;
            ArrayList arrayList5 = new ArrayList();
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                Object next3 = it7.next();
                Iterator it8 = it7;
                String str33 = str18;
                if (((UserParameter.StaticText) next3).getStyle() == StaticTextStyle.TIP) {
                    arrayList5.add(next3);
                }
                it7 = it8;
                str18 = str33;
            }
            String str34 = str18;
            String strJoinToString$default2 = CollectionsKt.joinToString$default(arrayList5, "\n\n", null, null, 0, null, new Function1() { // from class: qHw.Ew
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vd.EWS(visualEffect2, context, (UserParameter.StaticText) obj);
                }
            }, 30, null);
            List listUhV = UhV(visualEffect2.getParameters(), visualEffect2, context);
            ArrayList arrayList6 = new ArrayList();
            Iterator it9 = listUhV.iterator();
            while (true) {
                List list = listUhV;
                String str35 = ": ";
                Iterator it10 = it9;
                if (it9.hasNext()) {
                    n nVar = (n) it10.next();
                    String strN2 = Iy.w6.n(visualEffect2.getLocalizedStrings(), context, nVar.nr());
                    UserParameter userParameterO = nVar.O();
                    String str36 = str19;
                    if (userParameterO instanceof UserParameter.StaticText) {
                        int i2 = j.$EnumSwitchMapping$0[((UserParameter.StaticText) nVar.O()).getStyle().ordinal()];
                        if (i2 == 1) {
                            str17 = null;
                        } else {
                            if (i2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str17 = "### " + Iy.w6.n(visualEffect2.getLocalizedStrings(), context, ((UserParameter.StaticText) nVar.O()).getText());
                        }
                    } else if (userParameterO instanceof UserParameter.Texture) {
                        str17 = null;
                    } else if (userParameterO instanceof UserParameter.Selector) {
                        str17 = "- " + strN2 + ": \n" + CollectionsKt.joinToString$default(((UserParameter.Selector) nVar.O()).getChoices(), "\n", null, null, 0, null, new Function1() { // from class: qHw.nKK
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return vd.hRu(visualEffect2, context, (ChoiceInfo) obj);
                            }
                        }, 30, null);
                    } else {
                        str17 = "- " + strN2 + ": ";
                    }
                    if (str17 != null) {
                        arrayList6.add(str17);
                    }
                    it9 = it10;
                    listUhV = list;
                    str19 = str36;
                } else {
                    String str37 = str19;
                    String strJoinToString$default3 = CollectionsKt.joinToString$default(arrayList6, "\n", null, null, 0, null, null, 62, null);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        try {
                            n nVar2 = (n) it11.next();
                            UserParameter userParameterO2 = nVar2.O();
                            String strNr = nVar2.nr();
                            VisualEffect visualEffect3 = visualEffect2;
                            Iterator it12 = it11;
                            zipOutputStream2 = zipOutputStream3;
                            String str38 = lowerCase;
                            if (userParameterO2 instanceof UserParameter.Color) {
                                try {
                                    str4 = str35;
                                    arrayList = arrayList7;
                                    str5 = strN;
                                    mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", TtmlNode.ATTR_TTS_COLOR), TuplesKt.to("type", ((UserParameter.Color) userParameterO2).getHasAlpha() ? "rgba" : "rgb"), TuplesKt.to("default", ((UserParameter.Color) userParameterO2).getDefaultValue().toString()));
                                } catch (Throwable th4) {
                                    th = th4;
                                    th = th;
                                    zipOutputStream = zipOutputStream2;
                                    try {
                                        throw th;
                                    } catch (Throwable th5) {
                                        CloseableKt.closeFinally(zipOutputStream, th);
                                        throw th5;
                                    }
                                }
                            } else {
                                str5 = strN;
                                if (userParameterO2 instanceof UserParameter.Slider) {
                                    switch (j.$EnumSwitchMapping$1[((UserParameter.Slider) userParameterO2).getSliderType().ordinal()]) {
                                        case 1:
                                            str16 = str28;
                                            break;
                                        case 2:
                                            str16 = str29;
                                            break;
                                        case 3:
                                            str16 = str30;
                                            break;
                                        case 4:
                                            str16 = str32;
                                            break;
                                        case 5:
                                            str16 = "relative-percent";
                                            break;
                                        case 6:
                                            str16 = "angle";
                                            break;
                                        case 7:
                                            str16 = "angle-range";
                                            break;
                                        case 8:
                                            str16 = "seconds";
                                            break;
                                        case 9:
                                            str16 = "frames";
                                            break;
                                        case 10:
                                            str16 = "rpm";
                                            break;
                                        case 11:
                                            str16 = "hz";
                                            break;
                                        case 12:
                                            str16 = "kelvin";
                                            break;
                                        default:
                                            throw new NoWhenBranchMatchedException();
                                    }
                                    mapMapOf2 = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", "slider"), TuplesKt.to("type", str16), TuplesKt.to(str23, UserParameterKt.format(((UserParameter.Slider) userParameterO2).getSliderType(), ((UserParameter.Slider) userParameterO2).getMinValue())), TuplesKt.to(str22, UserParameterKt.format(((UserParameter.Slider) userParameterO2).getSliderType(), ((UserParameter.Slider) userParameterO2).getMaxValue())), TuplesKt.to("default", UserParameterKt.format(((UserParameter.Slider) userParameterO2).getSliderType(), ((UserParameter.Slider) userParameterO2).getDefaultValue())));
                                } else {
                                    if (userParameterO2 instanceof UserParameter.StaticText) {
                                        int i3 = j.$EnumSwitchMapping$0[((UserParameter.StaticText) userParameterO2).getStyle().ordinal()];
                                        if (i3 != 1) {
                                            if (i3 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            mapMapOf2 = MapsKt.mapOf(TuplesKt.to("label", Iy.w6.n(visualEffect3.getLocalizedStrings(), context, ((UserParameter.StaticText) userParameterO2).getText())), TuplesKt.to("control", "statictext"), TuplesKt.to("type", "section"));
                                        }
                                        str4 = str35;
                                        arrayList = arrayList7;
                                        str8 = str20;
                                        str9 = str21;
                                        str7 = str22;
                                        str6 = str23;
                                        mapMapOf = null;
                                    } else if (userParameterO2 instanceof UserParameter.Spinner) {
                                        switch (j.$EnumSwitchMapping$1[((UserParameter.Spinner) userParameterO2).getSliderType().ordinal()]) {
                                            case 1:
                                                str15 = str28;
                                                break;
                                            case 2:
                                                str15 = str29;
                                                break;
                                            case 3:
                                                str15 = str30;
                                                break;
                                            case 4:
                                                str15 = str32;
                                                break;
                                            case 5:
                                                str15 = "relative-percent";
                                                break;
                                            case 6:
                                                str15 = "angle";
                                                break;
                                            case 7:
                                                str15 = "angle-range";
                                                break;
                                            case 8:
                                                str15 = "seconds";
                                                break;
                                            case 9:
                                                str15 = "frames";
                                                break;
                                            case 10:
                                                str15 = "rpm";
                                                break;
                                            case 11:
                                                str15 = "hz";
                                                break;
                                            case 12:
                                                str15 = "kelvin";
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        mapMapOf2 = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", "spinner"), TuplesKt.to("type", str15), TuplesKt.to(str23, UserParameterKt.format(((UserParameter.Spinner) userParameterO2).getSliderType(), ((UserParameter.Spinner) userParameterO2).getMinValue())), TuplesKt.to(str22, UserParameterKt.format(((UserParameter.Spinner) userParameterO2).getSliderType(), ((UserParameter.Spinner) userParameterO2).getMaxValue())), TuplesKt.to("default", UserParameterKt.format(((UserParameter.Spinner) userParameterO2).getSliderType(), ((UserParameter.Spinner) userParameterO2).getDefaultValue())));
                                    } else if (userParameterO2 instanceof UserParameter.Angle) {
                                        str4 = str35;
                                        arrayList = arrayList7;
                                        str8 = str20;
                                        str9 = str21;
                                        str7 = str22;
                                        str6 = str23;
                                        mapMapOf = null;
                                    } else {
                                        str7 = str22;
                                        if (userParameterO2 instanceof UserParameter.Orientation) {
                                            str4 = str35;
                                            arrayList = arrayList7;
                                            mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", "orientation"), TuplesKt.to("type", "quaternion"), TuplesKt.to("default", (Typography.quote + QuaternionKt.eulerAngles(((UserParameter.Orientation) userParameterO2).getDefaultValue()).toString()) + "\""));
                                            str8 = str20;
                                            str9 = str21;
                                            str6 = str23;
                                        } else if (userParameterO2 instanceof UserParameter.HueRing) {
                                            str4 = str35;
                                            arrayList = arrayList7;
                                            str8 = str20;
                                            str9 = str21;
                                            str6 = str23;
                                            mapMapOf = null;
                                        } else {
                                            if (userParameterO2 instanceof UserParameter.HueDisc) {
                                                if (((UserParameter.HueDisc) userParameterO2).getBias()) {
                                                    str6 = str23;
                                                    arrayList = arrayList7;
                                                    String str39 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((UserParameter.HueDisc) userParameterO2).getDefaultValue().getX())}, 1));
                                                    Intrinsics.checkNotNullExpressionValue(str39, "format(...)");
                                                    str4 = str35;
                                                    String str40 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((UserParameter.HueDisc) userParameterO2).getDefaultValue().getY() * 100)}, 1));
                                                    Intrinsics.checkNotNullExpressionValue(str40, "format(...)");
                                                    String str41 = ((UserParameter.HueDisc) userParameterO2).getDefaultValue().getZ() >= 0.0f ? "+" : "";
                                                    str12 = str20;
                                                    str13 = str21;
                                                    String str42 = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(((UserParameter.HueDisc) userParameterO2).getDefaultValue().getZ())}, 1));
                                                    Intrinsics.checkNotNullExpressionValue(str42, "format(...)");
                                                    str14 = str39 + "º " + str40 + "% " + str41 + str42;
                                                } else {
                                                    str4 = str35;
                                                    arrayList = arrayList7;
                                                    str12 = str20;
                                                    str13 = str21;
                                                    str6 = str23;
                                                    String str43 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((UserParameter.HueDisc) userParameterO2).getDefaultValue().getX())}, 1));
                                                    Intrinsics.checkNotNullExpressionValue(str43, "format(...)");
                                                    String str44 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((UserParameter.HueDisc) userParameterO2).getDefaultValue().getY() * 100)}, 1));
                                                    Intrinsics.checkNotNullExpressionValue(str44, "format(...)");
                                                    str14 = str43 + "º " + str44 + "%";
                                                }
                                                mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", "huedisc"), TuplesKt.to("type", ((UserParameter.HueDisc) userParameterO2).getBias() ? "hue+bias" : "hue"), TuplesKt.to("default", str14));
                                            } else {
                                                str4 = str35;
                                                arrayList = arrayList7;
                                                str12 = str20;
                                                str13 = str21;
                                                str6 = str23;
                                                if ((userParameterO2 instanceof UserParameter.Texture) || (userParameterO2 instanceof UserParameter.FloatValue)) {
                                                    str8 = str12;
                                                    str9 = str13;
                                                    mapMapOf = null;
                                                } else if (userParameterO2 instanceof UserParameter.Switch) {
                                                    mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", "switch"), TuplesKt.to("type", "switch"), TuplesKt.to("default", ((UserParameter.Switch) userParameterO2).getDefaultValue() ? NodeModuleProcess.FUNCTION_ON : "off"));
                                                } else {
                                                    if (userParameterO2 instanceof UserParameter.Point) {
                                                        str9 = str13;
                                                        mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", str9), TuplesKt.to("type", "xy"), TuplesKt.to("default", (Typography.quote + ((UserParameter.Point) userParameterO2).getDefaultValue().toString()) + "\""));
                                                    } else {
                                                        str9 = str13;
                                                        if (userParameterO2 instanceof UserParameter.XYZ) {
                                                            mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", str9), TuplesKt.to("type", "xyz"), TuplesKt.to("default", (Typography.quote + ((UserParameter.XYZ) userParameterO2).getDefaultValue().toString()) + "\""));
                                                        } else {
                                                            if (!(userParameterO2 instanceof UserParameter.Selector)) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            int i5 = j.$EnumSwitchMapping$2[((UserParameter.Selector) userParameterO2).getStyle().ordinal()];
                                                            if (i5 == 1) {
                                                                str8 = str12;
                                                                mapMapOf = MapsKt.mapOf(TuplesKt.to("label", strNr), TuplesKt.to("control", str8), TuplesKt.to("type", "dropdown"), TuplesKt.to("default", Iy.w6.n(visualEffect3.getLocalizedStrings(), context, ((UserParameter.Selector) userParameterO2).getChoices().get(((UserParameter.Selector) userParameterO2).getDefaultChoice()).getLabel())));
                                                            } else {
                                                                if (i5 != 2) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                Pair pair = TuplesKt.to("label", strNr);
                                                                str8 = str12;
                                                                Pair pair2 = TuplesKt.to("control", str8);
                                                                Pair pair3 = TuplesKt.to("type", "radio");
                                                                Iy.n localizedStrings = visualEffect3.getLocalizedStrings();
                                                                Iterator<T> it13 = ((UserParameter.Selector) userParameterO2).getChoices().iterator();
                                                                while (true) {
                                                                    if (it13.hasNext()) {
                                                                        next = it13.next();
                                                                        if (((ChoiceInfo) next).getValue() == ((UserParameter.Selector) userParameterO2).getDefaultChoice()) {
                                                                        }
                                                                    } else {
                                                                        next = null;
                                                                    }
                                                                }
                                                                Intrinsics.checkNotNull(next);
                                                                mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("default", Iy.w6.n(localizedStrings, context, ((ChoiceInfo) next).getLabel())));
                                                            }
                                                        }
                                                    }
                                                    str8 = str12;
                                                }
                                            }
                                            str8 = str12;
                                            str9 = str13;
                                        }
                                    }
                                    if (mapMapOf == null) {
                                        ArrayList arrayList8 = new ArrayList(mapMapOf.size());
                                        for (Map.Entry entry : mapMapOf.entrySet()) {
                                            String str45 = (String) entry.getKey();
                                            String str46 = (String) entry.getValue();
                                            StringBuilder sb = new StringBuilder();
                                            sb.append(str45);
                                            String str47 = str4;
                                            sb.append(str47);
                                            sb.append(str46);
                                            arrayList8.add(sb.toString());
                                            str4 = str47;
                                        }
                                        str10 = str4;
                                        str11 = "  - {" + CollectionsKt.joinToString$default(arrayList8, ", ", null, null, 0, null, null, 62, null) + "}";
                                    } else {
                                        str10 = str4;
                                        str11 = null;
                                    }
                                    if (str11 == null) {
                                        arrayList2 = arrayList;
                                        arrayList2.add(str11);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                    str20 = str8;
                                    str35 = str10;
                                    it11 = it12;
                                    strN = str5;
                                    zipOutputStream3 = zipOutputStream2;
                                    lowerCase = str38;
                                    str22 = str7;
                                    str23 = str6;
                                    str21 = str9;
                                    arrayList7 = arrayList2;
                                    visualEffect2 = visualEffect3;
                                }
                                str4 = str35;
                                arrayList = arrayList7;
                                mapMapOf = mapMapOf2;
                            }
                            str8 = str20;
                            str9 = str21;
                            str7 = str22;
                            str6 = str23;
                            if (mapMapOf == null) {
                            }
                            if (str11 == null) {
                            }
                            str20 = str8;
                            str35 = str10;
                            it11 = it12;
                            strN = str5;
                            zipOutputStream3 = zipOutputStream2;
                            lowerCase = str38;
                            str22 = str7;
                            str23 = str6;
                            str21 = str9;
                            arrayList7 = arrayList2;
                            visualEffect2 = visualEffect3;
                        } catch (Throwable th6) {
                            th = th6;
                            zipOutputStream2 = zipOutputStream3;
                        }
                    }
                    String str48 = strN;
                    VisualEffect visualEffect4 = visualEffect2;
                    String str49 = str20;
                    ZipOutputStream zipOutputStream5 = zipOutputStream3;
                    String str50 = str22;
                    String str51 = str23;
                    String str52 = lowerCase;
                    ArrayList arrayList9 = arrayList7;
                    String str53 = str21;
                    try {
                        strJoinToString$default = CollectionsKt.joinToString$default(arrayList9, "\n", null, null, 0, null, null, 62, null);
                    } catch (Throwable th7) {
                        th = th7;
                        zipOutputStream = zipOutputStream5;
                    }
                    if (StringsKt.startsWith$default(visualEffect4.getId(), "com.alightcreative.effects.repeat.", false, 2, (Object) null)) {
                        str = "repeat";
                    } else if (!visualEffect4.getShaderGroups().isEmpty()) {
                        str = "raster";
                    } else {
                        if (!Intrinsics.areEqual(visualEffect4.getId(), "com.alightcreative.effects.drawing.progress") && !Intrinsics.areEqual(visualEffect4.getId(), "com.alightcreative.effects.drawing.strokecolor") && !Intrinsics.areEqual(visualEffect4.getId(), "com.alightcreative.effects.drawing.stroketaper")) {
                            if (!visualEffect4.getScripts().isEmpty()) {
                                ACScript aCScript = (ACScript) CollectionsKt.first((List) visualEffect4.getScripts());
                                int i7 = j.$EnumSwitchMapping$3[aCScript.getType().ordinal()];
                                if (i7 != 1) {
                                    if (i7 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (!Intrinsics.areEqual(aCScript.getSource(), "com.alightcreative.script.movealongpath")) {
                                        str = "unknown";
                                    }
                                }
                                str = "transform";
                            }
                            throw th;
                        }
                        str = "vector";
                    }
                    String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.trimIndent("\n                        ---\n                        acdoc-type: effect\n                        acdoc-status: draft\n                        effect-id: " + visualEffect4.getId() + "\n                        effect-type: " + str + "\n                        effect-tags: [" + CollectionsKt.joinToString$default(visualEffect4.getTags(), ", ", null, null, 0, null, null, 62, null) + "]\n                        effect-params:\n                        {{PARAM-YAML}}\n                        ---\n                        \n                        # " + str48 + "\n                        \n                        " + Iy.w6.n(visualEffect4.getLocalizedStrings(), context, visualEffect4.getDesc()) + "\n                        \n                        ## Parameters\n                        \n                        {{PARAMS}}\n                        \n                        ## Usage\n                        \n                        {{USAGE}}\n                    "), "{{PARAMS}}", strJoinToString$default3, false, 4, (Object) null), "{{PARAM-YAML}}", strJoinToString$default, false, 4, (Object) null), "{{USAGE}}", strJoinToString$default2, false, 4, (Object) null);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str52);
                    sb2.append(".md");
                    ZipEntry zipEntry = new ZipEntry(sb2.toString());
                    zipOutputStream = zipOutputStream5;
                    try {
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bytes = strReplace$default.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        zipOutputStream.write(bytes);
                        Uri thumbnail = visualEffect4.getThumbnail();
                        if (thumbnail != null) {
                            if (Intrinsics.areEqual(thumbnail.getScheme(), FileUploadManager.f61570h)) {
                                List<String> pathSegments = thumbnail.getPathSegments();
                                str3 = str37;
                                Intrinsics.checkNotNullExpressionValue(pathSegments, str3);
                                if (Intrinsics.areEqual(CollectionsKt.firstOrNull((List) pathSegments), "android_asset")) {
                                    AssetManager assets = context.getAssets();
                                    List<String> pathSegments2 = thumbnail.getPathSegments();
                                    Intrinsics.checkNotNullExpressionValue(pathSegments2, str3);
                                    InputStream inputStreamOpen = assets.open(CollectionsKt.joinToString$default(CollectionsKt.drop(pathSegments2, 1), "/", null, null, 0, null, null, 62, null));
                                    try {
                                        Intrinsics.checkNotNull(inputStreamOpen);
                                        byte[] bytes2 = ByteStreamsKt.readBytes(inputStreamOpen);
                                        CloseableKt.closeFinally(inputStreamOpen, null);
                                        String lastPathSegment = thumbnail.getLastPathSegment();
                                        if (lastPathSegment != null) {
                                            str2 = str34;
                                            strSubstringAfterLast$default = StringsKt.substringAfterLast$default(lastPathSegment, str2, (String) null, 2, (Object) null);
                                        } else {
                                            str2 = str34;
                                            strSubstringAfterLast$default = null;
                                        }
                                        Intrinsics.checkNotNull(strSubstringAfterLast$default);
                                        zipOutputStream.putNextEntry(new ZipEntry(str52 + str2 + strSubstringAfterLast$default));
                                        zipOutputStream.write(bytes2);
                                    } finally {
                                    }
                                } else {
                                    str2 = str34;
                                }
                            } else {
                                str2 = str34;
                                str3 = str37;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else {
                            str2 = str34;
                            str3 = str37;
                        }
                        str21 = str53;
                        str19 = str3;
                        str18 = str2;
                        str24 = str28;
                        str25 = str29;
                        str26 = str30;
                        str27 = str32;
                        str22 = str50;
                        str23 = str51;
                        zipOutputStream3 = zipOutputStream;
                        str20 = str49;
                        it = it4;
                    } catch (Throwable th8) {
                        th = th8;
                        th = th;
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean QZ6(FragmentActivity fragmentActivity, com.google.firebase.iid.o oVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HI0.afx.O(fragmentActivity).setPrimaryClip(ClipData.newPlainText("Firebase IID", oVar.n()));
        Toast.makeText(fragmentActivity, 2132017504, 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RQ(FragmentActivity fragmentActivity, Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Toast.makeText(fragmentActivity, "Remote Config - Reloaded!", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean T3L(final FragmentActivity fragmentActivity, vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C2484Dsr c2484Dsr = C2484Dsr.f76360n;
        Resources resources = fragmentActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        final Map mapN = c2484Dsr.n(resources, HI0.afx.nr(fragmentActivity));
        XoT.C.Uo(vdVar, new Function0() { // from class: qHw.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.Bu(mapN);
            }
        });
        AlertDialog.Builder title = new AlertDialog.Builder(fragmentActivity).setTitle("Device Info");
        ArrayList arrayList = new ArrayList(mapN.size());
        for (Map.Entry entry : mapN.entrySet()) {
            arrayList.add(((String) entry.getKey()) + l.ae + ((String) entry.getValue()));
        }
        AlertDialog alertDialogCreate = title.setMessage(CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)).setNegativeButton("Copy Text", new DialogInterface.OnClickListener() { // from class: qHw.Xo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                vd.p0N(dialogInterface, i2);
            }
        }).setNeutralButton("Copy CSV", new DialogInterface.OnClickListener() { // from class: qHw.eO
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                vd.Uf(dialogInterface, i2);
            }
        }).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: qHw.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                vd.f(dialogInterface, i2);
            }
        }).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: qHw.QJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd.ub(fragmentActivity, mapN, view);
            }
        });
        alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: qHw.l3D
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vd.Qu(fragmentActivity, mapN, view);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UF(final vd vdVar, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(preference, "<unused var>");
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.aC
            @Override // java.lang.Runnable
            public final void run() {
                vd.X4T(this.f72397n);
            }
        }, 30L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Vvq(final vd vdVar, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(preference, "<unused var>");
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.C
            @Override // java.lang.Runnable
            public final void run() {
                vd.y(this.f72374n);
            }
        }, 30L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean VwL(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        vdVar.GD();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(vd vdVar, com.google.firebase.remoteconfig.j jVar, final FragmentActivity fragmentActivity, final Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        XoT.C.Uo(vdVar, new Function0() { // from class: qHw.afx
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.a63(task);
            }
        });
        if (task.isSuccessful()) {
            jVar.Uo().addOnCompleteListener(new OnCompleteListener() { // from class: qHw.Z
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    vd.RQ(fragmentActivity, task2);
                }
            });
        } else {
            Toast.makeText(fragmentActivity, "Remote Config - Reloaded FAIL", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4T(vd vdVar) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setSkuListFetched(0L);
        vdVar.ER().xMQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Zmq(final vd vdVar, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(preference, "<unused var>");
        if (StringsKt.isBlank(com.alightcreative.app.motion.persist.j.INSTANCE.getFirebaseEmulatorAddress())) {
            Toast.makeText(vdVar.getContext(), "Set emulator address first!", 0).show();
            return false;
        }
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.UGc
            @Override // java.lang.Runnable
            public final void run() {
                vd.JVN(this.f72394n);
            }
        }, 30L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Zn(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setShowed36EffectBrowserPopup(false);
        jVar.setShowBookmarkTooltip(false);
        jVar.setShowNewFeaturePopup(false);
        jVar.setShowMBTooltip(false);
        jVar.setTurnedOnCameraView(false);
        HI0.fuX.KN(vdVar, "Popups Reset", "The following popups and balloons have been reset and will be displayed again if relevant conditons are met:\n• 4.0 New Feature Popup\n• 3.6 Effect Browser Popup\n• Bookmark Balloon\n• Media Browser Album Balloon\n• Active Camera View Balloon ");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence hRu(VisualEffect visualEffect, Context context, ChoiceInfo choice) {
        Intrinsics.checkNotNullParameter(choice, "choice");
        return "  - " + Iy.w6.n(visualEffect.getLocalizedStrings(), context, choice.getLabel());
    }

    private static final String i(String str) {
        List<String> listSplit = new Regex("(?<=[a-z \\-])(?=[A-Z])").split(str, 0);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit, 10));
        Iterator<T> it = listSplit.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.trim((CharSequence) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList2, " ", null, null, 0, null, new Function1() { // from class: qHw.DAz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return vd.K((String) obj2);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean kSg(final FragmentActivity fragmentActivity, final vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Toast.makeText(fragmentActivity, "Reloading Remote Config", 0).show();
        final com.google.firebase.remoteconfig.j jVarAz = com.google.firebase.remoteconfig.j.az();
        Intrinsics.checkNotNullExpressionValue(jVarAz, "getInstance(...)");
        jVarAz.xMQ(10L).addOnCompleteListener(new OnCompleteListener() { // from class: qHw.qz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                vd.W(this.f72415n, jVarAz, fragmentActivity, task);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lLA(FragmentActivity fragmentActivity, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setShowedLagNoticeDate(0L);
        jVar.setShowedLagNotice(false);
        jVar.setReviewPopupResponse(j.C.f45809n);
        Toast.makeText(fragmentActivity, "Review Popup — Reset Complete", 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mI(FragmentActivity fragmentActivity, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j.INSTANCE.setAgreedPrivacy(false);
        Toast.makeText(fragmentActivity, "Reset Privacy Policy Agreement", 0).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n7b(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setInstalledAppVersions(SetsKt.plus(jVar.getInstalledAppVersions(), "3.10.3"));
        HI0.fuX.KN(vdVar, "Installed Version History", jVar.getInstalledAppVersions().isEmpty() ? "Empty" : CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.toList(jVar.getInstalledAppVersions())), "\n", null, null, 0, null, null, 62, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nO(vd vdVar, Preference preference, Object obj) {
        Intrinsics.checkNotNullParameter(preference, "<unused var>");
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.s4
            @Override // java.lang.Runnable
            public final void run() {
                vd.vl();
            }
        }, 30L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o9(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setInstalledAppVersions(SetsKt.plus(jVar.getInstalledAppVersions(), "3.5"));
        HI0.fuX.KN(vdVar, "Installed Version History", jVar.getInstalledAppVersions().isEmpty() ? "Empty" : CollectionsKt.joinToString$default(CollectionsKt.sorted(CollectionsKt.toList(jVar.getInstalledAppVersions())), "\n", null, null, 0, null, null, 62, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uG(vd vdVar) {
        com.alightcreative.app.motion.persist.j.INSTANCE.setSkuListFetched(0L);
        vdVar.ER().xMQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v0j(vd vdVar, Preference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = vdVar.getContext();
        Object systemService = context != null ? context.getSystemService("activity") : null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return true;
        }
        activityManager.clearApplicationUserData();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(vd vdVar) {
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        jVar.setAccountInfoCacheDate(0L);
        jVar.setSkuListFetched(0L);
        vdVar.ER().xMQ();
    }

    public final kgE.fuX ER() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final iF tUK() {
        iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Preference preference, final FragmentActivity fragmentActivity, final com.google.firebase.iid.o oVar) {
        Log.d("IID_TOKEN", oVar.n());
        preference.ul("Firebase IID: " + oVar.n());
        preference.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.r
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public final boolean n(Preference preference2) {
                return vd.QZ6(fragmentActivity, oVar, preference2);
            }
        });
        return Unit.INSTANCE;
    }

    private final void GD() {
        long jLongValue;
        final Context context = getContext();
        if (context == null) {
            return;
        }
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        File fileResolve = FilesKt.resolve(FilesKt.resolve(cacheDir, "debug"), "edoc_" + System.currentTimeMillis());
        fileResolve.mkdirs();
        File[] fileArrListFiles = fileResolve.listFiles();
        if (fileArrListFiles != null) {
            ArrayList<File> arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    if (StringsKt.startsWith$default(name, "edoc_", false, 2, (Object) null)) {
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        Long longOrNull = StringsKt.toLongOrNull(StringsKt.substringAfterLast$default(name2, "_", (String) null, 2, (Object) null));
                        if (longOrNull != null) {
                            jLongValue = longOrNull.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue < System.currentTimeMillis() - 3600000) {
                            arrayList.add(file);
                        }
                    }
                }
            }
            for (File file2 : arrayList) {
                Intrinsics.checkNotNull(file2);
                FilesKt.deleteRecursively(file2);
            }
        }
        final File file3 = new File(fileResolve, "AM_Effects_v1028425_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date()) + ".zip");
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage("Generating Effect Documentation Templates").setCancelable(false).create();
        alertDialogCreate.show();
        HI0.qz.nr(null, new Function0() { // from class: qHw.SPz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vd.Po6(file3, context);
            }
        }, 1, null).Uo(new Function1() { // from class: qHw.ci
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return vd.How(alertDialogCreate, this, file3, (Unit) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void JVN(vd vdVar) {
        PJ9.DAz.T(vdVar.tUK());
        vdVar.handler.postDelayed(new Runnable() { // from class: qHw.g9s
            @Override // java.lang.Runnable
            public final void run() {
                vd.xVH();
            }
        }, 400L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(FragmentActivity fragmentActivity, Map map, View view) {
        ClipboardManager clipboardManagerO = HI0.afx.O(fragmentActivity);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("\"" + ((String) entry.getKey()) + "\",\"" + ((String) entry.getValue()) + "\"");
        }
        clipboardManagerO.setPrimaryClip(ClipData.newPlainText("Device Info", CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)));
        Toast.makeText(fragmentActivity, "Copied CSV", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uf(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a63(Task task) {
        return "remoteConfig.fetch:isSuccessful=" + task.isSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0N(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tFV(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ub(FragmentActivity fragmentActivity, Map map, View view) {
        ClipboardManager clipboardManagerO = HI0.afx.O(fragmentActivity);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + l.ae + ((String) entry.getValue()));
        }
        clipboardManagerO.setPrimaryClip(ClipData.newPlainText("Device Info", CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)));
        Toast.makeText(fragmentActivity, 2132017504, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vl() {
        com.alightcreative.app.motion.activities.main.Ml.mUb();
        com.alightcreative.app.motion.persist.j.INSTANCE.setElementTabVisitTimestamp(0L);
    }

    @Override // androidx.preference.PreferenceFragmentCompat
    public void E2(Bundle savedInstanceState, String rootKey) {
        WPU(2132213762);
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            Preference preferenceKN = KN("com.alightcreative.motion.acDevMode");
            if (preferenceKN != null) {
                g().kSg(preferenceKN);
            }
            Preference preferenceKN2 = KN("com.alightcretive.motion.action.resetReview");
            if (preferenceKN2 != null) {
                preferenceKN2.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.j
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.lLA(activity, preference);
                    }
                });
            }
            Preference preferenceKN3 = KN("com.alightcretive.motion.action.resetPrivacyAgree");
            if (preferenceKN3 != null) {
                preferenceKN3.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.rv6
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.mI(activity, preference);
                    }
                });
            }
            Preference preferenceKN4 = KN("com.alightcretive.motion.action.resetElementNew");
            if (preferenceKN4 != null) {
                preferenceKN4.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.n
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.HBN(activity, preference);
                    }
                });
            }
            Preference preferenceKN5 = KN("com.alightcreative.motion.action.resetOneTimePopups");
            if (preferenceKN5 != null) {
                preferenceKN5.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.w6
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.Zn(this.f72423n, preference);
                    }
                });
            }
            Preference preferenceKN6 = KN("com.alightcreative.motion.action.resetAppData");
            if (preferenceKN6 != null) {
                preferenceKN6.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.Ml
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.v0j(this.f72387n, preference);
                    }
                });
            }
            Preference preferenceKN7 = KN("com.alightcreative.motion.action.addInstall3_5");
            if (preferenceKN7 != null) {
                preferenceKN7.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.I28
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.o9(this.f72380n, preference);
                    }
                });
            }
            Preference preferenceKN8 = KN("com.alightcreative.motion.action.addInstall3_10_3");
            if (preferenceKN8 != null) {
                preferenceKN8.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.Wre
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.n7b(this.f72395n, preference);
                    }
                });
            }
            Preference preferenceKN9 = KN("com.alightcreative.motion.action.clearInstallHistory");
            if (preferenceKN9 != null) {
                preferenceKN9.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.CN3
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.Aum(this.f72375n, preference);
                    }
                });
            }
            Preference preferenceKN10 = KN("com.alightcretive.motion.action.reloadRemoteConfig");
            if (preferenceKN10 != null) {
                preferenceKN10.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.fuX
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.kSg(activity, this, preference);
                    }
                });
            }
            final Preference preferenceKN11 = KN("com.alightcretive.motion.action.firebaseIID");
            if (preferenceKN11 != null) {
                preferenceKN11.fcU(null);
                Task taskMUb = FirebaseInstanceId.xMQ().mUb();
                final Function1 function1 = new Function1() { // from class: qHw.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return vd.F(preferenceKN11, activity, (com.google.firebase.iid.o) obj);
                    }
                };
                taskMUb.addOnSuccessListener(new OnSuccessListener() { // from class: qHw.o
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        vd.tFV(function1, obj);
                    }
                });
            }
            Preference preferenceKN12 = KN("com.alightcreative.motion.exportEffectDocTemplates");
            if (preferenceKN12 != null) {
                preferenceKN12.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.Q
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.VwL(this.f72389n, preference);
                    }
                });
            }
            Preference preferenceKN13 = KN("com.alightcretive.motion.showDiagnosticInfo");
            if (preferenceKN13 != null) {
                preferenceKN13.fcU(new Preference.OnPreferenceClickListener() { // from class: qHw.u
                    @Override // androidx.preference.Preference.OnPreferenceClickListener
                    public final boolean n(Preference preference) {
                        return vd.T3L(activity, this, preference);
                    }
                });
            }
            Preference preferenceKN14 = KN("com.alightcreative.motion.iaptest");
            if (preferenceKN14 != null) {
                preferenceKN14.G7(new Preference.OnPreferenceChangeListener() { // from class: qHw.qf
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean n(Preference preference, Object obj) {
                        return vd.UF(this.f72414n, preference, obj);
                    }
                });
            }
            Preference preferenceKN15 = KN("com.alightcreative.motion.useFirebaseEmulator");
            if (preferenceKN15 != null) {
                preferenceKN15.G7(new Preference.OnPreferenceChangeListener() { // from class: qHw.Ln
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean n(Preference preference, Object obj) {
                        return vd.Zmq(this.f72385n, preference, obj);
                    }
                });
            }
            Preference preferenceKN16 = KN("com.alightcreative.motion.iapSimulateBadToken");
            if (preferenceKN16 != null) {
                preferenceKN16.G7(new Preference.OnPreferenceChangeListener() { // from class: qHw.lej
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean n(Preference preference, Object obj) {
                        return vd.EF(this.f72408n, preference, obj);
                    }
                });
            }
            Preference preferenceKN17 = KN("com.alightcreative.motion.acctTestMode");
            if (preferenceKN17 != null) {
                preferenceKN17.G7(new Preference.OnPreferenceChangeListener() { // from class: qHw.iwV
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean n(Preference preference, Object obj) {
                        return vd.Vvq(this.f72404n, preference, obj);
                    }
                });
            }
            Preference preferenceKN18 = KN(YjqZUJsVmhcjko.zKWz);
            if (preferenceKN18 != null) {
                preferenceKN18.G7(new Preference.OnPreferenceChangeListener() { // from class: qHw.M
                    @Override // androidx.preference.Preference.OnPreferenceChangeListener
                    public final boolean n(Preference preference, Object obj) {
                        return vd.nO(this.f72386n, preference, obj);
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }
}
