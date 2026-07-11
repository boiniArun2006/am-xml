package androidx.media3.extractor.metadata.flac;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Wre;
import com.safedk.android.analytics.brandsafety.l;
import t1.AbstractC2372w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public final String key;
    public final String value;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.key.hashCode()) * 31) + this.value.hashCode();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "TOTALTRACKS":
                Integer numHI = Wre.HI(this.value);
                if (numHI != null) {
                    builder.setTotalTrackCount(numHI);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numHI2 = Wre.HI(this.value);
                if (numHI2 != null) {
                    builder.setTotalDiscCount(numHI2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numHI3 = Wre.HI(this.value);
                if (numHI3 != null) {
                    builder.setTrackNumber(numHI3);
                    break;
                }
                break;
            case "ALBUM":
                builder.setAlbumTitle(this.value);
                break;
            case "GENRE":
                builder.setGenre(this.value);
                break;
            case "TITLE":
                builder.setTitle(this.value);
                break;
            case "DESCRIPTION":
                builder.setDescription(this.value);
                break;
            case "DISCNUMBER":
                Integer numHI4 = Wre.HI(this.value);
                if (numHI4 != null) {
                    builder.setDiscNumber(numHI4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                builder.setAlbumArtist(this.value);
                break;
            case "ARTIST":
                builder.setArtist(this.value);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.key + l.ae + this.value;
    }

    public VorbisComment(String str, String str2) {
        this.key = AbstractC2372w6.J2(str);
        this.value = str2;
    }
}
