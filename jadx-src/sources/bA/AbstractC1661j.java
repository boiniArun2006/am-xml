package bA;

import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: bA.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class AbstractC1661j implements InterfaceC1656I28 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Set f43197O = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", FileUploadManager.f61563a, "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map f43198n = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC1664qz f43199t;

    @Override // bA.InterfaceC1656I28
    public boolean F() {
        return false;
    }

    @Override // bA.InterfaceC1656I28
    public InterfaceC1664qz EWS() {
        if (this.f43199t == null) {
            this.f43199t = new Pl(getWidth(), getHeight(), getSizeInBytes(), mYa(), getExtras());
        }
        return this.f43199t;
    }

    @Override // hVe.j
    public void FX(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f43197O) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f43198n.put(str, obj);
            }
        }
    }

    @Override // bA.InterfaceC1663o
    public Map getExtras() {
        return this.f43198n;
    }

    @Override // hVe.j
    public void jB(String str, Object obj) {
        if (f43197O.contains(str)) {
            this.f43198n.put(str, obj);
        }
    }

    @Override // bA.InterfaceC1656I28
    public eO mYa() {
        return Xo.nr;
    }
}
