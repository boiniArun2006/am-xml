package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class DragAndDropPermissionsCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final DragAndDropPermissions f36730n;

    @RequiresApi
    static class Api24Impl {
        static DragAndDropPermissions n(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.f36730n = dragAndDropPermissions;
    }

    public static DragAndDropPermissionsCompat n(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsN = Api24Impl.n(activity, dragEvent);
        if (dragAndDropPermissionsN != null) {
            return new DragAndDropPermissionsCompat(dragAndDropPermissionsN);
        }
        return null;
    }
}
