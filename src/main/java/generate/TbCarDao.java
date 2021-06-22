package generate;

import generator.TbCar;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

/**
 * TbCarDao继承基类
 */
@Repository
public interface TbCarDao extends MyBatisBaseDao<TbCar, Long> {


    public static @NotNull
    TbCarDao newInstance() {

        android.os.Bundle args = new Bundle();

        TbCarDao fragment = new TbCarDao();
        fragment.setArguments(args);
        return fragment;
    }
}