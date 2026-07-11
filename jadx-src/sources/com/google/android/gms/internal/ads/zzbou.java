package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzbou implements zzboh {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdxz zzb;

    @Nullable
    private final zzbwr zzd;

    @Nullable
    private final zzeiu zze;

    @Nullable
    private final zzcrv zzf;

    @Nullable
    private final zzdae zzg;

    @Nullable
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzaa zzh = null;
    private final zzgzy zzi = zzcei.zzg;

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
            return 7;
        }
        if (CmcdData.STREAM_TYPE_LIVE.equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    static Uri zzd(Context context, zzazh zzazhVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfjo zzfjoVar) {
        if (zzazhVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || zzfjoVar == null) {
                    if (zzazhVar.zze(uri)) {
                        return zzazhVar.zzd(uri, context, view, activity);
                    }
                } else if (zzazhVar.zze(uri)) {
                    return zzfjoVar.zza(uri, context, view, activity);
                }
            } catch (zzazi unused) {
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @VisibleForTesting
    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e2) {
            String strValueOf = String.valueOf(uri.toString());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e2);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0369  */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        zzdae zzdaeVar;
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        zzfir zzfirVarZzC = zzcjlVar.zzC();
        zzfiu zzfiuVarZzaC = zzcjlVar.zzaC();
        boolean zZza = false;
        if (zzfirVarZzC == null || zzfiuVarZzaC == null) {
            str3 = "";
            zZzb = false;
        } else {
            str3 = zzfiuVarZzaC.zzb;
            zZzb = zzfirVarZzC.zzb();
        }
        boolean z2 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmh)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoj)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcjlVar.zzW()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzclb) zzaVar).zzaI(zzb(map), zzc(map), z2);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzclb) zzaVar).zzaJ(zzb(map), zzc(map), str, z2, z4);
                return;
            } else {
                ((zzclb) zzaVar).zzaK(zzb(map), zzc(map), (String) map.get(CreativeInfo.al), (String) map.get("baseurl"), z2);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcjlVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfF)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfz)).booleanValue()) {
                    String strNr = CustomTabsClient.nr(context, null);
                    if (strNr != null && !context.getPackageName().equals(strNr)) {
                        zZza = true;
                    }
                } else {
                    zZza = zzbif.zza(context);
                }
                if (zZza) {
                    boolean z5 = z3;
                    boolean z6 = z2;
                    String str4 = str3;
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri uriZze = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                    if (zZzb && this.zze != null && zzi(zzaVar, zzcjlVar.getContext(), uriZze.toString(), str4)) {
                        return;
                    }
                    this.zzh = new zzbor(this);
                    zzclb zzclbVar = (zzclb) zzaVar;
                    String string = uriZze.toString();
                    com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzh;
                    Bundle bundle = new Bundle();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfE)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt(CmcdData.STREAMING_FORMAT_HLS, Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e2) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct initial height parameter.", e2);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e3) {
                                com.google.android.gms.ads.internal.util.zze.zzb("Invalid cct close button position parameter.", e3);
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    zzclbVar.zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, string, null, null, null, null, null, null, ObjectWrapper.wrap(zzaaVar).asBinder(), true, bundle), z6, z5, str4);
                    return;
                }
                zzg(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzk(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        boolean z7 = z3;
        boolean z9 = z2;
        String str5 = str3;
        if (PangleCreativeInfo.f62498a.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzk(zzaVar, map, zZzb, str5, z9, z7);
            return;
        }
        boolean z10 = zZzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
        Map map2 = map;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjA)).booleanValue()) {
                zzl(true);
                String str6 = (String) map2.get(TtmlNode.TAG_P);
                if (str6 == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z10 && this.zze != null && zzi(zzaVar2, zzcjlVar.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = zzcjlVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z9, z7, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str7 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                uri = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e4) {
                String strValueOf = String.valueOf(str7);
                int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(strValueOf), e4);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZze2 = zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), data, zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT()));
                if (!TextUtils.isEmpty(uri.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjB)).booleanValue()) {
                        uri.setDataAndType(uriZze2, uri.getType());
                    } else {
                        uri.setData(uriZze2);
                    }
                }
            }
        }
        boolean z11 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjW)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoo)).booleanValue() && (zzdaeVar = this.zzg) != null) {
            zzdaeVar.zzl();
        }
        HashMap map3 = new HashMap();
        if (z11) {
            zzbos zzbosVar = new zzbos(this, z9, zzaVar2, map3, map2);
            zzaVar2 = zzaVar2;
            map2 = map2;
            this.zzh = zzbosVar;
        } else {
            zZza = z9;
        }
        if (uri != null) {
            if (!z10 || this.zze == null || !zzi(zzaVar2, zzcjlVar.getContext(), uri.getData().toString(), str5)) {
                ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(uri, this.zzh), zZza, z7, str5);
                return;
            } else {
                if (z11) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((zzbrd) zzaVar2).zze("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string2 = !TextUtils.isEmpty(str) ? zze(zzd(zzcjlVar.getContext(), zzcjlVar.zzS(), Uri.parse(str), zzcjlVar.zzE(), zzcjlVar.zzj(), zzcjlVar.zzT())).toString() : str;
        if (!z10 || this.zze == null || !zzi(zzaVar2, zzcjlVar.getContext(), string2, str5)) {
            ((zzclb) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get(CmcdData.OBJECT_TYPE_INIT_SEGMENT), string2, (String) map2.get("m"), (String) map2.get(TtmlNode.TAG_P), (String) map2.get("c"), (String) map2.get(InneractiveMediationDefs.GENDER_FEMALE), (String) map2.get("e"), this.zzh), zZza, z7, str5);
        } else if (z11) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((zzbrd) zzaVar2).zze("openIntentAsync", map3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjQ)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjL)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbhe.zzjK)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzbxy zzbxyVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzd(context, zzdxzVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().zzs(context)) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.ads.internal.util.client.zzu(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        zzfir zzfirVarZzC = zzcjlVar.zzC();
        boolean z2 = (zzfirVarZzC == null || (zzwVar = zzfirVarZzC.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z3 = (zzfirVarZzC == null || (zzbxyVar = zzfirVarZzC.zzad) == null || !zzbxyVar.zza || zzbxyVar.zzb == null || !zzbxyVar.zzc) ? false : true;
        if (!z2) {
            if (z3) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzboVarZzE = com.google.android.gms.ads.internal.util.zzs.zzE(context);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zN = NotificationManagerCompat.nr(context).n();
            boolean zZzh = com.google.android.gms.ads.internal.zzt.zzf().zzh(context, "offline_notification_channel");
            boolean z4 = zzcjlVar.zzN().zzg() && zzcjlVar.zzj() == null;
            if (!zN) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!NotificationManagerCompat.nr(context).n()) {
                }
                zzj(context, str2, "notifications_disabled");
                return false;
            }
            if (zZzh) {
                zzj(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzboVarZzE == null) {
                zzj(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z4) {
                zzj(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjI)).booleanValue()) {
                zzj(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcjlVar.zzL() == null || zzcjlVar.zzj() == null) {
                ((zzclb) zzaVar).zzaL(str2, str, 14);
            } else {
                zzejg zzejgVarZze = zzejh.zze();
                zzejgVarZze.zza(zzcjlVar.zzj());
                zzejgVarZze.zzb(null);
                zzejgVarZze.zzc(str2);
                zzejgVarZze.zzd(str);
                try {
                    zzcjlVar.zzL().zzG(zzejgVarZze.zze());
                } catch (Exception e2) {
                    zzj(context, str2, e2.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        zzdxz zzdxzVar2 = this.zzb;
        if (zzdxzVar2 != null) {
            zzejf.zzd(context, zzdxzVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzj(Context context, String str, String str2) {
        zzeiu zzeiuVar = this.zze;
        zzeiuVar.zzd(str);
        zzdxz zzdxzVar = this.zzb;
        if (zzdxzVar != null) {
            zzejf.zzk(context, zzdxzVar, zzeiuVar, str, "dialog_not_shown", zzgui.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z2, String str, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        ResolveInfo resolveInfoZzc;
        zzcjl zzcjlVar;
        Intent intentZzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzb;
        zzl(true);
        zzcjl zzcjlVar2 = (zzcjl) zzaVar;
        Context context = zzcjlVar2.getContext();
        zzazh zzazhVarZzS = zzcjlVar2.zzS();
        View viewZzE = zzcjlVar2.zzE();
        zzfjo zzfjoVarZzT = zzcjlVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzcjlVar = zzcjlVar2;
            intentZzd = null;
        } else {
            Uri uriZze = zze(zzd(context, zzazhVarZzS, Uri.parse(str2), viewZzE, null, zzfjoVarZzT));
            boolean z7 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z9 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                z5 = true;
            } else {
                z5 = true;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfv)).booleanValue()) {
                    z6 = false;
                }
                Uri uriBuild = !g.f62375e.equalsIgnoreCase(uriZze.getScheme()) ? uriZze.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(uriZze.getScheme()) ? uriZze.buildUpon().scheme(g.f62375e).build() : null;
                ArrayList arrayList = new ArrayList();
                Intent intentZza = zzbot.zza(uriZze, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                Intent intentZza2 = zzbot.zza(uriBuild, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                if (z6) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzs(context, intentZza2);
                }
                resolveInfoZzc = zzbot.zzc(intentZza, arrayList, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                if (resolveInfoZzc == null) {
                    intentZzd = zzbot.zzd(intentZza, resolveInfoZzc, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                } else {
                    if (intentZza2 != null && (resolveInfoZzb = zzbot.zzb(intentZza2, context, zzazhVarZzS, viewZzE, zzfjoVarZzT)) != null) {
                        intentZzd = zzbot.zzd(intentZza, resolveInfoZzb, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                        if (zzbot.zzb(intentZzd, context, zzazhVarZzS, viewZzE, zzfjoVarZzT) == null) {
                        }
                    }
                    if (arrayList.isEmpty()) {
                        zzcjlVar = zzcjlVar2;
                    } else if (!z9 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        zzcjlVar = zzcjlVar2;
                        if (!z7) {
                            intentZzd = zzbot.zzd(intentZza, (ResolveInfo) arrayList.get(0), context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                        }
                    } else {
                        int size = arrayList.size();
                        int i2 = 0;
                        loop0: while (i2 < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i2);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                int i3 = i2 + 1;
                                if (it.hasNext()) {
                                    zzcjlVar = zzcjlVar2;
                                    if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        intentZzd = zzbot.zzd(intentZza, resolveInfo, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
                                        break loop0;
                                    }
                                    zzcjlVar2 = zzcjlVar;
                                }
                            }
                        }
                        zzcjlVar = zzcjlVar2;
                        if (!z7) {
                        }
                    }
                    intentZzd = intentZza;
                }
                zzcjlVar = zzcjlVar2;
            }
            z6 = z5;
            if (!g.f62375e.equalsIgnoreCase(uriZze.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent intentZza3 = zzbot.zza(uriZze, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            Intent intentZza22 = zzbot.zza(uriBuild, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            if (z6) {
            }
            resolveInfoZzc = zzbot.zzc(intentZza3, arrayList2, context, zzazhVarZzS, viewZzE, zzfjoVarZzT);
            if (resolveInfoZzc == null) {
            }
            zzcjlVar = zzcjlVar2;
        }
        if (!z2 || this.zze == null || intentZzd == null || !zzi(zzaVar, zzcjlVar.getContext(), intentZzd.getData().toString(), str)) {
            try {
                ((zzclb) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intentZzd, this.zzh), z3, z4, str);
            } catch (ActivityNotFoundException e2) {
                String message = e2.getMessage();
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
    }

    private final void zzl(boolean z2) {
        zzbwr zzbwrVar = this.zzd;
        if (zzbwrVar != null) {
            zzbwrVar.zzb(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i2) {
        zzdxz zzdxzVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfy)).booleanValue() || (zzdxzVar = this.zzb) == null) {
            return;
        }
        zzdxy zzdxyVarZza = zzdxzVar.zza();
        zzdxyVarZza.zzc(FileUploadManager.f61572j, "cct_action");
        switch (i2) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdxyVarZza.zzc("cct_open_status", str);
        zzdxyVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcrv zzcrvVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcjl zzcjlVar = (zzcjl) zzaVar;
        if (zzcjlVar.zzC() != null) {
            map2 = zzcjlVar.zzC().zzaw;
        }
        String strZza = zzccs.zza(str, zzcjlVar.getContext(), true, map2);
        String str2 = (String) map.get(CmcdData.OBJECT_TYPE_AUDIO_ONLY);
        if (str2 == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgzo.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzly)).booleanValue() && (zzcrvVar = this.zzf) != null && zzcrv.zzc(strZza)) ? zzcrvVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zzh()) : zzgzo.zza(strZza), new zzboq(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }

    public zzbou(com.google.android.gms.ads.internal.zzb zzbVar, zzbwr zzbwrVar, zzeiu zzeiuVar, zzdxz zzdxzVar, zzcrv zzcrvVar, zzdae zzdaeVar) {
        this.zza = zzbVar;
        this.zzd = zzbwrVar;
        this.zze = zzeiuVar;
        this.zzb = zzdxzVar;
        this.zzf = zzcrvVar;
        this.zzg = zzdaeVar;
    }
}
