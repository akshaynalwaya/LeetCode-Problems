/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
        int n = employees.size();
        for(int i=0;i<n;i++)
            map.put(employees.get(i).id,employees.get(i));         
        
        return getSum(map,id);
    }
    
    int getSum(HashMap<Integer,Employee> map, int id){
        Employee emp = map.get(id);
        int imp = emp.importance;
        int n = emp.subordinates.size();
        for(int i=0;i<n;i++)
            imp += getSum(map,emp.subordinates.get(i));
        
        /*
        for(Integer sub:emp.subordinates){
            imp += getSum(map,sub);
        }
        */
        return imp;
    }
}