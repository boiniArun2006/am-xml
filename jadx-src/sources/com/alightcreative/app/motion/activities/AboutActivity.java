package com.alightcreative.app.motion.activities;

import Dk.InterfaceC1335n;
import SJ0.C1459j;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Trmy.yioUaKMByL;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import androidx.view.LifecycleKt;
import com.alightcreative.account.LicenseInfo;
import com.alightcreative.account.LicenseType;
import com.alightcreative.app.motion.activities.AboutActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.vungle.ads.internal.signals.SignalManager;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import w.AbstractC2412j;
import z8.AbstractC2487Wre;
import z8.C2484Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0015¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/alightcreative/app/motion/activities/AboutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "itemId", "", "Zn", "(I)Z", "", "Mh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LSJ0/j;", "r", "LSJ0/j;", "binding", "LkgE/fuX;", "o", "LkgE/fuX;", "mI", "()LkgE/fuX;", "setIapManager", "(LkgE/fuX;)V", "iapManager", "LDk/n;", "Z", "LDk/n;", "tFV", "()LDk/n;", "setConcierge", "(LDk/n;)V", "concierge", "LQmE/iF;", "S", "LQmE/iF;", "VwL", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "g", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAboutActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AboutActivity.kt\ncom/alightcreative/app/motion/activities/AboutActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,503:1\n1#2:504\n12567#3,2:505\n1310#3,2:523\n1137#3,2:526\n13402#3:528\n13402#3:529\n1310#3,2:530\n1310#3,2:532\n13403#3:534\n13403#3:535\n1310#3,2:537\n1137#3,2:540\n13402#3:542\n13402#3:543\n1310#3,2:544\n1310#3,2:546\n13403#3:548\n13403#3:549\n1863#4,2:507\n1863#4,2:509\n1863#4:525\n1864#4:536\n1863#4:539\n1864#4:550\n126#5:511\n153#5,3:512\n126#5:551\n153#5,3:552\n126#5:555\n153#5,3:556\n126#5:559\n153#5,3:560\n161#6,8:515\n*S KotlinDebug\n*F\n+ 1 AboutActivity.kt\ncom/alightcreative/app/motion/activities/AboutActivity\n*L\n102#1:505,2\n287#1:523,2\n266#1:526,2\n268#1:528\n273#1:529\n275#1:530,2\n279#1:532,2\n273#1:534\n268#1:535\n334#1:537,2\n313#1:540,2\n315#1:542\n320#1:543\n322#1:544,2\n326#1:546,2\n320#1:548\n315#1:549\n125#1:507,2\n147#1:509,2\n265#1:525\n265#1:536\n312#1:539\n312#1:550\n454#1:511\n454#1:512,3\n451#1:551\n451#1:552,3\n461#1:555\n461#1:556,3\n465#1:559\n465#1:560,3\n77#1:515,8\n*E\n"})
public final class AboutActivity extends jO {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public InterfaceC1335n concierge;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public kgE.fuX iapManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private C1459j binding;
    public static final int E2 = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[kgE.K.values().length];
            try {
                iArr[kgE.K.f70079o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kgE.K.f70072S.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kgE.K.f70078g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kgE.K.E2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kgE.K.f70077e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kgE.K.f70075X.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kgE.K.f70070N.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kgE.K.f70073T.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kgE.K.f70081v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[kgE.K.Xw.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[kgE.K.f70076Z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LicenseType.values().length];
            try {
                iArr2[LicenseType.Promotional.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LicenseType.Subscription.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LicenseType.Pass.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Mgn.j.values().length];
            try {
                iArr3[Mgn.j.f6648n.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[Mgn.j.f6651t.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[Mgn.j.f6646O.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[Mgn.j.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[Mgn.j.f6650r.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o9(DialogInterface dialogInterface, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(DialogInterface dialogInterface, int i2) {
    }

    @Override // com.alightcreative.app.motion.activities.jO, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws PackageManager.NameNotFoundException {
        String str;
        Boolean boolValueOf;
        String str2;
        String str3;
        String email;
        String strSubstringAfterLast$default;
        boolean z2;
        super.onCreate(savedInstanceState);
        C1459j c1459jT = C1459j.t(getLayoutInflater());
        this.binding = c1459jT;
        C1459j c1459j = null;
        if (c1459jT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459jT = null;
        }
        setContentView(c1459jT.getRoot());
        C1459j c1459j2 = this.binding;
        if (c1459j2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j2 = null;
        }
        ViewCompat.Org(c1459j2.getRoot(), new OnApplyWindowInsetsListener() { // from class: com.alightcreative.app.motion.activities.j
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                return AboutActivity.T3L(view, windowInsetsCompat);
            }
        });
        PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 64);
        String str4 = packageInfo.versionName;
        int i2 = packageInfo.versionCode;
        Long BUILD_DATE = IvA.o.f4322n;
        if (BUILD_DATE != null && BUILD_DATE.longValue() == 0) {
            str = "N/A";
        } else {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
            Intrinsics.checkNotNullExpressionValue(BUILD_DATE, "BUILD_DATE");
            str = dateTimeInstance.format(new Date(BUILD_DATE.longValue()));
        }
        C1459j c1459j3 = this.binding;
        if (c1459j3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j3 = null;
        }
        AppCompatTextView appCompatTextView = c1459j3.aYN;
        String str5 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
        appCompatTextView.setText(str4 + " (" + str5 + ")");
        C1459j c1459j4 = this.binding;
        if (c1459j4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j4 = null;
        }
        c1459j4.WPU.setText(StringsKt.take("2d5c0f8d6aea15436d6faca47f9d6dec11f24c6e", 7) + " (" + str + ")");
        C1459j c1459j5 = this.binding;
        if (c1459j5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j5 = null;
        }
        c1459j5.f9495S.setText("Android " + Build.VERSION.RELEASE);
        C1459j c1459j6 = this.binding;
        if (c1459j6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j6 = null;
        }
        TextView textView = c1459j6.f9500g;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        textView.setText(lej.J2(MANUFACTURER, null, 1, null) + " " + Build.MODEL + " (" + Build.PRODUCT + ")");
        C1459j c1459j7 = this.binding;
        if (c1459j7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j7 = null;
        }
        c1459j7.ViF.setText(AbstractC2487Wre.mUb().n() + " (" + Build.BOARD + ")");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        HI0.afx.nr(this).getMemoryInfo(memoryInfo);
        C1459j c1459j8 = this.binding;
        if (c1459j8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j8 = null;
        }
        c1459j8.fD.setText(lej.t(HI0.afx.az(this).getUsableSpace(), false, 1, null) + " available / " + lej.t(HI0.afx.az(this).getTotalSpace(), false, 1, null) + " total");
        C1459j c1459j9 = this.binding;
        if (c1459j9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j9 = null;
        }
        c1459j9.iF.setText(lej.t(memoryInfo.availMem, false, 1, null) + " available / " + lej.t(memoryInfo.totalMem, false, 1, null) + " total");
        C1459j c1459j10 = this.binding;
        if (c1459j10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j10 = null;
        }
        c1459j10.te.setText(CollectionsKt.joinToString$default(AbstractC2487Wre.mUb().t(), ", ", null, null, 0, null, null, 62, null) + " (" + AbstractC2487Wre.mUb().nr() + "p)");
        C1459j c1459j11 = this.binding;
        if (c1459j11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j11 = null;
        }
        c1459j11.nY.setText(CollectionsKt.joinToString$default(AbstractC2487Wre.mUb().rl(), ", ", null, null, 0, null, null, 62, null) + " (" + AbstractC2487Wre.mUb().O() + "p)");
        C1459j c1459j12 = this.binding;
        if (c1459j12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j12 = null;
        }
        c1459j12.gh.setText(getResources().getConfiguration().getLocales().toLanguageTags());
        Signature[] signatureArr = packageInfo.signatures;
        String strJoinToString$default = signatureArr != null ? ArraysKt.joinToString$default(signatureArr, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.alightcreative.app.motion.activities.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutActivity.ub((Signature) obj);
            }
        }, 30, (Object) null) : null;
        Signature[] signatureArr2 = packageInfo.signatures;
        if (signatureArr2 != null) {
            int length = signatureArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z2 = false;
                    break;
                }
                byte[] byteArray = signatureArr2[i3].toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                byte[] bArrTy = HI0.gnv.ty(byteArray);
                Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
                if (Intrinsics.areEqual(StringsKt.reversed((CharSequence) StringsKt.substring(HI0.gnv.o(bArrTy), new IntRange(0, 7))).toString(), "E773DE16")) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            boolValueOf = null;
        }
        ArrayList arrayList = new ArrayList();
        boolean z3 = ((Boolean) mI().ck().getValue()).booleanValue() && !mI().gh();
        FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
        byte[] bArrAz = HI0.gnv.az((firebaseUserXMQ == null || (email = firebaseUserXMQ.getEmail()) == null || (strSubstringAfterLast$default = StringsKt.substringAfterLast$default(email, "@", (String) null, 2, (Object) null)) == null) ? "" : strSubstringAfterLast$default);
        Intrinsics.checkNotNullExpressionValue(bArrAz, "sha1(...)");
        String strSubstring = StringsKt.substring(HI0.gnv.o(bArrAz), new IntRange(0, 7));
        arrayList.add(firebaseUserXMQ == null ? z3 ? "XU-ZZ" : "XU" : firebaseUserXMQ.ub() ? z3 ? "NU-ZZ" : "NU" : !firebaseUserXMQ.rl() ? "EU" : z3 ? "AU" : "AU-ZZ");
        if (com.alightcreative.app.motion.persist.j.INSTANCE.getUpdateSp()) {
            arrayList.add("SP");
        }
        Iterator it = mI().Uo().iterator();
        while (it.hasNext()) {
            switch (n.$EnumSwitchMapping$0[((kgE.K) it.next()).ordinal()]) {
                case 1:
                    arrayList.add("+RW");
                    Unit unit = Unit.INSTANCE;
                    continue;
                case 2:
                    arrayList.add("+ME");
                    Unit unit2 = Unit.INSTANCE;
                    continue;
                case 3:
                    arrayList.add("+PS");
                    Unit unit3 = Unit.INSTANCE;
                    continue;
                case 4:
                    arrayList.add("+FF");
                    Unit unit4 = Unit.INSTANCE;
                    continue;
                case 5:
                    arrayList.add("+IP");
                    Unit unit5 = Unit.INSTANCE;
                    continue;
                case 6:
                    arrayList.add("+AE");
                    Unit unit6 = Unit.INSTANCE;
                    continue;
                case 7:
                    arrayList.add("+CO");
                    Unit unit7 = Unit.INSTANCE;
                    continue;
                case 8:
                    arrayList.add("+LP");
                    break;
                case 9:
                case 10:
                case 11:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Unit unit8 = Unit.INSTANCE;
        }
        int iN = com.alightcreative.account.C.n(mI().Uo());
        if (iN > 0) {
            arrayList.add("+CS" + iN);
        }
        Unit unit9 = Unit.INSTANCE;
        Iterator it2 = mI().Ik().iterator();
        while (it2.hasNext()) {
            int i5 = n.$EnumSwitchMapping$1[((LicenseInfo) it2.next()).getType().ordinal()];
            if (i5 == 1) {
                str3 = "LPR";
            } else if (i5 == 2) {
                str3 = "LSU";
            } else {
                if (i5 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str3 = "LPS";
            }
            arrayList.add(str3);
        }
        if (mI().rl()) {
            if (firebaseUserXMQ == null) {
                arrayList.add("ACS!!N");
            } else if (firebaseUserXMQ.ub()) {
                arrayList.add("ACS!!A");
            } else if (firebaseUserXMQ.rl()) {
                arrayList.add(firebaseUserXMQ.getEmail() == null ? "ACS!!EX" : !Intrinsics.areEqual(strSubstring, "7F934CC5") ? qfEYuUHwj.rfFBIWrUJW : "ACS");
            } else {
                arrayList.add("ACS!!E");
            }
        }
        arrayList.add(XoT.fuX.Ik(this) ? "N1" : "N0");
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        arrayList.add("HD" + jVar.getMaxLayers720());
        if (jVar.getMaxLayers1080() > 0) {
            arrayList.add("FHD" + jVar.getMaxLayers1080());
        }
        if (jVar.getMaxLayers1440() > 0) {
            arrayList.add("QHD" + jVar.getMaxLayers1440());
        }
        if (jVar.getMaxLayers2160() > 0) {
            arrayList.add("UHD" + jVar.getMaxLayers2160());
        }
        if (jVar.getLowQualityPreview()) {
            arrayList.add("LQP");
        }
        if (jVar.getOomCount() > 0) {
            arrayList.add("OM" + jVar.getOomCount());
        }
        int i7 = n.$EnumSwitchMapping$2[jVar.getAudioResamplerType().ordinal()];
        if (i7 == 1) {
            str2 = "AuN";
        } else if (i7 == 2) {
            str2 = "AuL";
        } else if (i7 == 3) {
            str2 = "AuSL";
        } else if (i7 == 4) {
            str2 = yioUaKMByL.WLfw;
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "AuSH";
        }
        arrayList.add(str2);
        if (jVar.getFirstAppExec() > 0) {
            arrayList.add("EX" + ((mI().az() - jVar.getFirstAppExec()) / SignalManager.TWENTY_FOUR_HOURS_MILLIS));
        }
        if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            arrayList.add("XLP");
        }
        if (jVar.getEmulatingGLSLMinMaxClamp()) {
            arrayList.add("GLC");
        }
        arrayList.add(CmcdData.STREAMING_FORMAT_SS + strJoinToString$default);
        arrayList.add("e" + strSubstring);
        C1459j c1459j13 = this.binding;
        if (c1459j13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j13 = null;
        }
        c1459j13.Uo.setText(CollectionsKt.joinToString$default(arrayList, ".\u200b", null, null, 0, null, null, 62, null));
        C1459j c1459j14 = this.binding;
        if (c1459j14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j14 = null;
        }
        c1459j14.f9504t.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.y(this.f44723n, view);
            }
        });
        C1459j c1459j15 = this.binding;
        if (c1459j15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j15 = null;
        }
        c1459j15.f9503r.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.ci
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.Bu(this.f44938n, view);
            }
        });
        C1459j c1459j16 = this.binding;
        if (c1459j16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j16 = null;
        }
        c1459j16.nY.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.g9s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.Qu(this.f45251n, view);
            }
        });
        C1459j c1459j17 = this.binding;
        if (c1459j17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j17 = null;
        }
        c1459j17.te.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.afx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.X4T(this.f44867n, view);
            }
        });
        C1459j c1459j18 = this.binding;
        if (c1459j18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j18 = null;
        }
        c1459j18.f9496T.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.xVH(this.f44842n, view);
            }
        });
        C1459j c1459j19 = this.binding;
        if (c1459j19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j19 = null;
        }
        c1459j19.XQ.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Ew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.EF(this.f44526n, view);
            }
        });
        C1459j c1459j20 = this.binding;
        if (c1459j20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1459j20 = null;
        }
        c1459j20.f9502o.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.nKK
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.uG(this.f45554n, view);
            }
        });
        C1459j c1459j21 = this.binding;
        if (c1459j21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1459j = c1459j21;
        }
        c1459j.J2.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.DAz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.Vvq(this.f44372n, view);
            }
        });
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f44329n;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(DialogInterface dialogInterface, int i2) {
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AboutActivity.this.new w6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void gh(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void qie(AboutActivity aboutActivity, String str, View view) {
            HI0.afx.O(aboutActivity).setPrimaryClip(ClipData.newPlainText("Persistent IDs", str));
            Toast.makeText(aboutActivity, 2132017504, 0).show();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strF;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f44329n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC1335n interfaceC1335nTFV = AboutActivity.this.tFV();
                this.f44329n = 1;
                obj = AbstractC2412j.n(interfaceC1335nTFV, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Map map = (Map) obj;
            FirebaseUser firebaseUserXMQ = FirebaseAuth.getInstance().xMQ();
            String str = "(none)";
            if (firebaseUserXMQ == null || (strF = firebaseUserXMQ.f()) == null) {
                strF = "(none)";
            }
            Pair pair = TuplesKt.to("AC User ID", strF);
            Pair pair2 = TuplesKt.to("AC Instance ID", com.alightcreative.app.motion.persist.j.INSTANCE.getAppInstance());
            String str2 = (String) map.get("backup_persistent_id");
            if (str2 == null) {
                str2 = "(none)";
            }
            Pair pair3 = TuplesKt.to("BSP User ID", str2);
            String str3 = (String) map.get("non_backup_persistent_id");
            if (str3 != null) {
                str = str3;
            }
            Map mapMapOf = MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to("BSP Backend ID", str));
            ArrayList arrayList = new ArrayList(mapMapOf.size());
            for (Map.Entry entry : mapMapOf.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "\n" + ((String) entry.getValue()) + "\n");
            }
            final String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(AboutActivity.this).setMessage(strJoinToString$default).setPositiveButton(2132017520, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    AboutActivity.w6.mUb(dialogInterface, i3);
                }
            }).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.qf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    AboutActivity.w6.gh(dialogInterface, i3);
                }
            }).create();
            final AboutActivity aboutActivity = AboutActivity.this;
            alertDialogCreate.show();
            alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Ln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AboutActivity.w6.qie(aboutActivity, strJoinToString$default, view);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bu(final AboutActivity aboutActivity, View view) {
        com.alightcreative.widget.nKK nkk = new com.alightcreative.widget.nKK(aboutActivity, aboutActivity.mI(), true);
        com.alightcreative.widget.nKK.ty(nkk, 2132017443, 2131361963, 0, false, null, 28, null);
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        if (!Intrinsics.areEqual(jVar.getDeviceCapsCheckSource(), "Database") && jVar.getDeviceCapsAvailableInDb()) {
            com.alightcreative.widget.nKK.ck(nkk, "Reset Video Codec Evaluation", null, false, null, new Function0() { // from class: com.alightcreative.app.motion.activities.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AboutActivity.Uf(this.f44810n);
                }
            }, 14, null);
        }
        if (Intrinsics.areEqual(jVar.getDeviceCapsCheckProd(), Build.PRODUCT)) {
            com.alightcreative.widget.nKK.ty(nkk, 2132017446, 2131361972, 0, false, null, 28, null);
        }
        com.alightcreative.widget.nKK.ty(nkk, 2132020158, 2131361973, 0, false, null, 28, null);
        com.alightcreative.widget.nKK.HI(nkk, 2132020159, 0, false, null, new Function0() { // from class: com.alightcreative.app.motion.activities.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutActivity.f(this.f44351n);
            }
        }, 14, null);
        nkk.fD(new Function1() { // from class: com.alightcreative.app.motion.activities.fuX
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AboutActivity.p0N(this.f45243n, ((Integer) obj).intValue());
            }
        });
        nkk.X(aboutActivity.getResources().getDimensionPixelSize(2131166272));
        Intrinsics.checkNotNull(view);
        com.alightcreative.widget.nKK.N(nkk, view, 0, 0, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EF(AboutActivity aboutActivity, View view) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, aboutActivity, "https://www.alightcreative.com/tos", null, 4, null);
    }

    private final void Mh() {
        C2484Dsr c2484Dsr = C2484Dsr.f76360n;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        final Map mapN = c2484Dsr.n(resources, HI0.afx.nr(this));
        XoT.C.Uo(this, new Function0() { // from class: com.alightcreative.app.motion.activities.eO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutActivity.jO(mapN);
            }
        });
        AlertDialog.Builder title = new AlertDialog.Builder(this).setTitle("Device Info");
        ArrayList arrayList = new ArrayList(mapN.size());
        for (Map.Entry entry : mapN.entrySet()) {
            arrayList.add(((String) entry.getKey()) + com.safedk.android.analytics.brandsafety.l.ae + ((String) entry.getValue()));
        }
        AlertDialog alertDialogCreate = title.setMessage(CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)).setNegativeButton("Copy Text", new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AboutActivity.Toy(dialogInterface, i2);
            }
        }).setNeutralButton("Copy CSV", new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.QJ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AboutActivity.wKp(dialogInterface, i2);
            }
        }).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.l3D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AboutActivity.Th(dialogInterface, i2);
            }
        }).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.xzo(this.f44920n, mapN, view);
            }
        });
        alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.s4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.XNZ(this.f45642n, mapN, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uf(AboutActivity aboutActivity) {
        j.Xo.t(new j.Xo(aboutActivity), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vvq(AboutActivity aboutActivity, View view) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, aboutActivity, "https://alightcreative.com/copyright_policy.pdf", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String jO(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("\"" + ((String) entry.getKey()) + "\",\"" + ((String) entry.getValue()) + "\"");
        }
        return "Device Info\n\n\n==== DEVICE INFO ========================================\n" + CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null) + "\n===================================================\n\n\n";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nO() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uG(AboutActivity aboutActivity, View view) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, aboutActivity, "https://alightcreative.com/privacy/", null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xVH(AboutActivity aboutActivity, View view) {
        YgZ.Ml.rl(YgZ.Ml.f12213n, aboutActivity, "https://www.alightcreative.com", null, 4, null);
    }

    public final QmE.iF VwL() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final kgE.fuX mI() {
        kgE.fuX fux = this.iapManager;
        if (fux != null) {
            return fux;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iapManager");
        return null;
    }

    public final InterfaceC1335n tFV() {
        InterfaceC1335n interfaceC1335n = this.concierge;
        if (interfaceC1335n != null) {
            return interfaceC1335n;
        }
        Intrinsics.throwUninitializedPropertyAccessException("concierge");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Aum(AboutActivity aboutActivity, View view) {
        HI0.afx.O(aboutActivity).setPrimaryClip(ClipData.newPlainText("DeviceID", com.alightcreative.app.motion.persist.j.INSTANCE.getDeviceID()));
        Toast.makeText(aboutActivity, 2132017504, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence HBN(int i2) {
        tu.nKK nkk;
        String strName;
        tu.nKK[] nkkArrValues = tu.nKK.values();
        int length = nkkArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                nkk = nkkArrValues[i3];
                if (nkk.rl() == i2) {
                    break;
                }
                i3++;
            } else {
                nkk = null;
                break;
            }
        }
        if (nkk != null && (strName = nkk.name()) != null) {
            return strName;
        }
        String string = Integer.toString(i2, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "0x" + string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void JVN(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lp6(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qu(AboutActivity aboutActivity, View view) {
        tu.j jVar;
        Iterator it;
        tu.n nVar;
        String strName;
        int i2;
        String strName2;
        Iterator it2 = AbstractC2487Wre.mUb().rl().iterator();
        String str = "";
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            MediaCodecInfo[] codecInfos = Hr.aC.qie().getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (Intrinsics.areEqual(mediaCodecInfo.getName(), str2)) {
                    String str3 = ((Object) str) + str2 + "\n";
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str4 = supportedTypes[i3];
                        String str5 = ((Object) str3) + "  " + str4 + "\n";
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str4);
                        String str6 = ((Object) (((Object) str5) + "    mime=" + capabilitiesForType.getMimeType() + "\n")) + "    profile/levels:\n";
                        MediaCodecInfo.CodecProfileLevel[] profileLevels = capabilitiesForType.profileLevels;
                        Intrinsics.checkNotNullExpressionValue(profileLevels, "profileLevels");
                        int length2 = profileLevels.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = profileLevels[i5];
                            tu.n[] nVarArrValues = tu.n.values();
                            int length3 = nVarArrValues.length;
                            int i7 = 0;
                            while (true) {
                                jVar = null;
                                if (i7 < length3) {
                                    nVar = nVarArrValues[i7];
                                    it = it2;
                                    if (nVar.rl() == codecProfileLevel.profile) {
                                        break;
                                    }
                                    i7++;
                                    it2 = it;
                                } else {
                                    it = it2;
                                    nVar = null;
                                    break;
                                }
                            }
                            if (nVar == null || (strName = nVar.name()) == null) {
                                String string = Integer.toString(codecProfileLevel.profile, CharsKt.checkRadix(16));
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                strName = "0x" + string;
                            }
                            tu.j[] jVarArrValues = tu.j.values();
                            int length4 = jVarArrValues.length;
                            String[] strArr = supportedTypes;
                            int i8 = 0;
                            while (true) {
                                if (i8 < length4) {
                                    tu.j jVar2 = jVarArrValues[i8];
                                    int i9 = i8;
                                    i2 = length;
                                    if (jVar2.rl() == codecProfileLevel.level) {
                                        jVar = jVar2;
                                        break;
                                    } else {
                                        i8 = i9 + 1;
                                        length = i2;
                                    }
                                } else {
                                    i2 = length;
                                    break;
                                }
                            }
                            if (jVar == null || (strName2 = jVar.name()) == null) {
                                String string2 = Integer.toString(codecProfileLevel.level, CharsKt.checkRadix(16));
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                strName2 = "0x" + string2;
                            }
                            str6 = ((Object) str6) + "      " + strName + " / " + strName2 + "\n";
                            i5++;
                            it2 = it;
                            supportedTypes = strArr;
                            length = i2;
                        }
                        Iterator it3 = it2;
                        String[] strArr2 = supportedTypes;
                        int[] colorFormats = capabilitiesForType.colorFormats;
                        Intrinsics.checkNotNullExpressionValue(colorFormats, "colorFormats");
                        String str7 = ((Object) str6) + "    colorFormats=" + ArraysKt.joinToString$default(colorFormats, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.alightcreative.app.motion.activities.Ml
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AboutActivity.HBN(((Integer) obj).intValue());
                            }
                        }, 30, (Object) null) + "\n";
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        str3 = ((Object) (((Object) (((Object) (((Object) (((Object) (((Object) str7) + "    video:\n")) + "      supportedWidths=" + videoCapabilities.getSupportedWidths() + "\n")) + "      supportedHeights=" + videoCapabilities.getSupportedHeights() + "\n")) + "      supportedFrameRates=" + videoCapabilities.getSupportedFrameRates() + "\n")) + "      bitrateRange=" + videoCapabilities.getBitrateRange() + "\n")) + "      alignment=" + videoCapabilities.getWidthAlignment() + "," + videoCapabilities.getHeightAlignment() + "\n";
                        i3++;
                        it2 = it3;
                        supportedTypes = strArr2;
                        length = length;
                    }
                    str = str3;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        new AlertDialog.Builder(aboutActivity).setMessage(str).setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.I28
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AboutActivity.UF(dialogInterface, i10);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat T3L(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
        Intrinsics.checkNotNull(view);
        view.setPadding(view.getPaddingLeft(), insetsJ2.rl, view.getPaddingRight(), insetsJ2.nr);
        return windowInsetsCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Th(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Toy(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UF(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4T(AboutActivity aboutActivity, View view) {
        tu.j jVar;
        Iterator it;
        tu.n nVar;
        String strName;
        int i2;
        String strName2;
        Iterator it2 = AbstractC2487Wre.mUb().t().iterator();
        String str = "";
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            MediaCodecInfo[] codecInfos = Hr.aC.qie().getCodecInfos();
            Intrinsics.checkNotNullExpressionValue(codecInfos, "getCodecInfos(...)");
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (Intrinsics.areEqual(mediaCodecInfo.getName(), str2)) {
                    String str3 = ((Object) str) + str2 + "\n";
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    Intrinsics.checkNotNullExpressionValue(supportedTypes, "getSupportedTypes(...)");
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str4 = supportedTypes[i3];
                        String str5 = ((Object) str3) + "  " + str4 + "\n";
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str4);
                        String str6 = ((Object) (((Object) str5) + "    mime=" + capabilitiesForType.getMimeType() + "\n")) + "    profile/levels:\n";
                        MediaCodecInfo.CodecProfileLevel[] profileLevels = capabilitiesForType.profileLevels;
                        Intrinsics.checkNotNullExpressionValue(profileLevels, "profileLevels");
                        int length2 = profileLevels.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = profileLevels[i5];
                            tu.n[] nVarArrValues = tu.n.values();
                            int length3 = nVarArrValues.length;
                            int i7 = 0;
                            while (true) {
                                jVar = null;
                                if (i7 < length3) {
                                    nVar = nVarArrValues[i7];
                                    it = it2;
                                    if (nVar.rl() == codecProfileLevel.profile) {
                                        break;
                                    }
                                    i7++;
                                    it2 = it;
                                } else {
                                    it = it2;
                                    nVar = null;
                                    break;
                                }
                            }
                            if (nVar == null || (strName = nVar.name()) == null) {
                                String string = Integer.toString(codecProfileLevel.profile, CharsKt.checkRadix(16));
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                strName = "0x" + string;
                            }
                            tu.j[] jVarArrValues = tu.j.values();
                            int length4 = jVarArrValues.length;
                            String[] strArr = supportedTypes;
                            int i8 = 0;
                            while (true) {
                                if (i8 < length4) {
                                    tu.j jVar2 = jVarArrValues[i8];
                                    int i9 = i8;
                                    i2 = length;
                                    if (jVar2.rl() == codecProfileLevel.level) {
                                        jVar = jVar2;
                                        break;
                                    } else {
                                        i8 = i9 + 1;
                                        length = i2;
                                    }
                                } else {
                                    i2 = length;
                                    break;
                                }
                            }
                            if (jVar == null || (strName2 = jVar.name()) == null) {
                                String string2 = Integer.toString(codecProfileLevel.level, CharsKt.checkRadix(16));
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                strName2 = "0x" + string2;
                            }
                            str6 = ((Object) str6) + "      " + strName + " / " + strName2 + "\n";
                            i5++;
                            it2 = it;
                            supportedTypes = strArr;
                            length = i2;
                        }
                        Iterator it3 = it2;
                        String[] strArr2 = supportedTypes;
                        int[] colorFormats = capabilitiesForType.colorFormats;
                        Intrinsics.checkNotNullExpressionValue(colorFormats, "colorFormats");
                        String str7 = ((Object) str6) + "    colorFormats=" + ArraysKt.joinToString$default(colorFormats, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.alightcreative.app.motion.activities.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AboutActivity.Zmq(((Integer) obj).intValue());
                            }
                        }, 30, (Object) null) + "\n";
                        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                        str3 = ((Object) (((Object) (((Object) (((Object) (((Object) (((Object) str7) + "    video:\n")) + "      supportedWidths=" + videoCapabilities.getSupportedWidths() + "\n")) + "      supportedHeights=" + videoCapabilities.getSupportedHeights() + "\n")) + "      supportedFrameRates=" + videoCapabilities.getSupportedFrameRates() + "\n")) + "      bitrateRange=" + videoCapabilities.getBitrateRange() + "\n")) + "      alignment=" + videoCapabilities.getWidthAlignment() + "," + videoCapabilities.getHeightAlignment() + "\n";
                        i3++;
                        it2 = it3;
                        supportedTypes = strArr2;
                        length = length;
                    }
                    str = str3;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        new AlertDialog.Builder(aboutActivity).setMessage(str).setPositiveButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.w6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                AboutActivity.JVN(dialogInterface, i10);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XNZ(AboutActivity aboutActivity, Map map, View view) {
        ClipboardManager clipboardManagerO = HI0.afx.O(aboutActivity);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add("\"" + ((String) entry.getKey()) + "\",\"" + ((String) entry.getValue()) + "\"");
        }
        clipboardManagerO.setPrimaryClip(ClipData.newPlainText("Device Info", CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)));
        Toast.makeText(aboutActivity, "Copied CSV", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Zmq(int i2) {
        tu.nKK nkk;
        String strName;
        tu.nKK[] nkkArrValues = tu.nKK.values();
        int length = nkkArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                nkk = nkkArrValues[i3];
                if (nkk.rl() == i2) {
                    break;
                }
                i3++;
            } else {
                nkk = null;
                break;
            }
        }
        if (nkk != null && (strName = nkk.name()) != null) {
            return strName;
        }
        String string = Integer.toString(i2, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return "0x" + string;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v29, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v32, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v35, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v38, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v41, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v44, types: [T, java.lang.String] */
    private final boolean Zn(int itemId) {
        if (itemId != 2131361963) {
            switch (itemId) {
                case 2131361972:
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.element = "";
                    com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                    if (jVar.getMaxLayers720() > 0) {
                        objectRef.element = objectRef.element + "• " + jVar.getMaxLayers720() + " layer(s) at 720p\n";
                    }
                    if (jVar.getMaxLayers1080() > 0) {
                        objectRef.element = objectRef.element + "• " + jVar.getMaxLayers1080() + " layer(s) at 1080p\n";
                    }
                    if (jVar.getMaxLayers1440() > 0) {
                        objectRef.element = objectRef.element + "• " + jVar.getMaxLayers1440() + " layer(s) at 1440p\n";
                    }
                    if (jVar.getMaxLayers2160() > 0) {
                        objectRef.element = objectRef.element + "• " + jVar.getMaxLayers2160() + " layer(s) at 2160p\n";
                    }
                    if (jVar.getMaxRes() > 0) {
                        objectRef.element = objectRef.element + "• Max resolution: " + jVar.getMaxRes() + "p\n";
                    }
                    if (jVar.getMaxResWithVideo() > 0) {
                        objectRef.element = objectRef.element + "• Max resolution w/video: " + jVar.getMaxResWithVideo() + "p\n";
                    }
                    if (StringsKt.isBlank((CharSequence) objectRef.element)) {
                        objectRef.element = "No evaluation data available";
                    } else if (jVar.getDeviceCapsCheckBypassed()) {
                        objectRef.element = objectRef.element + "Evaluation bypassed after " + jVar.getDeviceCapsCheckAttempts() + " attempts; above data is best guess only.";
                    }
                    String MANUFACTURER = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                    objectRef.element = "• Device: " + lej.J2(MANUFACTURER, null, 1, null) + " " + Build.MODEL + " (" + Build.PRODUCT + ")\n• Chipset: " + AbstractC2487Wre.mUb().n() + " (" + Build.BOARD + ")\n• Source: " + jVar.getDeviceCapsCheckSource() + "\n" + objectRef.element;
                    String string = getString(2132017445);
                    Object obj = objectRef.element;
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append("\n\n");
                    sb.append(obj);
                    AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setTitle(2132017446).setMessage(sb.toString()).setPositiveButton("Copy to Clipboard", new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.qz
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AboutActivity.s(dialogInterface, i2);
                        }
                    }).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Pl
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AboutActivity.Lp6(dialogInterface, i2);
                        }
                    }).create();
                    alertDialogCreate.show();
                    alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.Xo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AboutActivity.g6(this.f44825n, objectRef, view);
                        }
                    });
                    break;
                case 2131361973:
                    new AlertDialog.Builder(this).setMessage(2132020436).setNegativeButton(2132017396, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.aC
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AboutActivity.vl(dialogInterface, i2);
                        }
                    }).setPositiveButton(2132017374, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.C
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            AboutActivity.v0j(this.f44350n, dialogInterface, i2);
                        }
                    }).create().show();
                    break;
                case 2131361974:
                    Mh();
                    break;
            }
            return true;
        }
        new j.Ml(this, VwL()).n(true, new Function0() { // from class: com.alightcreative.app.motion.activities.Dsr
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AboutActivity.nO();
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(AboutActivity aboutActivity) {
        GJW.C.nr(LifecycleKt.n(aboutActivity.getLifecycleRegistry()), null, null, aboutActivity.new w6(null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g6(AboutActivity aboutActivity, Ref.ObjectRef objectRef, View view) {
        HI0.afx.O(aboutActivity).setPrimaryClip(ClipData.newPlainText("Codec Eval Results", (CharSequence) objectRef.element));
        Toast.makeText(aboutActivity, 2132017504, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n7b(DialogInterface dialogInterface, DialogInterface dialogInterface2, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0N(AboutActivity aboutActivity, int i2) {
        aboutActivity.Zn(i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence ub(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        byte[] bArrTy = HI0.gnv.ty(byteArray);
        Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
        return StringsKt.substring(HI0.gnv.o(bArrTy), new IntRange(0, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0j(final AboutActivity aboutActivity, final DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        AlertDialog alertDialogCreate = new AlertDialog.Builder(aboutActivity).setMessage(aboutActivity.getString(2132017531, com.alightcreative.app.motion.persist.j.INSTANCE.getDeviceID())).setPositiveButton(2132017511, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.UGc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                AboutActivity.o9(dialogInterface2, i3);
            }
        }).setNegativeButton(2132017436, new DialogInterface.OnClickListener() { // from class: com.alightcreative.app.motion.activities.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i3) {
                AboutActivity.n7b(dialogInterface, dialogInterface2, i3);
            }
        }).create();
        alertDialogCreate.show();
        alertDialogCreate.getButton(-1).setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.SPz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AboutActivity.Aum(this.f44746n, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void vl(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wKp(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xzo(AboutActivity aboutActivity, Map map, View view) {
        ClipboardManager clipboardManagerO = HI0.afx.O(aboutActivity);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + com.safedk.android.analytics.brandsafety.l.ae + ((String) entry.getValue()));
        }
        clipboardManagerO.setPrimaryClip(ClipData.newPlainText("Device Info", CollectionsKt.joinToString$default(arrayList, "\n", null, null, 0, null, null, 62, null)));
        Toast.makeText(aboutActivity, 2132017504, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(AboutActivity aboutActivity, View view) {
        aboutActivity.finish();
    }
}
