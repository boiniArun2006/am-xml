package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class TaskStackBuilder implements Iterable<Intent> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f36329n = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f36330t;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public void Uo() {
        KN(null);
    }

    public static TaskStackBuilder J2(Context context) {
        return new TaskStackBuilder(context);
    }

    public void KN(Bundle bundle) {
        if (this.f36329n.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f36329n.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (ContextCompat.startActivities(this.f36330t, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f36330t, intent);
    }

    public TaskStackBuilder O(ComponentName componentName) {
        int size = this.f36329n.size();
        try {
            Intent intentRl = NavUtils.rl(this.f36330t, componentName);
            while (intentRl != null) {
                this.f36329n.add(size, intentRl);
                intentRl = NavUtils.rl(this.f36330t, intentRl.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Intent> iterator() {
        return this.f36329n.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStackBuilder nr(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.n(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f36330t.getPackageManager());
            }
            O(component);
            rl(supportParentActivityIntent);
        }
        return this;
    }

    public TaskStackBuilder rl(Intent intent) {
        this.f36329n.add(intent);
        return this;
    }

    private TaskStackBuilder(Context context) {
        this.f36330t = context;
    }

    public TaskStackBuilder t(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f36330t.getPackageManager());
        }
        if (component != null) {
            O(component);
        }
        rl(intent);
        return this;
    }
}
