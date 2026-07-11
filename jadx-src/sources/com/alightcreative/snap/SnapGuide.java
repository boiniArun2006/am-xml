package com.alightcreative.snap;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import b1P.Wre;
import b1P.w6;
import com.alightcreative.app.motion.scene.Vector2D;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/alightcreative/snap/SnapGuide;", "Landroid/os/Parcelable;", "Lb1P/w6;", "axis", "Lcom/alightcreative/app/motion/scene/Vector2D;", "pos", "Lb1P/Wre;", "type", "", "length", "<init>", "(Lb1P/w6;Lcom/alightcreative/app/motion/scene/Vector2D;Lb1P/Wre;F)V", "(Lb1P/w6;FLb1P/Wre;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "Lb1P/w6;", "()Lb1P/w6;", "t", "Lcom/alightcreative/app/motion/scene/Vector2D;", "()Lcom/alightcreative/app/motion/scene/Vector2D;", "O", "Lb1P/Wre;", "nr", "()Lb1P/Wre;", "J2", "F", "rl", "()F", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SnapGuide implements Parcelable {
    public static final Parcelable.Creator<SnapGuide> CREATOR = new j();

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final float length;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final Wre type;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final w6 axis;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Vector2D pos;

    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final SnapGuide createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SnapGuide(w6.valueOf(parcel.readString()), Vector2D.CREATOR.createFromParcel(parcel), Wre.valueOf(parcel.readString()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public final SnapGuide[] newArray(int i2) {
            return new SnapGuide[i2];
        }
    }

    public SnapGuide(w6 axis, Vector2D pos, Wre type, float f3) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(pos, "pos");
        Intrinsics.checkNotNullParameter(type, "type");
        this.axis = axis;
        this.pos = pos;
        this.type = type;
        this.length = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapGuide)) {
            return false;
        }
        SnapGuide snapGuide = (SnapGuide) other;
        return this.axis == snapGuide.axis && Intrinsics.areEqual(this.pos, snapGuide.pos) && this.type == snapGuide.type && Float.compare(this.length, snapGuide.length) == 0;
    }

    public int hashCode() {
        return (((((this.axis.hashCode() * 31) + this.pos.hashCode()) * 31) + this.type.hashCode()) * 31) + Float.hashCode(this.length);
    }

    public String toString() {
        return "SnapGuide(axis=" + this.axis + ", pos=" + this.pos + ", type=" + this.type + ", length=" + this.length + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.axis.name());
        this.pos.writeToParcel(dest, flags);
        dest.writeString(this.type.name());
        dest.writeFloat(this.length);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final w6 getAxis() {
        return this.axis;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final Wre getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Vector2D getPos() {
        return this.pos;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnapGuide(w6 axis, float f3, Wre type) {
        this(axis, axis == w6.f43148n ? new Vector2D(f3, 0.0f) : new Vector2D(0.0f, f3), type, f3);
        Intrinsics.checkNotNullParameter(axis, "axis");
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
