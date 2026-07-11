package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u0011HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003JÇ\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\fHÆ\u0001J\u0013\u0010F\u001a\u00020\f2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\t\u0010I\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%¨\u0006J"}, d2 = {"Lcom/alightcreative/app/motion/scene/ExportParams;", "", "width", "", "height", "audioBitrate", "videoBitrate", "idrInterval", "fphs", "format", "Lcom/alightcreative/app/motion/scene/ExportFormat;", "audio", "", "video", "startFrame", "endFrame", "videoMime", "", "audioMime", "audioSampleRate", "audioChannelCount", "startOfNoWatermarkPeriod", "durationOfNoWatermarkPeriod", "imageQuality", "opaque", "<init>", "(IIIIIILcom/alightcreative/app/motion/scene/ExportFormat;ZZIILjava/lang/String;Ljava/lang/String;IIIIIZ)V", "getWidth", "()I", "getHeight", "getAudioBitrate", "getVideoBitrate", "getIdrInterval", "getFphs", "getFormat", "()Lcom/alightcreative/app/motion/scene/ExportFormat;", "getAudio", "()Z", "getVideo", "getStartFrame", "getEndFrame", "getVideoMime", "()Ljava/lang/String;", "getAudioMime", "getAudioSampleRate", "getAudioChannelCount", "getStartOfNoWatermarkPeriod", "getDurationOfNoWatermarkPeriod", "getImageQuality", "getOpaque", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ExportParams {
    public static final int $stable = 0;
    private final boolean audio;
    private final int audioBitrate;
    private final int audioChannelCount;
    private final String audioMime;
    private final int audioSampleRate;
    private final int durationOfNoWatermarkPeriod;
    private final int endFrame;
    private final ExportFormat format;
    private final int fphs;
    private final int height;
    private final int idrInterval;
    private final int imageQuality;
    private final boolean opaque;
    private final int startFrame;
    private final int startOfNoWatermarkPeriod;
    private final boolean video;
    private final int videoBitrate;
    private final String videoMime;
    private final int width;

    public ExportParams(int i2, int i3, int i5, int i7, int i8, int i9, ExportFormat format, boolean z2, boolean z3, int i10, int i11, String videoMime, String audioMime, int i12, int i13, int i14, int i15, int i16, boolean z4) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(videoMime, "videoMime");
        Intrinsics.checkNotNullParameter(audioMime, "audioMime");
        this.width = i2;
        this.height = i3;
        this.audioBitrate = i5;
        this.videoBitrate = i7;
        this.idrInterval = i8;
        this.fphs = i9;
        this.format = format;
        this.audio = z2;
        this.video = z3;
        this.startFrame = i10;
        this.endFrame = i11;
        this.videoMime = videoMime;
        this.audioMime = audioMime;
        this.audioSampleRate = i12;
        this.audioChannelCount = i13;
        this.startOfNoWatermarkPeriod = i14;
        this.durationOfNoWatermarkPeriod = i15;
        this.imageQuality = i16;
        this.opaque = z4;
    }

    public static /* synthetic */ ExportParams copy$default(ExportParams exportParams, int i2, int i3, int i5, int i7, int i8, int i9, ExportFormat exportFormat, boolean z2, boolean z3, int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15, int i16, boolean z4, int i17, Object obj) {
        boolean z5;
        int i18;
        int i19 = (i17 & 1) != 0 ? exportParams.width : i2;
        int i20 = (i17 & 2) != 0 ? exportParams.height : i3;
        int i21 = (i17 & 4) != 0 ? exportParams.audioBitrate : i5;
        int i22 = (i17 & 8) != 0 ? exportParams.videoBitrate : i7;
        int i23 = (i17 & 16) != 0 ? exportParams.idrInterval : i8;
        int i24 = (i17 & 32) != 0 ? exportParams.fphs : i9;
        ExportFormat exportFormat2 = (i17 & 64) != 0 ? exportParams.format : exportFormat;
        boolean z6 = (i17 & 128) != 0 ? exportParams.audio : z2;
        boolean z7 = (i17 & 256) != 0 ? exportParams.video : z3;
        int i25 = (i17 & 512) != 0 ? exportParams.startFrame : i10;
        int i26 = (i17 & 1024) != 0 ? exportParams.endFrame : i11;
        String str3 = (i17 & 2048) != 0 ? exportParams.videoMime : str;
        String str4 = (i17 & 4096) != 0 ? exportParams.audioMime : str2;
        int i27 = (i17 & 8192) != 0 ? exportParams.audioSampleRate : i12;
        int i28 = i19;
        int i29 = (i17 & 16384) != 0 ? exportParams.audioChannelCount : i13;
        int i30 = (i17 & 32768) != 0 ? exportParams.startOfNoWatermarkPeriod : i14;
        int i31 = (i17 & 65536) != 0 ? exportParams.durationOfNoWatermarkPeriod : i15;
        int i32 = (i17 & 131072) != 0 ? exportParams.imageQuality : i16;
        if ((i17 & 262144) != 0) {
            i18 = i32;
            z5 = exportParams.opaque;
        } else {
            z5 = z4;
            i18 = i32;
        }
        return exportParams.copy(i28, i20, i21, i22, i23, i24, exportFormat2, z6, z7, i25, i26, str3, str4, i27, i29, i30, i31, i18, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStartFrame() {
        return this.startFrame;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getEndFrame() {
        return this.endFrame;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getVideoMime() {
        return this.videoMime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAudioMime() {
        return this.audioMime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getAudioChannelCount() {
        return this.audioChannelCount;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getStartOfNoWatermarkPeriod() {
        return this.startOfNoWatermarkPeriod;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDurationOfNoWatermarkPeriod() {
        return this.durationOfNoWatermarkPeriod;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final int getImageQuality() {
        return this.imageQuality;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getOpaque() {
        return this.opaque;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVideoBitrate() {
        return this.videoBitrate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIdrInterval() {
        return this.idrInterval;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFphs() {
        return this.fphs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ExportFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAudio() {
        return this.audio;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getVideo() {
        return this.video;
    }

    public final ExportParams copy(int width, int height, int audioBitrate, int videoBitrate, int idrInterval, int fphs, ExportFormat format, boolean audio, boolean video, int startFrame, int endFrame, String videoMime, String audioMime, int audioSampleRate, int audioChannelCount, int startOfNoWatermarkPeriod, int durationOfNoWatermarkPeriod, int imageQuality, boolean opaque) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(videoMime, "videoMime");
        Intrinsics.checkNotNullParameter(audioMime, "audioMime");
        return new ExportParams(width, height, audioBitrate, videoBitrate, idrInterval, fphs, format, audio, video, startFrame, endFrame, videoMime, audioMime, audioSampleRate, audioChannelCount, startOfNoWatermarkPeriod, durationOfNoWatermarkPeriod, imageQuality, opaque);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExportParams)) {
            return false;
        }
        ExportParams exportParams = (ExportParams) other;
        return this.width == exportParams.width && this.height == exportParams.height && this.audioBitrate == exportParams.audioBitrate && this.videoBitrate == exportParams.videoBitrate && this.idrInterval == exportParams.idrInterval && this.fphs == exportParams.fphs && this.format == exportParams.format && this.audio == exportParams.audio && this.video == exportParams.video && this.startFrame == exportParams.startFrame && this.endFrame == exportParams.endFrame && Intrinsics.areEqual(this.videoMime, exportParams.videoMime) && Intrinsics.areEqual(this.audioMime, exportParams.audioMime) && this.audioSampleRate == exportParams.audioSampleRate && this.audioChannelCount == exportParams.audioChannelCount && this.startOfNoWatermarkPeriod == exportParams.startOfNoWatermarkPeriod && this.durationOfNoWatermarkPeriod == exportParams.durationOfNoWatermarkPeriod && this.imageQuality == exportParams.imageQuality && this.opaque == exportParams.opaque;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.audioBitrate)) * 31) + Integer.hashCode(this.videoBitrate)) * 31) + Integer.hashCode(this.idrInterval)) * 31) + Integer.hashCode(this.fphs)) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.audio)) * 31) + Boolean.hashCode(this.video)) * 31) + Integer.hashCode(this.startFrame)) * 31) + Integer.hashCode(this.endFrame)) * 31) + this.videoMime.hashCode()) * 31) + this.audioMime.hashCode()) * 31) + Integer.hashCode(this.audioSampleRate)) * 31) + Integer.hashCode(this.audioChannelCount)) * 31) + Integer.hashCode(this.startOfNoWatermarkPeriod)) * 31) + Integer.hashCode(this.durationOfNoWatermarkPeriod)) * 31) + Integer.hashCode(this.imageQuality)) * 31) + Boolean.hashCode(this.opaque);
    }

    public String toString() {
        return "ExportParams(width=" + this.width + ", height=" + this.height + ", audioBitrate=" + this.audioBitrate + ", videoBitrate=" + this.videoBitrate + ", idrInterval=" + this.idrInterval + ", fphs=" + this.fphs + ", format=" + this.format + ", audio=" + this.audio + ", video=" + this.video + ", startFrame=" + this.startFrame + ", endFrame=" + this.endFrame + ", videoMime=" + this.videoMime + ", audioMime=" + this.audioMime + ", audioSampleRate=" + this.audioSampleRate + ", audioChannelCount=" + this.audioChannelCount + ", startOfNoWatermarkPeriod=" + this.startOfNoWatermarkPeriod + ", durationOfNoWatermarkPeriod=" + this.durationOfNoWatermarkPeriod + ", imageQuality=" + this.imageQuality + ", opaque=" + this.opaque + ")";
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final int getAudioBitrate() {
        return this.audioBitrate;
    }

    public final int getAudioChannelCount() {
        return this.audioChannelCount;
    }

    public final String getAudioMime() {
        return this.audioMime;
    }

    public final int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    public final int getDurationOfNoWatermarkPeriod() {
        return this.durationOfNoWatermarkPeriod;
    }

    public final int getEndFrame() {
        return this.endFrame;
    }

    public final ExportFormat getFormat() {
        return this.format;
    }

    public final int getFphs() {
        return this.fphs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getIdrInterval() {
        return this.idrInterval;
    }

    public final int getImageQuality() {
        return this.imageQuality;
    }

    public final boolean getOpaque() {
        return this.opaque;
    }

    public final int getStartFrame() {
        return this.startFrame;
    }

    public final int getStartOfNoWatermarkPeriod() {
        return this.startOfNoWatermarkPeriod;
    }

    public final boolean getVideo() {
        return this.video;
    }

    public final int getVideoBitrate() {
        return this.videoBitrate;
    }

    public final String getVideoMime() {
        return this.videoMime;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ ExportParams(int i2, int i3, int i5, int i7, int i8, int i9, ExportFormat exportFormat, boolean z2, boolean z3, int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15, int i16, boolean z4, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i5, i7, i8, i9, exportFormat, z2, z3, i10, i11, str, str2, i12, i13, (i17 & 32768) != 0 ? 0 : i14, (i17 & 65536) != 0 ? 0 : i15, (i17 & 131072) != 0 ? 100 : i16, z4);
    }
}
