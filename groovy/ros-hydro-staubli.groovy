node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'hydro-devel'
    registerROS('ros_legacy:hydro-ros-precise', [
        'libopenblas-dev',
        'ros-hydro-industrial-robot-client',
        'ros-hydro-joint-state-publisher',
        'ros-hydro-moveit-core',
        'ros-hydro-robot-state-publisher',
        'ros-hydro-rviz',
        'ros-hydro-tf-conversions',
        'ros-hydro-xacro'
    ], [])
}
