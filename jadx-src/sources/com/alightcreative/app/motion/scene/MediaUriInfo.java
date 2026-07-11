package com.alightcreative.app.motion.scene;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00016B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u0089\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\rHÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u00067"}, d2 = {"Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "", "uri", "Landroid/net/Uri;", "filename", "", "title", "mime", "size", "", "infoUpdated", "sig", "width", "", "height", "orientation", "duration", "fphs", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;IIIJI)V", "getUri", "()Landroid/net/Uri;", "getFilename", "()Ljava/lang/String;", "getTitle", "getMime", "getSize", "()J", "getInfoUpdated", "getSig", "getWidth", "()I", "getHeight", "getOrientation", "getDuration", "getFphs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MediaUriInfo {
    private final long duration;
    private final String filename;
    private final int fphs;
    private final int height;
    private final long infoUpdated;
    private final String mime;
    private final int orientation;
    private final String sig;
    private final long size;
    private final String title;
    private final Uri uri;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/MediaUriInfo$Companion;", "", "<init>", "()V", "fromCache", "Lcom/alightcreative/app/motion/scene/MediaUriInfo;", "uri", "Landroid/net/Uri;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMediaUriInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaUriInfo.kt\ncom/alightcreative/app/motion/scene/MediaUriInfo$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MediaUriInfo fromCache(Uri uri) {
            MediaUriInfo mediaUriInfo;
            Intrinsics.checkNotNullParameter(uri, "uri");
            synchronized (MediaUriInfoKt.mediaUriInfoCache) {
                mediaUriInfo = (MediaUriInfo) MediaUriInfoKt.mediaUriInfoCache.get(uri);
            }
            return mediaUriInfo;
        }
    }

    public MediaUriInfo(Uri uri, String str, String str2, String str3, long j2, long j3, String str4, int i2, int i3, int i5, long j4, int i7) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.filename = str;
        this.title = str2;
        this.mime = str3;
        this.size = j2;
        this.infoUpdated = j3;
        this.sig = str4;
        this.width = i2;
        this.height = i3;
        this.orientation = i5;
        this.duration = j4;
        this.fphs = i7;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getFphs() {
        return this.fphs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMime() {
        return this.mime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getInfoUpdated() {
        return this.infoUpdated;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSig() {
        return this.sig;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final MediaUriInfo copy(Uri uri, String filename, String title, String mime, long size, long infoUpdated, String sig, int width, int height, int orientation, long duration, int fphs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new MediaUriInfo(uri, filename, title, mime, size, infoUpdated, sig, width, height, orientation, duration, fphs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaUriInfo)) {
            return false;
        }
        MediaUriInfo mediaUriInfo = (MediaUriInfo) other;
        return Intrinsics.areEqual(this.uri, mediaUriInfo.uri) && Intrinsics.areEqual(this.filename, mediaUriInfo.filename) && Intrinsics.areEqual(this.title, mediaUriInfo.title) && Intrinsics.areEqual(this.mime, mediaUriInfo.mime) && this.size == mediaUriInfo.size && this.infoUpdated == mediaUriInfo.infoUpdated && Intrinsics.areEqual(this.sig, mediaUriInfo.sig) && this.width == mediaUriInfo.width && this.height == mediaUriInfo.height && this.orientation == mediaUriInfo.orientation && this.duration == mediaUriInfo.duration && this.fphs == mediaUriInfo.fphs;
    }

    public int hashCode() {
        int iHashCode = this.uri.hashCode() * 31;
        String str = this.filename;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mime;
        int iHashCode4 = (((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.size)) * 31) + Long.hashCode(this.infoUpdated)) * 31;
        String str4 = this.sig;
        return ((((((((((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.orientation)) * 31) + Long.hashCode(this.duration)) * 31) + Integer.hashCode(this.fphs);
    }

    public String toString() {
        return "MediaUriInfo(uri=" + this.uri + ", filename=" + this.filename + ", title=" + this.title + ", mime=" + this.mime + ", size=" + this.size + ", infoUpdated=" + this.infoUpdated + ", sig=" + this.sig + ", width=" + this.width + ", height=" + this.height + ", orientation=" + this.orientation + ", duration=" + this.duration + ", fphs=" + this.fphs + ")";
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final int getFphs() {
        return this.fphs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getInfoUpdated() {
        return this.infoUpdated;
    }

    public final String getMime() {
        return this.mime;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final String getSig() {
        return this.sig;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ MediaUriInfo(Uri uri, String str, String str2, String str3, long j2, long j3, String str4, int i2, int i3, int i5, long j4, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? -1L : j2, (i8 & 32) != 0 ? System.currentTimeMillis() : j3, (i8 & 64) == 0 ? str4 : null, (i8 & 128) != 0 ? -1 : i2, (i8 & 256) != 0 ? -1 : i3, (i8 & 512) != 0 ? -1 : i5, (i8 & 1024) == 0 ? j4 : -1L, (i8 & 2048) != 0 ? -1 : i7);
    }
}
