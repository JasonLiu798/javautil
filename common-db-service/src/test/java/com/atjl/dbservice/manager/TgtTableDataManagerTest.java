package com.atjl.dbservice.manager;

import com.atjl.dbservice.api.domain.SearchCondBase;
import com.atjl.dbservice.domain.SeparatedDatas;
import com.atjl.eg.DataTestUtil;
import com.atjl.util.common.DateUtil;
import org.junit.*;
import org.junit.rules.ExpectedException;
import com.atjl.util.common.SystemUtil;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.atjl.util.json.JSONFastJsonUtil;
import com.atjl.util.json.JSONFmtUtil;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-service.xml"})
public class TgtTableDataManagerTest {

    @Resource
    private TgtTableDataManager tgtTableDataManager;
    @Resource
    private RawTableDataGetManager rawTableDataGetManager;

    @Test
    public void testGetTgtData() throws Exception {
        long t = System.currentTimeMillis();
        try {
            SearchCondBase cond = new SearchCondBase();
            String st = DateUtil.format(DateUtil.getDate(-20), DateUtil.yyyy_MM_dd_HH_mm_ss_EN);
            String et = DateUtil.format(DateUtil.getDate(0), DateUtil.yyyy_MM_dd_HH_mm_ss_EN);
            cond.setStartLoadTm(st);
            cond.setEndLoadTm(et);
            List<Map> l = rawTableDataGetManager.getData(DataTestUtil.getConfig(), cond);
            System.out.println("res: raw" + l.size() + "," + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l)));
//            List<Map> l2 = tgtTableDataManager.getTgtData(l, DataTestUtil.getConfig());
//            SeparatedDatas l2 = tgtTableDataManager.separate(l, DataTestUtil.getConfig());
//            System.out.println("res: succ " + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l2)));
        } catch (Exception e) {
            System.out.println("res: error " + e);
            e.printStackTrace();
        }
        long cost = System.currentTimeMillis() - t;
        System.out.println("cost:" + cost);
    }

    @Test
    public void testFilter() throws Exception {
        long t = System.currentTimeMillis();
        try {
            Object res = null;

            List<Map> l = rawTableDataGetManager.getData(DataTestUtil.getConfig(), new SearchCondBase());
            System.out.println("res:bf" + l.size() + "," + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l)));
//            List<Map> l2 = tgtTableDataManager.separate(l, DataTestUtil.getConfig());
//            System.out.println("res:af" + l2.size() + "," + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l2)));
        } catch (Exception e) {
            System.out.println("res: error " + e);
            e.printStackTrace();
        }
        long cost = System.currentTimeMillis() - t;
        System.out.println("cost:" + cost);
    }

    @Test
    public void testGen() throws Exception {
        long t = System.currentTimeMillis();
        try {
            List<Map> l = rawTableDataGetManager.getData(DataTestUtil.getConfig(), new SearchCondBase());
            System.out.println("res: bf" + l.size() + "," + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l)));
//            List<Map> l2 = tgtTableDataManager.getTgtData(l, DataTestUtil.getConfig());
            SeparatedDatas l2 = tgtTableDataManager.separate(l, DataTestUtil.getConfig());
            System.out.println("res: sep " + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(l2)));

//			List res1 = tgtTableDataManager.tgtDataGenInsert(l2.getExistDatas(), DataTestUtil.getConfig());
//			List res2 = tgtTableDataManager.tgtDataGenInsert(l2.getNotExistDatas(), DataTestUtil.getConfig());
//            System.out.println("res: succ e " + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(res1)));
//			System.out.println("res: succ ne " + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(res2)));
        } catch (Exception e) {
            System.out.println("res: error " + e);
            e.printStackTrace();
        }
        long cost = System.currentTimeMillis() - t;
        System.out.println("cost:" + cost);
    }

    @Test
    public void testInsert() throws Exception {
        long t = System.currentTimeMillis();
        try {
            Object res = null;

            System.out.println("res: succ " + JSONFmtUtil.formatJsonConsole(JSONFastJsonUtil.objectToJson(res)));
        } catch (Exception e) {
            System.out.println("res: error " + e);
            e.printStackTrace();
        }
        long cost = System.currentTimeMillis() - t;
        System.out.println("cost:" + cost);
    }


    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
    /*
        String dir = System.getProperty("user.dir");
        System.out.println("now " + dir);
        String config = dir.substring(0, dir.lastIndexOf("\\")) + "\\config";
        System.out.println("config " + config);
        */
        SystemUtil.addClasspath("D:\\project\\java\\aos\\config");
    }

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();
} 
