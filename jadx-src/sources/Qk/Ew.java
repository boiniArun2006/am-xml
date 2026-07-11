package Qk;

import com.alightcreative.app.motion.scene.ExportFormat;
import com.alightcreative.app.motion.scene.ExportParams;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Ew {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExportFormat.values().length];
            try {
                iArr[ExportFormat.VIDEO_MPEG4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExportFormat.VIDEO_3GPP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExportFormat.VIDEO_WEBM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExportFormat.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExportFormat.PNG_ZIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ExportFormat.JPEG_ZIP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ExportFormat.WEBP_ZIP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ExportFormat.PNG_PLAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ExportFormat.JPEG_PLAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ExportFormat.WEBP_PLAIN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ExportFormat.M4A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SPz n(ExportParams params, File exportFile) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(exportFile, "exportFile");
        switch (j.$EnumSwitchMapping$0[params.getFormat().ordinal()]) {
            case 1:
            case 2:
            case 3:
                throw new IllegalStateException(("External export context shouldn't be used for format " + params.getFormat()).toString());
            case 4:
                return new g9s(exportFile, params);
            case 5:
            case 6:
            case 7:
                return new DAz(exportFile, params);
            case 8:
            case 9:
            case 10:
                return new Z(exportFile, params);
            case 11:
                throw new NotImplementedError(null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean rl(ExportParams exportParams) {
        Intrinsics.checkNotNullParameter(exportParams, "<this>");
        switch (j.$EnumSwitchMapping$0[exportParams.getFormat().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 11:
                throw new NotImplementedError(null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean t(SPz sPz) {
        Intrinsics.checkNotNullParameter(sPz, "<this>");
        return sPz instanceof Z;
    }
}
