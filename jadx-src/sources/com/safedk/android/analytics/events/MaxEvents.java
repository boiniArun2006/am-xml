package com.safedk.android.analytics.events;

import android.os.Bundle;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.d;
import com.safedk.android.utils.f;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class MaxEvents extends ArrayList<a> implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f62791a = "MaxEvents";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f62792b;

    public MaxEvents() {
        this.f62792b = 10;
    }

    public MaxEvents(int capacity) {
        this.f62792b = 10;
        this.f62792b = capacity;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(a aVar) {
        if (size() >= this.f62792b) {
            remove(0);
        }
        return super.add(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i2, a aVar) {
        super.add(i2, aVar);
    }

    public ArrayList<Bundle> a() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        Iterator<a> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        Logger.d(f62791a, "MaxEvents toBundle : ", arrayList.toString());
        return arrayList;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<a> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString() + ",");
        }
        return sb.toString();
    }

    @Override // com.safedk.android.utils.f
    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("capacity", this.f62792b);
        jSONObject.put("maxEvents", d.a(this));
        return jSONObject;
    }

    @Override // com.safedk.android.utils.f
    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.f62792b = jSONObject.optInt("capacity", 10);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("maxEvents");
            if (jSONArrayOptJSONArray != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                    a aVar = new a();
                    aVar.a(jSONArrayOptJSONArray.getJSONObject(i2));
                    add(aVar);
                }
            }
        }
    }
}
