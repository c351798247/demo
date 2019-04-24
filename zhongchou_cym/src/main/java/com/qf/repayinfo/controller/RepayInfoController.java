package com.qf.repayinfo.controller;

import com.qf.pojo.ProjectInfo;
import com.qf.pojo.RepayInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RepayInfoController {


    @RequestMapping(value = "saveRepayInfo", method = RequestMethod.POST)
    public Object saveRepayInfo(@RequestParam("showPhotoFile") CommonsMultipartFile file, RepayInfo repayInfo, HttpSession session) throws IOException {

//            接收图片
        String path = "D:\\IdeaProjects\\zhongchou_cym\\src\\main\\webapp\\photo\\" + System.currentTimeMillis() + file.getOriginalFilename();
        file.transferTo(new File(path));
        repayInfo.setShowPhoto(path.substring(path.indexOf("photo")));

//            取出session里的回报repay集合
        Object objList = session.getAttribute("repayList");
        List repayList;
        if (objList instanceof List) {
            repayList = (List) objList;
        } else {

            repayList = new ArrayList();
        }
        repayList.add(repayInfo);
        session.setAttribute("repayList", repayList);


        return repayInfo;
    }

    @RequestMapping(value = "deleteTempRepay", method = RequestMethod.POST)
    public Object deleteTempRepay(int repayId, HttpSession session) {
//       获取临时回报集合
        Object attribute = session.getAttribute("repayList");
        if (attribute instanceof List) {
            List repayList = (List) attribute;
//            按索引删除
            Object remove = repayList.remove(repayId);
//            重新设置集合
            session.setAttribute("repayList", repayList);
            return remove;
        }
        return false;
    }


}
