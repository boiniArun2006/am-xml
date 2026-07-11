package com.alightcreative.app.motion.activities;

import QmE.j;
import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import z8.AbstractC2487Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/alightcreative/app/motion/activities/DeviceMismatchNoticeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LSJ0/I28;", "r", "LSJ0/I28;", "binding", "LQmE/iF;", "o", "LQmE/iF;", "C", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceMismatchNoticeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceMismatchNoticeActivity.kt\ncom/alightcreative/app/motion/activities/DeviceMismatchNoticeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n1#2:94\n12567#3,2:95\n*S KotlinDebug\n*F\n+ 1 DeviceMismatchNoticeActivity.kt\ncom/alightcreative/app/motion/activities/DeviceMismatchNoticeActivity\n*L\n55#1:95,2\n*E\n"})
public final class DeviceMismatchNoticeActivity extends X2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.I28 binding;

    public final QmE.iF C() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alightcreative.app.motion.activities.X2, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws PackageManager.NameNotFoundException {
        int i2;
        Boolean boolValueOf;
        SJ0.I28 i28;
        boolean z2;
        int i3 = 1;
        super.onCreate(savedInstanceState);
        SJ0.I28 i28T = SJ0.I28.t(getLayoutInflater());
        this.binding = i28T;
        if (i28T == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i28T = null;
        }
        setContentView(i28T.getRoot());
        PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 64);
        String str = packageInfo.versionName;
        int i5 = packageInfo.versionCode;
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        Long BUILD_DATE = IvA.o.f4322n;
        Intrinsics.checkNotNullExpressionValue(BUILD_DATE, "BUILD_DATE");
        String str2 = dateTimeInstance.format(new Date(BUILD_DATE.longValue()));
        Signature[] signatureArr = packageInfo.signatures;
        String strJoinToString$default = signatureArr != null ? ArraysKt.joinToString$default(signatureArr, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.alightcreative.app.motion.activities.cA
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceMismatchNoticeActivity.Mx((Signature) obj);
            }
        }, 30, (Object) null) : null;
        String str3 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        String str4 = str + " (" + str3 + ")" + (com.alightcreative.app.motion.persist.j.INSTANCE.getEmulatingGLSLMinMaxClamp() ? " (Compat)" : "");
        String strTake = StringsKt.take("2d5c0f8d6aea15436d6faca47f9d6dec11f24c6e", 7);
        if (strTake.length() == 0) {
            strTake = "?";
        }
        String str5 = ((Object) strTake) + "." + strJoinToString$default + " (" + str2 + ")";
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        HI0.afx.nr(this).getMemoryInfo(memoryInfo);
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String strJoinToString$default2 = ArraysKt.joinToString$default(SUPPORTED_ABIS, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        Signature[] signatureArr2 = packageInfo.signatures;
        if (signatureArr2 != null) {
            int length = signatureArr2.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i2 = i3;
                    z2 = 0;
                    break;
                }
                i2 = i3;
                byte[] byteArray = signatureArr2[i7].toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                byte[] bArrTy = HI0.gnv.ty(byteArray);
                Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
                if (Intrinsics.areEqual(StringsKt.reversed((CharSequence) StringsKt.substring(HI0.gnv.o(bArrTy), new IntRange(0, 7))).toString(), "E773DE16")) {
                    z2 = i2;
                    break;
                } else {
                    i7++;
                    i3 = i2;
                }
            }
            boolValueOf = Boolean.valueOf(z2);
        } else {
            i2 = 1;
            boolValueOf = null;
        }
        QmE.iF iFVarC = C();
        Bundle bundle = new Bundle();
        bundle.putString("sigs", strJoinToString$default);
        bundle.putString("abis", strJoinToString$default2);
        Boolean bool = Boolean.TRUE;
        bundle.putBoolean("lp", Intrinsics.areEqual(boolValueOf, bool));
        Unit unit = Unit.INSTANCE;
        iFVarC.n(new j.fuX("device-mismatch", bundle));
        if (Intrinsics.areEqual(boolValueOf, bool)) {
            SJ0.I28 i282 = this.binding;
            if (i282 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i282 = null;
            }
            i282.J2.setText("TAMPERING DETECTED");
            SJ0.I28 i283 = this.binding;
            if (i283 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i283 = null;
            }
            i283.rl.setText("This installation of Alight Motion has been modified or tampered with after downloading from Google Play and as a result it is no longer compatible with your device. Please use the unmodified official version from the Google Play Store. For further assistance please contact support-android@alightmotion.com and include a screenshot of this screen.");
        }
        String str6 = (("App: " + str4 + "\n") + "Build: " + str5 + "\n") + "OS: " + Build.VERSION.RELEASE + "\n";
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String str7 = (((str6 + "Device: " + L0y.rl(MANUFACTURER, null, i2, null) + " " + Build.MODEL + " (" + Build.PRODUCT + ")\n") + "Chipset: " + AbstractC2487Wre.mUb().n() + " (" + Build.BOARD + ")\n") + "RAM: " + lej.t(memoryInfo.availMem, false, 1, null) + " available / " + lej.t(memoryInfo.totalMem, false, 1, null) + " total\n") + "ABIS: " + strJoinToString$default2 + "\n";
        SJ0.I28 i284 = this.binding;
        if (i284 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i284 = null;
        }
        i284.f9148t.setText(str7);
        SJ0.I28 i285 = this.binding;
        if (i285 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            i28 = null;
        } else {
            i28 = i285;
        }
        i28.nr.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.g9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceMismatchNoticeActivity.G7(this.f45250n, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G7(DeviceMismatchNoticeActivity deviceMismatchNoticeActivity, View view) {
        ot.j.rl(deviceMismatchNoticeActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence Mx(Signature signature) {
        byte[] byteArray = signature.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        byte[] bArrTy = HI0.gnv.ty(byteArray);
        Intrinsics.checkNotNullExpressionValue(bArrTy, "sha1(...)");
        return StringsKt.substring(HI0.gnv.o(bArrTy), new IntRange(0, 7));
    }
}
