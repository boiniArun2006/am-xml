package com.alightcreative.backup.domain.usecases.internal;

import aT.dE.JLZo;
import androidx.annotation.Keep;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/alightcreative/backup/domain/usecases/internal/FirestoreSharedProjectInfo;", "", "title", "", "size", "", "type", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSize", "()J", "getType", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class FirestoreSharedProjectInfo {
    private final long size;
    private final String title;
    private final String type;

    public FirestoreSharedProjectInfo() {
        this(null, 0L, null, 7, null);
    }

    public static /* synthetic */ FirestoreSharedProjectInfo copy$default(FirestoreSharedProjectInfo firestoreSharedProjectInfo, String str, long j2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = firestoreSharedProjectInfo.title;
        }
        if ((i2 & 2) != 0) {
            j2 = firestoreSharedProjectInfo.size;
        }
        if ((i2 & 4) != 0) {
            str2 = firestoreSharedProjectInfo.type;
        }
        return firestoreSharedProjectInfo.copy(str, j2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final FirestoreSharedProjectInfo copy(String title, long size, String type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FirestoreSharedProjectInfo(title, size, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirestoreSharedProjectInfo)) {
            return false;
        }
        FirestoreSharedProjectInfo firestoreSharedProjectInfo = (FirestoreSharedProjectInfo) other;
        return Intrinsics.areEqual(this.title, firestoreSharedProjectInfo.title) && this.size == firestoreSharedProjectInfo.size && Intrinsics.areEqual(this.type, firestoreSharedProjectInfo.type);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "FirestoreSharedProjectInfo(title=" + this.title + ", size=" + this.size + ", type=" + this.type + ")";
    }

    public FirestoreSharedProjectInfo(String title, long j2, String type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.title = title;
        this.size = j2;
        this.type = type;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FirestoreSharedProjectInfo(String str, long j2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3 = i2 & 1;
        String str3 = JLZo.OcFS;
        this(i3 != 0 ? str3 : str, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? str3 : str2);
    }
}
