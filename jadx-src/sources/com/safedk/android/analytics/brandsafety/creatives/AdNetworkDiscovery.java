package com.safedk.android.analytics.brandsafety.creatives;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.webkit.WebView;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.RedirectDetails;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.brandsafety.u;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import com.safedk.android.utils.SimpleConcurrentHashSet;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public interface AdNetworkDiscovery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f61908a = 0.15f;

    public enum WebViewResourceMatchingMethod {
        DEFAULT,
        DIRECT_CREATIVE_INFO,
        WEBVIEW_LOOKUP
    }

    long a(CreativeInfo creativeInfo);

    Pair<String, List<String>> a(Set<String> set);

    CreativeInfo a(SimpleConcurrentHashSet<String> simpleConcurrentHashSet);

    CreativeInfo a(Object obj);

    String a(Bundle bundle);

    String a(View view, BrandSafetyUtils.AdType adType);

    String a(WebView webView, String str, String str2);

    String a(String str, String str2, WeakReference<WebView> weakReference);

    WeakReference<View> a(com.safedk.android.analytics.brandsafety.d dVar);

    WeakReference<WebView> a(List<WeakReference<WebView>> list, String str);

    List<CreativeInfo> a(int i2);

    List<CreativeInfo> a(WebView webView, String str);

    List<CreativeInfo> a(String str, String str2, WebView webView);

    List<CreativeInfo> a(String str, String str2, byte[] bArr, Map<String, List<String>> map, c.a aVar);

    List<CreativeInfo> a(WeakReference<View> weakReference, String str, BrandSafetyUtils.AdType adType);

    void a(View view, int i2, int i3);

    void a(WebView webView);

    void a(WebView webView, Object obj);

    void a(CreativeInfo creativeInfo, String str);

    void a(com.safedk.android.analytics.brandsafety.d dVar, List<WeakReference<View>> list);

    void a(u uVar);

    void a(FileInputStream fileInputStream, FileDescriptor fileDescriptor);

    void a(FileInputStream fileInputStream, String str);

    void a(Object obj, Object obj2);

    void a(Object obj, String str);

    void a(String str, String str2, BrandSafetyEvent.AdFormatType adFormatType, Object obj);

    void a(String str, String str2, String str3, String str4);

    void a(WeakReference<WebView> weakReference, String str);

    boolean a();

    boolean a(View view);

    boolean a(com.safedk.android.analytics.brandsafety.c cVar);

    boolean a(com.safedk.android.analytics.brandsafety.e eVar, List<String> list, String str);

    boolean a(String str);

    boolean a(String str, Bundle bundle);

    boolean a(String str, com.safedk.android.analytics.brandsafety.e eVar);

    boolean a(String str, Object obj);

    boolean a(String str, String str2);

    WebViewResourceMatchingMethod b();

    String b(Object obj);

    void b(WebView webView, String str);

    void b(CreativeInfo creativeInfo);

    void b(u uVar);

    void b(Object obj, Object obj2);

    void b(String str, String str2, WebView webView);

    boolean b(View view);

    boolean b(String str);

    boolean b(String str, String str2);

    CreativeInfo c(Object obj);

    CreativeInfo c(Object obj, Object obj2);

    String c(String str, String str2);

    Set<String> c();

    void c(View view);

    void c(CreativeInfo creativeInfo);

    boolean c(String str);

    b d();

    void d(View view);

    void d(Object obj);

    void d(Object obj, Object obj2);

    void d(String str, String str2);

    boolean d(CreativeInfo creativeInfo);

    boolean d(String str);

    String e(String str, String str2);

    List<String> e();

    void e(String str);

    boolean e(View view);

    BrandSafetyUtils.AdType f(View view);

    String f();

    String f(String str);

    void f(String str, String str2);

    View g(View view);

    HashMap<Integer, String> g();

    void g(String str, String str2);

    boolean g(String str);

    int h(String str);

    void h(String str, String str2);

    boolean i(String str);

    boolean j(String str);

    RedirectDetails.RedirectType k(String str);

    String l(String str);

    boolean m(String str);

    void n(String str);

    void o(String str);

    boolean p(String str);

    Set<String> q(String str);

    void r(String str);

    List<CreativeInfo> s(String str);

    List<CreativeInfo> t(String str);

    List<CreativeInfo> u(String str);

    String v(String str);

    void w(String str);

    String x(String str);

    void y(String str);

    boolean z(String str);
}
