package kk;

import b.InterfaceC1648Ml;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q3M.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n implements InterfaceC1648Ml {
    private final q3M.n nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f70127t;

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterfaceC1648Ml.n.values().length];
            try {
                iArr[InterfaceC1648Ml.n.f43130n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC1648Ml.n.f43132t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC1648Ml.n.f43129O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n(long j2, q3M.n networkErrorUploadDelayProvider) {
        Intrinsics.checkNotNullParameter(networkErrorUploadDelayProvider, "networkErrorUploadDelayProvider");
        this.f70127t = j2;
        this.nr = networkErrorUploadDelayProvider;
    }

    @Override // q3M.n
    public void reset() {
        this.nr.reset();
    }

    @Override // q3M.n
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public long n(InterfaceC1648Ml.n delayConditioner) {
        Intrinsics.checkNotNullParameter(delayConditioner, "delayConditioner");
        int i2 = j.$EnumSwitchMapping$0[delayConditioner.ordinal()];
        if (i2 == 1) {
            this.nr.reset();
            return this.f70127t;
        }
        if (i2 == 2) {
            this.nr.reset();
            return this.f70127t;
        }
        if (i2 == 3) {
            return I28.t(this.nr);
        }
        throw new NoWhenBranchMatchedException();
    }
}
