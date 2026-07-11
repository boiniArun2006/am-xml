package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class ProgramInformation {

    @Nullable
    public final String copyright;

    @Nullable
    public final String lang;

    @Nullable
    public final String moreInformationURL;

    @Nullable
    public final String source;

    @Nullable
    public final String title;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramInformation)) {
            return false;
        }
        ProgramInformation programInformation = (ProgramInformation) obj;
        return Objects.equals(this.title, programInformation.title) && Objects.equals(this.source, programInformation.source) && Objects.equals(this.copyright, programInformation.copyright) && Objects.equals(this.moreInformationURL, programInformation.moreInformationURL) && Objects.equals(this.lang, programInformation.lang);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.source;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.copyright;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.moreInformationURL;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.lang;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public ProgramInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.source = str2;
        this.copyright = str3;
        this.moreInformationURL = str4;
        this.lang = str5;
    }
}
