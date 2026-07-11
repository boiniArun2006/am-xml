package com.google.android.gms.location;

import ScC.FuwU.XIvb;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@SafeParcelable.Class(creator = "DetectedActivityCreator")
@SafeParcelable.Reserved({1000})
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;

    @SafeParcelable.Field(id = 1)
    int zzb;

    @SafeParcelable.Field(id = 2)
    int zzc;

    @NonNull
    public static final Comparator<DetectedActivity> zza = new zzq();

    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new zzr();

    public int getConfidence() {
        return this.zzc;
    }

    public int getType() {
        int i2 = this.zzb;
        if (i2 > 22 || i2 < 0) {
            return 4;
        }
        return i2;
    }

    @ShowFirstParty
    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.zzb == detectedActivity.zzb && this.zzc == detectedActivity.zzc) {
                return true;
            }
        }
        return false;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @SafeParcelable.Constructor
    public DetectedActivity(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3) {
        this.zzb = i2;
        this.zzc = i3;
    }

    @NonNull
    public String toString() {
        String string;
        int type = getType();
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type != 5) {
                                if (type != 7) {
                                    if (type != 8) {
                                        if (type != 16) {
                                            string = type != 17 ? Integer.toString(type) : XIvb.WzXsqCKCSKPxLMC;
                                        } else {
                                            string = "IN_ROAD_VEHICLE";
                                        }
                                    } else {
                                        string = "RUNNING";
                                    }
                                } else {
                                    string = "WALKING";
                                }
                            } else {
                                string = "TILTING";
                            }
                        } else {
                            string = "UNKNOWN";
                        }
                    } else {
                        string = "STILL";
                    }
                } else {
                    string = "ON_FOOT";
                }
            } else {
                string = "ON_BICYCLE";
            }
        } else {
            string = "IN_VEHICLE";
        }
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(string);
        sb.append(", confidence=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i2) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
