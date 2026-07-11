package com.alightcreative.app.motion.scene;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u001ag\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0015\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u0018\u001a\u00020\r*\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001c\u001a'\u0010!\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a%\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(\"\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/scene/Scene;", "LUO6/w6;", "exportInfo", "", "startFrame", "endFrame", "audioSampleRate", "audioChannelCount", "videoBitrate", "audioBitrate", "fphs", "Lcom/alightcreative/app/motion/scene/VideoEncoding;", "videoEncoding", "Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParamsVideo", "(Lcom/alightcreative/app/motion/scene/Scene;LUO6/w6;IIIIIIILcom/alightcreative/app/motion/scene/VideoEncoding;)Lcom/alightcreative/app/motion/scene/ExportParams;", "exportParamsGif", "(Lcom/alightcreative/app/motion/scene/Scene;LUO6/w6;III)Lcom/alightcreative/app/motion/scene/ExportParams;", "Landroid/graphics/Bitmap$CompressFormat;", "bitmapFormat", "imageQuality", "exportParamsImageSeqInZip", "(Lcom/alightcreative/app/motion/scene/Scene;LUO6/w6;IIILandroid/graphics/Bitmap$CompressFormat;I)Lcom/alightcreative/app/motion/scene/ExportParams;", "exportFrame", "exportParamsImage", "(Lcom/alightcreative/app/motion/scene/Scene;IILandroid/graphics/Bitmap$CompressFormat;I)Lcom/alightcreative/app/motion/scene/ExportParams;", "", "lockForExport", "()V", "unlockForExport", "R", "Lkotlin/Function0;", "block", "withLockForExport", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", CreativeInfoManager.f61947b, "width", "height", "", "isEncoderSupported", "(Lcom/alightcreative/app/motion/scene/VideoEncoding;II)Z", "lockedForExport", "Z", "app_productionRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSceneExporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SceneExporter.kt\ncom/alightcreative/app/motion/scene/SceneExporterKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
public final class SceneExporterKt {
    private static volatile boolean lockedForExport;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ExportParams exportParamsGif(Scene scene, UO6.w6 exportInfo, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        return new ExportParams(exportInfo.J2(), exportInfo.O(), scene.getWidth() * scene.getHeight() >= 840000 ? 196608 : scene.getWidth() * scene.getHeight() >= 144000 ? 131072 : 24576, 0, 2, i5, ExportFormat.GIF, false, true, i2, i3, "", "", 44100, 2, 0, 0, 0, false, 229376, null);
    }

    public static /* synthetic */ ExportParams exportParamsGif$default(Scene scene, UO6.w6 w6Var, int i2, int i3, int i5, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i2 = 0;
        }
        if ((i7 & 4) != 0) {
            i3 = TimeKt.frameNumberFromTime(scene.getTotalTime(), UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr())) - 1;
        }
        if ((i7 & 8) != 0) {
            i5 = UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr());
        }
        return exportParamsGif(scene, w6Var, i2, i3, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ExportParams exportParamsImage(Scene scene, int i2, int i3, Bitmap.CompressFormat bitmapFormat, int i5) {
        ExportFormat exportFormat;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(bitmapFormat, "bitmapFormat");
        int exportWidth = scene.getExportWidth();
        int exportHeight = scene.getExportHeight();
        int i7 = scene.getWidth() * scene.getHeight() >= 840000 ? 196608 : scene.getWidth() * scene.getHeight() >= 144000 ? 131072 : 24576;
        int i8 = WhenMappings.$EnumSwitchMapping$0[bitmapFormat.ordinal()];
        if (i8 == 1) {
            exportFormat = ExportFormat.JPEG_PLAIN;
        } else if (i8 == 2) {
            exportFormat = ExportFormat.PNG_PLAIN;
        } else {
            if (i8 != 3) {
                throw new NotImplementedError(null, i, 0 == true ? 1 : 0);
            }
            exportFormat = ExportFormat.WEBP_PLAIN;
        }
        return new ExportParams(exportWidth, exportHeight, i7, 0, 2, i3, exportFormat, false, true, i2, i2 + 1, "", "", 44100, 2, 0, 0, i5, bitmapFormat == Bitmap.CompressFormat.PNG ? 0 : 1, 98304, null);
    }

    public static /* synthetic */ ExportParams exportParamsImage$default(Scene scene, int i2, int i3, Bitmap.CompressFormat compressFormat, int i5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = 0;
        }
        if ((i7 & 2) != 0) {
            i3 = scene.getFramesPerHundredSeconds();
        }
        if ((i7 & 4) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i7 & 8) != 0) {
            i5 = 80;
        }
        return exportParamsImage(scene, i2, i3, compressFormat, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ExportParams exportParamsImageSeqInZip(Scene scene, UO6.w6 exportInfo, int i2, int i3, int i5, Bitmap.CompressFormat bitmapFormat, int i7) {
        ExportFormat exportFormat;
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        Intrinsics.checkNotNullParameter(bitmapFormat, "bitmapFormat");
        int iJ2 = exportInfo.J2();
        int iO = exportInfo.O();
        int i8 = scene.getWidth() * scene.getHeight() >= 840000 ? 196608 : scene.getWidth() * scene.getHeight() >= 144000 ? 131072 : 24576;
        int i9 = WhenMappings.$EnumSwitchMapping$0[bitmapFormat.ordinal()];
        if (i9 == 1) {
            exportFormat = ExportFormat.JPEG_ZIP;
        } else if (i9 == 2) {
            exportFormat = ExportFormat.PNG_ZIP;
        } else {
            if (i9 != 3) {
                throw new NotImplementedError(null, i, 0 == true ? 1 : 0);
            }
            exportFormat = ExportFormat.WEBP_ZIP;
        }
        return new ExportParams(iJ2, iO, i8, 0, 2, i5, exportFormat, false, true, i2, i3, "", "", 44100, 2, 0, 0, i7, bitmapFormat == Bitmap.CompressFormat.PNG ? 0 : 1, 98304, null);
    }

    public static /* synthetic */ ExportParams exportParamsImageSeqInZip$default(Scene scene, UO6.w6 w6Var, int i2, int i3, int i5, Bitmap.CompressFormat compressFormat, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i2 = 0;
        }
        int i9 = i2;
        if ((i8 & 4) != 0) {
            i3 = TimeKt.frameNumberFromTime(scene.getTotalTime(), UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr())) - 1;
        }
        int i10 = i3;
        if ((i8 & 8) != 0) {
            i5 = UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr());
        }
        int i11 = i5;
        if ((i8 & 16) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if ((i8 & 32) != 0) {
            i7 = compressFormat2 == Bitmap.CompressFormat.PNG ? 80 : w6Var.n();
        }
        return exportParamsImageSeqInZip(scene, w6Var, i9, i10, i11, compressFormat2, i7);
    }

    public static final ExportParams exportParamsVideo(Scene scene, UO6.w6 exportInfo, int i2, int i3, int i5, int i7, int i8, int i9, int i10, VideoEncoding videoEncoding) {
        Intrinsics.checkNotNullParameter(scene, "<this>");
        Intrinsics.checkNotNullParameter(exportInfo, "exportInfo");
        Intrinsics.checkNotNullParameter(videoEncoding, "videoEncoding");
        int iJ2 = exportInfo.J2();
        int iO = exportInfo.O();
        return new ExportParams(iJ2, iO + (iO % 2), i9, i8, 2, i10, ExportFormat.VIDEO_MPEG4, true, true, i2, i3, videoEncoding.getMime(), "audio/mp4a-latm", i5, i7, 0, 0, 0, true, 229376, null);
    }

    public static /* synthetic */ ExportParams exportParamsVideo$default(Scene scene, UO6.w6 w6Var, int i2, int i3, int i5, int i7, int i8, int i9, int i10, VideoEncoding videoEncoding, int i11, Object obj) {
        int i12;
        if ((i11 & 2) != 0) {
            i2 = 0;
        }
        int i13 = i2;
        if ((i11 & 4) != 0) {
            i3 = TimeKt.frameNumberFromTime(scene.getTotalTime(), UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr())) - 1;
        }
        int i14 = i3;
        int i15 = (i11 & 8) != 0 ? 48000 : i5;
        int i16 = (i11 & 16) != 0 ? 2 : i7;
        if ((i11 & 64) != 0) {
            i12 = w6Var.J2() * w6Var.O() >= 840000 ? 196608 : w6Var.J2() * w6Var.O() >= 144000 ? 131072 : 24576;
        } else {
            i12 = i9;
        }
        return exportParamsVideo(scene, w6Var, i13, i14, i15, i16, i8, i12, (i11 & 128) != 0 ? UO6.iF.n(scene.getFramesPerHundredSeconds(), w6Var.nr()) : i10, (i11 & 256) != 0 ? VideoEncoding.AVC : videoEncoding);
    }

    public static final boolean isEncoderSupported(VideoEncoding encoding, int i2, int i3) {
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        if (Hr.aC.qie().findEncoderForFormat(MediaFormat.createVideoFormat(encoding.getMime(), i2, i3)) != null) {
            return !StringsKt.isBlank(r1);
        }
        return false;
    }

    public static final void lockForExport() {
        synchronized (EXPORT_LOCK.INSTANCE) {
            lockedForExport = true;
            Unit unit = Unit.INSTANCE;
        }
        XoT.C.KN("SceneExporter", new Function0() { // from class: com.alightcreative.app.motion.scene.gnv
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneExporterKt.lockForExport$lambda$2();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String lockForExport$lambda$2() {
        return "ExportLock: LOCK for export";
    }

    public static final void unlockForExport() {
        synchronized (EXPORT_LOCK.INSTANCE) {
            lockedForExport = false;
            Unit unit = Unit.INSTANCE;
        }
        XoT.C.KN("SceneExporter", new Function0() { // from class: com.alightcreative.app.motion.scene.fg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SceneExporterKt.unlockForExport$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unlockForExport$lambda$4() {
        return "ExportLock: UNLOCK for export";
    }

    public static final <R> R withLockForExport(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        lockForExport();
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            unlockForExport();
            InlineMarker.finallyEnd(1);
        }
    }
}
