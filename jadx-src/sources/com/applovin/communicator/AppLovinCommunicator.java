package com.applovin.communicator;

import android.content.Context;
import com.applovin.impl.communicator.MessagingServiceImpl;
import com.applovin.impl.f5;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class AppLovinCommunicator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppLovinCommunicator f47692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f47693f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1802k f47694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1804o f47695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f5 f47696c = new f5();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MessagingServiceImpl f47697d = new MessagingServiceImpl();

    public static AppLovinCommunicator getInstance() {
        return getInstance(C1802k.o());
    }

    public void a(C1802k c1802k) {
        this.f47694a = c1802k;
        this.f47695b = c1802k.O();
        a("Attached SDK instance: " + c1802k + "...");
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        subscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, String str) {
        unsubscribe(appLovinCommunicatorSubscriber, Collections.singletonList(str));
    }

    @Deprecated
    public static AppLovinCommunicator getInstance(Context context) {
        synchronized (f47693f) {
            try {
                if (f47692e == null) {
                    f47692e = new AppLovinCommunicator();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f47692e;
    }

    public AppLovinCommunicatorMessagingService getMessagingService() {
        return this.f47697d;
    }

    public boolean hasSubscriber(String str) {
        return this.f47696c.a(str);
    }

    public boolean respondsToTopic(String str) {
        return this.f47694a.t().a(str);
    }

    public void subscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            if (this.f47696c.a(appLovinCommunicatorSubscriber, str)) {
                this.f47697d.maybeSendStickyMessages(str);
            } else {
                a("Unable to subscribe " + appLovinCommunicatorSubscriber + " to topic: " + str);
            }
        }
    }

    public String toString() {
        return "AppLovinCommunicator{sdk=" + this.f47694a + '}';
    }

    public void unsubscribe(AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber, List<String> list) {
        for (String str : list) {
            a("Unsubscribing " + appLovinCommunicatorSubscriber + " from topic: " + str);
            this.f47696c.b(appLovinCommunicatorSubscriber, str);
        }
    }

    private void a(String str) {
        if (this.f47695b == null || !C1804o.a()) {
            return;
        }
        this.f47695b.a("AppLovinCommunicator", str);
    }
}
