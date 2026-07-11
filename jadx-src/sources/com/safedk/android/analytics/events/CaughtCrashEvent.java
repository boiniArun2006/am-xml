package com.safedk.android.analytics.events;

import com.safedk.android.analytics.StatsCollector;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CaughtCrashEvent extends CrashEvent implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f62781j = "CaughtCrashEvent";
    private static final long serialVersionUID = 0;

    public CaughtCrashEvent(JSONObject report) {
        super(null, StatsCollector.EventType.crash, report);
    }

    @Override // com.safedk.android.analytics.events.CrashEvent
    protected boolean c() {
        return true;
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public StatsCollector.EventType a() {
        return StatsCollector.EventType.crash;
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public String b() {
        return "";
    }

    @Override // com.safedk.android.analytics.events.CrashEvent, com.safedk.android.analytics.events.base.StatsEvent
    public void a(StatsEvent statsEvent) {
    }
}
