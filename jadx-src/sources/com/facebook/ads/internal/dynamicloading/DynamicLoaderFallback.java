package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Keep
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    class j implements InvocationHandler {
        final /* synthetic */ List J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f52246O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Method f52247S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ List f52248Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Method f52249g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f52250n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f52251o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map f52252r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Map f52253t;

        j(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f52250n = list;
            this.f52253t = map;
            this.f52246O = list2;
            this.J2 = list3;
            this.f52252r = map2;
            this.f52251o = list4;
            this.f52248Z = list5;
            this.f52247S = method;
            this.f52249g = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object objNewProxyInstance;
            if (method.getReturnType().isPrimitive()) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.f52250n.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f52253t))) {
                    }
                    Iterator it2 = this.f52246O.iterator();
                    while (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, this.f52253t)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            }
            if (method.getReturnType().equals(String.class)) {
                return "";
            }
            if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                objNewProxyInstance = obj;
            } else {
                objNewProxyInstance = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
            }
            Iterator it3 = this.J2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it3.next())) {
                    DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f52252r.get(obj), (AdListener) objArr[0]);
                    break;
                }
            }
            Iterator it4 = this.f52251o.iterator();
            while (it4.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                    this.f52252r.put(objNewProxyInstance, obj);
                }
            }
            Iterator it5 = this.f52248Z.iterator();
            while (it5.hasNext()) {
                if (DynamicLoaderFallback.equalsMethods(method, (Method) it5.next())) {
                    for (Object obj2 : objArr) {
                        if (obj2 instanceof Ad) {
                            this.f52253t.put(objNewProxyInstance, (Ad) obj2);
                        }
                    }
                }
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f52247S)) {
                this.f52253t.put(objArr[1], (Ad) objArr[0]);
            }
            if (DynamicLoaderFallback.equalsMethods(method, this.f52249g)) {
                this.f52253t.put(objArr[1], (Ad) objArr[0]);
            }
            return objNewProxyInstance;
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AdListener f52254n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Ad f52255t;

        n(AdListener adListener, Ad ad) {
            this.f52254n = adListener;
            this.f52255t = ad;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52254n.onError(this.f52255t, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Method f52256n;
        private final InvocationHandler rl;

        class j implements InvocationHandler {
            j() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (!"toString".equals(method.getName())) {
                    w6.this.f52256n = method;
                    return null;
                }
                return null;
            }
        }

        private w6() {
            this.rl = new j();
        }

        Method rl() {
            return this.f52256n;
        }

        public Object t(Class cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.rl));
        }

        /* synthetic */ w6(j jVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@Nullable Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new n(adListener, ad), 500L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        w6 w6Var = new w6(null);
        DynamicLoader dynamicLoader = (DynamicLoader) w6Var.t(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(w6Var.rl());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(w6Var.rl());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(w6Var.rl());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(w6Var.rl());
        dynamicLoader.createNativeAdApi(null, null);
        Method methodRl = w6Var.rl();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method methodRl2 = w6Var.rl();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) w6Var.t(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(w6Var.rl());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(w6Var.rl());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(w6Var.rl());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) w6Var.t(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(w6Var.rl());
        interstitialAdApi.loadAd(null);
        arrayList2.add(w6Var.rl());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(w6Var.rl());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) w6Var.t(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(w6Var.rl());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(w6Var.rl());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(w6Var.rl());
        AdViewApi adViewApi = (AdViewApi) w6Var.t(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(w6Var.rl());
        adViewApi.loadAd(null);
        arrayList2.add(w6Var.rl());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(w6Var.rl());
        ((AdView.AdViewLoadConfigBuilder) w6Var.t(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(w6Var.rl());
        ((NativeAdBase.NativeAdLoadConfigBuilder) w6Var.t(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(w6Var.rl());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) w6Var.t(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(w6Var.rl());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) w6Var.t(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(w6Var.rl());
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new j(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, methodRl, methodRl2));
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }
}
