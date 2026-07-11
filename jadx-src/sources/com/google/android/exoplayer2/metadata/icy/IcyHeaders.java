package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new j();
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    public final int bitrate;

    @Nullable
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;

    @Nullable
    public final String name;

    @Nullable
    public final String url;

    class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public IcyHeaders[] newArray(int i2) {
            return new IcyHeaders[i2];
        }

        j() {
        }
    }

    public IcyHeaders(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z2, int i3) {
        Assertions.checkArgument(i3 == -1 || i3 > 0);
        this.bitrate = i2;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z2;
        this.metadataInterval = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.bitrate == icyHeaders.bitrate && Util.areEqual(this.genre, icyHeaders.genre) && Util.areEqual(this.name, icyHeaders.name) && Util.areEqual(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static IcyHeaders parse(Map<String, List<String>> map) {
        boolean z2;
        int i2;
        IcyHeaders icyHeaders;
        String str;
        String str2;
        boolean zEquals;
        int i3;
        List<String> list = map.get(RESPONSE_HEADER_BITRATE);
        boolean z3 = true;
        int i5 = -1;
        if (list != null) {
            String str3 = list.get(0);
            try {
                i3 = Integer.parseInt(str3) * 1000;
                if (i3 > 0) {
                    z2 = true;
                } else {
                    try {
                        Log.w(TAG, "Invalid bitrate: " + str3);
                        z2 = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        Log.w(TAG, "Invalid bitrate header: " + str3);
                        z2 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
            i2 = i3;
        } else {
            z2 = false;
            i2 = -1;
        }
        List<String> list2 = map.get(RESPONSE_HEADER_GENRE);
        String str4 = null;
        if (list2 != null) {
            String str5 = list2.get(0);
            icyHeaders = null;
            str4 = str5;
            z2 = true;
        } else {
            icyHeaders = null;
        }
        List<String> list3 = map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str = list3.get(0);
            z2 = true;
        } else {
            str = icyHeaders;
        }
        List<String> list4 = map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str2 = list4.get(0);
            z2 = true;
        } else {
            str2 = icyHeaders;
        }
        List<String> list5 = map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z2 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            String str6 = list6.get(0);
            try {
                int i7 = Integer.parseInt(str6);
                if (i7 > 0) {
                    i5 = i7;
                } else {
                    try {
                        Log.w(TAG, "Invalid metadata interval: " + str6);
                        z3 = z2;
                    } catch (NumberFormatException unused3) {
                        i5 = i7;
                        Log.w(TAG, "Invalid metadata interval: " + str6);
                    }
                }
                z2 = z3;
            } catch (NumberFormatException unused4) {
            }
        }
        int i8 = i5;
        if (z2) {
            icyHeaders = new IcyHeaders(i2, str4, str, str2, zEquals, i8);
        }
        return icyHeaders;
    }

    public int hashCode() {
        int i2 = (527 + this.bitrate) * 31;
        String str = this.genre;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.name;
        if (str != null) {
            builder.setStation(str);
        }
        String str2 = this.genre;
        if (str2 != null) {
            builder.setGenre(str2);
        }
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        Util.writeBoolean(parcel, this.isPublic);
        parcel.writeInt(this.metadataInterval);
    }

    IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.isPublic = Util.readBoolean(parcel);
        this.metadataInterval = parcel.readInt();
    }
}
