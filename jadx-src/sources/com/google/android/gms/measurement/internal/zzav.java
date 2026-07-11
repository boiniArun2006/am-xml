package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.impl.zpl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads_identifier.VR.wDgKoYAES;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.CrashEvent;
import com.safedk.android.analytics.events.base.StatsEvent;
import d8q.jqQ.QTafcm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
final class zzav extends zzor {
    private final zzau zzm;
    private final zzof zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", obbPUqyhtS.fgwJBDsGDqpeqpt, "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    @WorkerThread
    public final long zzM() {
        return zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long zzO() {
        return zzaB("select max(timestamp) from raw_events", null, 0L);
    }

    final boolean zzX(String str, long j2) {
        try {
            if (zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) > 0) {
                return false;
            }
            return zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) > 0;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Error checking backfill conditions", e2);
            return false;
        }
    }

    final /* synthetic */ long zzaj(String str, String[] strArr, long j2) {
        return zzaB("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    final /* synthetic */ zzof zzau() {
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    @WorkerThread
    public final zzar zzw(long j2, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9) {
        return zzx(j2, str, 1L, false, false, z4, false, z6, z7, z9);
    }

    @WorkerThread
    private final void zzaD(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (contentValues.getAsString("app_id") == null) {
                this.zzu.zzaV().zzd().zzb("Value of the primary key is not set.", zzgt.zzl("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id");
            sb.append(" = ?");
            if (sQLiteDatabaseZze.update("consent_settings", contentValues, sb.toString(), new String[]{r2}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzc("Failed to insert/update table (got -1). key", zzgt.zzl("consent_settings"), zzgt.zzl("app_id"));
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzd("Error storing into table. key", zzgt.zzl("consent_settings"), zzgt.zzl("app_id"), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzbc zzaE(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        zzbc zzbcVar = new zzbc(str2, str3, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaV().zzb().zzb("Got multiple records for event aggregates, expected one. appId", zzgt.zzl(str2));
                        }
                        cursorQuery.close();
                        return zzbcVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzib zzibVar = this.zzu;
                    zzibVar.zzaV().zzb().zzd("Error querying events. appId", zzgt.zzl(str2), zzibVar.zzl().zza(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    private final zzpi zzaH(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaV().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpj.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), bArr);
            zzlr zzlrVarZzb = zzlr.zzb(i2);
            if (zzlrVarZzb != zzlr.GOOGLE_SIGNAL && zzlrVarZzb != zzlr.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).zzcl();
                    zzicVar.zzao(i3);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i5];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split(l.ae, 2);
                    if (strArrSplit2.length != 2) {
                        this.zzu.zzaV().zzb().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i5++;
                }
            }
            zzph zzphVar = new zzph();
            zzphVar.zzb(j2);
            zzphVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
            zzphVar.zzd(str2);
            zzphVar.zze(map);
            zzphVar.zzf(zzlrVarZzb);
            zzphVar.zzg(j3);
            zzphVar.zzh(j4);
            zzphVar.zzi(j5);
            zzphVar.zzj(i3);
            return zzphVar.zza();
        } catch (IOException e2) {
            this.zzu.zzaV().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e2);
            return null;
        }
    }

    private final String zzaI() {
        zzib zzibVar = this.zzu;
        long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        Locale locale = Locale.US;
        zzlr zzlrVar = zzlr.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(zzlrVar.zza());
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        zzibVar.zzc();
        Long l2 = (Long) zzfx.zzS.zzb(null);
        l2.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l2);
        Integer numValueOf2 = Integer.valueOf(zzlrVar.zza());
        zzibVar.zzc();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(zzal.zzI()));
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb.append("(");
        sb.append(str);
        sb.append(" OR ");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @WorkerThread
    static final void zzaw(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @WorkerThread
    public final long zzA(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzlr zzlrVar, Long l2) {
        int iDelete;
        zzg();
        zzay();
        Preconditions.checkNotNull(zzibVar);
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        if (zzai()) {
            zzpf zzpfVar = this.zzg;
            long jZza = zzpfVar.zzq().zzb.zza();
            zzib zzibVar2 = this.zzu;
            long jElapsedRealtime = zzibVar2.zzaZ().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzibVar2.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpfVar.zzq().zzb.zzb(jElapsedRealtime);
                zzg();
                zzay();
                if (zzai() && (iDelete = zze().delete("upload_queue", zzaI(), new String[0])) > 0) {
                    zzibVar2.zzaV().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                Preconditions.checkNotEmpty(str);
                zzg();
                zzay();
                try {
                    int iZzm = zzibVar2.zzc().zzm(str, zzfx.zzz);
                    if (iZzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZzm)});
                    }
                } catch (SQLiteException e2) {
                    this.zzu.zzaV().zzb().zzc("Error deleting over the limit queued batches. appId", zzgt.zzl(str), e2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(l.ae);
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrZzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrZzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", zpl.n("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlrVar.zza()));
        zzib zzibVar3 = this.zzu;
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzibVar3.zzaZ().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = zze().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzibVar3.zzaV().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e3) {
            this.zzu.zzaV().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e3);
            return -1L;
        }
    }

    @WorkerThread
    public final boolean zzD(String str) {
        zzlr[] zzlrVarArr = {zzlr.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlrVarArr[0].zza()));
        String strZzaJ = zzaJ(arrayList);
        String strZzaI = zzaI();
        StringBuilder sb = new StringBuilder(String.valueOf(strZzaJ).length() + 61 + strZzaI.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strZzaJ);
        sb.append(" AND NOT ");
        sb.append(strZzaI);
        return zzaA(sb.toString(), new String[]{str}) != 0;
    }

    public final boolean zzG() {
        return zzaA("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzP() {
        return zzaA("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzR() {
        return zzaA("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzY(String str, Long l2, String str2, Bundle bundle) {
        Bundle bundle2;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        Cursor cursorQuery;
        String str3 = str;
        Preconditions.checkNotNull(bundle);
        zzg();
        zzay();
        zzat zzatVar = l2 != null ? new zzat(this, str3, l2.longValue()) : new zzat(this, str3);
        List<zzas> listZza = zzatVar.zza();
        while (!listZza.isEmpty()) {
            for (zzas zzasVar : listZza) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    com.google.android.gms.internal.measurement.zzid zzidVar2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            cursorQuery = zze().query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(zzasVar.zzb)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzidVar = null;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            zzidVar = null;
                        }
                        if (cursorQuery.moveToFirst()) {
                            try {
                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorQuery.getBlob(0))).zzbc();
                                try {
                                    if (cursorQuery.moveToNext()) {
                                        this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgt.zzl(str3));
                                    }
                                    cursorQuery.close();
                                    cursorQuery.close();
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursor2 = cursorQuery;
                                    this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgt.zzl(str3), e);
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                                zzidVar2 = zzidVar;
                            } catch (IOException e5) {
                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgt.zzl(str3), e5);
                                cursorQuery.close();
                            }
                            if (zzidVar2 == null) {
                                Iterator it = zzidVar2.zzf().iterator();
                                while (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.zziu) it.next()).zzc().equals(str2)) {
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", zzgt.zzl(str3));
                        }
                        cursorQuery.close();
                        if (zzidVar2 == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                zzpf zzpfVar = this.zzg;
                zzpj zzpjVarZzp = zzpfVar.zzp();
                com.google.android.gms.internal.measurement.zzhs zzhsVar = zzasVar.zzd;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
                    if (zzhwVar.zzi()) {
                        bundle3.putDouble(zzhwVar.zzb(), zzhwVar.zzj());
                    } else if (zzhwVar.zzg()) {
                        bundle3.putFloat(zzhwVar.zzb(), zzhwVar.zzh());
                    } else if (zzhwVar.zze()) {
                        bundle3.putLong(zzhwVar.zzb(), zzhwVar.zzf());
                    } else if (zzhwVar.zzc()) {
                        bundle3.putString(zzhwVar.zzb(), zzhwVar.zzd());
                    } else if (zzhwVar.zzk().isEmpty()) {
                        zzpjVarZzp.zzu.zzaV().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle3.putParcelableArray(zzhwVar.zzb(), zzpj.zzy(zzhwVar.zzk()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strZzd = zzhsVar.zzd();
                if (string == null) {
                    string = "";
                }
                zzgu zzguVar = new zzgu(strZzd, string, bundle3, zzhsVar.zzf());
                zzib zzibVar = this.zzu;
                Bundle bundle4 = zzguVar.zzd;
                String str4 = zzguVar.zza;
                zzpo zzpoVarZzk = zzibVar.zzk();
                if (str4.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        zzpf zzpfVar2 = zzpfVar;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        zzpfVar = zzpfVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                zzpf zzpfVar3 = zzpfVar;
                zzpoVarZzk.zzI(bundle4, bundle2);
                zzbb zzbbVar = new zzbb(this.zzu, zzguVar.zzb, str3, zzhsVar.zzd(), zzhsVar.zzf(), zzhsVar.zzh(), bundle4);
                long j2 = zzasVar.zza;
                long j3 = zzasVar.zzb;
                boolean z2 = zzasVar.zzc;
                zzg();
                zzay();
                Preconditions.checkNotNull(zzbbVar);
                String str6 = zzbbVar.zza;
                Preconditions.checkNotEmpty(str6);
                byte[] bArrZzcc = zzpfVar3.zzp().zzh(zzbbVar).zzcc();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str6);
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbbVar.zzb);
                contentValues.put(StatsEvent.f62824A, Long.valueOf(zzbbVar.zzd));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put("data", bArrZzcc);
                contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                try {
                    long jUpdate = zze().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        zzibVar.zzaV().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgt.zzl(str6), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e6) {
                    this.zzu.zzaV().zzb().zzc("Error updating raw event. appId", zzgt.zzl(zzbbVar.zza), e6);
                }
                str3 = str;
            }
            listZza = zzatVar.zza();
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x031c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x031d, code lost:
    
        r12.put("filter_id", r0);
        r21 = r3;
        r12.put("property_name", r7.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x032f, code lost:
    
        if (r7.zzg() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0331, code lost:
    
        r3 = java.lang.Boolean.valueOf(r7.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x033a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x033b, code lost:
    
        r12.put("session_scoped", r3);
        r12.put("data", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x034d, code lost:
    
        if (zze().insertWithOnConflict("property_filters", null, r12, 5) != (-1)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x034f, code lost:
    
        r22.zzu.zzaV().zzb().zzb("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0363, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0365, code lost:
    
        r0 = r19;
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x036b, code lost:
    
        r22.zzu.zzaV().zzb().zzc("Error storing property filter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x037e, code lost:
    
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        r0 = zze();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r23, java.lang.String.valueOf(r10)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x03a1, code lost:
    
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0494, code lost:
    
        r20.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0497, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        r11 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0182, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018e, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r11.next()).zza() != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0190, code lost:
    
        r22.zzu.zzaV().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.zzgt.zzl(r23), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:
    
        r11 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b5, code lost:
    
        r19 = r0;
        r0 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01c3, code lost:
    
        if (r11.hasNext() == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c5, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.zzff) r11.next();
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01df, code lost:
    
        if (r12.zzc().isEmpty() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e1, code lost:
    
        r0 = r22.zzu.zzaV().zze();
        r11 = com.google.android.gms.measurement.internal.zzgt.zzl(r23);
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f9, code lost:
    
        if (r12.zza() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01fb, code lost:
    
        r16 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0206, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0208, code lost:
    
        r0.zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r11, r13, java.lang.String.valueOf(r16));
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0213, code lost:
    
        r3 = r12.zzcc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0217, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0219, code lost:
    
        r7 = new android.content.ContentValues();
        r7.put("app_id", r23);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x022c, code lost:
    
        if (r12.zza() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
    
        r0 = java.lang.Integer.valueOf(r12.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0237, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x023b, code lost:
    
        r7.put("filter_id", r0);
        r7.put("event_name", r12.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024b, code lost:
    
        if (r12.zzk() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r12.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0256, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0257, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0269, code lost:
    
        if (zze().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x026b, code lost:
    
        r22.zzu.zzaV().zzb().zzb("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.zzgt.zzl(r23));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x027e, code lost:
    
        r0 = r19;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0286, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0287, code lost:
    
        r22.zzu.zzaV().zzb().zzc("Error storing event filter. appId", com.google.android.gms.measurement.internal.zzgt.zzl(r23), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029c, code lost:
    
        r20 = r7;
        r3 = r19.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02aa, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ac, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.zzfn) r3.next();
        zzay();
        zzg();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c6, code lost:
    
        if (r7.zzc().isEmpty() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02c8, code lost:
    
        r0 = r22.zzu.zzaV().zze();
        r9 = com.google.android.gms.measurement.internal.zzgt.zzl(r23);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e0, code lost:
    
        if (r7.zza() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02e2, code lost:
    
        r16 = java.lang.Integer.valueOf(r7.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ed, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02ef, code lost:
    
        r0.zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f8, code lost:
    
        r11 = r7.zzcc();
        r12 = new android.content.ContentValues();
        r12.put(r0, r23);
        r19 = r0;
        r12.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0311, code lost:
    
        if (r7.zza() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.zzb());
     */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzag(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) list.get(i2)).zzcl();
            if (zzfcVar.zzd() != 0) {
                for (int i3 = 0; i3 < zzfcVar.zzd(); i3++) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzfcVar.zze(i3).zzcl();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    String strZzb = zzjl.zzb(zzfeVar.zza());
                    if (strZzb != null) {
                        zzfeVar2.zzb(strZzb);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i5 = 0;
                    while (i5 < zzfeVar.zzc()) {
                        com.google.android.gms.internal.measurement.zzfh zzfhVarZzd = zzfeVar.zzd(i5);
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        boolean z3 = z2;
                        String strZzc = zzls.zzc(zzfhVarZzd.zzh(), zzjm.zza, zzjm.zzb);
                        if (strZzc != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzfhVarZzd.zzcl();
                            zzfgVar.zza(strZzc);
                            zzfeVar2.zze(i5, (com.google.android.gms.internal.measurement.zzfh) zzfgVar.zzbc());
                            z2 = true;
                        } else {
                            z2 = z3;
                        }
                        i5++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z2) {
                        zzfcVar.zzf(i3, zzfeVar2);
                        list.set(i2, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                }
            }
            if (zzfcVar.zza() != 0) {
                for (int i7 = 0; i7 < zzfcVar.zza(); i7++) {
                    com.google.android.gms.internal.measurement.zzfn zzfnVarZzb = zzfcVar.zzb(i7);
                    String strZzc2 = zzls.zzc(zzfnVarZzb.zzc(), zzjn.zza, zzjn.zzb);
                    if (strZzc2 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzfnVarZzb.zzcl();
                        zzfmVar.zza(strZzc2);
                        zzfcVar.zzc(i7, zzfmVar);
                        list.set(i2, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.zzbc());
                    }
                }
            }
        }
        zzay();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        try {
            zzay();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZze2 = zze();
            sQLiteDatabaseZze2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZze2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) it.next();
                zzay();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzfdVar);
                if (zzfdVar.zza()) {
                    int iZzb = zzfdVar.zzb();
                    Iterator it2 = zzfdVar.zzf().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff) it2.next()).zza()) {
                                this.zzu.zzaV().zze().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgt.zzl(str), Integer.valueOf(iZzb));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    this.zzu.zzaV().zze().zzb("Audience with no ID. appId", zzgt.zzl(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseZze;
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar2 = (com.google.android.gms.internal.measurement.zzfd) it3.next();
                arrayList.add(zzfdVar2.zza() ? Integer.valueOf(zzfdVar2.zzb()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzay();
            zzg();
            SQLiteDatabase sQLiteDatabaseZze3 = zze();
            try {
                long jZzaA = zzaA("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i8 = 0;
                int iMax = Math.max(0, Math.min(2000, this.zzu.zzc().zzm(str, zzfx.zzU)));
                if (jZzaA > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZze3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i8);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i8++;
                    }
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgt.zzl(str), e2);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = sQLiteDatabaseZze;
        }
    }

    @WorkerThread
    final zzbc zzah(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) throws Throwable {
        zzbc zzbcVarZzaE = zzaE(CrashEvent.f62787f, str, zzhsVar.zzd());
        if (zzbcVarZzaE == null) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgt.zzl(str), zzibVar.zzl().zza(str2));
            return new zzbc(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j2 = zzbcVarZzaE.zze + 1;
        long j3 = zzbcVarZzaE.zzd + 1;
        return new zzbc(zzbcVarZzaE.zza, zzbcVarZzaE.zzb, zzbcVarZzaE.zzc + 1, j3, j2, zzbcVarZzaE.zzf, zzbcVarZzaE.zzg, zzbcVarZzaE.zzh, zzbcVarZzaE.zzi, zzbcVarZzaE.zzj, zzbcVarZzaE.zzk);
    }

    @VisibleForTesting
    protected final boolean zzai() {
        zzib zzibVar = this.zzu;
        Context contextZzaY = zzibVar.zzaY();
        zzibVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #3 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ec, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012e, B:50:0x013a, B:53:0x014e, B:55:0x016b, B:56:0x0174, B:57:0x017e, B:62:0x01ae, B:61:0x019b, B:65:0x01b5, B:52:0x0147, B:67:0x01ca, B:71:0x01e0, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:83:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TRY_LEAVE, TryCatch #3 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ec, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012e, B:50:0x013a, B:53:0x014e, B:55:0x016b, B:56:0x0174, B:57:0x017e, B:62:0x01ae, B:61:0x019b, B:65:0x01b5, B:52:0x0147, B:67:0x01ca, B:71:0x01e0, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:83:0x0016 }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzav(String str, long j2, long j3, zzpb zzpbVar) {
        ?? IsEmpty;
        ?? string;
        SQLiteDatabase sQLiteDatabaseZze;
        String[] strArr;
        String str2;
        String string2;
        ?? r3;
        String str3;
        String[] strArr2;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        Preconditions.checkNotNull(zzpbVar);
        zzg();
        zzay();
        Cursor cursorRawQuery = null;
        try {
            try {
                sQLiteDatabaseZze = zze();
                IsEmpty = TextUtils.isEmpty(str);
            } catch (SQLiteException e2) {
                e = e2;
                IsEmpty = str;
            }
            if (IsEmpty != 0) {
                String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                str2 = j3 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb = new StringBuilder(str2.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str2);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb.toString(), strArr3);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        string = cursorRawQuery.getString(0);
                        try {
                            string2 = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                            r3 = string;
                            cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                this.zzu.zzaV().zzb().zzb("Raw event metadata record is missing. appId", zzgt.zzl(r3));
                            } else {
                                try {
                                    com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpj.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), cursorRawQuery.getBlob(0))).zzbc();
                                    if (cursorRawQuery.moveToNext()) {
                                        this.zzu.zzaV().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgt.zzl(r3));
                                    }
                                    cursorRawQuery.close();
                                    Preconditions.checkNotNull(zzidVar);
                                    zzpbVar.zza = zzidVar;
                                    if (j3 != -1) {
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(j3)};
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, StatsEvent.f62824A, "data"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            long j4 = cursorRawQuery.getLong(0);
                                            try {
                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorRawQuery.getBlob(3));
                                                zzhrVar.zzl(cursorRawQuery.getString(1));
                                                zzhrVar.zzo(cursorRawQuery.getLong(2));
                                            } catch (IOException e3) {
                                                this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgt.zzl(r3), e3);
                                            }
                                            if (!zzpbVar.zza(j4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc())) {
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        this.zzu.zzaV().zze().zzb("Raw event data disappeared while in transaction. appId", zzgt.zzl(r3));
                                    }
                                } catch (IOException e4) {
                                    this.zzu.zzaV().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgt.zzl(r3), e4);
                                }
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgt.zzl(string), e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    string = str;
                }
                this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgt.zzl(string), e);
            } else {
                try {
                    if (j3 != -1) {
                        String str4 = str;
                        strArr = new String[]{str4, String.valueOf(j3)};
                        IsEmpty = str4;
                    } else {
                        String str5 = str;
                        strArr = new String[]{str5};
                        IsEmpty = str5;
                    }
                    str2 = j3 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb2 = new StringBuilder(str2.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str2);
                    sb2.append(" order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb2.toString(), strArr);
                    if (cursorRawQuery.moveToFirst()) {
                        string2 = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        r3 = IsEmpty;
                        cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                        if (cursorRawQuery.moveToFirst()) {
                        }
                    }
                } catch (SQLiteException e7) {
                    e = e7;
                    string = IsEmpty;
                    this.zzu.zzaV().zzb().zzc("Data loss. Error selecting raw event. appId", zzgt.zzl(string), e);
                }
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    @WorkerThread
    public final zzbc zzf(String str, String str2) {
        return zzaE(CrashEvent.f62787f, str, str2);
    }

    @WorkerThread
    public final void zzh(zzbc zzbcVar) {
        zzaF(CrashEvent.f62787f, zzbcVar);
    }

    public final void zzi(String str) {
        zzbc zzbcVarZzaE;
        zzaG("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zze().query(CrashEvent.f62787f, (String[]) Collections.singletonList(AppMeasurementSdk.ConditionalUserProperty.NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbcVarZzaE = zzaE(CrashEvent.f62787f, str, string)) != null) {
                            zzaF("events_snapshot", zzbcVarZzaE);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error creating snapshot. appId", zzgt.zzl(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(String str) throws Throwable {
        boolean z2;
        zzbc zzbcVarZzaE;
        ArrayList arrayList = new ArrayList(Arrays.asList(AppMeasurementSdk.ConditionalUserProperty.NAME, "lifetime_count"));
        zzbc zzbcVarZzaE2 = zzaE(CrashEvent.f62787f, str, "_f");
        zzbc zzbcVarZzaE3 = zzaE(CrashEvent.f62787f, str, "_v");
        zzaG(CrashEvent.f62787f, str);
        Cursor cursorQuery = null;
        boolean z3 = false;
        try {
            cursorQuery = zze().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e2) {
            e = e2;
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            if (zzbcVarZzaE2 != null) {
                zzaF(CrashEvent.f62787f, zzbcVarZzaE2);
            } else if (zzbcVarZzaE3 != null) {
                zzaF(CrashEvent.f62787f, zzbcVarZzaE3);
            }
            zzaG("events_snapshot", str);
        }
        boolean z4 = false;
        z2 = false;
        do {
            try {
                String string = cursorQuery.getString(0);
                if (cursorQuery.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z4 = true;
                    } else if ("_v".equals(string)) {
                        z2 = true;
                    }
                }
                if (string != null && (zzbcVarZzaE = zzaE("events_snapshot", str, string)) != null) {
                    zzaF(CrashEvent.f62787f, zzbcVarZzaE);
                }
            } catch (SQLiteException e3) {
                e = e3;
                z3 = z4;
                try {
                    this.zzu.zzaV().zzb().zzc("Error querying snapshot. appId", zzgt.zzl(str), e);
                    z4 = z3;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (z3 && zzbcVarZzaE2 != null) {
                        zzaF(CrashEvent.f62787f, zzbcVarZzaE2);
                    } else if (!z2 && zzbcVarZzaE3 != null) {
                        zzaF(CrashEvent.f62787f, zzbcVarZzaE3);
                    }
                    zzaG("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = z4;
                if (cursorQuery != null) {
                }
                if (z3) {
                    if (!z2) {
                        zzaF(CrashEvent.f62787f, zzbcVarZzaE3);
                    }
                }
                zzaG("events_snapshot", str);
                throw th;
            }
        } while (cursorQuery.moveToNext());
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (z4 || zzbcVarZzaE2 == null) {
            if (!z2 && zzbcVarZzaE3 != null) {
            }
        }
        zzaG("events_snapshot", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b6, code lost:
    
        r0 = r8.zzaV().zzb();
        r8.zzc();
        r0.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzo(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        String str5;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str6 = str;
                arrayList2.add(str6);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = null;
                        try {
                            this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", zzgt.zzl(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb2.append(str3);
                    sb2.append("*");
                    arrayList2.add(sb2.toString());
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String[] strArr2 = {AppMeasurementSdk.ConditionalUserProperty.NAME, "set_timestamp", "value", "origin"};
                String string = sb.toString();
                zzib zzibVar = this.zzu;
                zzibVar.zzc();
                cursorQuery = sQLiteDatabaseZze.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                zzibVar.zzc();
                                if (size >= 1000) {
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j2 = cursorQuery.getLong(1);
                                Object objZzL = zzL(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objZzL == null) {
                                    try {
                                        zzibVar.zzaV().zzb().zzd("(2)Read invalid user property value, ignoring it", zzgt.zzl(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", zzgt.zzl(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                    }
                                } else {
                                    str5 = string3;
                                    try {
                                        arrayList.add(new zzpm(str6, str5, string2, j2, objZzL));
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.zzu.zzaV().zzb().zzd("(2)Error querying user properties", zzgt.zzl(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                    }
                                }
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor = cursorQuery;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e6) {
            e = e6;
            str4 = str2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzah zzq(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursorQuery.moveToFirst()) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        }
        String string = cursorQuery.getString(0);
        if (string == null) {
            string = "";
        }
        String str4 = string;
        Object objZzL = zzL(cursorQuery, 1);
        boolean z2 = cursorQuery.getInt(2) != 0;
        String string2 = cursorQuery.getString(3);
        long j2 = cursorQuery.getLong(4);
        zzpf zzpfVar = this.zzg;
        zzpj zzpjVarZzp = zzpfVar.zzp();
        byte[] blob = cursorQuery.getBlob(5);
        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
        zzbg zzbgVar = (zzbg) zzpjVarZzp.zzl(blob, creator);
        str3 = str2;
        try {
            zzah zzahVar = new zzah(str, str4, new zzpk(str3, cursorQuery.getLong(8), objZzL, str4), cursorQuery.getLong(6), z2, string2, zzbgVar, j2, (zzbg) zzpfVar.zzp().zzl(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbg) zzpfVar.zzp().zzl(cursorQuery.getBlob(10), creator));
            if (cursorQuery.moveToNext()) {
                zzib zzibVar = this.zzu;
                zzibVar.zzaV().zzb().zzc("Got multiple records for conditional property, expected one", zzgt.zzl(str), zzibVar.zzl().zzc(str3));
            }
            cursorQuery.close();
            return zzahVar;
        } catch (SQLiteException e4) {
            e = e4;
        }
        zzib zzibVar2 = this.zzu;
        zzibVar2.zzaV().zzb().zzd("Error querying conditional property", zzgt.zzl(str), zzibVar2.zzl().zzc(str3), e);
        if (cursorQuery != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r2 = r12.zzaV().zzb();
        r12.zzc();
        r2.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzt(String str, String[] strArr) {
        zzg();
        zzay();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String[] strArr2 = {"app_id", "origin", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                zzib zzibVar = this.zzu;
                zzibVar.zzc();
                cursorQuery = sQLiteDatabaseZze.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        zzibVar.zzc();
                        if (size >= 1000) {
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objZzL = zzL(cursorQuery, 3);
                        boolean z2 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j2 = cursorQuery.getLong(6);
                        zzpf zzpfVar = this.zzg;
                        zzpj zzpjVarZzp = zzpfVar.zzp();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) zzpjVarZzp.zzl(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpk(string3, cursorQuery.getLong(10), objZzL, string2), cursorQuery.getLong(8), z2, string4, zzbgVar, j2, (zzbg) zzpfVar.zzp().zzl(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbg) zzpfVar.zzp().zzl(cursorQuery.getBlob(12), creator)));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzb("Error querying conditional user property value", e2);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzu(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpf zzpfVar = this.zzg;
                        zzh zzhVar = new zzh(zzpfVar.zzaf(), str);
                        zzjk zzjkVarZzB = zzpfVar.zzB(str);
                        zzjj zzjjVar = zzjj.ANALYTICS_STORAGE;
                        if (zzjkVarZzB.zzo(zzjjVar)) {
                            zzhVar.zze(cursorQuery.getString(0));
                        }
                        zzhVar.zzg(cursorQuery.getString(1));
                        if (zzpfVar.zzB(str).zzo(zzjj.AD_STORAGE)) {
                            zzhVar.zzk(cursorQuery.getString(2));
                        }
                        zzhVar.zzF(cursorQuery.getLong(3));
                        zzhVar.zzo(cursorQuery.getLong(4));
                        zzhVar.zzq(cursorQuery.getLong(5));
                        zzhVar.zzs(cursorQuery.getString(6));
                        zzhVar.zzw(cursorQuery.getString(7));
                        zzhVar.zzy(cursorQuery.getLong(8));
                        zzhVar.zzA(cursorQuery.getLong(9));
                        zzhVar.zzE(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.zzO(cursorQuery.getLong(11));
                        zzhVar.zzQ(cursorQuery.getLong(12));
                        zzhVar.zzS(cursorQuery.getLong(13));
                        zzhVar.zzU(cursorQuery.getLong(14));
                        zzhVar.zzI(cursorQuery.getLong(15));
                        zzhVar.zzK(cursorQuery.getLong(16));
                        zzhVar.zzu(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzhVar.zzm(cursorQuery.getString(18));
                        zzhVar.zzY(cursorQuery.getLong(19));
                        zzhVar.zzW(cursorQuery.getLong(20));
                        zzhVar.zzab(cursorQuery.getString(21));
                        zzhVar.zzad(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        zzhVar.zzC(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.zzah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpfVar.zzB(str).zzo(zzjjVar)) {
                            zzhVar.zzi(cursorQuery.getString(28));
                        }
                        zzhVar.zzaj((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        zzhVar.zzaE(cursorQuery.getLong(39));
                        zzhVar.zzaz(cursorQuery.getString(36));
                        zzhVar.zzal(cursorQuery.getLong(30));
                        zzhVar.zzan(cursorQuery.getLong(31));
                        zzql.zza();
                        zzib zzibVar = this.zzu;
                        if (zzibVar.zzc().zzp(str, zzfx.zzaP)) {
                            zzhVar.zzap(cursorQuery.getInt(32));
                            zzhVar.zzax(cursorQuery.getLong(35));
                        }
                        zzhVar.zzar((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        zzhVar.zzaf(boolValueOf);
                        zzhVar.zzaB(cursorQuery.getInt(37));
                        zzhVar.zzaD(cursorQuery.getInt(38));
                        zzhVar.zzaG(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            zzhVar.zzat(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzhVar.zzav(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        zzhVar.zzaI(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            zzhVar.zzaK(cursorQuery.getInt(44));
                        }
                        zzhVar.zzb();
                        if (cursorQuery.moveToNext()) {
                            zzibVar.zzaV().zzb().zzb("Got multiple records for app, expected one. appId", zzgt.zzl(str));
                        }
                        cursorQuery.close();
                        return zzhVar;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzc("Error querying app. appId", zzgt.zzl(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    public final void zzv(zzh zzhVar, boolean z2, boolean z3) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzay();
        String strZzc = zzhVar.zzc();
        Preconditions.checkNotNull(strZzc);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzc);
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzB(strZzc).zzo(zzjj.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        zzpf zzpfVar = this.zzg;
        if (zzpfVar.zzB(strZzc).zzo(zzjj.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpfVar.zzB(strZzc).zzo(zzjj.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzql.zza();
        zzib zzibVar = this.zzu;
        if (zzibVar.zzc().zzp(strZzc, zzfx.zzaP)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        List listZzag = zzhVar.zzag();
        if (listZzag != null) {
            if (listZzag.isEmpty()) {
                zzibVar.zzaV().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(qUrazMnwDskFs.AuOELdhyh, listZzag));
            }
        }
        com.google.android.gms.internal.measurement.zzpn.zza();
        if (zzibVar.zzc().zzp(null, zzfx.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (sQLiteDatabaseZze.update("apps", contentValues, "app_id = ?", new String[]{strZzc}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert/update app (got -1). appId", zzgt.zzl(strZzc));
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing app. appId", zzgt.zzl(strZzc), e2);
        }
    }

    zzav(zzpf zzpfVar) {
        super(zzpfVar);
        this.zzn = new zzof(this.zzu.zzaZ());
        this.zzu.zzc();
        this.zzm = new zzau(this, this.zzu.zzaY(), "google_app_measurement.db");
    }

    @WorkerThread
    private final long zzaA(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    long j2 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j2;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    private final long zzaB(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String zzaC(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                }
                cursorRawQuery.close();
                return "";
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    @WorkerThread
    private final void zzaF(String str, zzbc zzbcVar) {
        Long l2;
        Preconditions.checkNotNull(zzbcVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbcVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbcVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbcVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbcVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbcVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbcVar.zzg));
        contentValues.put("last_bundled_day", zzbcVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbcVar.zzi);
        contentValues.put("last_sampling_rate", zzbcVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbcVar.zze));
        Boolean bool = zzbcVar.zzk;
        if (bool != null && bool.booleanValue()) {
            l2 = 1L;
        } else {
            l2 = null;
        }
        contentValues.put("last_exempt_from_sampling", l2);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", zzgt.zzl(str2));
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing event aggregates. appId", zzgt.zzl(zzbcVar.zza), e2);
        }
    }

    private final void zzaG(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error deleting snapshot. appId", zzgt.zzl(str2), e2);
        }
    }

    private static final String zzaJ(List list) {
        if (list.isEmpty()) {
            return "";
        }
        return String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpi zzB(long j2) throws Throwable {
        Cursor cursorQuery;
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    zzpi zzpiVarZzaH = zzaH((String) Preconditions.checkNotNull(cursorQuery.getString(1)), j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return zzpiVarZzaH;
                }
            } catch (SQLiteException e2) {
                e = e2;
                try {
                    this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List zzC(String str, zzon zzonVar, int i2) {
        List arrayList;
        String strValueOf;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String[] strArr = {"rowId", "app_id", QTafcm.YwoYHLoTSMcs, "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"};
            String strZzaJ = zzaJ(zzonVar.zza);
            String strZzaI = zzaI();
            StringBuilder sb = new StringBuilder(String.valueOf(strZzaJ).length() + 17 + strZzaI.length());
            sb.append("app_id=?");
            sb.append(strZzaJ);
            sb.append(" AND NOT ");
            sb.append(strZzaI);
            String string = sb.toString();
            String[] strArr2 = {str};
            if (i2 > 0) {
                strValueOf = String.valueOf(i2);
            } else {
                strValueOf = null;
            }
            cursorQuery = sQLiteDatabaseZze.query("upload_queue", strArr, string, strArr2, null, null, "creation_timestamp ASC", strValueOf);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                zzpi zzpiVarZzaH = zzaH(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (zzpiVarZzaH != null) {
                    arrayList.add(zzpiVarZzaH);
                }
            }
        } catch (SQLiteException e2) {
            try {
                this.zzu.zzaV().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e2);
                arrayList = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    @WorkerThread
    public final void zzE(Long l2) {
        zzg();
        zzay();
        Preconditions.checkNotNull(l2);
        try {
            if (zze().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                this.zzu.zzaV().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e2);
            throw e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzF() throws Throwable {
        SQLiteException e2;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZze = zze();
        ?? r12 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzu.zzaV().zzb().zzb("Database error getting next bundle app id", e2);
                }
            } catch (Throwable th) {
                r12 = sQLiteDatabaseZze;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    @WorkerThread
    public final void zzH(long j2) {
        zzg();
        zzay();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Failed to delete a bundle in a queue table", e2);
            throw e2;
        }
    }

    @WorkerThread
    final void zzI() {
        zzg();
        zzay();
        if (zzai()) {
            zzpf zzpfVar = this.zzg;
            long jZza = zzpfVar.zzq().zza.zza();
            zzib zzibVar = this.zzu;
            long jElapsedRealtime = zzibVar.zzaZ().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            zzibVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpfVar.zzq().zza.zzb(jElapsedRealtime);
                zzg();
                zzay();
                if (zzai()) {
                    SQLiteDatabase sQLiteDatabaseZze = zze();
                    String strValueOf = String.valueOf(zzibVar.zzaZ().currentTimeMillis());
                    zzibVar.zzc();
                    int iDelete = sQLiteDatabaseZze.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzal.zzI())});
                    if (iDelete > 0) {
                        zzibVar.zzaV().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    final void zzJ(List list) {
        zzg();
        zzay();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (!zzai()) {
            return;
        }
        String strJoin = TextUtils.join(",", list);
        StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
        sb.append("(");
        sb.append(strJoin);
        sb.append(")");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 80);
        sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        sb2.append(string);
        sb2.append(" AND retry_count =  2147483647 LIMIT 1");
        if (zzaA(sb2.toString(), null) > 0) {
            this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            StringBuilder sb3 = new StringBuilder(string.length() + 127);
            sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            sQLiteDatabaseZze.execSQL(sb3.toString());
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e2);
        }
    }

    @WorkerThread
    final void zzK(Long l2) {
        zzg();
        zzay();
        Preconditions.checkNotNull(l2);
        if (!zzai()) {
            return;
        }
        StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
        sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
        sb.append(l2);
        sb.append(" AND retry_count =  2147483647 LIMIT 1");
        if (zzaA(sb.toString(), null) > 0) {
            this.zzu.zzaV().zze().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            long jCurrentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
            sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
            sb2.append(jCurrentTimeMillis);
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 34 + l2.toString().length() + 29);
            sb3.append("UPDATE upload_queue");
            sb3.append(string);
            sb3.append(" WHERE rowid = ");
            sb3.append(l2);
            sb3.append(" AND retry_count < 2147483647");
            sQLiteDatabaseZze.execSQL(sb3.toString());
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Error incrementing retry count. error", e2);
        }
    }

    @VisibleForTesting
    @WorkerThread
    final Object zzL(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.zzu.zzaV().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.zzu.zzaV().zzb().zza("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i2);
                }
                return Double.valueOf(cursor.getDouble(i2));
            }
            return Long.valueOf(cursor.getLong(i2));
        }
        this.zzu.zzaV().zzb().zza("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:20:0x00b0, B:23:0x00b8), top: B:29:0x001b }] */
    @VisibleForTesting
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final long zzN(String str, String str2) {
        SQLiteException e2;
        long jZzaB;
        long j2;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzay();
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select ");
                sb.append("first_open_count");
                sb.append(" from app2 where app_id=?");
                j2 = -1;
                jZzaB = zzaB(sb.toString(), new String[]{str}, -1L);
            } finally {
                sQLiteDatabaseZze.endTransaction();
            }
        } catch (SQLiteException e3) {
            e2 = e3;
            jZzaB = 0;
        }
        if (jZzaB == -1) {
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", (Integer) 0);
            contentValues2.put("previous_install_count", (Integer) 0);
            if (sQLiteDatabaseZze.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                this.zzu.zzaV().zzb().zzc("Failed to insert column (got -1). appId", zzgt.zzl(str), "first_open_count");
            } else {
                jZzaB = 0;
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
                } catch (SQLiteException e4) {
                    e2 = e4;
                    this.zzu.zzaV().zzb().zzd("Error inserting column. appId", zzgt.zzl(str), "first_open_count", e2);
                }
                if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
                    this.zzu.zzaV().zzb().zzc("Failed to update column (got 0). appId", zzgt.zzl(str), "first_open_count");
                } else {
                    sQLiteDatabaseZze.setTransactionSuccessful();
                    j2 = jZzaB;
                }
            }
            this.zzu.zzaV().zzb().zzd("Error inserting column. appId", zzgt.zzl(str), "first_open_count", e2);
            j2 = jZzaB;
        } else {
            contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
            if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
            }
        }
        return j2;
    }

    public final boolean zzQ(String str, String str2) {
        if (zzaA("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void zzS(List list) {
        Preconditions.checkNotNull(list);
        zzg();
        zzay();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int iDelete = zze().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            this.zzu.zzaV().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final void zzT(String str) {
        try {
            zze().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", zzgt.zzl(str), e2);
        }
    }

    public final long zzU(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaB("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean zzV(String str, Long l2, long j2, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzhsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        zzib zzibVar = this.zzu;
        byte[] bArrZzcc = zzhsVar.zzcc();
        zzibVar.zzaV().zzk().zzc("Saving complex main event, appId, data size", zzibVar.zzl().zza(str), Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrZzcc);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert complex main event (got -1). appId", zzgt.zzl(str));
                return false;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing complex main event. appId", zzgt.zzl(str), e2);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle zzW(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzu.zzaV().zzk().zza("Default event parameters not found");
                    } else {
                        try {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpj.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursorRawQuery.getBlob(0))).zzbc();
                            this.zzg.zzp();
                            Bundle bundleZzE = zzpj.zzE(zzhsVar.zza());
                            cursorRawQuery.close();
                            return bundleZzE;
                        } catch (IOException e2) {
                            this.zzu.zzaV().zzb().zzc("Failed to retrieve default event parameters. appId", zzgt.zzl(str), e2);
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzu.zzaV().zzb().zzb("Error selecting default event parameters", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e = e4;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzjk zzZ(String str) {
        Throwable th;
        SQLiteException e2;
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        ?? RawQuery = {str};
        ?? r12 = 0;
        zzjkVarZzf = null;
        zzjkVarZzf = null;
        zzjk zzjkVarZzf = null;
        try {
            try {
                RawQuery = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (!RawQuery.moveToFirst()) {
                        this.zzu.zzaV().zzk().zza("No data found");
                    } else {
                        zzjkVarZzf = zzjk.zzf(RawQuery.getString(0), RawQuery.getInt(1));
                    }
                } catch (SQLiteException e3) {
                    e2 = e3;
                    this.zzu.zzaV().zzb().zzb("Error querying database.", e2);
                    if (RawQuery != 0) {
                    }
                    if (zzjkVarZzf != null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = RawQuery;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e4) {
            e2 = e4;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r12 != 0) {
            }
            throw th;
        }
        RawQuery.close();
        if (zzjkVarZzf != null) {
            return zzjk.zza;
        }
        return zzjkVarZzf;
    }

    @WorkerThread
    public final boolean zzaa(String str, zzog zzogVar) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzogVar);
        Preconditions.checkNotEmpty(str);
        zzib zzibVar = this.zzu;
        long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        zzfw zzfwVar = zzfx.zzav;
        long jLongValue = jCurrentTimeMillis - ((Long) zzfwVar.zzb(null)).longValue();
        long j2 = zzogVar.zzb;
        if (j2 < jLongValue || j2 > ((Long) zzfwVar.zzb(null)).longValue() + jCurrentTimeMillis) {
            zzibVar.zzaV().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgt.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        zzibVar.zzaV().zzk().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzogVar.zza);
        contentValues.put("source", Integer.valueOf(zzogVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (zze().insert("trigger_uris", null, contentValues) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert trigger URI (got -1). appId", zzgt.zzl(str));
                return false;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing trigger URI. appId", zzgt.zzl(str), e2);
            return false;
        }
    }

    public final void zzab(String str, zzjk zzjkVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjkVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjkVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjkVar.zzb()));
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzaz zzac(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return zzaz.zzg(zzaC("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void zzad(String str, zzaz zzazVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzazVar);
        zzg();
        zzay();
        zzjk zzjkVarZzZ = zzZ(str);
        zzjk zzjkVar = zzjk.zza;
        if (zzjkVarZzZ == zzjkVar) {
            zzab(str, zzjkVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzazVar.zze());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final void zzae(String str, zzjk zzjkVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjkVar);
        zzg();
        zzay();
        zzab(str, zzZ(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjkVar.zzl());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzjk zzaf(String str) {
        Preconditions.checkNotNull(str);
        zzg();
        zzay();
        return zzjk.zzf(zzaC("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    @WorkerThread
    public final void zzb() {
        zzay();
        zze().beginTransaction();
    }

    @WorkerThread
    public final void zzc() {
        zzay();
        zze().setTransactionSuccessful();
    }

    @WorkerThread
    public final void zzd() {
        zzay();
        zze().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    final SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zze().zzb("Error opening database", e2);
            throw e2;
        }
    }

    @WorkerThread
    public final void zzk(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            zze().delete("user_attributes", wDgKoYAES.tIOcQIa, new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzd("Error deleting user property. appId", zzgt.zzl(str), zzibVar.zzl().zzc(str2), e2);
        }
    }

    @WorkerThread
    public final boolean zzl(zzpm zzpmVar) {
        Preconditions.checkNotNull(zzpmVar);
        zzg();
        zzay();
        String str = zzpmVar.zza;
        String str2 = zzpmVar.zzc;
        if (zzm(str, str2) == null) {
            if (zzpo.zzh(str2)) {
                if (zzaA("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzc().zzn(str, zzfx.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzaA = zzaA("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzpmVar.zzb});
                this.zzu.zzc();
                if (jZzaA >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpmVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(zzpmVar.zzd));
        zzaw(contentValues, "value", zzpmVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzu.zzaV().zzb().zzb("Failed to insert/update user property (got -1). appId", zzgt.zzl(str));
                return true;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing user property. appId", zzgt.zzl(zzpmVar.zza), e2);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzpm zzm(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        cursor.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor == null) {
            }
        }
        if (cursorQuery.moveToFirst()) {
            long j2 = cursorQuery.getLong(0);
            Object objZzL = zzL(cursorQuery, 1);
            if (objZzL != null) {
                str3 = str;
                str4 = str2;
                try {
                    zzpm zzpmVar = new zzpm(str3, cursorQuery.getString(2), str4, j2, objZzL);
                    if (cursorQuery.moveToNext()) {
                        this.zzu.zzaV().zzb().zzb("Got multiple records for user property, expected one. appId", zzgt.zzl(str3));
                    }
                    cursorQuery.close();
                    return zzpmVar;
                } catch (SQLiteException e4) {
                    e = e4;
                }
            }
            sQLiteException = e;
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzd("Error querying user property. appId", zzgt.zzl(str3), zzibVar.zzl().zzc(str4), sQLiteException);
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    public final List zzn(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                zzib zzibVar = this.zzu;
                zzibVar.zzc();
                cursorQuery = zze().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j2 = cursorQuery.getLong(2);
                            Object objZzL = zzL(cursorQuery, 3);
                            if (objZzL == null) {
                                zzibVar.zzaV().zzb().zzb("Read invalid user property value, ignoring it. appId", zzgt.zzl(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new zzpm(str2, str3, string, j2, objZzL));
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    this.zzu.zzaV().zzb().zzc("Error querying user properties. appId", zzgt.zzl(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    str2 = str;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str2 = str;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } finally {
        }
    }

    @WorkerThread
    public final boolean zzp(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        zzg();
        zzay();
        String str = zzahVar.zza;
        Preconditions.checkNotNull(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long jZzaA = zzaA("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzu.zzc();
            if (jZzaA >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzahVar.zzc.zzb);
        zzaw(contentValues, "value", Preconditions.checkNotNull(zzahVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzahVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzahVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzahVar.zzh));
        zzib zzibVar = this.zzu;
        contentValues.put("timed_out_event", zzibVar.zzk().zzae(zzahVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzahVar.zzd));
        contentValues.put("triggered_event", zzibVar.zzk().zzae(zzahVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzibVar.zzk().zzae(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzibVar.zzaV().zzb().zzb("Failed to insert/update conditional user property (got -1)", zzgt.zzl(str));
                return true;
            }
            return true;
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzc("Error storing conditional user property", zzgt.zzl(str), e2);
            return true;
        }
    }

    @WorkerThread
    public final int zzr(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzay();
        try {
            return zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzb().zzd("Error deleting conditional property", zzgt.zzl(str), zzibVar.zzl().zzc(str2), e2);
            return 0;
        }
    }

    @WorkerThread
    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @WorkerThread
    public final zzar zzx(long j2, String str, long j3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z9) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                cursorQuery = sQLiteDatabaseZze.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.zzu.zzaV().zze().zzb("Not updating daily counts, app is not known. appId", zzgt.zzl(str));
                } else {
                    if (cursorQuery.getLong(0) == j2) {
                        zzarVar.zzb = cursorQuery.getLong(1);
                        zzarVar.zza = cursorQuery.getLong(2);
                        zzarVar.zzc = cursorQuery.getLong(3);
                        zzarVar.zzd = cursorQuery.getLong(4);
                        zzarVar.zze = cursorQuery.getLong(5);
                        zzarVar.zzf = cursorQuery.getLong(6);
                        zzarVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z2) {
                        zzarVar.zzb += j3;
                    }
                    if (z3) {
                        zzarVar.zza += j3;
                    }
                    if (z4) {
                        zzarVar.zzc += j3;
                    }
                    if (z5) {
                        zzarVar.zzd += j3;
                    }
                    if (z6) {
                        zzarVar.zze += j3;
                    }
                    if (z7) {
                        zzarVar.zzf += j3;
                    }
                    if (z9) {
                        zzarVar.zzg += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    sQLiteDatabaseZze.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error updating daily counts. appId", zzgt.zzl(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zzarVar;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[SYNTHETIC] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq zzy(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaV().zzb().zzb("Got multiple records for app config, expected one. appId", zzgt.zzl(str));
                        }
                        if (blob != null) {
                            zzaq zzaqVar = new zzaq(blob, string, string2);
                            cursorQuery.close();
                            return zzaqVar;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaV().zzb().zzc("Error querying remote config. appId", zzgt.zzl(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor == null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor == null) {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z2) {
        zzg();
        zzay();
        Preconditions.checkNotNull(zzidVar);
        Preconditions.checkNotEmpty(zzidVar.zzA());
        Preconditions.checkState(zzidVar.zzn());
        zzI();
        zzib zzibVar = this.zzu;
        long jCurrentTimeMillis = zzibVar.zzaZ().currentTimeMillis();
        long jZzo = zzidVar.zzo();
        zzibVar.zzc();
        if (jZzo >= jCurrentTimeMillis - zzal.zzI()) {
            long jZzo2 = zzidVar.zzo();
            zzibVar.zzc();
            if (jZzo2 > zzal.zzI() + jCurrentTimeMillis) {
                zzibVar.zzaV().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgt.zzl(zzidVar.zzA()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.zzo()));
            }
        }
        try {
            byte[] bArrZzv = this.zzg.zzp().zzv(zzidVar.zzcc());
            zzib zzibVar2 = this.zzu;
            zzibVar2.zzaV().zzk().zzb("Saving bundle, size", Integer.valueOf(bArrZzv.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.zzA());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.zzo()));
            contentValues.put("data", bArrZzv);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzidVar.zzaa()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.zzab()));
            }
            try {
                if (zze().insert("queue", null, contentValues) == -1) {
                    zzibVar2.zzaV().zzb().zzb("Failed to insert bundle (got -1). appId", zzgt.zzl(zzidVar.zzA()));
                    return false;
                }
                return true;
            } catch (SQLiteException e2) {
                this.zzu.zzaV().zzb().zzc("Error storing bundle. appId", zzgt.zzl(zzidVar.zzA()), e2);
                return false;
            }
        } catch (IOException e3) {
            this.zzu.zzaV().zzb().zzc("Data loss. Failed to serialize bundle. appId", zzgt.zzl(zzidVar.zzA()), e3);
            return false;
        }
    }
}
