package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.AbstractRunnableC1782i5;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1803m;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.x4;
import com.google.android.exoplayer2.C;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class c extends AbstractRunnableC1782i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f50409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1804o f50410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f50411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f50412j;

    public List a(int i2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C1803m c1803mG = this.f48733a.G();
        if (!c1803mG.b("persistent_postback_cache.json", C1802k.o())) {
            C1804o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = c1803mG.a("persistent_postback_cache.json", C1802k.o());
        String strF = c1803mG.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            C1804o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z2 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (C1804o.a()) {
                this.f50410h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f48733a.a(x4.I2);
            for (int i3 = 0; i3 < jSONArray.length() && arrayList.size() < i2; i3++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i3), this.f48733a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        C1804o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th) {
                    C1804o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th);
                    this.f48733a.D().a("PersistentPostbackQueueSaveTask", "deserializePostback", th);
                }
            }
            if (C1804o.a()) {
                this.f50410h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th2) {
            try {
                C1804o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th2);
                try {
                    this.f48733a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th2);
                    if (((Boolean) this.f48733a.a(x4.N0)).booleanValue()) {
                        c1803mG.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z2 = true;
                    if (z2 && ((Boolean) this.f48733a.a(x4.N0)).booleanValue()) {
                        c1803mG.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        this.f50412j = arrayList.isEmpty();
        return arrayList;
    }

    c(b bVar, C1802k c1802k) {
        super("PersistentPostbackQueueSaveTask", c1802k);
        this.f50411i = new AtomicBoolean();
        this.f50412j = false;
        this.f50409g = bVar;
        this.f50410h = c1802k.O();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f50409g.d());
    }

    private void a(List list) {
        if (!(this.f50412j && list.isEmpty()) && this.f50411i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    C1804o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f48733a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes(C.UTF8_NAME));
                C1803m c1803mG = this.f48733a.G();
                if (c1803mG.a((InputStream) byteArrayInputStream, c1803mG.a("persistent_postback_cache.json", C1802k.o()), true)) {
                    if (C1804o.a()) {
                        this.f50410h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (C1804o.a()) {
                    this.f50410h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                C1804o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f48733a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f50411i.set(false);
        }
    }
}
