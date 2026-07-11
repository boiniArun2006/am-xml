package androidx.core.widget;

import android.widget.ListView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView P5;

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean n(int i2) {
        return false;
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public void mUb(int i2, int i3) {
        this.P5.scrollListBy(i3);
    }

    @Override // androidx.core.widget.AutoScrollHelper
    public boolean rl(int i2) {
        ListView listView = this.P5;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i3 = firstVisiblePosition + childCount;
        if (i2 > 0) {
            if (i3 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i2 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.P5 = listView;
    }
}
