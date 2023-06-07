package service.serviceImpl;

import model.Company;
import model.Group;
import service.GroupService;

import java.util.Arrays;
import java.util.Objects;

public class GroupServiceImpl implements GroupService {
    private CompanyServiceImpl companyService;
    public GroupServiceImpl(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @Override
    public Group[] saveGroup(Long companyId, Group... groups) {
        Company company=companyService.getCompanyById(companyId);
        company.setGroups(groups);
        return company.getGroups();
    }
    @Override
    public Group getById(Long id,Group []groups) {
        for(Group g:groups){
            if(id==g.getId()){
                return g;
            }
        }
        return null;
    }
    @Override
    public Group[] getAllGroupsByCompanyId(Long companyId) {
        return companyService.getCompanyById(companyId).getGroups();
    }
    @Override
    public Group updateGroupByName(String name, Group group) {
        group.setName(name);
        return group;

    }

    @Override
    public String deleteGroupByCompanyId(Long companyId, Long GroupId) {
        for (Company c:companyService.getAllCompanies()) {
           if (companyId == c.getId()) {
                for (int i=0;i<c.getGroups().length;i++) {
                    if (GroupId == c.getGroups()[i].getId()) {
                        c.getGroups()[i] = null;
                    }
                }System.out.println(c);
          }
        }
        return "Group is successfully deleted";
    }
}


