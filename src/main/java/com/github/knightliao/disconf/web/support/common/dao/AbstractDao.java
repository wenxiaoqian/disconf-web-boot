package com.github.knightliao.disconf.web.support.common.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import com.github.knightliao.orm.commons.BaseObject;
import com.github.knightliao.orm.jorm.dao.GenericDao;
import com.github.knightliao.orm.jorm.operator.Match;
import com.github.knightliao.orm.jorm.operator.Modify;
import com.github.knightliao.orm.jorm.operator.Order;
import com.github.knightliao.orm.jorm.param.BetweenParam;
import com.github.knightliao.orm.jorm.param.ExpressionParam;
import com.github.knightliao.orm.jorm.param.GreaterThanParam;
import com.github.knightliao.orm.jorm.param.IncrParam;
import com.github.knightliao.orm.jorm.param.LessThanParam;
import com.github.knightliao.orm.jorm.param.LikeParam;
import com.github.knightliao.orm.jorm.param.NotParam;

/**
 */
public abstract class AbstractDao<KEY extends Serializable, ENTITY extends BaseObject<KEY>> extends
        GenericDao<KEY, ENTITY> {

    protected static final Logger LOG = LoggerFactory.getLogger(AbstractDao.class);

    @Override
    @Resource(name = "onedbJdbcTemplate")
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        super.setJdbcTemplate(jdbcTemplate);
    }

    /**
     * 该类是否有dspId一列
     */
    public AbstractDao() {
        super();
    }

    @Override
    public void recordLog(String sLog) {
        LOG.debug(sLog);
    }

    // modified by liqingyun
    protected Object like(String searchWord) {
        return new LikeParam(searchWord);
    }

    protected Object between(Object start, Object end) {
        return new BetweenParam(start, end);
    }

    protected Object greaterThan(Object value) {
        return new GreaterThanParam(value);
    }

    protected Object lessThan(Object value) {
        return new LessThanParam(value);
    }

    protected Object express() {
        return new ExpressionParam();
    }

    protected Object not(Object value) {
        return new NotParam(value);
    }

    protected Object incr(Number value) {
        return new IncrParam(value);
    }

    public Order order(final String column, final boolean asc) {
        return new Order(column, asc);
    }

    public Match match(final String column, final Object value) {
        return new Match(column, value);
    }

    public Modify modify(String column, Object value) {
        return new Modify(column, value);
    }

    public final List<Object> toList(Object... os) {
        if (os == null || os.length == 0) {
            return new ArrayList<Object>(0);
        }
        ArrayList<Object> list = new ArrayList<Object>(os.length);
        for (Object o : os) {
            list.add(o);
        }
        return list;
    }

    /**
     * 新版的Page，返回TotalCount
     *
     * @param matches
     * @param daoPage
     *
     * @return
     */
    public DaoPageResult<ENTITY> page2(List<Match> matches, DaoPage daoPage) {

        DaoPageResult<ENTITY> daoPageResult = new DaoPageResult<ENTITY>();

        // 结果
        List<ENTITY> result = page(matches, daoPage);
        daoPageResult.setResult(result);

        // 总数
        int totalCount = count(matches);
        daoPageResult.setTotalCount(totalCount);

        return daoPageResult;
    }

    /**
     * 根据查询条件获取结果集列表
     *
     * @param matches
     *
     * @return
     */
    private List<ENTITY> page(List<Match> matches, DaoPage daoPage) {

        if (daoPage.getPageNo() < 1 || daoPage.getPageSize() < 0) {
            return find(matches, daoPage.getOrderList());
        }

        int offset = (daoPage.getPageNo() - 1) * daoPage.getPageSize();
        int limit = daoPage.getPageSize();
        return find(matches, daoPage.getOrderList(), offset, limit);
    }

}
