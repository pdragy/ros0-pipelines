node {
    git url: 'https://github.com/ros-industrial-consortium/descartes.git', branch: 'hydro-devel'
    registerROS('ros_legacy:hydro-ros-precise', ['ros-hydro-moveit-ros-planning', 'ros-hydro-cmake-modules'], ['ros-hydro-moveit-core'])
}
