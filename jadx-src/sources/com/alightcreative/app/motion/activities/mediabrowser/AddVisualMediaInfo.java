package com.alightcreative.app.motion.activities.mediabrowser;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010'¨\u0006*"}, d2 = {"Lcom/alightcreative/app/motion/activities/mediabrowser/AddVisualMediaInfo;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "uri", "", "typeName", "", "duration", "", "startTrim", "endTrim", "<init>", "(Landroid/net/Uri;Ljava/lang/String;IJJ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Landroid/net/Uri;", "O", "()Landroid/net/Uri;", "t", "Ljava/lang/String;", "nr", "I", "J2", "J", "()J", "r", "rl", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddVisualMediaInfo implements Parcelable {
    public static final Parcelable.Creator<AddVisualMediaInfo> CREATOR = new j();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final long startTrim;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri uri;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long endTrim;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String typeName;

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final AddVisualMediaInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddVisualMediaInfo((Uri) parcel.readParcelable(AddVisualMediaInfo.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final AddVisualMediaInfo[] newArray(int i2) {
            return new AddVisualMediaInfo[i2];
        }
    }

    public AddVisualMediaInfo(Uri uri, String typeName, int i2, long j2, long j3) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        this.uri = uri;
        this.typeName = typeName;
        this.duration = i2;
        this.startTrim = j2;
        this.endTrim = j3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddVisualMediaInfo)) {
            return false;
        }
        AddVisualMediaInfo addVisualMediaInfo = (AddVisualMediaInfo) other;
        return Intrinsics.areEqual(this.uri, addVisualMediaInfo.uri) && Intrinsics.areEqual(this.typeName, addVisualMediaInfo.typeName) && this.duration == addVisualMediaInfo.duration && this.startTrim == addVisualMediaInfo.startTrim && this.endTrim == addVisualMediaInfo.endTrim;
    }

    public int hashCode() {
        return (((((((this.uri.hashCode() * 31) + this.typeName.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + Long.hashCode(this.startTrim)) * 31) + Long.hashCode(this.endTrim);
    }

    public String toString() {
        return "AddVisualMediaInfo(uri=" + this.uri + ", typeName=" + this.typeName + ", duration=" + this.duration + ", startTrim=" + this.startTrim + ", endTrim=" + this.endTrim + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.uri, flags);
        dest.writeString(this.typeName);
        dest.writeInt(this.duration);
        dest.writeLong(this.startTrim);
        dest.writeLong(this.endTrim);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final long getEndTrim() {
        return this.endTrim;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getStartTrim() {
        return this.startTrim;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AddVisualMediaInfo(android.net.Uri r9, java.lang.String r10, int r11, long r12, long r14, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto La
            com.alightcreative.app.motion.persist.j r11 = com.alightcreative.app.motion.persist.j.INSTANCE
            int r11 = r11.getDefaultLayerDuration()
        La:
            r3 = r11
            r11 = r16 & 8
            r0 = 0
            if (r11 == 0) goto L13
            r4 = r0
            goto L14
        L13:
            r4 = r12
        L14:
            r11 = r16 & 16
            if (r11 == 0) goto L1d
            r6 = r0
            r2 = r10
            r0 = r8
            r1 = r9
            goto L21
        L1d:
            r6 = r14
            r0 = r8
            r1 = r9
            r2 = r10
        L21:
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo.<init>(android.net.Uri, java.lang.String, int, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
