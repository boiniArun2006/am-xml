package androidx.media3.extractor.metadata.icy;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class IcyHeaders implements Metadata.Entry {
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyHeaders.class == obj.getClass()) {
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.bitrate == icyHeaders.bitrate && Objects.equals(this.genre, icyHeaders.genre) && Objects.equals(this.name, icyHeaders.name) && Objects.equals(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval) {
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

    @Override // androidx.media3.common.Metadata.Entry
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

    public IcyHeaders(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z2, int i3) {
        boolean z3;
        if (i3 != -1 && i3 <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        Assertions.checkArgument(z3);
        this.bitrate = i2;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z2;
        this.metadataInterval = i3;
    }
}
