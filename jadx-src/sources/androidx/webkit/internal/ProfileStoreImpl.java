package androidx.webkit.internal;

import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import java.lang.reflect.InvocationHandler;
import java.util.List;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ProfileStoreImpl implements ProfileStore {
    private static ProfileStore rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ProfileStoreBoundaryInterface f42516n;

    public static ProfileStore getInstance() {
        if (rl == null) {
            rl = new ProfileStoreImpl(WebViewGlueCommunicator.nr().getProfileStore());
        }
        return rl;
    }

    @Override // androidx.webkit.ProfileStore
    public boolean deleteProfile(String str) {
        if (WebViewFeatureInternal.f42552a.t()) {
            return this.f42516n.deleteProfile(str);
        }
        throw WebViewFeatureInternal.n();
    }

    @Override // androidx.webkit.ProfileStore
    public List getAllProfileNames() {
        if (WebViewFeatureInternal.f42552a.t()) {
            return this.f42516n.getAllProfileNames();
        }
        throw WebViewFeatureInternal.n();
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getOrCreateProfile(String str) {
        if (WebViewFeatureInternal.f42552a.t()) {
            return new ProfileImpl((ProfileBoundaryInterface) SuF.j.n(ProfileBoundaryInterface.class, this.f42516n.getOrCreateProfile(str)));
        }
        throw WebViewFeatureInternal.n();
    }

    @Override // androidx.webkit.ProfileStore
    public Profile getProfile(String str) {
        if (!WebViewFeatureInternal.f42552a.t()) {
            throw WebViewFeatureInternal.n();
        }
        InvocationHandler profile = this.f42516n.getProfile(str);
        if (profile != null) {
            return new ProfileImpl((ProfileBoundaryInterface) SuF.j.n(ProfileBoundaryInterface.class, profile));
        }
        return null;
    }

    private ProfileStoreImpl(ProfileStoreBoundaryInterface profileStoreBoundaryInterface) {
        this.f42516n = profileStoreBoundaryInterface;
    }
}
