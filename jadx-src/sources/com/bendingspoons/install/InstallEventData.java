package com.bendingspoons.install;

import com.bendingspoons.concierge.domain.entities.CreationType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016JP\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b)\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b*\u0010\u0016¨\u0006-"}, d2 = {"Lcom/bendingspoons/install/InstallEventData;", "", "", "installedBeforePico", "Lcom/bendingspoons/concierge/domain/entities/CreationType;", "backupPersistentIdStatus", "nonBackupPersistentIdStatus", "", "newAppVersion", "oldAppVersion", "oldBundleVersion", "<init>", "(ZLcom/bendingspoons/concierge/domain/entities/CreationType;Lcom/bendingspoons/concierge/domain/entities/CreationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lpq/Ml;", "toMap", "()Lpq/Ml;", "component1", "()Z", "component2", "()Lcom/bendingspoons/concierge/domain/entities/CreationType;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(ZLcom/bendingspoons/concierge/domain/entities/CreationType;Lcom/bendingspoons/concierge/domain/entities/CreationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/install/InstallEventData;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getInstalledBeforePico", "Lcom/bendingspoons/concierge/domain/entities/CreationType;", "getBackupPersistentIdStatus", "getNonBackupPersistentIdStatus", "Ljava/lang/String;", "getNewAppVersion", "getOldAppVersion", "getOldBundleVersion", "Companion", "j", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInstallEventData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstallEventData.kt\ncom/bendingspoons/install/InstallEventData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final /* data */ class InstallEventData {
    private static final String BACKUP_PERSISTENT_ID_STATUS_NAME = "backup_persistent_id_status";
    private static final j Companion = new j(null);
    private static final String INSTALLED_BEFORE_PICO_NAME = "installed_before_pico";
    private static final String NEW_APP_VERSION_NAME = "new_app_version";
    private static final String NON_BACKUP_PERSISTENT_ID_STATUS_NAME = "non_backup_persistent_id_status";
    private static final String OLD_APP_VERSION_NAME = "old_app_version";
    private static final String OLD_BUNDLE_VERSION_NAME = "old_bundle_version";

    @Json(name = BACKUP_PERSISTENT_ID_STATUS_NAME)
    private final CreationType backupPersistentIdStatus;

    @Json(name = INSTALLED_BEFORE_PICO_NAME)
    private final boolean installedBeforePico;

    @Json(name = NEW_APP_VERSION_NAME)
    private final String newAppVersion;

    @Json(name = NON_BACKUP_PERSISTENT_ID_STATUS_NAME)
    private final CreationType nonBackupPersistentIdStatus;

    @Json(name = OLD_APP_VERSION_NAME)
    private final String oldAppVersion;

    @Json(name = OLD_BUNDLE_VERSION_NAME)
    private final String oldBundleVersion;

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static /* synthetic */ InstallEventData copy$default(InstallEventData installEventData, boolean z2, CreationType creationType, CreationType creationType2, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = installEventData.installedBeforePico;
        }
        if ((i2 & 2) != 0) {
            creationType = installEventData.backupPersistentIdStatus;
        }
        if ((i2 & 4) != 0) {
            creationType2 = installEventData.nonBackupPersistentIdStatus;
        }
        if ((i2 & 8) != 0) {
            str = installEventData.newAppVersion;
        }
        if ((i2 & 16) != 0) {
            str2 = installEventData.oldAppVersion;
        }
        if ((i2 & 32) != 0) {
            str3 = installEventData.oldBundleVersion;
        }
        String str4 = str2;
        String str5 = str3;
        return installEventData.copy(z2, creationType, creationType2, str, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getInstalledBeforePico() {
        return this.installedBeforePico;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CreationType getBackupPersistentIdStatus() {
        return this.backupPersistentIdStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CreationType getNonBackupPersistentIdStatus() {
        return this.nonBackupPersistentIdStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNewAppVersion() {
        return this.newAppVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOldAppVersion() {
        return this.oldAppVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOldBundleVersion() {
        return this.oldBundleVersion;
    }

    public final InstallEventData copy(boolean installedBeforePico, CreationType backupPersistentIdStatus, CreationType nonBackupPersistentIdStatus, String newAppVersion, String oldAppVersion, String oldBundleVersion) {
        Intrinsics.checkNotNullParameter(backupPersistentIdStatus, "backupPersistentIdStatus");
        Intrinsics.checkNotNullParameter(nonBackupPersistentIdStatus, "nonBackupPersistentIdStatus");
        Intrinsics.checkNotNullParameter(newAppVersion, "newAppVersion");
        return new InstallEventData(installedBeforePico, backupPersistentIdStatus, nonBackupPersistentIdStatus, newAppVersion, oldAppVersion, oldBundleVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallEventData)) {
            return false;
        }
        InstallEventData installEventData = (InstallEventData) other;
        return this.installedBeforePico == installEventData.installedBeforePico && this.backupPersistentIdStatus == installEventData.backupPersistentIdStatus && this.nonBackupPersistentIdStatus == installEventData.nonBackupPersistentIdStatus && Intrinsics.areEqual(this.newAppVersion, installEventData.newAppVersion) && Intrinsics.areEqual(this.oldAppVersion, installEventData.oldAppVersion) && Intrinsics.areEqual(this.oldBundleVersion, installEventData.oldBundleVersion);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.installedBeforePico) * 31) + this.backupPersistentIdStatus.hashCode()) * 31) + this.nonBackupPersistentIdStatus.hashCode()) * 31) + this.newAppVersion.hashCode()) * 31;
        String str = this.oldAppVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.oldBundleVersion;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallEventData(installedBeforePico=" + this.installedBeforePico + ", backupPersistentIdStatus=" + this.backupPersistentIdStatus + ", nonBackupPersistentIdStatus=" + this.nonBackupPersistentIdStatus + ", newAppVersion=" + this.newAppVersion + ", oldAppVersion=" + this.oldAppVersion + ", oldBundleVersion=" + this.oldBundleVersion + ")";
    }

    public InstallEventData(boolean z2, CreationType backupPersistentIdStatus, CreationType nonBackupPersistentIdStatus, String newAppVersion, String str, String str2) {
        Intrinsics.checkNotNullParameter(backupPersistentIdStatus, "backupPersistentIdStatus");
        Intrinsics.checkNotNullParameter(nonBackupPersistentIdStatus, "nonBackupPersistentIdStatus");
        Intrinsics.checkNotNullParameter(newAppVersion, "newAppVersion");
        this.installedBeforePico = z2;
        this.backupPersistentIdStatus = backupPersistentIdStatus;
        this.nonBackupPersistentIdStatus = nonBackupPersistentIdStatus;
        this.newAppVersion = newAppVersion;
        this.oldAppVersion = str;
        this.oldBundleVersion = str2;
    }

    public final CreationType getBackupPersistentIdStatus() {
        return this.backupPersistentIdStatus;
    }

    public final boolean getInstalledBeforePico() {
        return this.installedBeforePico;
    }

    public final String getNewAppVersion() {
        return this.newAppVersion;
    }

    public final CreationType getNonBackupPersistentIdStatus() {
        return this.nonBackupPersistentIdStatus;
    }

    public final String getOldAppVersion() {
        return this.oldAppVersion;
    }

    public final String getOldBundleVersion() {
        return this.oldBundleVersion;
    }

    public final Ml toMap() {
        Ml ml = new Ml();
        ml.KN(INSTALLED_BEFORE_PICO_NAME, this.installedBeforePico);
        ml.O(BACKUP_PERSISTENT_ID_STATUS_NAME, this.backupPersistentIdStatus.name());
        ml.O(NON_BACKUP_PERSISTENT_ID_STATUS_NAME, this.nonBackupPersistentIdStatus.name());
        ml.O(NEW_APP_VERSION_NAME, this.newAppVersion);
        String str = this.oldAppVersion;
        if (str != null) {
            ml.O(OLD_APP_VERSION_NAME, str);
        }
        String str2 = this.oldBundleVersion;
        if (str2 != null) {
            ml.O(OLD_BUNDLE_VERSION_NAME, str2);
        }
        return ml;
    }
}
