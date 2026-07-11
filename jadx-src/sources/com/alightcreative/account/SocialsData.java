package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/alightcreative/account/SocialsData;", "", "tiktok", "", "instagram", "youtube", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTiktok", "()Ljava/lang/String;", "setTiktok", "(Ljava/lang/String;)V", "getInstagram", "setInstagram", "getYoutube", "setYoutube", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SocialsData {
    public static final int $stable = 8;
    private String instagram;
    private String tiktok;
    private String youtube;

    public SocialsData() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ SocialsData copy$default(SocialsData socialsData, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = socialsData.tiktok;
        }
        if ((i2 & 2) != 0) {
            str2 = socialsData.instagram;
        }
        if ((i2 & 4) != 0) {
            str3 = socialsData.youtube;
        }
        return socialsData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTiktok() {
        return this.tiktok;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstagram() {
        return this.instagram;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getYoutube() {
        return this.youtube;
    }

    public final SocialsData copy(String tiktok, String instagram, String youtube) {
        return new SocialsData(tiktok, instagram, youtube);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialsData)) {
            return false;
        }
        SocialsData socialsData = (SocialsData) other;
        return Intrinsics.areEqual(this.tiktok, socialsData.tiktok) && Intrinsics.areEqual(this.instagram, socialsData.instagram) && Intrinsics.areEqual(this.youtube, socialsData.youtube);
    }

    public int hashCode() {
        String str = this.tiktok;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.instagram;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.youtube;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SocialsData(tiktok=" + this.tiktok + ", instagram=" + this.instagram + ", youtube=" + this.youtube + ")";
    }

    public SocialsData(String str, String str2, String str3) {
        this.tiktok = str;
        this.instagram = str2;
        this.youtube = str3;
    }

    public final String getInstagram() {
        return this.instagram;
    }

    public final String getTiktok() {
        return this.tiktok;
    }

    public final String getYoutube() {
        return this.youtube;
    }

    public final void setInstagram(String str) {
        this.instagram = str;
    }

    public final void setTiktok(String str) {
        this.tiktok = str;
    }

    public final void setYoutube(String str) {
        this.youtube = str;
    }

    public /* synthetic */ SocialsData(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
    }
}
