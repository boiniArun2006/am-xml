package com.safedk.android.analytics.brandsafety;

import aT.dE.JLZo;
import android.app.Activity;
import android.os.Bundle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.BannerFinder;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.l;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class q extends BannerFinder {
    public q(int i2) {
        super(BrandSafetyUtils.AdType.MREC, Arrays.asList(BrandSafetyUtils.f61449o), "MrecFinder", i2);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.b
    protected c a(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        return new r(str, str2, str3, screenShotOrientation, str4, str5);
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected e a(Activity activity, String str, int i2, String str2, Bundle bundle, String str3) {
        r rVar = new r(a(com.safedk.android.internal.b.getInstance().getForegroundActivity()), str, i2, str2, bundle, str3);
        rVar.ag = new WeakReference<>(activity);
        return rVar;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean f(String str, String str2) {
        boolean zA = CreativeInfoManager.a(str2, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_TRACKING, false);
        String strA = CreativeInfoManager.a(str2, AdNetworkConfiguration.AD_NETWORK_TO_IGNORE, (String) null);
        Logger.d(this.f61779a, "sdk ", str2, ": config item SUPPORTS_MREC_IMPRESSION_TRACKING is ", Boolean.valueOf(zA), ", config item AD_NETWORK_TO_IGNORE is ", strA, ", isOnUiThread = ", Boolean.valueOf(com.safedk.android.utils.n.c()));
        if (zA && !str.equals(strA)) {
            return true;
        }
        Logger.d(this.f61779a, "MREC tracking is not supported for this ad network (", str, ")");
        return false;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean a(e eVar, long j2) {
        if (eVar == null || com.safedk.android.utils.e.a((c) eVar)) {
            Logger.d(this.f61779a, Logger.FeatureTag.MEMORY_LOAD, "don't take screenshot, ad info: ", eVar, ", low memory");
            return false;
        }
        int iA = ((int) CreativeInfoManager.a(eVar.c(), AdNetworkConfiguration.MREC_SCREENSHOT_TAKING_DELAY, 0L)) / SafeDK.getInstance().Z();
        Logger.d(this.f61779a, "should take screenshot started for ", eVar.c(), ", iterationDelay = ", Integer.valueOf(iA), ",  timerIterationCounter = ", Long.valueOf(j2));
        if (iA > 0 && j2 <= iA) {
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, delay interval for sdk ", eVar.c(), " not reached, current iteration : ", Long.valueOf(j2), ", skipping");
            eVar.an.f61399c--;
            return false;
        }
        if (!SafeDK.getInstance().I()) {
            AdNetworkDiscovery adNetworkDiscoveryJ = CreativeInfoManager.j(eVar.c());
            if (!eVar.i().f62606l && adNetworkDiscoveryJ != null && adNetworkDiscoveryJ.a((c) eVar)) {
                eVar.i().f62606l = true;
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot - found a media player");
            }
            CreativeInfo creativeInfoJ = eVar.j();
            if (creativeInfoJ == null) {
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, no creative info yet");
                return false;
            }
            if (BrandSafetyUtils.f61449o.equals(creativeInfoJ.K())) {
                boolean zA = CreativeInfoManager.a(eVar.f61840v, AdNetworkConfiguration.DETECT_MULTIPLE_ADS_BY_WEB_VIEW_CHANGE, false);
                if (creativeInfoJ.an() && !zA) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, multi ad, sdk: ", eVar.f61840v);
                    return false;
                }
                if (!n(eVar.c())) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, JLZo.bPUYhrcAmezPWeF, eVar.c(), " Mrec EoV is not supported");
                    return true;
                }
                if (!eVar.i().f62606l) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC ad is not a video ad");
                    return true;
                }
                if (eVar.i().f62605k) {
                    Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC video ad finished playing or sdk configured to take screenshots throughout the impression. ");
                    return true;
                }
                Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "don't take screenshot, MREC video hasn't finished playing yet, waiting for video completed event");
                return false;
            }
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC ad");
            return true;
        }
        Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, SafeDK Config item 'AlwaysTakeScreenshot' is true");
        return true;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder
    protected boolean n(String str) {
        boolean zA = CreativeInfoManager.a(str, AdNetworkConfiguration.SUPPORTS_MREC_IMPRESSION_EOV, false);
        if (!zA) {
            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "take screenshot, MREC EoV is not supported for this SDK: ", str);
        }
        return zA;
    }

    @Override // com.safedk.android.analytics.brandsafety.BannerFinder, com.safedk.android.analytics.brandsafety.a
    public boolean a(String str, String str2, boolean z2, String str3) {
        c cVarD;
        String strK;
        synchronized (f61366L) {
            String str4 = this.f61779a;
            Object[] objArr = new Object[6];
            objArr[0] = "on video ";
            objArr[1] = z2 ? "completed" : TtmlNode.START;
            objArr[2] = ", keys : ";
            objArr[3] = f61366L.keySet();
            objArr[4] = ", isOnUiThread = ";
            objArr[5] = Boolean.valueOf(com.safedk.android.utils.n.c());
            Logger.d(str4, objArr);
        }
        if (str2 == null) {
            cVarD = null;
        } else {
            cVarD = c(str2);
        }
        if (cVarD == null) {
            List<c> listS = s(str);
            if (z2) {
                cVarD = d(listS);
            } else {
                cVarD = listS.size() == 1 ? listS.get(0) : null;
            }
        }
        Logger.d(this.f61779a, "set on video - ad info is: ", cVarD);
        if (cVarD == null || cVarD.f61834p != BrandSafetyUtils.AdType.MREC) {
            return false;
        }
        Logger.d(this.f61779a, "set on video info is with event id: ", cVarD.f61819L, " is eov triggered: ", Boolean.valueOf(cVarD.i().f62605k), " is video: ", Boolean.valueOf(cVarD.i().f62606l));
        r rVar = (r) cVarD;
        if (z2 && !rVar.i().f62605k) {
            rVar.b(l.f62661p, new l.a(l.f62635P, str3));
        } else if (!z2 && (!rVar.i().f62606l || rVar.i().f62605k)) {
            rVar.b(l.f62660o, new l.a(l.f62635P, str3));
        }
        CreativeInfo creativeInfoJ = rVar.j();
        String str5 = this.f61779a;
        Logger.FeatureTag featureTag = Logger.FeatureTag.AD_CAPTURE;
        Object[] objArr2 = new Object[8];
        objArr2[0] = "on video ";
        objArr2[1] = z2 ? "completed" : TtmlNode.START;
        objArr2[2] = ", view address: ";
        objArr2[3] = str2;
        objArr2[4] = ", ad format: ";
        if (creativeInfoJ == null) {
            strK = null;
        } else {
            strK = creativeInfoJ.K();
        }
        objArr2[5] = strK;
        objArr2[6] = ", current value: ";
        objArr2[7] = Boolean.valueOf(rVar.i().f62605k);
        Logger.d(str5, featureTag, objArr2);
        if (creativeInfoJ != null) {
            Logger.d(this.f61779a, "on mrec video event triggered, setting ci ad as video ad.");
            creativeInfoJ.f(true);
            k kVarI = rVar.i();
            if (kVarI != null) {
                kVarI.f62606l = true;
            }
            if (creativeInfoJ.K() == null) {
                String str6 = this.f61779a;
                Object[] objArr3 = new Object[3];
                objArr3[0] = "on video ";
                objArr3[1] = z2 ? "completed" : TtmlNode.START;
                objArr3[2] = ", setting CI ad format, based on view address match";
                Logger.d(str6, objArr3);
                creativeInfoJ.a(BrandSafetyEvent.AdFormatType.MREC);
            }
            if (!rVar.i().f62605k && z2) {
                a((c) rVar);
                if (!creativeInfoJ.v()) {
                    Logger.d(this.f61779a, "on video completed, setting CI as video ad");
                    creativeInfoJ.f(true);
                }
                Logger.d(this.f61779a, "on video completed, setting to: ", Boolean.valueOf(z2));
                rVar.i().f62605k = true;
                rVar.i().f62606l = true;
                if (n(rVar.c())) {
                    if (rVar.an != null) {
                        Logger.d(this.f61779a, "on video completed, impressionHandlerTask = ", rVar.an, ", taskFuture = ", rVar.an.f61400d);
                        if (rVar.an.f61400d != null) {
                            Logger.d(this.f61779a, Logger.FeatureTag.AD_CAPTURE, "on video completed, cancelling existing taskFuture ", rVar.an.f61400d);
                            rVar.an.f61400d.cancel(false);
                            rVar.an.f61400d = null;
                        }
                        int iZ = SafeDK.getInstance().Z() * 1000;
                        String str7 = this.f61779a;
                        Object[] objArr4 = new Object[4];
                        objArr4[0] = "on video completed, start taking screenshots for view: ";
                        objArr4[1] = (rVar.an.f61398b == null || rVar.an.f61398b.get() == null) ? V8ValueNull.NULL : rVar.an.f61398b.get();
                        objArr4[2] = ", samplingInterval = ";
                        objArr4[3] = Integer.valueOf(iZ);
                        Logger.d(str7, objArr4);
                        rVar.an = new BannerFinder.a(rVar, rVar.an.f61398b, this.f61783e, rVar.av);
                        rVar.an.f61400d = this.f61776E.scheduleWithFixedDelay(rVar.an, 500L, iZ, TimeUnit.MILLISECONDS);
                    }
                } else {
                    Logger.d(this.f61779a, "on video completed, Info impressionHandlerTask is null : ", rVar);
                }
            } else if (!z2) {
                a((c) rVar);
                rVar.i().f62605k = false;
            }
        }
        return true;
    }

    private List<c> s(String str) {
        Logger.d(this.f61779a, "get items by sdk package started, sdk: ", str);
        ArrayList arrayList = new ArrayList();
        synchronized (f61366L) {
            for (e eVar : f61366L.values()) {
                Logger.d(this.f61779a, "get MREC infos By sdk package, mrec info: ", eVar);
                if ((eVar instanceof r) && !eVar.f61827U && eVar.ab && eVar.c() != null && eVar.c().equals(str)) {
                    Logger.d(this.f61779a, "get MREC infos By sdk package, adding ", eVar);
                    arrayList.add(eVar);
                }
            }
        }
        return arrayList;
    }

    private c d(List<c> list) {
        c cVar = null;
        for (c cVar2 : list) {
            if (cVar2 != null && cVar2.i() != null && cVar2.i().f62606l) {
                if (cVar != null) {
                    Logger.d(this.f61779a, "found more than one video mrec info - not returning");
                    return null;
                }
                cVar = cVar2;
            }
        }
        return cVar;
    }
}
