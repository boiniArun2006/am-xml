package oC;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[oC.j.values().length];
            try {
                iArr[oC.j.AAC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[I28.values().length];
            try {
                iArr2[I28.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[I28.H265.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String n(oC.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        if (j.$EnumSwitchMapping$0[jVar.ordinal()] == 1) {
            return "audio/mp4a-latm";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String rl(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        int i2 = j.$EnumSwitchMapping$1[i28.ordinal()];
        if (i2 == 1) {
            return "video/avc";
        }
        if (i2 == 2) {
            return "video/hevc";
        }
        throw new NoWhenBranchMatchedException();
    }
}
