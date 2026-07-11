package kYF;

import Z.w6;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import x.EnumC2421n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {

    public static final class n extends Animatable2.AnimationCallback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f69936n;
        final /* synthetic */ Function0 rl;

        n(Function0 function0, Function0 function02) {
            this.f69936n = function0;
            this.rl = function02;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            Function0 function0 = this.rl;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            Function0 function0 = this.f69936n;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final class w6 extends Animatable2Compat.AnimationCallback {
        final /* synthetic */ Function0 rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f69937t;

        w6(Function0 function0, Function0 function02) {
            this.rl = function0;
            this.f69937t = function02;
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void rl(Drawable drawable) {
            Function0 function0 = this.f69937t;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void t(Drawable drawable) {
            Function0 function0 = this.rl;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC2421n.values().length];
            try {
                iArr[EnumC2421n.f75141n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2421n.f75143t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2421n.f75140O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Z.CN3.values().length];
            try {
                iArr2[Z.CN3.f12263n.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Z.CN3.f12264t.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Animatable2.AnimationCallback n(Function0 function0, Function0 function02) {
        return new n(function0, function02);
    }

    public static final int nr(Z.w6 w6Var, Z.CN3 cn3) {
        if (w6Var instanceof w6.j) {
            return ((w6.j) w6Var).f12273n;
        }
        int i2 = j.$EnumSwitchMapping$1[cn3.ordinal()];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Animatable2Compat.AnimationCallback rl(Function0 function0, Function0 function02) {
        return new w6(function0, function02);
    }

    public static final boolean t(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }
}
